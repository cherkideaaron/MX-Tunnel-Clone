package rased.vpn.app.service.vpn;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.ArrayMap;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class TunnelUtils {
    public static Map<String, CharSequence> BBCODES_LIST;
    private static Map<Integer, Integer> lastRotateList = new ArrayMap();
    private static String lastPayload = "";

    public static String formatCustomPayload(String str, int i, String str2) {
        ArrayMap arrayMap = new ArrayMap();
        BBCODES_LIST = arrayMap;
        arrayMap.put("[method]", "CONNECT");
        BBCODES_LIST.put("[host]", str);
        BBCODES_LIST.put("[port]", Integer.toString(i));
        BBCODES_LIST.put("[host_port]", String.format("%s:%d", str, Integer.valueOf(i)));
        BBCODES_LIST.put("[protocol]", "HTTP/1.0");
        BBCODES_LIST.put("[ssh]", String.format("%s:%d", str, Integer.valueOf(i)));
        BBCODES_LIST.put("[crlf]", "\r\n");
        BBCODES_LIST.put("[cr]", "\r");
        BBCODES_LIST.put("[lf]", "\n");
        BBCODES_LIST.put("[lfcr]", "\n\r");
        BBCODES_LIST.put("\\n", "\n");
        BBCODES_LIST.put("\\r", "\r");
        String property = System.getProperty("http.agent");
        Map<String, CharSequence> map = BBCODES_LIST;
        if (property == null) {
            property = "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36";
        }
        map.put("[ua]", property);
        if (str2.isEmpty()) {
            return str2;
        }
        Iterator<String> it = BBCODES_LIST.keySet().iterator();
        while (it.hasNext()) {
            String lowerCase = it.next().toLowerCase();
            str2 = str2.replace(lowerCase, BBCODES_LIST.get(lowerCase));
        }
        return parseRotate(str2);
    }

    public static String getLocalIpAddress() throws SocketException {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress().toString();
                    }
                }
            }
            return "No IP Available";
        } catch (SocketException unused) {
            return "ERROR Obtaining IP";
        }
    }

    private static boolean injectSimpleSplit(String str, OutputStream outputStream) throws IOException {
        if (!str.contains("[split]")) {
            return false;
        }
        String[] strArrSplit = str.split(Pattern.quote("[split]"));
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                outputStream.write(strArrSplit[i].getBytes("ISO-8859-1"));
            } catch (UnsupportedEncodingException unused) {
                outputStream.write(strArrSplit[i].getBytes());
            }
            outputStream.flush();
        }
        return true;
    }

    public static boolean injectSplitPayload(String str, OutputStream outputStream) throws InterruptedException, IOException {
        if (!str.contains("[delay_split]")) {
            return injectSimpleSplit(str, outputStream);
        }
        String[] strArrSplit = str.split(Pattern.quote("[delay_split]"));
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            if (!injectSimpleSplit(str2, outputStream)) {
                try {
                    outputStream.write(str2.getBytes("ISO-8859-1"));
                } catch (UnsupportedEncodingException unused) {
                    outputStream.write(str2.getBytes());
                }
                outputStream.flush();
            }
            try {
                if (i != strArrSplit.length - 1) {
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException unused2) {
            }
        }
        return true;
    }

    public static boolean isActiveVpn(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasTransport(4);
    }

    public static boolean isNetworkOnline(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static String parseRotate(String str) {
        int iIntValue;
        Matcher matcher = Pattern.compile("\\[rotate=(.*?)\\]").matcher(str);
        if (!lastPayload.equals(str)) {
            lastRotateList.clear();
            lastPayload = str;
        }
        int i = 0;
        while (matcher.find()) {
            String[] strArrSplit = matcher.group(1).split(";");
            if (strArrSplit.length > 0) {
                if (!lastRotateList.containsKey(Integer.valueOf(i)) || (iIntValue = lastRotateList.get(Integer.valueOf(i)).intValue() + 1) >= strArrSplit.length) {
                    iIntValue = 0;
                }
                str = str.replace(matcher.group(0), strArrSplit[iIntValue]);
                lastRotateList.put(Integer.valueOf(i), Integer.valueOf(iIntValue));
                i++;
            }
        }
        return str;
    }

    public static void restartRotate() {
        lastRotateList.clear();
    }
}

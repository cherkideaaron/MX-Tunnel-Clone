package rased.vpn.app.service.vpn;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public class VpnUtils {
    private static final String DEFAULT_PRIMARY_DNS_SERVER = "8.8.8.8";
    private static final String DEFAULT_SECONDARY_DNS_SERVER = "1.1.0.0";
    private static final Pattern IPV4_PATTERN = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern IPV6_STD_PATTERN = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern IPV6_HEX_COMPRESSED_PATTERN = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static class PrivateAddress {
        public final String mIpAddress;
        public final int mPrefixLength;
        public final String mRouter;
        public final String mSubnet;

        public PrivateAddress(String str, String str2, int i, String str3) {
            this.mIpAddress = str;
            this.mSubnet = str2;
            this.mPrefixLength = i;
            this.mRouter = str3;
        }
    }

    public static int findAvailablePort(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (isPortAvailable(i3)) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int findProcessId(java.lang.String r7) throws java.io.IOException {
        /*
            java.lang.String r0 = "ps -A"
            java.lang.String r1 = "toolbox ps"
            java.lang.String r2 = "ps -ef"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lc:
            r3 = 3
            if (r2 >= r3) goto L5f
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            r4 = r0[r2]
            java.lang.Process r3 = r3.exec(r4)
            java.io.BufferedReader r4 = new java.io.BufferedReader
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            java.io.InputStream r6 = r3.getInputStream()
            r5.<init>(r6)
            r4.<init>(r5)
        L27:
            java.lang.String r5 = r4.readLine()
            if (r5 == 0) goto L5c
            java.lang.String r6 = "PID"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L27
            boolean r6 = r5.contains(r7)
            if (r6 == 0) goto L27
            java.lang.String r7 = "\\s+"
            java.lang.String[] r7 = r5.split(r7)
            r0 = 1
            r0 = r7[r0]     // Catch: java.lang.Throwable -> L4c java.lang.NumberFormatException -> L4e
            int r7 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L4c java.lang.NumberFormatException -> L4e
            r3.destroy()     // Catch: java.lang.Exception -> L4b
        L4b:
            return r7
        L4c:
            r7 = move-exception
            goto L58
        L4e:
            r7 = r7[r1]     // Catch: java.lang.Throwable -> L4c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L4c
            r3.destroy()     // Catch: java.lang.Exception -> L57
        L57:
            return r7
        L58:
            r3.destroy()     // Catch: java.lang.Exception -> L5b
        L5b:
            throw r7
        L5c:
            int r2 = r2 + 1
            goto Lc
        L5f:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.service.vpn.VpnUtils.findProcessId(java.lang.String):int");
    }

    public static List<String> getActiveNetworkDnsResolver(Context context) throws Exception {
        Collection<InetAddress> activeNetworkDnsResolvers = getActiveNetworkDnsResolvers(context);
        if (activeNetworkDnsResolvers.isEmpty()) {
            throw new Exception("no active network DNS resolver");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<InetAddress> it = activeNetworkDnsResolvers.iterator();
        int i = 2;
        while (it.hasNext()) {
            String string = it.next().toString();
            if (string.startsWith("/")) {
                string = string.substring(1);
            }
            if (!string.contains(":")) {
                arrayList.add(string);
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private static Collection<InetAddress> getActiveNetworkDnsResolvers(Context context) throws Exception {
        ArrayList arrayList = new ArrayList();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Class.forName("android.net.LinkProperties");
            Object objInvoke = ConnectivityManager.class.getMethod("getActiveLinkProperties", null).invoke(connectivityManager, null);
            if (objInvoke != null) {
                Iterator<InetAddress> it = ((LinkProperties) objInvoke).getDnsServers().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        } catch (ClassNotFoundException e) {
            throw new Exception("getActiveNetworkDnsResolvers failed", e);
        } catch (IllegalAccessException e2) {
            throw new Exception("getActiveNetworkDnsResolvers failed", e2);
        } catch (IllegalArgumentException e3) {
            throw new Exception("getActiveNetworkDnsResolvers failed", e3);
        } catch (NoSuchMethodException e4) {
            throw new Exception("getActiveNetworkDnsResolvers failed", e4);
        } catch (NullPointerException e5) {
            throw new Exception("getActiveNetworkDnsResolvers failed", e5);
        } catch (InvocationTargetException e6) {
            throw new Exception("getActiveNetworkDnsResolvers failed", e6);
        }
    }

    public static List<String> getNetworkDnsServer(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            return getActiveNetworkDnsResolver(context);
        } catch (Exception unused) {
            arrayList.add(DEFAULT_PRIMARY_DNS_SERVER);
            arrayList.add(DEFAULT_SECONDARY_DNS_SERVER);
            return arrayList;
        }
    }

    public static boolean isIPv4Address(String str) {
        return IPV4_PATTERN.matcher(str).matches();
    }

    public static boolean isIPv6Address(String str) {
        return isIPv6StdAddress(str) || isIPv6HexCompressedAddress(str);
    }

    public static boolean isIPv6HexCompressedAddress(String str) {
        return IPV6_HEX_COMPRESSED_PATTERN.matcher(str).matches();
    }

    public static boolean isIPv6StdAddress(String str) {
        return IPV6_STD_PATTERN.matcher(str).matches();
    }

    private static boolean isPortAvailable(int i) throws IOException {
        Socket socket = new Socket();
        try {
            try {
                try {
                    socket.connect(new InetSocketAddress("127.0.0.1", i), 1000);
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                    return false;
                } catch (SocketTimeoutException unused2) {
                    socket.close();
                    return false;
                } catch (IOException unused3) {
                    socket.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        socket.close();
                    } catch (IOException unused4) {
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                return true;
            }
        } catch (IOException unused6) {
            return false;
        }
    }

    public static int killProcess(File file, String str) throws Exception {
        int i = 0;
        do {
            int iFindProcessId = findProcessId(file.getName());
            if (iFindProcessId == -1) {
                return iFindProcessId;
            }
            i++;
            String strValueOf = String.valueOf(iFindProcessId);
            String[] strArr = {"", "busybox ", "toolbox "};
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    Runtime.getRuntime().exec(strArr[i2] + "killall " + str + " " + file.getName());
                } catch (IOException unused) {
                }
                try {
                    Runtime.getRuntime().exec(strArr[i2] + "killall " + str + " " + file.getCanonicalPath());
                } catch (IOException unused2) {
                }
            }
            killProcess(strValueOf, str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused3) {
            }
        } while (i <= 4);
        throw new Exception("Cannot kill: " + file.getAbsolutePath());
    }

    public static PrivateAddress selectPrivateAddress() throws Exception {
        HashMap map = new HashMap();
        map.put("10", new PrivateAddress("10.0.0.1", "10.0.0.0", 8, "10.0.0.2"));
        map.put("172", new PrivateAddress("172.16.0.1", "172.16.0.0", 12, "172.16.0.2"));
        map.put("192", new PrivateAddress("192.168.0.1", "192.168.0.0", 16, "192.168.0.2"));
        map.put("169", new PrivateAddress("169.254.1.1", "169.254.1.0", 24, "169.254.1.2"));
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.startsWith("10.")) {
                            map.remove("10");
                        } else if (hostAddress.length() >= 6 && hostAddress.substring(0, 6).compareTo("172.16") >= 0 && hostAddress.substring(0, 6).compareTo("172.31") <= 0) {
                            map.remove("172");
                        } else if (hostAddress.startsWith("192.168")) {
                            map.remove("192");
                        }
                    }
                }
            }
            if (map.size() > 0) {
                return (PrivateAddress) map.values().iterator().next();
            }
            throw new Exception("no private address available");
        } catch (SocketException e) {
            e.printStackTrace();
            throw new Exception("selectPrivateAddress failed", e);
        }
    }

    public static void killProcess(File file) throws Exception {
        killProcess(file, "-9");
    }

    public static void killProcess(String str, String str2) throws IOException {
        String[] strArr = {"", "toolbox ", "busybox "};
        for (int i = 0; i < 3; i++) {
            try {
                Runtime.getRuntime().exec(strArr[i] + "kill " + str2 + " " + str);
            } catch (IOException e) {
                SkStatus.logDebug("error killing process: " + str + ", " + e.getMessage());
            }
        }
    }
}

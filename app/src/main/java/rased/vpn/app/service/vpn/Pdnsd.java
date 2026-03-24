package rased.vpn.app.service.vpn;

import android.content.Context;
import com.mxtunnel.pro.R;
import defpackage.C0223Mg;
import defpackage.InterfaceC3155oH;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public class Pdnsd extends Thread {
    private static final String PDNSD_BIN = "libpdnsd";
    private static final String PDNSD_SERVER = "server {\n label= \"%1$s\";\n ip = %2$s;\n port = %3$d;\n uptest = none;\n }\n";
    private static final String PDNSD_SERVER_TEST = "server {\n label= \"%1$s\";\n ip = %2$s;\n port = %3$d;\n reject = ::/0;\n reject_policy = negate;\n reject_recursively = on;\n timeout = 5;\n }\n";
    private static final String TAG = "PdnsdThread";
    private File filePdnsd;
    private Context mContext;
    private String[] mDnsHosts;
    private int mDnsPort;
    private String mPdnsdHost;
    private int mPdnsdPort;
    private Process mProcess;

    public interface OnPdnsdListener {
        void onStart();

        void onStop();
    }

    public Pdnsd(Context context, String[] strArr, int i, String str, int i2) {
        this.mContext = context;
        this.mDnsHosts = strArr;
        this.mDnsPort = i;
        this.mPdnsdHost = str;
        this.mPdnsdPort = i2;
    }

    private File makePdnsdConf(File file, String[] strArr, int i, String str, int i2) throws IOException {
        String fromRaw = readFromRaw(this.mContext, R.raw.pdnsd_local);
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < strArr.length) {
            String str2 = strArr[i3];
            Locale locale = Locale.ENGLISH;
            StringBuilder sb2 = new StringBuilder("server");
            i3++;
            sb2.append(Integer.toString(i3));
            sb.append(String.format(locale, PDNSD_SERVER, sb2.toString(), str2, Integer.valueOf(i)));
        }
        String str3 = String.format(Locale.ENGLISH, fromRaw, sb.toString(), file.getCanonicalPath(), str, Integer.valueOf(i2));
        File file2 = new File(file, "pdnsd.conf");
        if (file2.exists()) {
            file2.delete();
        }
        saveTextFile(file2, str3);
        File file3 = new File(file, "pdnsd.cache");
        if (!file3.exists()) {
            try {
                file3.createNewFile();
            } catch (Exception unused) {
            }
        }
        return file2;
    }

    public static String readFromRaw(Context context, int i) {
        Scanner scannerUseDelimiter = new Scanner(context.getResources().openRawResource(i), "UTF-8").useDelimiter("\\A");
        StringBuilder sb = new StringBuilder();
        while (scannerUseDelimiter.hasNext()) {
            sb.append(scannerUseDelimiter.next());
        }
        scannerUseDelimiter.close();
        return sb.toString();
    }

    public static boolean saveTextFile(File file, String str) throws IOException {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(str);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // java.lang.Thread
    public synchronized void interrupt() {
        super.interrupt();
        Process process = this.mProcess;
        if (process != null) {
            process.destroy();
        }
        try {
            File file = this.filePdnsd;
            if (file != null) {
                VpnUtils.killProcess(file);
            }
        } catch (Exception unused) {
        }
        this.mProcess = null;
        this.filePdnsd = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        if (this.mProcess != null) {
            return;
        }
        try {
            this.filePdnsd = new File(this.mContext.getApplicationInfo().nativeLibraryDir, "libpdnsd.so");
            this.mProcess = Runtime.getRuntime().exec(this.filePdnsd.getCanonicalPath() + " -v9 -c " + makePdnsdConf(this.mContext.getFilesDir(), this.mDnsHosts, this.mDnsPort, this.mPdnsdHost, this.mPdnsdPort).toString());
            InterfaceC3155oH interfaceC3155oH = new InterfaceC3155oH() { // from class: rased.vpn.app.service.vpn.Pdnsd.1
                @Override // defpackage.InterfaceC3155oH
                public void onLine(String str) {
                    SkStatus.logDebug("Pdnsd: " + str);
                }
            };
            C0223Mg c0223Mg = new C0223Mg(this.mProcess.getInputStream(), interfaceC3155oH);
            C0223Mg c0223Mg2 = new C0223Mg(this.mProcess.getErrorStream(), interfaceC3155oH);
            c0223Mg.start();
            c0223Mg2.start();
            this.mProcess.waitFor();
        } catch (IOException e) {
            SkStatus.logException("Pdnsd Error", e);
        } catch (Exception e2) {
            SkStatus.logDebug("Pdnsd Error: " + e2);
        }
    }
}

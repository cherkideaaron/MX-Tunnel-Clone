package defpackage;

import android.content.Context;
import java.io.File;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;

/* loaded from: classes2.dex */
public final class GO extends Thread {
    public static FO s;
    public Context a;
    public Process b;
    public File c;
    public C3492ub d;
    public String e;
    public String f;
    public String m;
    public String n;
    public File o;
    public boolean p;
    public boolean q;
    public Integer r;

    static {
        Deobfuscator$MHRTUNNELVPN$app.getString(-164870261797818L);
    }

    public static Inet4Address a(InetAddress[] inetAddressArr) {
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress instanceof Inet4Address) {
                return (Inet4Address) inetAddress;
            }
        }
        return null;
    }

    public static boolean b(File file, String str) {
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(str);
            printWriter.flush();
            printWriter.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        if (this.b != null) {
            s.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-164814427222970L));
            this.b.destroy();
        }
        try {
            File file = this.c;
            if (file != null) {
                AbstractC0136He.x(file);
            }
        } catch (Exception unused) {
        }
        File file2 = this.o;
        if (file2 != null && file2.exists()) {
            this.o.delete();
        }
        this.b = null;
        this.c = null;
        super.interrupt();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006a A[PHI: r11
      0x006a: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v14 java.lang.String) binds: [B:4:0x003f, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException, java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GO.run():void");
    }
}

package defpackage;

import android.content.Context;
import com.mxtunnel.pro.R;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.vpn.TunnelManagerHelper;
import rased.vpn.app.service.vpn.logger.SkStatus;
import rased.vpn.app.utils.PUtils;

/* renamed from: tK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3430tK extends Thread {
    public static InterfaceC3376sK v;
    public Context a;
    public Process b;
    public File c;
    public C3492ub d;
    public String e;
    public String f;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public File u;

    static {
        Deobfuscator$MHRTUNNELVPN$app.getString(-114339971560378L);
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
            v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-114258367181754L));
            this.b.destroy();
        }
        try {
            File file = this.c;
            if (file != null) {
                AbstractC0136He.x(file);
            }
        } catch (Exception unused) {
        }
        File file2 = this.u;
        if (file2 != null && file2.exists()) {
            this.u.delete();
        }
        this.b = null;
        this.c = null;
        super.interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException, UnknownHostException {
        C3492ub c3492ub = this.d;
        Context context = this.a;
        try {
            try {
                this.c = new File(context.getApplicationInfo().nativeLibraryDir, Deobfuscator$MHRTUNNELVPN$app.getString(-112123768435642L));
                String strH = c3492ub.h();
                this.t = strH;
                if (strH.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-112321336931258L))) {
                    String[] strArrSplit = this.t.split(Deobfuscator$MHRTUNNELVPN$app.getString(-112329926865850L));
                    this.t = strArrSplit[new Random().nextInt(strArrSplit.length)];
                } else if (this.t.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-112338516800442L))) {
                    String strReplaceAll = this.t.replaceAll(Deobfuscator$MHRTUNNELVPN$app.getString(-112347106735034L), Deobfuscator$MHRTUNNELVPN$app.getString(-112381466473402L));
                    StringBuilder sb = new StringBuilder();
                    sb.append(Integer.valueOf(strReplaceAll.split(Deobfuscator$MHRTUNNELVPN$app.getString(-112385761440698L))[0]).intValue() + ((int) (Math.random() * ((Integer.valueOf(strReplaceAll.split(Deobfuscator$MHRTUNNELVPN$app.getString(-112394351375290L))[1]).intValue() - r9) + 1))));
                    sb.append(c3492ub.h().split(Pattern.quote(Deobfuscator$MHRTUNNELVPN$app.getString(-175921212650426L)))[1]);
                    this.t = sb.toString();
                }
                InetAddress[] allByName = new InetAddress[0];
                try {
                    allByName = InetAddress.getAllByName(this.t);
                } catch (UnknownHostException unused) {
                    AbstractC3279qd.j0(context, Deobfuscator$MHRTUNNELVPN$app.getString(-112402941309882L));
                    InterfaceC3376sK interfaceC3376sK = v;
                    if (interfaceC3376sK != null) {
                        interfaceC3376sK.stopSocksOpenVPN();
                    } else {
                        AbstractC3279qd.j0(context, Deobfuscator$MHRTUNNELVPN$app.getString(-112480250721210L));
                    }
                    TunnelManagerHelper.stopSocksHttp(context);
                }
                try {
                    this.t = a(allByName).getHostAddress();
                } catch (Exception unused2) {
                }
                c3492ub.y(this.t);
                this.n = this.t + Deobfuscator$MHRTUNNELVPN$app.getString(-112609099740090L);
                this.q = Deobfuscator$MHRTUNNELVPN$app.getString(-112660639347642L);
                this.o = Deobfuscator$MHRTUNNELVPN$app.getString(-112669229282234L);
                this.p = Deobfuscator$MHRTUNNELVPN$app.getString(-112677819216826L);
                this.m = Deobfuscator$MHRTUNNELVPN$app.getString(-112686409151418L);
                this.r = Deobfuscator$MHRTUNNELVPN$app.getString(-112699294053306L);
                String string = Deobfuscator$MHRTUNNELVPN$app.getString(-112768013530042L);
                this.e = string;
                this.f = String.valueOf((Integer.parseInt(string) * 5) / 2);
                this.s = Deobfuscator$MHRTUNNELVPN$app.getString(-112798078301114L);
                String str = String.format(Locale.ENGLISH, Deobfuscator$MHRTUNNELVPN$app.getString(-112806668235706L), PUtils.pEncrypt(context, this.n), this.s, this.q, this.o, this.p, this.m, this.r, this.e, this.f, context.getString(R.string.app));
                File file = new File(context.getFilesDir().getPath(), Deobfuscator$MHRTUNNELVPN$app.getString(-113760150975418L));
                this.u = file;
                if (b(file, str)) {
                    this.b = new ProcessBuilder(new String[0]).command(new File(this.c.getCanonicalPath()).getAbsolutePath(), Deobfuscator$MHRTUNNELVPN$app.getString(-113811690582970L), Deobfuscator$MHRTUNNELVPN$app.getString(-113841755354042L), this.u.getAbsolutePath()).redirectErrorStream(true).start();
                    SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-113880410059706L), context.getString(R.string.state_connecting));
                    SkStatus.logInfo(R.string.state_connecting, new Object[0]);
                    v.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-113927654699962L));
                    C0607co c0607co = new C0607co(this);
                    C0223Mg c0223Mg = new C0223Mg(this.b.getInputStream(), c0607co);
                    C0223Mg c0223Mg2 = new C0223Mg(this.b.getErrorStream(), c0607co);
                    c0223Mg.start();
                    c0223Mg2.start();
                    this.b.waitFor();
                }
            } catch (NullPointerException unused3) {
                InterfaceC3376sK interfaceC3376sK2 = v;
                if (interfaceC3376sK2 != null) {
                    interfaceC3376sK2.stopSocksOpenVPN();
                } else {
                    AbstractC3279qd.j0(context, Deobfuscator$MHRTUNNELVPN$app.getString(-114035028882362L));
                }
                TunnelManagerHelper.stopSocksHttp(context);
                AbstractC3279qd.i0(context, Deobfuscator$MHRTUNNELVPN$app.getString(-114163877901242L));
            }
        } catch (IOException | InterruptedException unused4) {
        }
    }
}

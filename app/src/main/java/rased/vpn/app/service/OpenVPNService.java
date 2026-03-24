package rased.vpn.app.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0136He;
import defpackage.AbstractC3264qG;
import defpackage.AbstractC3279qd;
import defpackage.BinderC3407sy;
import defpackage.C0102Fe;
import defpackage.C2811i1;
import defpackage.C2827iH;
import defpackage.C3080my;
import defpackage.C3190oy;
import defpackage.C3300qy;
import defpackage.C3312rA;
import defpackage.C3461ty;
import defpackage.C3492ub;
import defpackage.C3515uy;
import defpackage.C3569vy;
import defpackage.C3623wy;
import defpackage.C3708yb;
import defpackage.G3;
import defpackage.H2;
import defpackage.InterfaceC2752gy;
import defpackage.InterfaceC2994lL;
import defpackage.InterfaceC3353ry;
import defpackage.RunnableC2807hy;
import defpackage.RunnableC2915jy;
import defpackage.YD;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TreeMap;
import net.openvpn.ovpn3.ClientAPI_Config;
import net.openvpn.ovpn3.ClientAPI_EvalConfig;
import net.openvpn.ovpn3.ClientAPI_MergeConfig;
import net.openvpn.ovpn3.ClientAPI_OpenVPNClient;
import net.openvpn.ovpn3.ClientAPI_Status;
import net.openvpn.ovpn3.ClientAPI_TransportStats;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.a;

/* loaded from: classes2.dex */
public class OpenVPNService extends VpnService implements InterfaceC2994lL, Handler.Callback, InterfaceC2752gy {
    public static final /* synthetic */ int E = 0;
    public C3492ub A;
    public Timer B;
    public boolean C;
    public final boolean D;
    public boolean a = false;
    public final ArrayDeque b = new ArrayDeque();
    public C3515uy c;
    public boolean d;
    public HashMap e;
    public C3300qy f;
    public C3300qy m;
    public final ArrayDeque n;
    public final BinderC3407sy o;
    public C2811i1 p;
    public Handler q;
    public Notification.Builder r;
    public RunnableC2807hy s;
    public C2827iH t;
    public C3569vy u;
    public C0102Fe v;
    public H2 w;
    public boolean x;
    public long y;
    public NotificationManager z;

    static {
        Deobfuscator$MHRTUNNELVPN$app.getString(-105797281608634L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-105878885987258L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-105977670235066L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-106089339384762L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-106231073305530L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-106355627357114L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-106497361277882L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-106707814675386L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-106849548596154L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-107038527157178L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-107115836568506L);
        System.loadLibrary(Deobfuscator$MHRTUNNELVPN$app.getString(-107180261077946L));
    }

    public OpenVPNService() {
        new SimpleDateFormat(Deobfuscator$MHRTUNNELVPN$app.getString(-80109082211258L));
        this.n = new ArrayDeque();
        this.o = new BinderC3407sy(this);
        this.x = false;
        this.y = 0L;
        this.C = false;
        this.D = true;
        Deobfuscator$MHRTUNNELVPN$app.getString(-80164916786106L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80285175870394L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80379665150906L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80504219202490L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80633068221370L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80731852469178L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80804866913210L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80864996455354L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-80946600833978L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81062564950970L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81148464296890L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81238658610106L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81341737825210L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81436227105722L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81539306320826L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81620910699450L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81693925143482L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81805594293178L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-81917263442874L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82007457756090L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82106242003898L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82162076578746L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82273745728442L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82381119910842L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82467019256762L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82570098471866L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82664587752378L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82784846836666L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82887926051770L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-82978120364986L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83076904612794L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83167098926010L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83287358010298L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83338897617850L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83472041604026L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83622365459386L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83716854739898L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83824228922298L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-83918718202810L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84000322581434L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84154941404090L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84279495455674L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84378279703482L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84489948853178L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84588733100986L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84717582119866L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84812071400378L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-84928035517370L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-85031114732474L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-85159963751354L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-85258747999162L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-85374712116154L);
    }

    public static String g(String str) {
        for (String str2 : str.split(Deobfuscator$MHRTUNNELVPN$app.getString(-92637501813690L))) {
            if (str2.toLowerCase().contains(Deobfuscator$MHRTUNNELVPN$app.getString(-92646091748282L))) {
                String[] strArrSplit = str2.split(Deobfuscator$MHRTUNNELVPN$app.getString(-92680451486650L));
                return strArrSplit.length >= 3 ? strArrSplit[2] : Deobfuscator$MHRTUNNELVPN$app.getString(-92689041421242L);
            }
        }
        return Deobfuscator$MHRTUNNELVPN$app.getString(-92710516257722L);
    }

    public static String n(long j) {
        String string;
        float f;
        float f2 = j;
        if (f2 >= 1.0E12f) {
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-95390575850426L);
            f = 1.0995116E12f;
        } else if (f2 >= 1.0E9f) {
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-95403460752314L);
            f = 1.0737418E9f;
        } else if (f2 >= 1000000.0f) {
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-95416345654202L);
            f = 1048576.0f;
        } else {
            if (f2 < 1000.0f) {
                return String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-95442115457978L), Float.valueOf(f2));
            }
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-95429230556090L);
            f = 1024.0f;
        }
        return String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-95463590294458L), Float.valueOf(f2 / f), string);
    }

    public final void a(String str, String str2) {
        ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
        clientAPI_Config.setContent(str2);
        ClientAPI_EvalConfig clientAPI_EvalConfigEval_config_static = ClientAPI_OpenVPNClient.eval_config_static(clientAPI_Config);
        if (clientAPI_EvalConfigEval_config_static.getError()) {
            e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-88497153340346L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-88583052686266L), str, clientAPI_EvalConfigEval_config_static.getMessage()));
        }
        C3515uy c3515uy = new C3515uy(this, Deobfuscator$MHRTUNNELVPN$app.getString(-88617412424634L), str, false, clientAPI_EvalConfigEval_config_static);
        try {
            AbstractC3279qd.o0(this, c3515uy.b(), str2);
            String str3 = c3515uy.g;
            this.w.p(Deobfuscator$MHRTUNNELVPN$app.getString(-88656067130298L), str3);
            this.w.p(Deobfuscator$MHRTUNNELVPN$app.getString(-88677541966778L), str3);
            m();
            f(0, Deobfuscator$MHRTUNNELVPN$app.getString(-88690426868666L), str3, str3, null);
        } catch (IOException unused) {
            e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-88789211116474L), str);
        }
    }

    public final void b(a aVar) {
        ArrayDeque arrayDeque = this.b;
        arrayDeque.remove(aVar);
        arrayDeque.addFirst(aVar);
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-95948921598906L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-96013346108346L), Integer.valueOf(arrayDeque.size())));
    }

    public final void c(String str, Intent intent, boolean z) throws InterruptedException {
        if (!this.a) {
            d(str, intent, z);
            return;
        }
        this.C = false;
        p();
        new Handler().postDelayed(new RunnableC2915jy(this, str, intent, z), 2000L);
    }

    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v7 */
    public final boolean d(String str, Intent intent, boolean z) {
        boolean z2;
        boolean z3;
        C3623wy c3623wy;
        ?? r17;
        C3515uy c3515uy;
        boolean z4;
        String string;
        String strReplace;
        StringBuilder sbN = AbstractC3264qG.n(str);
        sbN.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91147148161978L));
        String stringExtra = intent.getStringExtra(sbN.toString());
        StringBuilder sbN2 = AbstractC3264qG.n(str);
        sbN2.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91185802867642L));
        String stringExtra2 = intent.getStringExtra(sbN2.toString());
        StringBuilder sbN3 = AbstractC3264qG.n(str);
        sbN3.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91241637442490L));
        String stringExtra3 = intent.getStringExtra(sbN3.toString());
        StringBuilder sbN4 = AbstractC3264qG.n(str);
        sbN4.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91293177050042L));
        String stringExtra4 = intent.getStringExtra(sbN4.toString());
        StringBuilder sbN5 = AbstractC3264qG.n(str);
        sbN5.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91361896526778L));
        String stringExtra5 = intent.getStringExtra(sbN5.toString());
        StringBuilder sbN6 = AbstractC3264qG.n(str);
        sbN6.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91430616003514L));
        intent.getBooleanExtra(sbN6.toString(), false);
        String stringExtra6 = intent.getStringExtra(str + Deobfuscator$MHRTUNNELVPN$app.getString(-91542285153210L));
        StringBuilder sbN7 = AbstractC3264qG.n(str);
        sbN7.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91576644891578L));
        String stringExtra7 = intent.getStringExtra(sbN7.toString());
        StringBuilder sbN8 = AbstractC3264qG.n(str);
        sbN8.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91606709662650L));
        String stringExtra8 = intent.getStringExtra(sbN8.toString());
        StringBuilder sbN9 = AbstractC3264qG.n(str);
        sbN9.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91632479466426L));
        String stringExtra9 = intent.getStringExtra(sbN9.toString());
        StringBuilder sbN10 = AbstractC3264qG.n(str);
        sbN10.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91692609008570L));
        String stringExtra10 = intent.getStringExtra(sbN10.toString());
        StringBuilder sbN11 = AbstractC3264qG.n(str);
        sbN11.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91735558681530L));
        String stringExtra11 = intent.getStringExtra(sbN11.toString());
        StringBuilder sbN12 = AbstractC3264qG.n(str);
        sbN12.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91778508354490L));
        boolean booleanExtra = intent.getBooleanExtra(sbN12.toString(), false);
        StringBuilder sbN13 = AbstractC3264qG.n(str);
        sbN13.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91847227831226L));
        String stringExtra12 = intent.getStringExtra(sbN13.toString());
        StringBuilder sbN14 = AbstractC3264qG.n(str);
        sbN14.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91903062406074L));
        String stringExtra13 = intent.getStringExtra(sbN14.toString());
        StringBuilder sbN15 = AbstractC3264qG.n(str);
        sbN15.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91946012079034L));
        String stringExtra14 = intent.getStringExtra(sbN15.toString());
        StringBuilder sbN16 = AbstractC3264qG.n(str);
        sbN16.append(Deobfuscator$MHRTUNNELVPN$app.getString(-91997551686586L));
        String stringExtra15 = intent.getStringExtra(sbN16.toString());
        i();
        C3515uy c3515uyB = this.u.b(stringExtra);
        if (c3515uyB != null) {
            z2 = true;
        } else {
            z2 = true;
            e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-90653226922938L), stringExtra);
            c3515uyB = null;
        }
        if (c3515uyB == null) {
            return false;
        }
        if (stringExtra3 != null) {
            C3623wy c3623wyC = c3515uyB.c(z2);
            C0102Fe c0102Fe = this.v;
            c3623wyC.getClass();
            if (z) {
                z3 = booleanExtra;
            } else {
                C3312rA c3312rA = c0102Fe.b(stringExtra3) ? null : (C3312rA) ((TreeMap) c0102Fe.e).get(stringExtra3);
                if (c3312rA != null) {
                    c3623wyC.d = c3312rA;
                    c3623wyC.c = intent;
                    z3 = booleanExtra;
                    c3623wyC.a = SystemClock.elapsedRealtime() + 120000;
                    if (!c3623wyC.b) {
                        if (stringExtra4 == null || stringExtra5 == null) {
                            c3623wyC.f = c3312rA.g;
                            c3623wyC.e = c3312rA.d;
                        } else {
                            c3623wyC.f = stringExtra4;
                            c3623wyC.e = stringExtra5;
                        }
                    }
                } else {
                    z3 = booleanExtra;
                    c3623wyC.d = null;
                    c3623wyC.c = null;
                    c3623wyC.a = 0L;
                    c3623wyC.b = false;
                    c3623wyC.f = null;
                    c3623wyC.e = null;
                }
            }
            c3623wy = c3623wyC;
        } else {
            z3 = booleanExtra;
            c3515uyB.j = null;
            c3623wy = null;
        }
        String strB = c3515uyB.b();
        String strJ = this.A.j();
        try {
            String strY = AbstractC3279qd.Y(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-92074861097914L));
            int iL = this.A.l();
            if (iL == 3 || iL == 5) {
                C3492ub c3492ub = this.A;
                try {
                    c3492ub.getClass();
                    strJ = String.valueOf(Integer.parseInt(c3492ub.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166618313487290L), Deobfuscator$MHRTUNNELVPN$app.getString(-166656968192954L))));
                } catch (IOException unused) {
                    c3515uy = c3515uyB;
                    z4 = false;
                    c3515uyB = c3515uy;
                    r17 = z4;
                    Object[] objArr = new Object[2];
                    objArr[r17] = c3515uyB.f;
                    objArr[1] = strB;
                    e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-92448523252666L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-92525832663994L), objArr));
                    return r17;
                }
            }
            String strReplace2 = strY.replace(g(strY), strJ);
            String[] strArrSplit = strReplace2.split(Deobfuscator$MHRTUNNELVPN$app.getString(-92551602467770L));
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    string = Deobfuscator$MHRTUNNELVPN$app.getString(-92603142075322L);
                    break;
                }
                String str2 = strArrSplit[i];
                String[] strArr = strArrSplit;
                if (str2.toLowerCase().contains(Deobfuscator$MHRTUNNELVPN$app.getString(-92560192402362L))) {
                    string = str2.split(Deobfuscator$MHRTUNNELVPN$app.getString(-92594552140730L))[1];
                    break;
                }
                i++;
                strArrSplit = strArr;
            }
            C3492ub c3492ub2 = this.A;
            c3492ub2.getClass();
            boolean z5 = false;
            try {
                if (c3492ub2.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-165024880620474L), false) && this.A.l() == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.A.h());
                    sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-92126400705466L));
                    sb.append(this.A.j());
                    sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-92134990640058L));
                    C3492ub c3492ub3 = this.A;
                    c3492ub3.getClass();
                    sb.append(c3492ub3.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-165179499443130L), Deobfuscator$MHRTUNNELVPN$app.getString(-165222449116090L)));
                    String strReplace3 = strReplace2.replace(string, sb.toString());
                    String strReplace4 = strReplace3.replace(g(strReplace3), this.A.j());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strReplace4);
                    String string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-92143580574650L);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Deobfuscator$MHRTUNNELVPN$app.getString(-92250954757050L));
                    sb3.append(this.A.g());
                    sb3.append(Deobfuscator$MHRTUNNELVPN$app.getString(-92255249724346L));
                    C3492ub c3492ub4 = this.A;
                    c3492ub4.getClass();
                    sb3.append(c3492ub4.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-167095054857146L), Deobfuscator$MHRTUNNELVPN$app.getString(-167142299497402L)));
                    sb3.append(Deobfuscator$MHRTUNNELVPN$app.getString(-92263839658938L));
                    sb2.append(String.format(string2, sb3.toString()));
                    strReplace = sb2.toString();
                } else {
                    String strReplace5 = strReplace2.replace(string, this.A.h());
                    strReplace = strReplace5.replace(g(strReplace5), this.A.j());
                }
                String str3 = strReplace;
                String string3 = Deobfuscator$MHRTUNNELVPN$app.getString(-92272429593530L);
                Object[] objArr2 = new Object[1];
                z5 = false;
                objArr2[0] = Integer.valueOf(str3.length());
                try {
                    Log.d(string3, String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-92336854102970L), objArr2));
                    boolean z6 = z3;
                    c3515uy = c3515uyB;
                    z4 = false;
                    try {
                        return o(c3515uyB, str3, stringExtra2, c3623wy, stringExtra6, stringExtra7, stringExtra8, stringExtra9, stringExtra10, stringExtra11, z6, stringExtra12, stringExtra13, stringExtra14, stringExtra15);
                    } catch (IOException unused2) {
                        c3515uyB = c3515uy;
                        r17 = z4;
                        Object[] objArr3 = new Object[2];
                        objArr3[r17] = c3515uyB.f;
                        objArr3[1] = strB;
                        e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-92448523252666L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-92525832663994L), objArr3));
                        return r17;
                    }
                } catch (IOException unused3) {
                    r17 = 0;
                    Object[] objArr32 = new Object[2];
                    objArr32[r17] = c3515uyB.f;
                    objArr32[1] = strB;
                    e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-92448523252666L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-92525832663994L), objArr32));
                    return r17;
                }
            } catch (IOException unused4) {
                c3515uy = c3515uyB;
                z4 = z5;
            }
        } catch (IOException unused5) {
            r17 = 0;
        }
    }

    public final void e(int i, String str, String str2) {
        f(i, str, str2, null, null);
    }

    public final void f(int i, String str, String str2, String str3, InterfaceC3353ry interfaceC3353ry) {
        C3190oy c3190oy = (C3190oy) this.e.get(str);
        C3300qy c3300qy = new C3300qy();
        int i2 = i | 2;
        c3300qy.b = i2;
        if (c3190oy != null) {
            c3300qy.h = c3190oy.d;
            c3300qy.f = c3190oy.c;
            c3300qy.i = c3190oy.e;
            c3300qy.c = c3190oy.b;
            c3300qy.j = interfaceC3353ry;
            c3300qy.b = i2 | c3190oy.a;
        } else {
            c3300qy.i = R.string.unknown;
            if (this.a) {
                this.s.reconnect(1);
            }
        }
        c3300qy.e = str;
        if (str2 != null) {
            c3300qy.d = str2;
        } else {
            c3300qy.d = Deobfuscator$MHRTUNNELVPN$app.getString(-97778577667002L);
        }
        if ((c3300qy.b & 4) != 0) {
            c3300qy.a = SystemClock.elapsedRealtime() + 60000;
        }
        c3300qy.g = str3;
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(1, c3300qy));
    }

    public final C3080my h() {
        C3080my c3080my = new C3080my();
        ClientAPI_TransportStats clientAPI_TransportStatsTransport_stats = this.s.transport_stats();
        c3080my.d = -1;
        if (this.a) {
            int iElapsedRealtime = ((int) (SystemClock.elapsedRealtime() - this.y)) / 1000;
            c3080my.c = iElapsedRealtime;
            if (iElapsedRealtime < 0) {
                c3080my.c = 0;
            }
            c3080my.a = clientAPI_TransportStatsTransport_stats.getBytesIn();
            c3080my.b = clientAPI_TransportStatsTransport_stats.getBytesOut();
            int lastPacketReceived = clientAPI_TransportStatsTransport_stats.getLastPacketReceived();
            if (lastPacketReceived >= 0) {
                c3080my.d = lastPacketReceived >> 10;
            }
        } else {
            c3080my.c = 0;
            c3080my.a = 0L;
            c3080my.b = 0L;
        }
        return c3080my;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[PHI: r7
      0x00da: PHI (r7v26 uy) = (r7v21 uy), (r7v27 uy) binds: [B:51:0x0120, B:29:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.service.OpenVPNService.handleMessage(android.os.Message):boolean");
    }

    public final C3569vy i() {
        if (this.u == null) {
            m();
        }
        return this.u;
    }

    public final boolean j(String str, String str2, boolean z) {
        if (AbstractC0136He.w(str2)) {
            if ((str2 != null ? new File(str2).getParent() : null) == null) {
                if (z) {
                    ClientAPI_MergeConfig clientAPI_MergeConfigMerge_config_string_static = ClientAPI_OpenVPNClient.merge_config_string_static(str);
                    String str3 = Deobfuscator$MHRTUNNELVPN$app.getString(-87887267984314L) + clientAPI_MergeConfigMerge_config_string_static.getStatus();
                    if (!str3.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-87925922689978L))) {
                        e(1, str3, clientAPI_MergeConfigMerge_config_string_static.getErrorText());
                        return false;
                    }
                    str = clientAPI_MergeConfigMerge_config_string_static.getProfileContent();
                }
                ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
                clientAPI_Config.setContent(str);
                ClientAPI_EvalConfig clientAPI_EvalConfigEval_config_static = ClientAPI_OpenVPNClient.eval_config_static(clientAPI_Config);
                if (clientAPI_EvalConfigEval_config_static.getError()) {
                    e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-88020411970490L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-88106311316410L), str2, clientAPI_EvalConfigEval_config_static.getMessage()));
                    return false;
                }
                C3515uy c3515uy = new C3515uy(this, Deobfuscator$MHRTUNNELVPN$app.getString(-88140671054778L), str2, false, clientAPI_EvalConfigEval_config_static);
                try {
                    AbstractC3279qd.o0(this, c3515uy.b(), str);
                    String str4 = c3515uy.g;
                    this.w.p(Deobfuscator$MHRTUNNELVPN$app.getString(-88179325760442L), str4);
                    this.w.p(Deobfuscator$MHRTUNNELVPN$app.getString(-88200800596922L), str4);
                    m();
                    f(0, Deobfuscator$MHRTUNNELVPN$app.getString(-88213685498810L), str4, str4, null);
                    return true;
                } catch (IOException unused) {
                    e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-88312469746618L), str2);
                    return false;
                }
            }
        }
        e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-88398369092538L), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.C3461ty r6) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.service.OpenVPNService.k(ty):void");
    }

    public final void l(String str) {
        C3461ty c3461ty = new C3461ty();
        c3461ty.a = str;
        k(c3461ty);
    }

    public final void m() {
        C3569vy c3569vy = new C3569vy(this);
        try {
            C3569vy.a(c3569vy, Deobfuscator$MHRTUNNELVPN$app.getString(-96361238459322L));
            C3569vy.a(c3569vy, Deobfuscator$MHRTUNNELVPN$app.getString(-96395598197690L));
            Collections.sort(c3569vy, new G3(4));
        } catch (IOException unused) {
        }
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-96434252903354L), Deobfuscator$MHRTUNNELVPN$app.getString(-96498677412794L));
        Iterator<E> it = c3569vy.iterator();
        while (it.hasNext()) {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-96601756627898L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-96666181137338L), ((C3515uy) it.next()).toString()));
        }
        this.u = c3569vy;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(defpackage.C3515uy r21, java.lang.String r22, java.lang.String r23, defpackage.C3623wy r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.service.OpenVPNService.o(uy, java.lang.String, java.lang.String, wy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    @Override // android.net.VpnService, android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null || !intent.getAction().equals(Deobfuscator$MHRTUNNELVPN$app.getString(-95497950032826L))) {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-95596734280634L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-95661158790074L), intent));
            return super.onBind(intent);
        }
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-95785712841658L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-95850137351098L), intent));
        return this.o;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-85872928322490L), Deobfuscator$MHRTUNNELVPN$app.getString(-85937352831930L));
        this.q = new Handler(this);
        this.z = (NotificationManager) getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-86066201850810L));
        HashMap map = new HashMap();
        this.e = map;
        map.put(Deobfuscator$MHRTUNNELVPN$app.getString(-101966170780602L), new C3190oy(R.string.reconnecting, 2131230886, 20, 2, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102022005355450L), new C3190oy(R.string.resolve, 2131230886, 30, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102056365093818L), new C3190oy(R.string.wait_proxy, 2131230886, 40, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102103609734074L), new C3190oy(R.string.wait, 2131230886, 50, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102125084570554L), new C3190oy(R.string.connecting, 2131230886, 60, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102172329210810L), new C3190oy(R.string.get_config, 2131230886, 70, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102219573851066L), new C3190oy(R.string.assign_ip, 2131230886, 80, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102262523524026L), new C3190oy(R.string.add_routes, 2131230886, 90, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102309768164282L), new C3190oy(R.string.connected, 2131230885, 100, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102352717837242L), new C3190oy(R.string.disconnected, 2131230899, 0, 2, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102408552412090L), new C3190oy(R.string.auth_failed, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102460092019642L), new C3190oy(R.string.pem_password_fail, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102537401430970L), new C3190oy(R.string.cert_verify_fail, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102610415875002L), new C3190oy(R.string.tls_version_min, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102679135351738L), new C3190oy(R.string.dynamic_challenge, 2131230904, 0, 2, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102756444763066L), new C3190oy(R.string.tun_setup_failed, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102829459207098L), new C3190oy(R.string.tun_iface_create, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102902473651130L), new C3190oy(R.string.tap_not_supported, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-102979783062458L), new C3190oy(R.string.profile_not_found, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103057092473786L), new C3190oy(R.string.config_file_parse_error, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103160171688890L), new C3190oy(R.string.need_creds_error, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103233186132922L), new C3190oy(R.string.creds_error, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103284725740474L), new C3190oy(R.string.connection_timeout, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103366330119098L), new C3190oy(R.string.inactive_timeout, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103439344563130L), new C3190oy(R.string.info_msg, 2131231175, 0, 0, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103460819399610L), new C3190oy(R.string.warn_msg, 2131231175, 0, 0, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103482294236090L), new C3190oy(R.string.proxy_need_creds, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103555308680122L), new C3190oy(R.string.proxy_error, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103606848287674L), new C3190oy(R.string.proxy_context_expired, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103701337568186L), new C3190oy(R.string.epki_error, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103748582208442L), new C3190oy(R.string.epki_invalid_alias, 2131230904, 0, 0, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103830186587066L), new C3190oy(R.string.pause, 2131231169, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103855956390842L), new C3190oy(R.string.resume, 2131230886, 0, 2, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103886021161914L), new C3190oy(R.string.core_thread_active, 2131230886, 10, 1, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-103967625540538L), new C3190oy(R.string.core_thread_inactive, -1, 0, 0, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104057819853754L), new C3190oy(R.string.core_thread_error, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104135129265082L), new C3190oy(R.string.core_thread_abandoned, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104229618545594L), new C3190oy(R.string.client_halt, 2131230904, 0, 3, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104281158153146L), new C3190oy(R.string.client_restart, 2131230886, 0, 2, 0));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104345582662586L), new C3190oy(R.string.profile_import_success, 2131231175, 0, 2, 44));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104444366910394L), new C3190oy(R.string.profile_delete_success, 2131230890, 0, 2, 12));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104543151158202L), new C3190oy(R.string.profile_delete_failed, 2131230904, 0, 2, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104637640438714L), new C3190oy(R.string.profile_parse_error, 2131230904, 0, 3, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104723539784634L), new C3190oy(R.string.profile_conflict, 2131230904, 0, 3, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104796554228666L), new C3190oy(R.string.profile_write_error, 2131230904, 0, 3, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104882453574586L), new C3190oy(R.string.profile_filename_error, 2131230904, 0, 3, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-104981237822394L), new C3190oy(R.string.profile_rename_success, 2131231175, 0, 2, 12));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-105080022070202L), new C3190oy(R.string.profile_rename_failed, 2131230904, 0, 2, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-105174511350714L), new C3190oy(R.string.profile_merge_exception, 2131230904, 0, 2, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-105277590565818L), new C3190oy(R.string.profile_merge_ovpn_ext_fail, 2131230904, 0, 2, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-105397849650106L), new C3190oy(R.string.profile_merge_ovpn_file_fail, 2131230904, 0, 2, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-105522403701690L), new C3190oy(R.string.profile_merge_ref_fail, 2131230904, 0, 2, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-105621187949498L), new C3190oy(R.string.profile_merge_multiple_ref_fail, 2131230904, 0, 2, 4));
        this.e.put(Deobfuscator$MHRTUNNELVPN$app.getString(-105758626902970L), new C3190oy(R.string.ui_reset, 2131231175, 0, 0, 8));
        C2811i1 c2811i1 = new C2811i1();
        c2811i1.e = this;
        c2811i1.c = null;
        c2811i1.b = this;
        Deobfuscator$MHRTUNNELVPN$app.getString(-72446860555194L);
        c2811i1.d = c2811i1.q();
        this.p = c2811i1;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Deobfuscator$MHRTUNNELVPN$app.getString(-85434841658298L));
        intentFilter.addAction(Deobfuscator$MHRTUNNELVPN$app.getString(-85593755448250L));
        intentFilter.addAction(Deobfuscator$MHRTUNNELVPN$app.getString(-85731194401722L));
        C2811i1 c2811i12 = this.p;
        ConnectivityManager connectivityManagerR = c2811i12.r();
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(15).build();
        C3708yb c3708yb = new C3708yb(c2811i12, 0);
        c2811i12.a = c3708yb;
        connectivityManagerR.registerNetworkCallback(networkRequestBuild, c3708yb);
        this.t = new C2827iH(new YD(this), 22);
        this.w = new H2(new YD(this));
        Log.i("JellyBeanHack", String.format("Build.VERSION.SDK_INT=%d", Integer.valueOf(Build.VERSION.SDK_INT)));
        C0102Fe c0102Fe = new C0102Fe(getResources().getString(R.string.proxy_none));
        this.v = c0102Fe;
        String string = Deobfuscator$MHRTUNNELVPN$app.getString(-86122036425658L);
        c0102Fe.c = this;
        c0102Fe.b = string;
        C0102Fe c0102Fe2 = this.v;
        c0102Fe2.getClass();
        try {
            if (((String) c0102Fe2.b) != null) {
                Context context = (Context) c0102Fe2.c;
                String str = (String) c0102Fe2.b;
                C0102Fe c0102FeG = C0102Fe.g((String) c0102Fe2.f, (JSONObject) new JSONTokener(AbstractC3279qd.f0(context.openFileInput(str), str)).nextValue());
                c0102Fe2.e = (TreeMap) c0102FeG.e;
                c0102Fe2.d = (String) c0102FeG.d;
                c0102Fe2.a = false;
            }
        } catch (IOException unused) {
            Log.d("ProxyList", "ProxyList.load: no proxy file present");
        } catch (Exception e) {
            Log.e("ProxyList", "ProxyList.load", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() throws InterruptedException {
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-97456455119802L), Deobfuscator$MHRTUNNELVPN$app.getString(-97520879629242L));
        this.x = true;
        p();
        C2811i1 c2811i1 = this.p;
        c2811i1.r().unregisterNetworkCallback((C3708yb) c2811i1.a);
        super.onDestroy();
    }

    @Override // android.net.VpnService
    public final void onRevoke() throws InterruptedException {
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-97619663877050L), Deobfuscator$MHRTUNNELVPN$app.getString(-97684088386490L));
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r10, int r11, int r12) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rased.vpn.app.service.OpenVPNService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-97254591656890L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-97319016166330L), intent.toString()));
        return super.onUnbind(intent);
    }

    public final void p() throws InterruptedException {
        if (this.a) {
            this.s.stop();
            RunnableC2807hy runnableC2807hy = this.s;
            Thread thread = runnableC2807hy.c;
            if (thread != null) {
                try {
                    thread.join(5000L);
                } catch (InterruptedException unused) {
                }
                if (thread.isAlive()) {
                    ClientAPI_Status clientAPI_Status = new ClientAPI_Status();
                    clientAPI_Status.setError(true);
                    clientAPI_Status.setMessage("CORE_THREAD_ABANDONED");
                    runnableC2807hy.a(clientAPI_Status);
                }
            }
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-97069908063162L), Deobfuscator$MHRTUNNELVPN$app.getString(-97134332572602L));
        }
    }
}

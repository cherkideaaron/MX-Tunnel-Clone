package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNApplication;

/* renamed from: tx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3460tx {
    public static final /* synthetic */ int e = 0;
    public AppOpenAd a = null;
    public boolean b = false;
    public boolean c = false;
    public final /* synthetic */ OpenVPNApplication d;

    static {
        Deobfuscator$MHRTUNNELVPN$app.getString(-17402559689658L);
        Deobfuscator$MHRTUNNELVPN$app.getString(-17475574133690L);
    }

    public C3460tx(OpenVPNApplication openVPNApplication) {
        this.d = openVPNApplication;
    }

    public final void a(Context context) {
        if (this.b || this.a != null) {
            return;
        }
        this.b = true;
        AppOpenAd.load(context, Deobfuscator$MHRTUNNELVPN$app.getString(-17183516357562L), new AdRequest.Builder().build(), new C3352rx(this));
    }

    public final void b(Activity activity, InterfaceC3514ux interfaceC3514ux) {
        if (this.c) {
            return;
        }
        AppOpenAd appOpenAd = this.a;
        boolean z = appOpenAd != null;
        OpenVPNApplication openVPNApplication = this.d;
        if (z) {
            appOpenAd.setFullScreenContentCallback(new C3406sx(this, interfaceC3514ux, activity));
            C3492ub c3492ub = openVPNApplication.d;
            c3492ub.getClass();
            if (c3492ub.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169388567393210L), true)) {
                return;
            }
            this.c = true;
            this.a.show(activity);
            return;
        }
        interfaceC3514ux.h();
        long j = openVPNApplication.c.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-17351020082106L), 0L);
        if (j != 0 && (j == 0 || System.currentTimeMillis() < j + 14400000)) {
            return;
        }
        a(activity);
    }
}

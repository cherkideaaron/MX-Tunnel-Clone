package defpackage;

import android.os.Handler;
import android.view.View;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.mxtunnel.pro.R;
import java.util.Date;
import java.util.WeakHashMap;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.SplashActivity;
import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.TunnelManagerHelper;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* renamed from: wG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3588wG implements CC, InterfaceC2918k0, InterfaceC3155oH, OnFailureListener {
    public Object a;

    public /* synthetic */ C3588wG(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.CC
    public void a() {
        SplashActivity splashActivity = (SplashActivity) this.a;
        splashActivity.c.setText("A problem has occured please try again later or check your internet connection!");
        AbstractC3279qd.j0(splashActivity.getApplicationContext(), "Server/Internet Problem!");
        new Handler().postDelayed(new RunnableC2705g5(this, 25), 3000L);
    }

    @Override // defpackage.InterfaceC2918k0
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = UL.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        C2827iH c2827iH = swipeDismissBehavior.b;
        if (c2827iH != null) {
            c2827iH.y(view);
        }
        return true;
    }

    public void c() {
        AbstractC3698yI abstractC3698yI = (AbstractC3698yI) this.a;
        abstractC3698yI.getClass();
        String str = ((AI) abstractC3698yI).b;
        if (str == null) {
            throw new C2594e4();
        }
        throw new C2594e4(str);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        if (exc instanceof C0329Sk) {
            Logger logger = KP.e;
            logger.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            KP kp = (KP) ((RunnableC3680y0) this.a).c;
            int i = (int) kp.b;
            kp.b = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * kp.b : i != 960 ? 30L : 960L;
            kp.a = (kp.b * 1000) + DefaultClock.getInstance().currentTimeMillis();
            logger.v("Scheduling refresh for " + kp.a, new Object[0]);
            kp.c.postDelayed(kp.d, kp.b * 1000);
        }
    }

    @Override // defpackage.InterfaceC3155oH
    public void onLine(String str) {
        boolean zContains = str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-114387216200634L));
        GO go2 = (GO) this.a;
        if (zContains && !go2.q) {
            GO.s.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-114438755808186L));
            GO.s.startSocksOpenVPN();
            Thread thread = XRayDNSService.r;
            XRayDNSService.q = new Date().getTime();
            Thread thread2 = new Thread(XRayDNSService.s);
            XRayDNSService.r = thread2;
            thread2.start();
            SkStatus.logInfo(R.string.tunnel_start, new Object[0]);
            go2.q = true;
        }
        if (str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-114481705481146L))) {
            GO.s.stopSocksOpenVPN();
            TunnelManagerHelper.stopXRay(go2.a);
        }
        if (!str.contains(Deobfuscator$MHRTUNNELVPN$app.getString(-114550424957882L)) || go2.p) {
            return;
        }
        AbstractC3279qd.j0(go2.a, Deobfuscator$MHRTUNNELVPN$app.getString(-114662094107578L));
        go2.p = true;
    }
}

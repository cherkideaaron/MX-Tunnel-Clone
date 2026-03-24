package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3519v1 implements L7, InterfaceC3627x1, InterfaceC3062mg {
    public final /* synthetic */ C3573w1 a;

    public /* synthetic */ C3519v1(C3573w1 c3573w1) {
        this.a = c3573w1;
    }

    @Override // defpackage.InterfaceC3062mg
    public void b(InterfaceC3258qA interfaceC3258qA) {
        C3573w1 c3573w1 = this.a;
        c3573w1.getClass();
        C0360Uh c0360Uh = C0360Uh.f;
        c0360Uh.t("AnalyticsConnector now available.");
        InterfaceC3411t1 interfaceC3411t1 = (InterfaceC3411t1) interfaceC3258qA.get();
        C2827iH c2827iH = new C2827iH(interfaceC3411t1, 8);
        R2 r2 = new R2(16, false);
        C3465u1 c3465u1 = (C3465u1) interfaceC3411t1;
        C0108Fk c0108FkB = c3465u1.b("clx", r2);
        if (c0108FkB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            C0108Fk c0108FkB2 = c3465u1.b(AppMeasurement.CRASH_ORIGIN, r2);
            if (c0108FkB2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            c0108FkB = c0108FkB2;
        }
        if (c0108FkB == null) {
            c0360Uh.A("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c0360Uh.t("Registered Firebase Analytics listener.");
        C2524cp c2524cp = new C2524cp(7, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        KJ kj = new KJ();
        kj.c = new Object();
        kj.a = c2827iH;
        kj.b = timeUnit;
        synchronized (c3573w1) {
            try {
                Iterator it = ((ArrayList) c3573w1.a).iterator();
                while (it.hasNext()) {
                    c2524cp.d((C2731gd) it.next());
                }
                r2.c = c2524cp;
                r2.b = kj;
                c3573w1.c = c2524cp;
                c3573w1.b = kj;
            } finally {
            }
        }
    }

    @Override // defpackage.L7
    public void d(C2731gd c2731gd) {
        C3573w1 c3573w1 = this.a;
        synchronized (c3573w1) {
            if (((L7) c3573w1.c) instanceof C0376Vg) {
                ((ArrayList) c3573w1.a).add(c2731gd);
            }
            ((L7) c3573w1.c).d(c2731gd);
        }
    }

    @Override // defpackage.InterfaceC3627x1
    public void n(Bundle bundle) {
        ((InterfaceC3627x1) this.a.b).n(bundle);
    }
}

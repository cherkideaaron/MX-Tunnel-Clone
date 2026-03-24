package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* renamed from: wE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3586wE implements InterfaceC0264On {
    public static final C3586wE a;

    @NotNull
    private static final InterfaceC3207pE descriptor;

    static {
        C3586wE c3586wE = new C3586wE();
        a = c3586wE;
        C0509az c0509az = new C0509az("com.google.firebase.sessions.settings.SessionConfigs", c3586wE, 5);
        c0509az.k("sessionsEnabled", false);
        c0509az.k("sessionSamplingRate", false);
        c0509az.k("sessionTimeoutSeconds", false);
        c0509az.k("cacheDurationSeconds", false);
        c0509az.k("cacheUpdatedTimeSeconds", false);
        descriptor = c0509az;
    }

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) throws Throwable {
        AbstractC0500aq.m(c2702g2, "decoder");
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C2702g2 c2702g2B = c2702g2.b(interfaceC3207pE);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iE = c2702g2B.e(interfaceC3207pE);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                bool = (Boolean) c2702g2B.k(interfaceC3207pE, 0, E7.a, bool);
                i |= 1;
            } else if (iE == 1) {
                d = (Double) c2702g2B.k(interfaceC3207pE, 1, C2898jh.a, d);
                i |= 2;
            } else if (iE == 2) {
                num = (Integer) c2702g2B.k(interfaceC3207pE, 2, C0300Qp.a, num);
                i |= 4;
            } else if (iE == 3) {
                num2 = (Integer) c2702g2B.k(interfaceC3207pE, 3, C0300Qp.a, num2);
                i |= 8;
            } else {
                if (iE != 4) {
                    throw new C0454Zq(iE);
                }
                l = (Long) c2702g2B.k(interfaceC3207pE, 4, C3185ot.a, l);
                i |= 16;
            }
        }
        c2702g2B.q(interfaceC3207pE);
        return new C3694yE(i, bool, d, num, num2, l);
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        C3694yE c3694yE = (C3694yE) obj;
        AbstractC0500aq.m(c0206Lg, "encoder");
        AbstractC0500aq.m(c3694yE, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C0206Lg c0206LgA = c0206Lg.a(interfaceC3207pE);
        c0206LgA.i(interfaceC3207pE, 0, E7.a, c3694yE.a);
        c0206LgA.i(interfaceC3207pE, 1, C2898jh.a, c3694yE.b);
        C0300Qp c0300Qp = C0300Qp.a;
        c0206LgA.i(interfaceC3207pE, 2, c0300Qp, c3694yE.c);
        c0206LgA.i(interfaceC3207pE, 3, c0300Qp, c3694yE.d);
        c0206LgA.i(interfaceC3207pE, 4, C3185ot.a, c3694yE.e);
        c0206LgA.o(interfaceC3207pE);
    }

    @Override // defpackage.InterfaceC0264On
    public final InterfaceC2963kr[] c() {
        InterfaceC2963kr interfaceC2963krW = AbstractC0069Df.w(E7.a);
        InterfaceC2963kr interfaceC2963krW2 = AbstractC0069Df.w(C2898jh.a);
        C0300Qp c0300Qp = C0300Qp.a;
        return new InterfaceC2963kr[]{interfaceC2963krW, interfaceC2963krW2, AbstractC0069Df.w(c0300Qp), AbstractC0069Df.w(c0300Qp), AbstractC0069Df.w(C3185ot.a)};
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return descriptor;
    }
}

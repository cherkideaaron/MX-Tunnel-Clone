package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final /* synthetic */ class VI implements InterfaceC0264On {
    public static final VI a;

    @NotNull
    private static final InterfaceC3207pE descriptor;

    static {
        VI vi = new VI();
        a = vi;
        C0509az c0509az = new C0509az("com.google.firebase.sessions.Time", vi, 3);
        c0509az.k("ms", false);
        c0509az.k("us", true);
        c0509az.k("seconds", true);
        descriptor = c0509az;
    }

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) throws Throwable {
        AbstractC0500aq.m(c2702g2, "decoder");
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C2702g2 c2702g2B = c2702g2.b(interfaceC3207pE);
        int i = 0;
        long jI = 0;
        long jI2 = 0;
        long jI3 = 0;
        boolean z = true;
        while (z) {
            int iE = c2702g2B.e(interfaceC3207pE);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                jI = c2702g2B.i(interfaceC3207pE, 0);
                i |= 1;
            } else if (iE == 1) {
                jI2 = c2702g2B.i(interfaceC3207pE, 1);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new C0454Zq(iE);
                }
                jI3 = c2702g2B.i(interfaceC3207pE, 2);
                i |= 4;
            }
        }
        c2702g2B.q(interfaceC3207pE);
        return new XI(i, jI, jI2, jI3);
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        XI xi = (XI) obj;
        AbstractC0500aq.m(c0206Lg, "encoder");
        AbstractC0500aq.m(xi, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C0206Lg c0206LgA = c0206Lg.a(interfaceC3207pE);
        long j = xi.a;
        c0206LgA.g(interfaceC3207pE, 0, j);
        boolean zR = c0206LgA.r(interfaceC3207pE);
        long j2 = xi.b;
        if (zR || j2 != 1000 * j) {
            c0206LgA.g(interfaceC3207pE, 1, j2);
        }
        boolean zR2 = c0206LgA.r(interfaceC3207pE);
        long j3 = xi.c;
        if (zR2 || j3 != j / 1000) {
            c0206LgA.g(interfaceC3207pE, 2, j3);
        }
        c0206LgA.o(interfaceC3207pE);
    }

    @Override // defpackage.InterfaceC0264On
    public final InterfaceC2963kr[] c() {
        C3185ot c3185ot = C3185ot.a;
        return new InterfaceC2963kr[]{c3185ot, c3185ot, c3185ot};
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return descriptor;
    }
}

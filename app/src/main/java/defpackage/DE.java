package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final /* synthetic */ class DE implements InterfaceC0264On {
    public static final DE a;

    @NotNull
    private static final InterfaceC3207pE descriptor;

    static {
        DE de = new DE();
        a = de;
        C0509az c0509az = new C0509az("com.google.firebase.sessions.SessionDetails", de, 4);
        c0509az.k("sessionId", false);
        c0509az.k("firstSessionId", false);
        c0509az.k("sessionIndex", false);
        c0509az.k("sessionStartTimestampUs", false);
        descriptor = c0509az;
    }

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) throws Throwable {
        AbstractC0500aq.m(c2702g2, "decoder");
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C2702g2 c2702g2B = c2702g2.b(interfaceC3207pE);
        int i = 0;
        int iG = 0;
        String strP = null;
        String strP2 = null;
        long jI = 0;
        boolean z = true;
        while (z) {
            int iE = c2702g2B.e(interfaceC3207pE);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strP = c2702g2B.p(interfaceC3207pE, 0);
                i |= 1;
            } else if (iE == 1) {
                strP2 = c2702g2B.p(interfaceC3207pE, 1);
                i |= 2;
            } else if (iE == 2) {
                iG = c2702g2B.g(interfaceC3207pE, 2);
                i |= 4;
            } else {
                if (iE != 3) {
                    throw new C0454Zq(iE);
                }
                jI = c2702g2B.i(interfaceC3207pE, 3);
                i |= 8;
            }
        }
        c2702g2B.q(interfaceC3207pE);
        return new FE(jI, strP, i, iG, strP2);
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        FE fe = (FE) obj;
        AbstractC0500aq.m(c0206Lg, "encoder");
        AbstractC0500aq.m(fe, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C0206Lg c0206LgA = c0206Lg.a(interfaceC3207pE);
        c0206LgA.n(interfaceC3207pE, 0, fe.a);
        c0206LgA.n(interfaceC3207pE, 1, fe.b);
        c0206LgA.d(interfaceC3207pE, 2);
        c0206LgA.e(fe.c);
        c0206LgA.g(interfaceC3207pE, 3, fe.d);
        c0206LgA.o(interfaceC3207pE);
    }

    @Override // defpackage.InterfaceC0264On
    public final InterfaceC2963kr[] c() {
        C3427tH c3427tH = C3427tH.a;
        return new InterfaceC2963kr[]{c3427tH, c3427tH, C0300Qp.a, C3185ot.a};
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return descriptor;
    }
}

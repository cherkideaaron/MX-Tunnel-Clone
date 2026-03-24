package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final /* synthetic */ class Ez implements InterfaceC0264On {
    public static final Ez a;

    @NotNull
    private static final InterfaceC3207pE descriptor;

    static {
        Ez ez = new Ez();
        a = ez;
        C0509az c0509az = new C0509az("com.google.firebase.sessions.ProcessData", ez, 2);
        c0509az.k("pid", false);
        c0509az.k("uuid", false);
        descriptor = c0509az;
    }

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) throws Throwable {
        AbstractC0500aq.m(c2702g2, "decoder");
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C2702g2 c2702g2B = c2702g2.b(interfaceC3207pE);
        String strP = null;
        boolean z = true;
        int i = 0;
        int iG = 0;
        while (z) {
            int iE = c2702g2B.e(interfaceC3207pE);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                iG = c2702g2B.g(interfaceC3207pE, 0);
                i |= 1;
            } else {
                if (iE != 1) {
                    throw new C0454Zq(iE);
                }
                strP = c2702g2B.p(interfaceC3207pE, 1);
                i |= 2;
            }
        }
        c2702g2B.q(interfaceC3207pE);
        return new Gz(i, iG, strP);
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        Gz gz = (Gz) obj;
        AbstractC0500aq.m(c0206Lg, "encoder");
        AbstractC0500aq.m(gz, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C0206Lg c0206LgA = c0206Lg.a(interfaceC3207pE);
        c0206LgA.d(interfaceC3207pE, 0);
        c0206LgA.e(gz.a);
        c0206LgA.n(interfaceC3207pE, 1, gz.b);
        c0206LgA.o(interfaceC3207pE);
    }

    @Override // defpackage.InterfaceC0264On
    public final InterfaceC2963kr[] c() {
        return new InterfaceC2963kr[]{C0300Qp.a, C3427tH.a};
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return descriptor;
    }
}

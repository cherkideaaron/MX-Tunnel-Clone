package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: zE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3748zE implements InterfaceC0264On {
    public static final C3748zE a;

    @NotNull
    private static final InterfaceC3207pE descriptor;

    static {
        C3748zE c3748zE = new C3748zE();
        a = c3748zE;
        C0509az c0509az = new C0509az("com.google.firebase.sessions.SessionData", c3748zE, 3);
        c0509az.k("sessionDetails", false);
        c0509az.k("backgroundTime", true);
        c0509az.k("processDataMap", true);
        descriptor = c0509az;
    }

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) throws Throwable {
        AbstractC0500aq.m(c2702g2, "decoder");
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C2702g2 c2702g2B = c2702g2.b(interfaceC3207pE);
        InterfaceC2963kr[] interfaceC2963krArr = BE.d;
        FE fe = null;
        boolean z = true;
        int i = 0;
        XI xi = null;
        Map map = null;
        while (z) {
            int iE = c2702g2B.e(interfaceC3207pE);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                fe = (FE) c2702g2B.l(interfaceC3207pE, 0, DE.a, fe);
                i |= 1;
            } else if (iE == 1) {
                xi = (XI) c2702g2B.k(interfaceC3207pE, 1, VI.a, xi);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new C0454Zq(iE);
                }
                map = (Map) c2702g2B.k(interfaceC3207pE, 2, interfaceC2963krArr[2], map);
                i |= 4;
            }
        }
        c2702g2B.q(interfaceC3207pE);
        return new BE(i, fe, xi, map);
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        BE be = (BE) obj;
        AbstractC0500aq.m(c0206Lg, "encoder");
        AbstractC0500aq.m(be, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        InterfaceC3207pE interfaceC3207pE = descriptor;
        C0206Lg c0206LgA = c0206Lg.a(interfaceC3207pE);
        AE ae = BE.Companion;
        c0206LgA.k(interfaceC3207pE, 0, DE.a, be.a);
        boolean zR = c0206LgA.r(interfaceC3207pE);
        XI xi = be.b;
        if (zR || xi != null) {
            c0206LgA.i(interfaceC3207pE, 1, VI.a, xi);
        }
        boolean zR2 = c0206LgA.r(interfaceC3207pE);
        Map map = be.c;
        if (zR2 || map != null) {
            c0206LgA.i(interfaceC3207pE, 2, BE.d[2], map);
        }
        c0206LgA.o(interfaceC3207pE);
    }

    @Override // defpackage.InterfaceC0264On
    public final InterfaceC2963kr[] c() {
        return new InterfaceC2963kr[]{DE.a, AbstractC0069Df.w(VI.a), AbstractC0069Df.w(BE.d[2])};
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return descriptor;
    }
}

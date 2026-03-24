package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: tH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3427tH implements InterfaceC2963kr {
    public static final C3427tH a = new C3427tH();
    public static final Az b = new Az("kotlin.String", C3732yz.A);

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) {
        AbstractC0500aq.m(c2702g2, "decoder");
        return c2702g2.o();
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        String str = (String) obj;
        AbstractC0500aq.m(c0206Lg, "encoder");
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c0206Lg.m(str);
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return b;
    }
}

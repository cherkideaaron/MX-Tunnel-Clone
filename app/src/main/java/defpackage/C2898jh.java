package defpackage;

/* renamed from: jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2898jh implements InterfaceC2963kr {
    public static final C2898jh a = new C2898jh();
    public static final Az b = new Az("kotlin.Double", C3732yz.x);

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) {
        AbstractC0500aq.m(c2702g2, "decoder");
        return Double.valueOf(c2702g2.d());
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        AbstractC0500aq.m(c0206Lg, "encoder");
        c0206Lg.c(dDoubleValue);
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return b;
    }
}

package defpackage;

/* renamed from: Qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0300Qp implements InterfaceC2963kr {
    public static final C0300Qp a = new C0300Qp();
    public static final Az b = new Az("kotlin.Int", C3732yz.y);

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) {
        AbstractC0500aq.m(c2702g2, "decoder");
        return Integer.valueOf(c2702g2.f());
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        AbstractC0500aq.m(c0206Lg, "encoder");
        c0206Lg.e(iIntValue);
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return b;
    }
}

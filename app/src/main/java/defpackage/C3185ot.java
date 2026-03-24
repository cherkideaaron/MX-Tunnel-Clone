package defpackage;

/* renamed from: ot, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3185ot implements InterfaceC2963kr {
    public static final C3185ot a = new C3185ot();
    public static final Az b = new Az("kotlin.Long", C3732yz.z);

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) {
        AbstractC0500aq.m(c2702g2, "decoder");
        return Long.valueOf(c2702g2.h());
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        AbstractC0500aq.m(c0206Lg, "encoder");
        c0206Lg.f(jLongValue);
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return b;
    }
}

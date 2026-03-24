package defpackage;

/* loaded from: classes2.dex */
public final class E7 implements InterfaceC2963kr {
    public static final E7 a = new E7();
    public static final Az b = new Az("kotlin.Boolean", C3732yz.w);

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) {
        AbstractC0500aq.m(c2702g2, "decoder");
        return Boolean.valueOf(c2702g2.c());
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC0500aq.m(c0206Lg, "encoder");
        c0206Lg.b(zBooleanValue);
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return b;
    }
}

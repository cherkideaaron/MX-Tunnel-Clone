package defpackage;

/* loaded from: classes2.dex */
public final class Lw implements InterfaceC2963kr {
    public final InterfaceC2963kr a;
    public final C3262qE b;

    public Lw(InterfaceC2963kr interfaceC2963kr) {
        AbstractC0500aq.m(interfaceC2963kr, "serializer");
        this.a = interfaceC2963kr;
        this.b = new C3262qE(interfaceC2963kr.d());
    }

    @Override // defpackage.InterfaceC2963kr
    public final Object a(C2702g2 c2702g2) {
        AbstractC0500aq.m(c2702g2, "decoder");
        if (c2702g2.j()) {
            return c2702g2.n(this.a);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2963kr
    public final void b(C0206Lg c0206Lg, Object obj) {
        AbstractC0500aq.m(c0206Lg, "encoder");
        if (obj != null) {
            c0206Lg.l(this.a, obj);
        } else {
            c0206Lg.h();
        }
    }

    @Override // defpackage.InterfaceC2963kr
    public final InterfaceC3207pE d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Lw.class == obj.getClass() && AbstractC0500aq.b(this.a, ((Lw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

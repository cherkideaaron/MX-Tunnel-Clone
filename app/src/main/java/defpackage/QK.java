package defpackage;

/* loaded from: classes.dex */
public final class QK implements InterfaceC0134Hc {
    public final QK a;
    public final C3658xf b;

    public QK(QK qk, C3658xf c3658xf) {
        AbstractC0500aq.m(c3658xf, "instance");
        this.a = qk;
        this.b = c3658xf;
    }

    public final void a(InterfaceC0272Pe interfaceC0272Pe) {
        AbstractC0500aq.m(interfaceC0272Pe, "candidate");
        if (this.b == interfaceC0272Pe) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.".toString());
        }
        QK qk = this.a;
        if (qk != null) {
            qk.a(interfaceC0272Pe);
        }
    }

    @Override // defpackage.InterfaceC0168Jc
    public final Object fold(Object obj, InterfaceC3396sn interfaceC3396sn) {
        return interfaceC3396sn.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        return AbstractC2883jK.v(this, interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0134Hc
    public final InterfaceC0151Ic getKey() {
        return C0108Fk.o;
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        return AbstractC2883jK.G(this, interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc plus(InterfaceC0168Jc interfaceC0168Jc) {
        return AbstractC2883jK.I(this, interfaceC0168Jc);
    }
}

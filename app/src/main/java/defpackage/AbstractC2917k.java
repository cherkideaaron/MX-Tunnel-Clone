package defpackage;

/* renamed from: k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2917k implements InterfaceC0134Hc {
    public final InterfaceC0151Ic a;

    public AbstractC2917k(InterfaceC0151Ic interfaceC0151Ic) {
        this.a = interfaceC0151Ic;
    }

    @Override // defpackage.InterfaceC0168Jc
    public final Object fold(Object obj, InterfaceC3396sn interfaceC3396sn) {
        return interfaceC3396sn.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC0168Jc
    public InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        return AbstractC2883jK.v(this, interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0134Hc
    public final InterfaceC0151Ic getKey() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0168Jc
    public InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        return AbstractC2883jK.G(this, interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc plus(InterfaceC0168Jc interfaceC0168Jc) {
        return AbstractC2883jK.I(this, interfaceC0168Jc);
    }
}

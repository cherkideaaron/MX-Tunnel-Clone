package defpackage;

/* loaded from: classes2.dex */
public final class HG implements InterfaceC3493uc, InterfaceC0338Tc {
    public final InterfaceC3493uc a;
    public final InterfaceC0168Jc b;

    public HG(InterfaceC3493uc interfaceC3493uc, InterfaceC0168Jc interfaceC0168Jc) {
        this.a = interfaceC3493uc;
        this.b = interfaceC0168Jc;
    }

    @Override // defpackage.InterfaceC0338Tc
    public final InterfaceC0338Tc getCallerFrame() {
        InterfaceC3493uc interfaceC3493uc = this.a;
        if (interfaceC3493uc instanceof InterfaceC0338Tc) {
            return (InterfaceC0338Tc) interfaceC3493uc;
        }
        return null;
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        return this.b;
    }

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}

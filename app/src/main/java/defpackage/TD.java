package defpackage;

/* loaded from: classes2.dex */
public class TD extends AbstractC2862j implements InterfaceC0338Tc {
    public final InterfaceC3493uc d;

    public TD(InterfaceC3493uc interfaceC3493uc, InterfaceC0168Jc interfaceC0168Jc) {
        super(interfaceC0168Jc, true);
        this.d = interfaceC3493uc;
    }

    @Override // defpackage.C0267Oq
    public final boolean D() {
        return true;
    }

    @Override // defpackage.InterfaceC0338Tc
    public final InterfaceC0338Tc getCallerFrame() {
        InterfaceC3493uc interfaceC3493uc = this.d;
        if (interfaceC3493uc instanceof InterfaceC0338Tc) {
            return (InterfaceC0338Tc) interfaceC3493uc;
        }
        return null;
    }

    @Override // defpackage.C0267Oq
    public void j(Object obj) {
        AbstractC0500aq.V(AbstractC0069Df.C(this.d), AbstractC0136He.G(obj));
    }

    @Override // defpackage.C0267Oq
    public void k(Object obj) {
        this.d.resumeWith(AbstractC0136He.G(obj));
    }
}

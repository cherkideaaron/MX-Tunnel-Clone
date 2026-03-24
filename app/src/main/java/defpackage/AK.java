package defpackage;

/* loaded from: classes2.dex */
public final class AK extends TD {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public AK(InterfaceC3493uc interfaceC3493uc, InterfaceC0168Jc interfaceC0168Jc) {
        BK bk = BK.a;
        super(interfaceC3493uc, interfaceC0168Jc.get(bk) == null ? interfaceC0168Jc.plus(bk) : interfaceC0168Jc);
        this.e = new ThreadLocal();
        if (interfaceC3493uc.getContext().get(C3397so.b) instanceof AbstractC0219Mc) {
            return;
        }
        Object objP = AbstractC0136He.P(interfaceC0168Jc, null);
        AbstractC0136He.H(interfaceC0168Jc, objP);
        W(interfaceC0168Jc, objP);
    }

    public final boolean V() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void W(InterfaceC0168Jc interfaceC0168Jc, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new Jy(interfaceC0168Jc, obj));
    }

    @Override // defpackage.TD, defpackage.C0267Oq
    public final void k(Object obj) {
        if (this.threadLocalIsSet) {
            Jy jy = (Jy) this.e.get();
            if (jy != null) {
                AbstractC0136He.H((InterfaceC0168Jc) jy.a, jy.b);
            }
            this.e.remove();
        }
        Object objG = AbstractC0136He.G(obj);
        InterfaceC3493uc interfaceC3493uc = this.d;
        InterfaceC0168Jc context = interfaceC3493uc.getContext();
        Object objP = AbstractC0136He.P(context, null);
        AK akQ = objP != AbstractC0136He.m ? MO.Q(interfaceC3493uc, context, objP) : null;
        try {
            this.d.resumeWith(objG);
        } finally {
            if (akQ == null || akQ.V()) {
                AbstractC0136He.H(context, objP);
            }
        }
    }
}

package defpackage;

/* renamed from: j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2862j extends C0267Oq implements InterfaceC3493uc, InterfaceC0304Rc {
    public final InterfaceC0168Jc c;

    public AbstractC2862j(InterfaceC0168Jc interfaceC0168Jc, boolean z) {
        super(z);
        B((InterfaceC0029Aq) interfaceC0168Jc.get(C0108Fk.e));
        this.c = interfaceC0168Jc.plus(this);
    }

    @Override // defpackage.C0267Oq
    public final void A(C0234Na c0234Na) {
        AbstractC3279qd.J(this.c, c0234Na);
    }

    @Override // defpackage.C0267Oq
    public String G() {
        return super.G();
    }

    @Override // defpackage.C0267Oq
    public final void J(Object obj) {
        if (!(obj instanceof C0217Ma)) {
            T(obj);
            return;
        }
        C0217Ma c0217Ma = (C0217Ma) obj;
        Throwable th = c0217Ma.a;
        c0217Ma.getClass();
        S(C0217Ma.b.get(c0217Ma) != 0, th);
    }

    public final void U(EnumC0355Uc enumC0355Uc, AbstractC2862j abstractC2862j, InterfaceC3396sn interfaceC3396sn) {
        Object objInvoke;
        int iOrdinal = enumC0355Uc.ordinal();
        DK dk = DK.a;
        if (iOrdinal == 0) {
            try {
                AbstractC0500aq.V(AbstractC0069Df.C(AbstractC0069Df.i(this, interfaceC3396sn, abstractC2862j)), dk);
                return;
            } finally {
                resumeWith(AbstractC0115Ga.n(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC0500aq.m(interfaceC3396sn, "<this>");
                AbstractC0069Df.C(AbstractC0069Df.i(this, interfaceC3396sn, abstractC2862j)).resumeWith(dk);
                return;
            }
            if (iOrdinal != 3) {
                throw new C0234Na();
            }
            try {
                InterfaceC0168Jc interfaceC0168Jc = this.c;
                Object objP = AbstractC0136He.P(interfaceC0168Jc, null);
                try {
                    if (interfaceC3396sn instanceof AbstractC2543d7) {
                        AbstractC2883jK.j(2, interfaceC3396sn);
                        objInvoke = interfaceC3396sn.invoke(abstractC2862j, this);
                    } else {
                        objInvoke = AbstractC0069Df.j0(this, interfaceC3396sn, abstractC2862j);
                    }
                    AbstractC0136He.H(interfaceC0168Jc, objP);
                    if (objInvoke != EnumC0321Sc.a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    AbstractC0136He.H(interfaceC0168Jc, objP);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // defpackage.InterfaceC0304Rc
    public final InterfaceC0168Jc g() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        return this.c;
    }

    @Override // defpackage.C0267Oq, defpackage.InterfaceC0029Aq
    public boolean isActive() {
        return super.isActive();
    }

    @Override // defpackage.C0267Oq
    public final String p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(Object obj) {
        Throwable thA = IC.a(obj);
        if (thA != null) {
            obj = new C0217Ma(false, thA);
        }
        Object objF = F(obj);
        if (objF == AbstractC2883jK.d) {
            return;
        }
        k(objF);
    }

    public void T(Object obj) {
    }

    public void S(boolean z, Throwable th) {
    }
}

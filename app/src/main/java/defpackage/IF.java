package defpackage;

/* loaded from: classes2.dex */
public final class IF extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ PF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IF(PF pf, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = pf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new IF(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((IF) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            PF pf = this.b;
            R2 r2 = new R2(pf.e.getData(), new HF(pf, null), 28, false);
            C0489af c0489af = new C0489af(pf, 2);
            this.a = 1;
            if (r2.b(c0489af, this) == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        return DK.a;
    }
}

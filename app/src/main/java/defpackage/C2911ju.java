package defpackage;

/* renamed from: ju, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2911ju extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3076mu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2911ju(C3076mu c3076mu, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3076mu;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C2911ju(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C2911ju) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            AbstractC3241pu abstractC3241pu = this.b.a;
            this.a = 1;
            obj = abstractC3241pu.c(this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        return obj;
    }
}

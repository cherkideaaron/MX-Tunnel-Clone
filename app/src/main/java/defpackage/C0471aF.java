package defpackage;

/* renamed from: aF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0471aF extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C2551dF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471aF(C2551dF c2551dF, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c2551dF;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C0471aF(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0471aF) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            InterfaceC3067ml data = this.b.b.getData();
            this.a = 1;
            obj = AbstractC0069Df.q(data, this);
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

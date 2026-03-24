package defpackage;

/* renamed from: zK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3754zK extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC3177ol c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3754zK(InterfaceC3177ol interfaceC3177ol, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = interfaceC3177ol;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3754zK c3754zK = new C3754zK(this.c, interfaceC3493uc);
        c3754zK.b = obj;
        return c3754zK;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3754zK) create(obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            Object obj2 = this.b;
            this.a = 1;
            if (this.c.d(obj2, this) == enumC0321Sc) {
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

package defpackage;

/* renamed from: pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3226pf extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ InterfaceC3396sn b;
    public final /* synthetic */ C0068De c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3226pf(InterfaceC3396sn interfaceC3396sn, C0068De c0068De, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = interfaceC3396sn;
        this.c = c0068De;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C3226pf(this.b, this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3226pf) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            Object obj2 = this.c.b;
            this.a = 1;
            obj = this.b.invoke(obj2, this);
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

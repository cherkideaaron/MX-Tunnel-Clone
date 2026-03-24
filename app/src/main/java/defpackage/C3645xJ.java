package defpackage;

/* renamed from: xJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3645xJ extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3699yJ b;
    public final /* synthetic */ C0417Xn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3645xJ(C3699yJ c3699yJ, C0417Xn c0417Xn, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3699yJ;
        this.c = c0417Xn;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C3645xJ(this.b, this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3645xJ) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            AJ aj = this.b.a;
            this.a = 1;
            obj = aj.c(this.c, this);
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

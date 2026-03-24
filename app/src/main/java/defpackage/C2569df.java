package defpackage;

/* renamed from: df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2569df extends WH implements InterfaceC2631en {
    public int a;
    public final /* synthetic */ InterfaceC2631en b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2569df(InterfaceC2631en interfaceC2631en, InterfaceC3493uc interfaceC3493uc) {
        super(1, interfaceC3493uc);
        this.b = interfaceC2631en;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(InterfaceC3493uc interfaceC3493uc) {
        return new C2569df(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        return ((C2569df) create((InterfaceC3493uc) obj)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            this.a = 1;
            obj = this.b.invoke(this);
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

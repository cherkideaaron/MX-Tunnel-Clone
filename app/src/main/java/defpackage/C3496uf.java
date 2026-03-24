package defpackage;

/* renamed from: uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3496uf extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3658xf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3496uf(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3496uf c3496uf = new C3496uf(this.c, interfaceC3493uc);
        c3496uf.b = obj;
        return c3496uf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3496uf) create((Uu) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            Uu uu = (Uu) this.b;
            this.a = 1;
            if (C3658xf.c(this.c, uu, this) == enumC0321Sc) {
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

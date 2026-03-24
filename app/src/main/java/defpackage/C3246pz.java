package defpackage;

/* renamed from: pz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3246pz extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC3396sn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3246pz(InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = interfaceC3396sn;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3246pz c3246pz = new C3246pz(this.c, interfaceC3493uc);
        c3246pz.b = obj;
        return c3246pz;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3246pz) create((Rv) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rv rv = (Rv) this.b;
            AbstractC0115Ga.U(obj);
            return rv;
        }
        AbstractC0115Ga.U(obj);
        Rv rv2 = new Rv(Ht.b0(((Rv) this.b).a()), false);
        this.b = rv2;
        this.a = 1;
        return this.c.invoke(rv2, this) == enumC0321Sc ? enumC0321Sc : rv2;
    }
}

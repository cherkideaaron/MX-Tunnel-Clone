package defpackage;

/* renamed from: i9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2819i9 extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC2769hE c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2819i9(InterfaceC2769hE interfaceC2769hE, Object obj, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = interfaceC2769hE;
        this.d = obj;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C2819i9 c2819i9 = new C2819i9(this.c, this.d, interfaceC3493uc);
        c2819i9.b = obj;
        return c2819i9;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C2819i9) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        Object objN;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        Object c2599e9 = DK.a;
        try {
            if (i == 0) {
                AbstractC0115Ga.U(obj);
                InterfaceC2769hE interfaceC2769hE = this.c;
                Object obj2 = this.d;
                this.a = 1;
                if (interfaceC2769hE.d(this, obj2) == enumC0321Sc) {
                    return enumC0321Sc;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0115Ga.U(obj);
            }
            objN = c2599e9;
        } catch (Throwable th) {
            objN = AbstractC0115Ga.n(th);
        }
        if (!(!(objN instanceof HC))) {
            c2599e9 = new C2599e9(IC.a(objN));
        }
        return new C2709g9(c2599e9);
    }
}

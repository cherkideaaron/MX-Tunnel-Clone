package defpackage;

/* renamed from: rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3345rq extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3615wq b;
    public final /* synthetic */ InterfaceC2631en c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3345rq(C3615wq c3615wq, InterfaceC2631en interfaceC2631en, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3615wq;
        this.c = interfaceC2631en;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C3345rq(this.b, this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3345rq) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        C3615wq c3615wq = this.b;
        try {
            if (i == 0) {
                AbstractC0115Ga.U(obj);
                Object obj2 = c3615wq.b.get();
                Boolean bool = Boolean.TRUE;
                if (AbstractC0500aq.b(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                c3615wq.b.set(bool);
                C2916jz c2916jz = c3615wq.c;
                C3292qq c3292qq = new C3292qq(this.c, null);
                this.a = 1;
                obj = c2916jz.a(new C3246pz(c3292qq, null), this);
                if (obj == enumC0321Sc) {
                    return enumC0321Sc;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0115Ga.U(obj);
            }
            return (Rv) obj;
        } finally {
            c3615wq.b.set(Boolean.FALSE);
        }
    }
}

package defpackage;

/* renamed from: of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3171of extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3658xf b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3171of(C3658xf c3658xf, boolean z, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3658xf;
        this.c = z;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C3171of(this.b, this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3171of) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        C3658xf c3658xf = this.b;
        try {
            if (i == 0) {
                AbstractC0115Ga.U(obj);
                if (c3658xf.h.v() instanceof C3286qk) {
                    return c3658xf.h.v();
                }
                this.a = 1;
                if (c3658xf.h(this) == enumC0321Sc) {
                    return enumC0321Sc;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0115Ga.U(obj);
                    return (UG) obj;
                }
                AbstractC0115Ga.U(obj);
            }
            this.a = 2;
            obj = C3658xf.e(c3658xf, this.c, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
            return (UG) obj;
        } catch (Throwable th) {
            return new C2874jB(th, -1);
        }
    }
}

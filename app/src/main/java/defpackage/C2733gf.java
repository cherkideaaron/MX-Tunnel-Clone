package defpackage;

/* renamed from: gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2733gf extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3658xf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2733gf(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C2733gf(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C2733gf) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        DK dk = DK.a;
        C3658xf c3658xf = this.b;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            KJ kj = c3658xf.i;
            this.a = 1;
            Object objL = ((C0166Ja) kj.b).l(this);
            if (objL != enumC0321Sc) {
                objL = dk;
            }
            if (objL == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC0115Ga.U(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        InterfaceC3067ml interfaceC3067mlD = c3658xf.g().d();
        N7 n7 = N7.b;
        boolean z = interfaceC3067mlD instanceof InterfaceC0111Fn;
        C0021Ai c0021Ai = C0021Ai.a;
        InterfaceC3067ml interfaceC3067mlI = z ? ((InterfaceC0111Fn) interfaceC3067mlD).i(c0021Ai, 0, n7) : new C0520b9(interfaceC3067mlD, c0021Ai, 0, n7, 1);
        C0489af c0489af = new C0489af(c3658xf, 1);
        this.a = 2;
        return interfaceC3067mlI.b(c0489af, this) == enumC0321Sc ? enumC0321Sc : dk;
    }
}

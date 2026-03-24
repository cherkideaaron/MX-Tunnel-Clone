package defpackage;

/* renamed from: jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2896jf extends WH implements InterfaceC2631en {
    public Throwable a;
    public int b;
    public final /* synthetic */ C3658xf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2896jf(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(1, interfaceC3493uc);
        this.c = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(InterfaceC3493uc interfaceC3493uc) {
        return new C2896jf(this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        return ((C2896jf) create((InterfaceC3493uc) obj)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        UG c2874jB;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.b;
        C3658xf c3658xf = this.c;
        try {
        } catch (Throwable th2) {
            InterfaceC0334Sp interfaceC0334SpG = c3658xf.g();
            this.a = th2;
            this.b = 2;
            Object objB = interfaceC0334SpG.b(this);
            if (objB == enumC0321Sc) {
                return enumC0321Sc;
            }
            th = th2;
            obj = objB;
        }
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            this.b = 1;
            obj = C3658xf.f(c3658xf, true, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.a;
                AbstractC0115Ga.U(obj);
                c2874jB = new C2874jB(th, ((Number) obj).intValue());
                return new Jy(c2874jB, Boolean.TRUE);
            }
            AbstractC0115Ga.U(obj);
        }
        c2874jB = (UG) obj;
        return new Jy(c2874jB, Boolean.TRUE);
    }
}

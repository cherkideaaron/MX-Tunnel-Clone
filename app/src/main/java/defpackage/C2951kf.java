package defpackage;

/* renamed from: kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2951kf extends WH implements InterfaceC3396sn {
    public Throwable a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ C3658xf d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2951kf(C3658xf c3658xf, int i, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.d = c3658xf;
        this.e = i;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C2951kf c2951kf = new C2951kf(this.d, this.e, interfaceC3493uc);
        c2951kf.c = ((Boolean) obj).booleanValue();
        return c2951kf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C2951kf) create(bool, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        boolean z;
        UG ug;
        boolean z2;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        boolean z3 = this.b;
        C3658xf c3658xf = this.d;
        try {
        } catch (Throwable th2) {
            if (z3 != 0) {
                InterfaceC0334Sp interfaceC0334SpG = c3658xf.g();
                this.a = th2;
                this.c = z3;
                this.b = 2;
                Object objB = interfaceC0334SpG.b(this);
                if (objB == enumC0321Sc) {
                    return enumC0321Sc;
                }
                z = z3;
                th = th2;
                obj = objB;
            } else {
                boolean z4 = z3;
                th = th2;
                iIntValue = this.e;
                z = z4;
            }
        }
        if (z3 == 0) {
            AbstractC0115Ga.U(obj);
            boolean z5 = this.c;
            this.c = z5;
            this.b = 1;
            obj = C3658xf.f(c3658xf, z5, this);
            z3 = z5;
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (z3 != 1) {
                if (z3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.c;
                th = this.a;
                AbstractC0115Ga.U(obj);
                iIntValue = ((Number) obj).intValue();
                C2874jB c2874jB = new C2874jB(th, iIntValue);
                z2 = z;
                ug = c2874jB;
                return new Jy(ug, Boolean.valueOf(z2));
            }
            boolean z6 = this.c;
            AbstractC0115Ga.U(obj);
            z3 = z6;
        }
        ug = (UG) obj;
        z2 = z3;
        return new Jy(ug, Boolean.valueOf(z2));
    }
}

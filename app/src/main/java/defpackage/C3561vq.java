package defpackage;

/* renamed from: vq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3561vq extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3615wq b;
    public final /* synthetic */ C3081mz c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3561vq(C3615wq c3615wq, C3081mz c3081mz, Object obj, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3615wq;
        this.c = c3081mz;
        this.d = obj;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C3561vq(this.b, this.c, this.d, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3561vq) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            C2916jz c2916jz = this.b.c;
            C3507uq c3507uq = new C3507uq(this.c, this.d, null);
            this.a = 1;
            obj = c2916jz.a(new C3246pz(c3507uq, null), this);
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

package defpackage;

/* renamed from: c9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0574c9 extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0520b9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0574c9(C0520b9 c0520b9, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = c0520b9;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0574c9 c0574c9 = new C0574c9(this.c, interfaceC3493uc);
        c0574c9.b = obj;
        return c0574c9;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0574c9) create((InterfaceC3177ol) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        DK dk = DK.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            InterfaceC3177ol interfaceC3177ol = (InterfaceC3177ol) this.b;
            this.a = 1;
            Object objB = ((InterfaceC3067ml) this.c.e).b(interfaceC3177ol, this);
            if (objB != enumC0321Sc) {
                objB = dk;
            }
            if (objB == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        return dk;
    }
}

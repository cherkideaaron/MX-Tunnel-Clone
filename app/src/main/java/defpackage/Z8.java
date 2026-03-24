package defpackage;

/* loaded from: classes2.dex */
public final class Z8 extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC3177ol c;
    public final /* synthetic */ C0520b9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(InterfaceC3177ol interfaceC3177ol, C0520b9 c0520b9, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = interfaceC3177ol;
        this.d = c0520b9;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        Z8 z8 = new Z8(this.c, this.d, interfaceC3493uc);
        z8.b = obj;
        return z8;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((Z8) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        DK dk = DK.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            InterfaceC0304Rc interfaceC0304Rc = (InterfaceC0304Rc) this.b;
            C0520b9 c0520b9 = this.d;
            int i2 = c0520b9.b;
            if (i2 == -3) {
                i2 = -2;
            }
            EnumC0355Uc enumC0355Uc = EnumC0355Uc.b;
            InterfaceC3396sn c0465a9 = new C0465a9(c0520b9, null);
            Rz rz = new Rz(MO.z(interfaceC0304Rc, c0520b9.a), AbstractC0500aq.a(i2, c0520b9.c, 4));
            rz.U(enumC0355Uc, rz, c0465a9);
            this.a = 1;
            Object objZ = AbstractC0500aq.z(this.c, rz, true, this);
            if (objZ != enumC0321Sc) {
                objZ = dk;
            }
            if (objZ == enumC0321Sc) {
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

package defpackage;

/* loaded from: classes.dex */
public final class ZF extends WH implements InterfaceC3396sn {
    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new ZF(2, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        ZF zf = (ZF) create((InterfaceC3177ol) obj, (InterfaceC3493uc) obj2);
        DK dk = DK.a;
        zf.invokeSuspend(dk);
        return dk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        return DK.a;
    }
}

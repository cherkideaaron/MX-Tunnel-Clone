package defpackage;

/* loaded from: classes2.dex */
public final class KF extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;
    public final /* synthetic */ PF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KF(PF pf, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = pf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        KF kf = new KF(this.b, interfaceC3493uc);
        kf.a = obj;
        return kf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((KF) create((BE) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        return BE.a((BE) this.a, null, this.b.d.a(), null, 5);
    }
}

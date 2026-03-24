package defpackage;

/* loaded from: classes.dex */
public final class Gv extends WH implements InterfaceC3396sn {
    public final /* synthetic */ Lv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gv(Lv lv, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.a = lv;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new Gv(this.a, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((Gv) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        return new Integer(C3587wF.b.nativeGetCounterValue(((C3587wF) this.a.i.getValue()).a));
    }
}

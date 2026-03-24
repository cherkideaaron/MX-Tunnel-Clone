package defpackage;

/* renamed from: ou, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3186ou extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;
    public final /* synthetic */ AbstractC3241pu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3186ou(AbstractC3241pu abstractC3241pu, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = abstractC3241pu;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3186ou c3186ou = new C3186ou(this.b, interfaceC3493uc);
        c3186ou.a = obj;
        return c3186ou;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        ((C3186ou) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
        throw null;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        throw null;
    }
}

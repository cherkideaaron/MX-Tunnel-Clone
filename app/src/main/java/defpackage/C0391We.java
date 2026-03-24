package defpackage;

/* renamed from: We, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391We extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0391We c0391We = new C0391We(2, interfaceC3493uc);
        c0391We.a = obj;
        return c0391We;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0391We) create((UG) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        return Boolean.valueOf(!(((UG) this.a) instanceof C3286qk));
    }
}

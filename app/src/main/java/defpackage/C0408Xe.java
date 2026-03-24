package defpackage;

/* renamed from: Xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408Xe extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;
    public final /* synthetic */ UG b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408Xe(UG ug, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = ug;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0408Xe c0408Xe = new C0408Xe(this.b, interfaceC3493uc);
        c0408Xe.a = obj;
        return c0408Xe;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0408Xe) create((UG) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        UG ug = (UG) this.a;
        return Boolean.valueOf((ug instanceof C0068De) && ug.a <= this.b.a);
    }
}

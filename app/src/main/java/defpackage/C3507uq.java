package defpackage;

/* renamed from: uq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3507uq extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3081mz b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3507uq(C3081mz c3081mz, Object obj, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3081mz;
        this.c = obj;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3507uq c3507uq = new C3507uq(this.b, this.c, interfaceC3493uc);
        c3507uq.a = obj;
        return c3507uq;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        C3507uq c3507uq = (C3507uq) create((Rv) obj, (InterfaceC3493uc) obj2);
        DK dk = DK.a;
        c3507uq.invokeSuspend(dk);
        return dk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        ((Rv) this.a).d(this.b, this.c);
        return DK.a;
    }
}

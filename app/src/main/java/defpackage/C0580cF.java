package defpackage;

/* renamed from: cF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0580cF extends WH implements InterfaceC3396sn {
    public final /* synthetic */ C3694yE a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0580cF(C3694yE c3694yE, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.a = c3694yE;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C0580cF(this.a, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0580cF) create((C3694yE) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        return this.a;
    }
}

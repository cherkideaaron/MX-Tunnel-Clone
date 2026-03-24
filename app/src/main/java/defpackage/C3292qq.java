package defpackage;

/* renamed from: qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3292qq extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;
    public final /* synthetic */ InterfaceC2631en b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3292qq(InterfaceC2631en interfaceC2631en, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = interfaceC2631en;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3292qq c3292qq = new C3292qq(this.b, interfaceC3493uc);
        c3292qq.a = obj;
        return c3292qq;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        C3292qq c3292qq = (C3292qq) create((Rv) obj, (InterfaceC3493uc) obj2);
        DK dk = DK.a;
        c3292qq.invokeSuspend(dk);
        return dk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        this.b.invoke((Rv) this.a);
        return DK.a;
    }
}

package defpackage;

/* renamed from: cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2525cq extends AbstractC3547vc {
    public int a;
    public final /* synthetic */ InterfaceC3396sn b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2525cq(InterfaceC3493uc interfaceC3493uc, InterfaceC0168Jc interfaceC0168Jc, InterfaceC3396sn interfaceC3396sn, Object obj) {
        super(interfaceC3493uc, interfaceC0168Jc);
        this.b = interfaceC3396sn;
        this.c = obj;
        AbstractC0500aq.k(interfaceC3493uc, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 2;
            AbstractC0115Ga.U(obj);
            return obj;
        }
        this.a = 1;
        AbstractC0115Ga.U(obj);
        InterfaceC3396sn interfaceC3396sn = this.b;
        AbstractC0500aq.k(interfaceC3396sn, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC2883jK.j(2, interfaceC3396sn);
        return interfaceC3396sn.invoke(this.c, this);
    }
}

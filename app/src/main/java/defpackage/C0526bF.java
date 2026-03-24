package defpackage;

/* renamed from: bF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0526bF extends AbstractC3547vc {
    public /* synthetic */ Object a;
    public final /* synthetic */ C2551dF b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526bF(C2551dF c2551dF, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.b = c2551dF;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}

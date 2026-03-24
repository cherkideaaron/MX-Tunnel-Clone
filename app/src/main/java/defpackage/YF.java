package defpackage;

/* loaded from: classes.dex */
public final class YF extends AbstractC3547vc {
    public Vv a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0472aG d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YF(C0472aG c0472aG, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c0472aG;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, this);
    }
}

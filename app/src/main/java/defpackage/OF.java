package defpackage;

/* loaded from: classes2.dex */
public final class OF extends AbstractC3547vc {
    public String a;
    public JF b;
    public /* synthetic */ Object c;
    public final /* synthetic */ PF d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OF(PF pf, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = pf;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return PF.a(this.d, null, null, this);
    }
}

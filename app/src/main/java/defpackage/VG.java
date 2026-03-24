package defpackage;

/* loaded from: classes2.dex */
public final class VG extends AbstractC3547vc {
    public WG a;
    public InterfaceC3177ol b;
    public XG c;
    public InterfaceC0029Aq d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ WG m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VG(WG wg, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.m = wg;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= Integer.MIN_VALUE;
        this.m.b(null, this);
        return EnumC0321Sc.a;
    }
}

package defpackage;

/* renamed from: Re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306Re extends AbstractC3547vc {
    public Object a;
    public Object b;
    public Object c;
    public OB d;
    public C3658xf e;
    public /* synthetic */ Object f;
    public final /* synthetic */ C0323Se m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0306Re(C0323Se c0323Se, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.m = c0323Se;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}

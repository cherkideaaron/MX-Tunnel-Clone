package defpackage;

/* renamed from: vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3550vf extends AbstractC3547vc {
    public NB a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3658xf c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3550vf(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, false, this);
    }
}

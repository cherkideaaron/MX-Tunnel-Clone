package defpackage;

/* renamed from: ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2678ff extends AbstractC3547vc {
    public C3658xf a;
    public Vv b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3658xf d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2678ff(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C3658xf.d(this.d, this);
    }
}

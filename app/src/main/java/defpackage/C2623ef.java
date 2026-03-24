package defpackage;

/* renamed from: ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2623ef extends AbstractC3547vc {
    public Object a;
    public C3658xf b;
    public InterfaceC0149Ia c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3658xf e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2623ef(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.e = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return C3658xf.c(this.e, null, this);
    }
}

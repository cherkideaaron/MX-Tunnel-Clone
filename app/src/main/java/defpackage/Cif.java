package defpackage;

/* renamed from: if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif extends AbstractC3547vc {
    public C3658xf a;
    public UG b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3658xf e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.e = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return C3658xf.e(this.e, false, this);
    }
}

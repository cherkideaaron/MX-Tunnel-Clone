package defpackage;

/* loaded from: classes2.dex */
public final class KE extends AbstractC3547vc {
    public LE a;
    public /* synthetic */ Object b;
    public final /* synthetic */ LE c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KE(LE le, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = le;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return LE.a(this.c, this);
    }
}

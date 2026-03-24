package defpackage;

/* loaded from: classes2.dex */
public final class RE extends AbstractC3547vc {
    public SE a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SE c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RE(SE se, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = se;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}

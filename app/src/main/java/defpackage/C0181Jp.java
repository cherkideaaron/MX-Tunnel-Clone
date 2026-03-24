package defpackage;

/* renamed from: Jp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0181Jp extends AbstractC3547vc {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0108Fk c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181Jp(C0108Fk c0108Fk, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = c0108Fk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}

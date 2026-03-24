package defpackage;

/* renamed from: Qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289Qe extends AbstractC3547vc {
    public KJ a;
    public /* synthetic */ Object b;
    public final /* synthetic */ KJ c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289Qe(KJ kj, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = kj;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}

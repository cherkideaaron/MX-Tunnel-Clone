package defpackage;

/* renamed from: xl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3664xl extends AbstractC3547vc {
    public C3718yl a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3718yl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3664xl(C3718yl c3718yl, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = c3718yl;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}

package defpackage;

/* renamed from: Cl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0058Cl extends AbstractC3547vc {
    public C3718yl a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ C3718yl d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058Cl(C3718yl c3718yl, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c3718yl;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.d(null, this);
    }
}

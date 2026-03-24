package defpackage;

/* renamed from: zJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3753zJ extends AbstractC3547vc {
    public AJ a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AJ c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3753zJ(AJ aj, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = aj;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AJ.d(this.c, null, this);
    }
}

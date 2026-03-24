package defpackage;

/* renamed from: vl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3556vl extends AbstractC3547vc {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ R2 c;
    public R2 d;
    public InterfaceC3177ol e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3556vl(R2 r2, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = r2;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

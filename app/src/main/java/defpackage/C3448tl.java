package defpackage;

/* renamed from: tl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3448tl extends AbstractC3547vc {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C3502ul c;
    public C3502ul d;
    public InterfaceC3177ol e;
    public C2986lD f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3448tl(C3502ul c3502ul, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = c3502ul;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

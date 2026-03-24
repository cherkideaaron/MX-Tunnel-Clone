package defpackage;

/* renamed from: Bl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0041Bl extends AbstractC3547vc {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C3502ul c;
    public C3718yl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0041Bl(C3502ul c3502ul, InterfaceC3493uc interfaceC3493uc) {
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

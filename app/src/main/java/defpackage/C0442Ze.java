package defpackage;

/* renamed from: Ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442Ze extends AbstractC3547vc {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C0489af c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0442Ze(C0489af c0489af, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = c0489af;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}

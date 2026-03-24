package defpackage;

/* renamed from: zF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3749zF extends AbstractC3547vc {
    public AF a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AF c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3749zF(AF af, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = af;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this, null);
    }
}

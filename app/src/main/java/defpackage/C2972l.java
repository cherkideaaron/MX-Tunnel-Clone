package defpackage;

/* renamed from: l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2972l extends AbstractC3547vc {
    public C2986lD a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2827iH c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2972l(C2827iH c2827iH, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = c2827iH;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

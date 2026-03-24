package defpackage;

/* renamed from: rl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3340rl extends AbstractC3547vc {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C3394sl c;
    public Object d;
    public InterfaceC3177ol e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3340rl(C3394sl c3394sl, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.c = c3394sl;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

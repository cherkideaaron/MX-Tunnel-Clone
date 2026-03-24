package defpackage;

/* renamed from: bC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0523bC extends AbstractC3547vc {
    public Object a;
    public Tv b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C2602eC d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0523bC(C2602eC c2602eC, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c2602eC;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}

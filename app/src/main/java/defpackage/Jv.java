package defpackage;

/* loaded from: classes.dex */
public final class Jv extends AbstractC3547vc {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Lv e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jv(Lv lv, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.e = lv;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}

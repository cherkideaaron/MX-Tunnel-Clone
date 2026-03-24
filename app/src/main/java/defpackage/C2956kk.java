package defpackage;

/* renamed from: kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2956kk extends AbstractC3547vc {
    public C3011lk a;
    public Object b;
    public Object c;
    public C3231pk d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C3011lk f;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2956kk(C3011lk c3011lk, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.f = c3011lk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.m |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}

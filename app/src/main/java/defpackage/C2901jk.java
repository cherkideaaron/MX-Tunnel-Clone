package defpackage;

/* renamed from: jk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2901jk extends AbstractC3547vc {
    public C3011lk a;
    public C2683fk b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3011lk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2901jk(C3011lk c3011lk, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.e = c3011lk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}

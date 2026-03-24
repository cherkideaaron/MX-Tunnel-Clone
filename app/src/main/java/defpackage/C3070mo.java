package defpackage;

/* renamed from: mo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3070mo implements InterfaceC2631en {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3070mo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((C3125no) this.b).c.removeCallbacks((Runnable) this.c);
                return DK.a;
            case 1:
                Rv rv = (Rv) obj;
                C3667xo c3667xo = (C3667xo) this.b;
                c3667xo.getClass();
                C3081mz c3081mz = C3667xo.d;
                String str = (String) this.c;
                rv.d(c3081mz, str);
                c3667xo.h(rv, str);
                return null;
            default:
                ((Vv) this.b).f(((Uv) this.c).b);
                return DK.a;
        }
    }
}

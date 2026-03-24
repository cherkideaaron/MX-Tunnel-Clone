package defpackage;

/* loaded from: classes.dex */
public final class Qs extends AbstractC0478aM {
    public static final C3397so d = new C3397so(19);
    public final C3534vG b = new C3534vG();
    public boolean c = false;

    @Override // defpackage.AbstractC0478aM
    public final void b() {
        C3534vG c3534vG = this.b;
        int i = c3534vG.c;
        for (int i2 = 0; i2 < i; i2++) {
            Os os = (Os) c3534vG.b[i2];
            Ls ls = os.n;
            ls.cancelLoad();
            ls.abandon();
            Ps ps = os.p;
            if (ps != null) {
                os.g(ps);
                if (ps.c) {
                    ps.b.onLoaderReset(ps.a);
                }
            }
            ls.unregisterListener(os);
            if (ps != null) {
                boolean z = ps.c;
            }
            ls.reset();
        }
        int i3 = c3534vG.c;
        Object[] objArr = c3534vG.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        c3534vG.c = 0;
    }
}

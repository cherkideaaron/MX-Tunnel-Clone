package defpackage;

/* loaded from: classes.dex */
public final class Ps implements Tw {
    public final Ls a;
    public final Ms b;
    public boolean c = false;

    public Ps(Ls ls, Ms ms) {
        this.a = ls;
        this.b = ms;
    }

    @Override // defpackage.Tw
    public final void d(Object obj) {
        this.b.onLoadFinished(this.a, obj);
        this.c = true;
    }

    public final String toString() {
        return this.b.toString();
    }
}

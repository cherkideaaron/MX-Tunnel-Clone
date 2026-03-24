package defpackage;

/* loaded from: classes.dex */
public final class r implements Runnable {
    public final AbstractC3463u a;
    public final As b;

    public r(AbstractC3463u abstractC3463u, As as) {
        this.a = abstractC3463u;
        this.b = as;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (AbstractC3463u.f.i(this.a, this, AbstractC3463u.e(this.b))) {
            AbstractC3463u.b(this.a);
        }
    }
}

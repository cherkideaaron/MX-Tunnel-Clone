package defpackage;

/* loaded from: classes.dex */
public final class G extends AbstractC0500aq {
    @Override // defpackage.AbstractC0500aq
    public final void T(H h, H h2) {
        h.b = h2;
    }

    @Override // defpackage.AbstractC0500aq
    public final void U(H h, Thread thread) {
        h.a = thread;
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean f(I i, E e, E e2) {
        synchronized (i) {
            try {
                if (i.b != e) {
                    return false;
                }
                i.b = e2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean g(I i, Object obj, Object obj2) {
        synchronized (i) {
            try {
                if (i.a != obj) {
                    return false;
                }
                i.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean h(I i, H h, H h2) {
        synchronized (i) {
            try {
                if (i.c != h) {
                    return false;
                }
                i.c = h2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

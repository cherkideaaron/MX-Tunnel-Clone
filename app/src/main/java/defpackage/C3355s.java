package defpackage;

/* renamed from: s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3355s extends AbstractC3279qd {
    @Override // defpackage.AbstractC3279qd
    public final void U(C3409t c3409t, C3409t c3409t2) {
        c3409t.b = c3409t2;
    }

    @Override // defpackage.AbstractC3279qd
    public final void V(C3409t c3409t, Thread thread) {
        c3409t.a = thread;
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean h(AbstractC3463u abstractC3463u, C3192p c3192p, C3192p c3192p2) {
        synchronized (abstractC3463u) {
            try {
                if (abstractC3463u.b != c3192p) {
                    return false;
                }
                abstractC3463u.b = c3192p2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean i(AbstractC3463u abstractC3463u, Object obj, Object obj2) {
        synchronized (abstractC3463u) {
            try {
                if (abstractC3463u.a != obj) {
                    return false;
                }
                abstractC3463u.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean j(AbstractC3463u abstractC3463u, C3409t c3409t, C3409t c3409t2) {
        synchronized (abstractC3463u) {
            try {
                if (abstractC3463u.c != c3409t) {
                    return false;
                }
                abstractC3463u.c = c3409t2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

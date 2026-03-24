package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3247q extends AbstractC3279qd {
    public final AtomicReferenceFieldUpdater v;
    public final AtomicReferenceFieldUpdater w;
    public final AtomicReferenceFieldUpdater x;
    public final AtomicReferenceFieldUpdater y;
    public final AtomicReferenceFieldUpdater z;

    public C3247q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.v = atomicReferenceFieldUpdater;
        this.w = atomicReferenceFieldUpdater2;
        this.x = atomicReferenceFieldUpdater3;
        this.y = atomicReferenceFieldUpdater4;
        this.z = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC3279qd
    public final void U(C3409t c3409t, C3409t c3409t2) {
        this.w.lazySet(c3409t, c3409t2);
    }

    @Override // defpackage.AbstractC3279qd
    public final void V(C3409t c3409t, Thread thread) {
        this.v.lazySet(c3409t, thread);
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean h(AbstractC3463u abstractC3463u, C3192p c3192p, C3192p c3192p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.y;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3463u, c3192p, c3192p2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3463u) == c3192p);
        return false;
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean i(AbstractC3463u abstractC3463u, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.z;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3463u, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3463u) == obj);
        return false;
    }

    @Override // defpackage.AbstractC3279qd
    public final boolean j(AbstractC3463u abstractC3463u, C3409t c3409t, C3409t c3409t2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.x;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3463u, c3409t, c3409t2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3463u) == c3409t);
        return false;
    }
}

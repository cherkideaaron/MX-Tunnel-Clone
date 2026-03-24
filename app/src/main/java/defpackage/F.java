package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class F extends AbstractC0500aq {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;

    public F(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicReferenceFieldUpdater2;
        this.m = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.o = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC0500aq
    public final void T(H h, H h2) {
        this.l.lazySet(h, h2);
    }

    @Override // defpackage.AbstractC0500aq
    public final void U(H h, Thread thread) {
        this.k.lazySet(h, thread);
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean f(I i, E e, E e2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(i, e, e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i) == e);
        return false;
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean g(I i, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(i, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i) == obj);
        return false;
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean h(I i, H h, H h2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(i, h, h2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(i) == h);
        return false;
    }
}

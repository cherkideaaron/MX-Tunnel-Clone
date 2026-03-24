package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Fq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0114Fq extends C0558bt implements InterfaceC2680fh, InterfaceC3344rp {
    public C0267Oq d;

    @Override // defpackage.InterfaceC3344rp
    public final C3513uw b() {
        return null;
    }

    @Override // defpackage.InterfaceC2680fh
    public final void c() {
        C0267Oq c0267OqI = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0267Oq.a;
            Object obj = atomicReferenceFieldUpdater.get(c0267OqI);
            if (obj instanceof AbstractC0114Fq) {
                if (obj != this) {
                    return;
                }
                C3715yi c3715yi = AbstractC2883jK.i;
                while (!atomicReferenceFieldUpdater.compareAndSet(c0267OqI, obj, c3715yi)) {
                    if (atomicReferenceFieldUpdater.get(c0267OqI) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC3344rp) || ((InterfaceC3344rp) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0558bt.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C2767hC) {
                    C0558bt c0558bt = ((C2767hC) obj2).a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC0500aq.k(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C0558bt c0558bt2 = (C0558bt) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C0558bt.c;
                C2767hC c2767hC = (C2767hC) atomicReferenceFieldUpdater3.get(c0558bt2);
                if (c2767hC == null) {
                    c2767hC = new C2767hC(c0558bt2);
                    atomicReferenceFieldUpdater3.set(c0558bt2, c2767hC);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c2767hC)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c0558bt2.e();
                return;
            }
        }
    }

    public InterfaceC0029Aq getParent() {
        return i();
    }

    public final C0267Oq i() {
        C0267Oq c0267Oq = this.d;
        if (c0267Oq != null) {
            return c0267Oq;
        }
        AbstractC0500aq.d0("job");
        throw null;
    }

    @Override // defpackage.InterfaceC3344rp
    public final boolean isActive() {
        return true;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override // defpackage.C0558bt
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0069Df.u(this) + "[job@" + AbstractC0069Df.u(i()) + ']';
    }
}

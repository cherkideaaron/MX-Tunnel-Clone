package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: rb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3330rb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3330rb.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3330rb.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC3330rb(AbstractC3330rb abstractC3330rb) {
        this._prev$volatile = abstractC3330rb;
    }

    public final void b() {
        b.set(this, null);
    }

    public final AbstractC3330rb c() {
        Object obj = a.get(this);
        if (obj == AbstractC2883jK.a) {
            return null;
        }
        return (AbstractC3330rb) obj;
    }

    public abstract boolean d();

    public final void e() {
        AbstractC3330rb abstractC3330rbC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            AbstractC3330rb abstractC3330rb = (AbstractC3330rb) atomicReferenceFieldUpdater.get(this);
            while (abstractC3330rb != null && abstractC3330rb.d()) {
                abstractC3330rb = (AbstractC3330rb) atomicReferenceFieldUpdater.get(abstractC3330rb);
            }
            AbstractC3330rb abstractC3330rbC2 = c();
            AbstractC0500aq.j(abstractC3330rbC2);
            while (abstractC3330rbC2.d() && (abstractC3330rbC = abstractC3330rbC2.c()) != null) {
                abstractC3330rbC2 = abstractC3330rbC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC3330rbC2);
                AbstractC3330rb abstractC3330rb2 = ((AbstractC3330rb) obj) == null ? null : abstractC3330rb;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC3330rbC2, obj, abstractC3330rb2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC3330rbC2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC3330rb != null) {
                a.set(abstractC3330rb, abstractC3330rbC2);
            }
            if (!abstractC3330rbC2.d() || abstractC3330rbC2.c() == null) {
                if (abstractC3330rb == null || !abstractC3330rb.d()) {
                    return;
                }
            }
        }
    }
}

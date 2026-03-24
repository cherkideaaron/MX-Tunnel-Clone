package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ct, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2528ct {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C2528ct.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C2637et(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C2637et c2637et = (C2637et) atomicReferenceFieldUpdater.get(this);
            int iA = c2637et.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C2637et c2637etC = c2637et.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2637et, c2637etC) && atomicReferenceFieldUpdater.get(this) == c2637et) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C2637et c2637et = (C2637et) atomicReferenceFieldUpdater.get(this);
            if (c2637et.b()) {
                return;
            }
            C2637et c2637etC = c2637et.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2637et, c2637etC) && atomicReferenceFieldUpdater.get(this) == c2637et) {
            }
        }
    }

    public final int c() {
        C2637et c2637et = (C2637et) a.get(this);
        c2637et.getClass();
        long j = C2637et.f.get(c2637et);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C2637et c2637et = (C2637et) atomicReferenceFieldUpdater.get(this);
            Object objD = c2637et.d();
            if (objD != C2637et.g) {
                return objD;
            }
            C2637et c2637etC = c2637et.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2637et, c2637etC) && atomicReferenceFieldUpdater.get(this) == c2637et) {
            }
        }
    }
}

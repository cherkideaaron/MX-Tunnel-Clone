package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: bt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0558bt {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C0558bt.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C0558bt.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C0558bt.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean d(C0558bt c0558bt, int i) {
        while (true) {
            C0558bt c0558btE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (c0558btE == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c0558btE = (C0558bt) obj;
                    if (!c0558btE.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0558btE);
                }
            }
            if (c0558btE instanceof C3074ms) {
                return (((C3074ms) c0558btE).d & i) == 0 && c0558btE.d(c0558bt, i);
            }
            atomicReferenceFieldUpdater.set(c0558bt, c0558btE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(c0558bt, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c0558btE, this, c0558bt)) {
                if (atomicReferenceFieldUpdater2.get(c0558btE) != this) {
                    break;
                }
            }
            c0558bt.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((defpackage.C2767hC) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0558bt e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C0558bt.b
            java.lang.Object r1 = r0.get(r9)
            bt r1 = (defpackage.C0558bt) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.C0558bt.a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.C2767hC
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            hC r6 = (defpackage.C2767hC) r6
            bt r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            bt r3 = (defpackage.C0558bt) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            defpackage.AbstractC0500aq.k(r6, r4)
            r4 = r6
            bt r4 = (defpackage.C0558bt) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0558bt.e():bt");
    }

    public final void f(C0558bt c0558bt) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            C0558bt c0558bt2 = (C0558bt) atomicReferenceFieldUpdater.get(c0558bt);
            if (a.get(this) != c0558bt) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0558bt, c0558bt2, this)) {
                if (atomicReferenceFieldUpdater.get(c0558bt) != c0558bt2) {
                    break;
                }
            }
            if (h()) {
                c0558bt.e();
                return;
            }
            return;
        }
    }

    public final C0558bt g() {
        C0558bt c0558bt;
        Object obj = a.get(this);
        C2767hC c2767hC = obj instanceof C2767hC ? (C2767hC) obj : null;
        if (c2767hC != null && (c0558bt = c2767hC.a) != null) {
            return c0558bt;
        }
        AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C0558bt) obj;
    }

    public boolean h() {
        return a.get(this) instanceof C2767hC;
    }

    public String toString() {
        return new C0503at(this, AbstractC0069Df.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0069Df.u(this);
    }
}

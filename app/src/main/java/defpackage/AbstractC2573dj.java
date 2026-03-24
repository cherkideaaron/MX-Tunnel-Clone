package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2573dj extends AbstractC2627ej implements InterfaceC3227pg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(AbstractC2573dj.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(AbstractC2573dj.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(AbstractC2573dj.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public InterfaceC2680fh a(long j, RunnableC0584cJ runnableC0584cJ, InterfaceC0168Jc interfaceC0168Jc) {
        return AbstractC0188Kf.a.a(j, runnableC0584cJ, interfaceC0168Jc);
    }

    @Override // defpackage.InterfaceC3227pg
    public final void b(long j, B8 b8) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0446Zi c0446Zi = new C0446Zi(this, j2 + jNanoTime, b8);
            r(jNanoTime, c0446Zi);
            AbstractC3279qd.K(b8, new C3364s8(c0446Zi, 2));
        }
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        n(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    @Override // defpackage.AbstractC2627ej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k() {
        /*
            r10 = this;
            boolean r0 = r10.l()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            r10.o()
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.AbstractC2573dj.m
            java.lang.Object r3 = r0.get(r10)
            ri r4 = defpackage.MO.g
            r5 = 0
            if (r3 != 0) goto L19
        L17:
            r7 = r5
            goto L49
        L19:
            boolean r6 = r3 instanceof defpackage.C2637et
            if (r6 == 0) goto L3d
            r6 = r3
            et r6 = (defpackage.C2637et) r6
            java.lang.Object r7 = r6.d()
            ri r8 = defpackage.C2637et.g
            if (r7 == r8) goto L2b
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L49
        L2b:
            et r6 = r6.c()
        L2f:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L36
            goto Lc
        L36:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L2f
            goto Lc
        L3d:
            if (r3 != r4) goto L40
            goto L17
        L40:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb7
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L49:
            if (r7 == 0) goto L4f
            r7.run()
            return r1
        L4f:
            T3 r3 = r10.e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5a
        L58:
            r8 = r6
            goto L62
        L5a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L61
            goto L58
        L61:
            r8 = r1
        L62:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L67
            goto Lb6
        L67:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L8f
            boolean r3 = r0 instanceof defpackage.C2637et
            if (r3 == 0) goto L8b
            et r0 = (defpackage.C2637et) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.C2637et.f
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto Lb6
            goto L8f
        L8b:
            if (r0 != r4) goto Lb6
        L8d:
            r1 = r6
            goto Lb6
        L8f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.AbstractC2573dj.n
            java.lang.Object r0 = r0.get(r10)
            cj r0 = (defpackage.C0602cj) r0
            if (r0 == 0) goto L8d
            monitor-enter(r0)
            bj[] r3 = r0.a     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La1
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La1:
            monitor-exit(r0)
            if (r5 != 0) goto La5
            goto L8d
        La5:
            long r3 = r5.a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb1
            goto Lb6
        Lb1:
            r1 = r3
            goto Lb6
        Lb3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb6:
            return r1
        Lb7:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L40
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2573dj.k():long");
    }

    public void n(Runnable runnable) {
        o();
        if (!p(runnable)) {
            RunnableC0171Jf.p.n(runnable);
            return;
        }
        Thread threadI = i();
        if (Thread.currentThread() != threadI) {
            LockSupport.unpark(threadI);
        }
    }

    public final void o() {
        AbstractRunnableC0548bj abstractRunnableC0548bjC;
        C0602cj c0602cj = (C0602cj) n.get(this);
        if (c0602cj == null || SI.b.get(c0602cj) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c0602cj) {
                try {
                    AbstractRunnableC0548bj[] abstractRunnableC0548bjArr = c0602cj.a;
                    abstractRunnableC0548bjC = null;
                    AbstractRunnableC0548bj abstractRunnableC0548bj = abstractRunnableC0548bjArr != null ? abstractRunnableC0548bjArr[0] : null;
                    if (abstractRunnableC0548bj != null) {
                        if (jNanoTime - abstractRunnableC0548bj.a >= 0 ? p(abstractRunnableC0548bj) : false) {
                            abstractRunnableC0548bjC = c0602cj.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC0548bjC != null);
    }

    public final boolean p(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (o.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof C2637et)) {
                if (obj == MO.g) {
                    return false;
                }
                C2637et c2637et = new C2637et(8, true);
                c2637et.a((Runnable) obj);
                c2637et.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2637et)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            C2637et c2637et2 = (C2637et) obj;
            int iA = c2637et2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C2637et c2637etC = c2637et2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2637etC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean q() {
        T3 t3 = this.e;
        if (!(t3 != null ? t3.isEmpty() : true)) {
            return false;
        }
        C0602cj c0602cj = (C0602cj) n.get(this);
        if (c0602cj != null && SI.b.get(c0602cj) != 0) {
            return false;
        }
        Object obj = m.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C2637et) {
            long j = C2637et.f.get((C2637et) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == MO.g) {
            return true;
        }
        return false;
    }

    public final void r(long j, AbstractRunnableC0548bj abstractRunnableC0548bj) {
        int iD;
        Thread threadI;
        boolean z = o.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (z) {
            iD = 1;
        } else {
            C0602cj c0602cj = (C0602cj) atomicReferenceFieldUpdater.get(this);
            if (c0602cj == null) {
                C0602cj c0602cj2 = new C0602cj();
                c0602cj2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0602cj2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC0500aq.j(obj);
                c0602cj = (C0602cj) obj;
            }
            iD = abstractRunnableC0548bj.d(j, c0602cj, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                m(j, abstractRunnableC0548bj);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        C0602cj c0602cj3 = (C0602cj) atomicReferenceFieldUpdater.get(this);
        if (c0602cj3 != null) {
            synchronized (c0602cj3) {
                AbstractRunnableC0548bj[] abstractRunnableC0548bjArr = c0602cj3.a;
                abstractRunnableC0548bj = abstractRunnableC0548bjArr != null ? abstractRunnableC0548bjArr[0] : null;
            }
        }
        if (abstractRunnableC0548bj != abstractRunnableC0548bj || Thread.currentThread() == (threadI = i())) {
            return;
        }
        LockSupport.unpark(threadI);
    }

    @Override // defpackage.AbstractC2627ej
    public void shutdown() {
        AbstractRunnableC0548bj abstractRunnableC0548bjC;
        ThreadLocal threadLocal = RI.a;
        RI.a.set(null);
        o.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3337ri c3337ri = MO.g;
            if (obj != null) {
                if (!(obj instanceof C2637et)) {
                    if (obj != c3337ri) {
                        C2637et c2637et = new C2637et(8, true);
                        c2637et.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2637et)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C2637et) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c3337ri)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (k() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0602cj c0602cj = (C0602cj) n.get(this);
            if (c0602cj == null) {
                return;
            }
            synchronized (c0602cj) {
                abstractRunnableC0548bjC = SI.b.get(c0602cj) > 0 ? c0602cj.c(0) : null;
            }
            if (abstractRunnableC0548bjC == null) {
                return;
            } else {
                m(jNanoTime, abstractRunnableC0548bjC);
            }
        }
    }
}

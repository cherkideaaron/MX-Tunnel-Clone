package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Qc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC0287Qc implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(ExecutorC0287Qc.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(ExecutorC0287Qc.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0287Qc.class, "_isTerminated$volatile");
    public static final C3337ri q = new C3337ri("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final C2632eo e;
    public final C2632eo f;
    public final C3368sC m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC0287Qc(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            throw new IllegalArgumentException(Vs.l(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC3264qG.e(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(Vs.l(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.e = new C2632eo();
        this.f = new C2632eo();
        this.m = new C3368sC((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.m) {
            try {
                if (p.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = o;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.m.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C0253Oc c0253Oc = new C0253Oc(this, i3);
                this.m.c(i3, c0253Oc);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i4 = i2 + 1;
                c0253Oc.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC3428tI c3536vI;
        EnumC0270Pc enumC0270Pc;
        AbstractC3590wI.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC3428tI) {
            c3536vI = (AbstractRunnableC3428tI) runnable;
            c3536vI.a = jNanoTime;
            c3536vI.b = z;
        } else {
            c3536vI = new C3536vI(runnable, jNanoTime, z);
        }
        boolean z3 = c3536vI.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0253Oc c0253Oc = threadCurrentThread instanceof C0253Oc ? (C0253Oc) threadCurrentThread : null;
        if (c0253Oc == null || !AbstractC0500aq.b(c0253Oc.n, this)) {
            c0253Oc = null;
        }
        if (c0253Oc != null && (enumC0270Pc = c0253Oc.c) != EnumC0270Pc.e && (c3536vI.b || enumC0270Pc != EnumC0270Pc.b)) {
            c0253Oc.m = true;
            C2724gO c2724gO = c0253Oc.a;
            if (z2) {
                c3536vI = c2724gO.a(c3536vI);
            } else {
                c2724gO.getClass();
                AbstractRunnableC3428tI abstractRunnableC3428tI = (AbstractRunnableC3428tI) C2724gO.b.getAndSet(c2724gO, c3536vI);
                c3536vI = abstractRunnableC3428tI == null ? null : c2724gO.a(abstractRunnableC3428tI);
            }
        }
        if (c3536vI != null) {
            if (!(c3536vI.b ? this.f : this.e).a(c3536vI)) {
                throw new RejectedExecutionException(AbstractC3264qG.l(new StringBuilder(), this.d, " was terminated"));
            }
        }
        boolean z4 = z2 && c0253Oc != null;
        if (z3) {
            if (z4 || g() || f(jAddAndGet)) {
                return;
            }
            g();
            return;
        }
        if (z4 || g() || f(atomicLongFieldUpdater.get(this))) {
            return;
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ExecutorC0287Qc.p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.C0253Oc
            r3 = 0
            if (r1 == 0) goto L18
            Oc r0 = (defpackage.C0253Oc) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            Qc r1 = r0.n
            boolean r1 = defpackage.AbstractC0500aq.b(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            sC r1 = r8.m
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.ExecutorC0287Qc.o     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            sC r5 = r8.m
            java.lang.Object r5 = r5.b(r1)
            defpackage.AbstractC0500aq.j(r5)
            Oc r5 = (defpackage.C0253Oc) r5
            if (r5 == r0) goto L74
        L44:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L55
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L55:
            gO r5 = r5.a
            eo r6 = r8.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.C2724gO.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            tI r7 = (defpackage.AbstractRunnableC3428tI) r7
            if (r7 == 0) goto L69
            r6.a(r7)
        L69:
            tI r7 = r5.b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            eo r1 = r8.f
            r1.b()
            eo r1 = r8.e
            r1.b()
        L83:
            if (r0 == 0) goto L8b
            tI r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            eo r1 = r8.e
            java.lang.Object r1 = r1.d()
            tI r1 = (defpackage.AbstractRunnableC3428tI) r1
            if (r1 != 0) goto Lb3
            eo r1 = r8.f
            java.lang.Object r1 = r1.d()
            tI r1 = (defpackage.AbstractRunnableC3428tI) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            Pc r1 = defpackage.EnumC0270Pc.e
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0287Qc.n
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0287Qc.o
            r0.set(r8, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L83
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L83
        Lc4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ExecutorC0287Qc.close():void");
    }

    public final void e(C0253Oc c0253Oc, int i, int i2) {
        while (true) {
            long j = n.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = c0253Oc.c();
                    while (true) {
                        if (objC == q) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        C0253Oc c0253Oc2 = (C0253Oc) objC;
                        int iB = c0253Oc2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = c0253Oc2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (n.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false, false);
    }

    public final boolean f(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        C3337ri c3337ri;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            C0253Oc c0253Oc = (C0253Oc) this.m.b((int) (2097151 & j));
            if (c0253Oc == null) {
                c0253Oc = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = c0253Oc.c();
                while (true) {
                    c3337ri = q;
                    if (objC == c3337ri) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    C0253Oc c0253Oc2 = (C0253Oc) objC;
                    iB = c0253Oc2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c0253Oc2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | iB)) {
                    c0253Oc.g(c3337ri);
                }
            }
            if (c0253Oc == null) {
                return false;
            }
            if (C0253Oc.o.compareAndSet(c0253Oc, -1, 0)) {
                LockSupport.unpark(c0253Oc);
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        C3368sC c3368sC = this.m;
        int iA = c3368sC.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            C0253Oc c0253Oc = (C0253Oc) c3368sC.b(i6);
            if (c0253Oc != null) {
                C2724gO c2724gO = c0253Oc.a;
                c2724gO.getClass();
                int i7 = C2724gO.b.get(c2724gO) != null ? (C2724gO.c.get(c2724gO) - C2724gO.d.get(c2724gO)) + 1 : C2724gO.c.get(c2724gO) - C2724gO.d.get(c2724gO);
                int iOrdinal = c0253Oc.c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    sb = new StringBuilder();
                    sb.append(i7);
                    c = 'c';
                } else if (iOrdinal == 1) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(i7);
                    c = 'b';
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        sb = new StringBuilder();
                        sb.append(i7);
                        c = 'd';
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C0234Na();
                    }
                    i5++;
                }
                sb.append(c);
                arrayList.add(sb.toString());
            }
        }
        long j = o.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.d);
        sb2.append('@');
        sb2.append(AbstractC0069Df.u(this));
        sb2.append("[Pool Size {core = ");
        int i8 = this.a;
        sb2.append(i8);
        sb2.append(", max = ");
        sb2.append(this.b);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i);
        sb2.append(", blocking = ");
        sb2.append(i2);
        sb2.append(", parked = ");
        sb2.append(i3);
        sb2.append(", dormant = ");
        sb2.append(i4);
        sb2.append(", terminated = ");
        sb2.append(i5);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.e.c());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.f.c());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }
}

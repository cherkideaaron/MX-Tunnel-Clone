package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* renamed from: Oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0253Oc extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(C0253Oc.class, "workerCtl$volatile");
    public final C2724gO a;
    public final OB b;
    public EnumC0270Pc c;
    public long d;
    public long e;
    public int f;
    private volatile int indexInArray;
    public boolean m;
    public final /* synthetic */ ExecutorC0287Qc n;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C0253Oc(ExecutorC0287Qc executorC0287Qc, int i) {
        this.n = executorC0287Qc;
        setDaemon(true);
        setContextClassLoader(executorC0287Qc.getClass().getClassLoader());
        this.a = new C2724gO();
        this.b = new OB();
        this.c = EnumC0270Pc.d;
        this.nextParkedWorker = ExecutorC0287Qc.q;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = defpackage.C2724gO.d.get(r3);
        r0 = defpackage.C2724gO.c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (defpackage.C2724gO.e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractRunnableC3428tI a(boolean r13) {
        /*
            r12 = this;
            Pc r0 = r12.c
            Pc r1 = defpackage.EnumC0270Pc.a
            r2 = 0
            gO r3 = r12.a
            r4 = 1
            Qc r5 = r12.n
            if (r0 != r1) goto Le
            goto L88
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0287Qc.o
        L10:
            Qc r7 = r12.n
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r1 = 42
            long r10 = r10 >> r1
            int r1 = (int) r10
            if (r1 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.C2724gO.b
            java.lang.Object r0 = r13.get(r3)
            tI r0 = (defpackage.AbstractRunnableC3428tI) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.b
            if (r1 != r4) goto L43
        L34:
            boolean r1 = r13.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r13.get(r3)
            if (r1 == r0) goto L34
            goto L25
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.C2724gO.d
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.C2724gO.c
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.C2724gO.e
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            tI r1 = r3.c(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            eo r13 = r5.f
            java.lang.Object r13 = r13.d()
            r2 = r13
            tI r2 = (defpackage.AbstractRunnableC3428tI) r2
            if (r2 != 0) goto L74
            tI r2 = r12.i(r4)
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.ExecutorC0287Qc.o
            boolean r1 = r6.compareAndSet(r7, r8, r10)
            if (r1 == 0) goto L10
            Pc r0 = defpackage.EnumC0270Pc.a
            r12.c = r0
        L88:
            if (r13 == 0) goto Lbc
            int r13 = r5.a
            int r13 = r13 * 2
            int r13 = r12.d(r13)
            if (r13 != 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L9f
            tI r13 = r12.e()
            if (r13 == 0) goto L9f
            goto Lc8
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.C2724gO.b
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            tI r13 = (defpackage.AbstractRunnableC3428tI) r13
            if (r13 != 0) goto Lb0
            tI r13 = r3.b()
        Lb0:
            if (r13 == 0) goto Lb3
            goto Lc8
        Lb3:
            if (r4 != 0) goto Lc3
            tI r13 = r12.e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lbc:
            tI r13 = r12.e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lc3:
            r13 = 3
            tI r13 = r12.i(r13)
        Lc8:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0253Oc.a(boolean):tI");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i;
    }

    public final AbstractRunnableC3428tI e() {
        C2632eo c2632eo;
        int iD = d(2);
        ExecutorC0287Qc executorC0287Qc = this.n;
        if (iD == 0) {
            AbstractRunnableC3428tI abstractRunnableC3428tI = (AbstractRunnableC3428tI) executorC0287Qc.e.d();
            if (abstractRunnableC3428tI != null) {
                return abstractRunnableC3428tI;
            }
            c2632eo = executorC0287Qc.f;
        } else {
            AbstractRunnableC3428tI abstractRunnableC3428tI2 = (AbstractRunnableC3428tI) executorC0287Qc.f.d();
            if (abstractRunnableC3428tI2 != null) {
                return abstractRunnableC3428tI2;
            }
            c2632eo = executorC0287Qc.e;
        }
        return (AbstractRunnableC3428tI) c2632eo.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(EnumC0270Pc enumC0270Pc) {
        EnumC0270Pc enumC0270Pc2 = this.c;
        boolean z = enumC0270Pc2 == EnumC0270Pc.a;
        if (z) {
            ExecutorC0287Qc.o.addAndGet(this.n, 4398046511104L);
        }
        if (enumC0270Pc2 != enumC0270Pc) {
            this.c = enumC0270Pc;
        }
        return z;
    }

    public final AbstractRunnableC3428tI i(int i) {
        AbstractRunnableC3428tI abstractRunnableC3428tIC;
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0287Qc.o;
        ExecutorC0287Qc executorC0287Qc = this.n;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC0287Qc) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            C0253Oc c0253Oc = (C0253Oc) executorC0287Qc.m.b(iD);
            if (c0253Oc != null && c0253Oc != this) {
                C2724gO c2724gO = c0253Oc.a;
                if (i == 3) {
                    abstractRunnableC3428tIC = c2724gO.b();
                } else {
                    c2724gO.getClass();
                    int i4 = C2724gO.d.get(c2724gO);
                    int i5 = C2724gO.c.get(c2724gO);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || C2724gO.e.get(c2724gO) != 0)) {
                        int i6 = i4 + 1;
                        abstractRunnableC3428tIC = c2724gO.c(i4, z);
                        if (abstractRunnableC3428tIC != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    abstractRunnableC3428tIC = null;
                }
                OB ob = this.b;
                if (abstractRunnableC3428tIC != null) {
                    ob.a = abstractRunnableC3428tIC;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2724gO.b;
                        AbstractRunnableC3428tI abstractRunnableC3428tI = (AbstractRunnableC3428tI) atomicReferenceFieldUpdater.get(c2724gO);
                        j = -2;
                        if (abstractRunnableC3428tI == null) {
                            break;
                        }
                        if (((abstractRunnableC3428tI.b ? 1 : 2) & i) != 0) {
                            AbstractC3590wI.f.getClass();
                            long jNanoTime = System.nanoTime() - abstractRunnableC3428tI.a;
                            long j3 = AbstractC3590wI.b;
                            if (jNanoTime >= j3) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(c2724gO, abstractRunnableC3428tI, null)) {
                                    if (atomicReferenceFieldUpdater.get(c2724gO) != abstractRunnableC3428tI) {
                                        break;
                                    }
                                }
                                ob.a = abstractRunnableC3428tI;
                                j = -1;
                                break;
                            }
                            j = j3 - jNanoTime;
                            break;
                        }
                        break;
                    }
                    j2 = j;
                }
                if (j2 == -1) {
                    AbstractRunnableC3428tI abstractRunnableC3428tI2 = (AbstractRunnableC3428tI) ob.a;
                    ob.a = null;
                    return abstractRunnableC3428tI2;
                }
                if (j2 > 0) {
                    jMin = Math.min(jMin, j2);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z;
        boolean z2 = false;
        loop0: while (true) {
            boolean z3 = z2;
            while (true) {
                ExecutorC0287Qc executorC0287Qc = this.n;
                executorC0287Qc.getClass();
                if (ExecutorC0287Qc.p.get(executorC0287Qc) == 0) {
                    EnumC0270Pc enumC0270Pc = this.c;
                    EnumC0270Pc enumC0270Pc2 = EnumC0270Pc.e;
                    if (enumC0270Pc == enumC0270Pc2) {
                        break loop0;
                    }
                    AbstractRunnableC3428tI abstractRunnableC3428tIA = a(this.m);
                    long j = -2097152;
                    if (abstractRunnableC3428tIA != null) {
                        this.e = 0L;
                        this.d = 0L;
                        if (this.c == EnumC0270Pc.c) {
                            this.c = EnumC0270Pc.b;
                        }
                        boolean z4 = abstractRunnableC3428tIA.b;
                        ExecutorC0287Qc executorC0287Qc2 = this.n;
                        if (z4) {
                            if (h(EnumC0270Pc.b) && !executorC0287Qc2.g() && !executorC0287Qc2.f(ExecutorC0287Qc.o.get(executorC0287Qc2))) {
                                executorC0287Qc2.g();
                            }
                            executorC0287Qc2.getClass();
                            try {
                                abstractRunnableC3428tIA.run();
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            }
                            ExecutorC0287Qc.o.addAndGet(executorC0287Qc2, -2097152L);
                            if (this.c != enumC0270Pc2) {
                                this.c = EnumC0270Pc.d;
                            }
                        } else {
                            executorC0287Qc2.getClass();
                            try {
                                abstractRunnableC3428tIA.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                            }
                        }
                    } else {
                        this.m = z2;
                        if (this.e == 0) {
                            Object obj = this.nextParkedWorker;
                            C3337ri c3337ri = ExecutorC0287Qc.q;
                            if (obj != c3337ri ? true : z2) {
                                o.set(this, -1);
                                while (this.nextParkedWorker != ExecutorC0287Qc.q) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = o;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    ExecutorC0287Qc executorC0287Qc3 = this.n;
                                    executorC0287Qc3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = ExecutorC0287Qc.p;
                                    if (atomicIntegerFieldUpdater3.get(executorC0287Qc3) != 0) {
                                        break;
                                    }
                                    EnumC0270Pc enumC0270Pc3 = this.c;
                                    EnumC0270Pc enumC0270Pc4 = EnumC0270Pc.e;
                                    if (enumC0270Pc3 == enumC0270Pc4) {
                                        break;
                                    }
                                    h(EnumC0270Pc.c);
                                    Thread.interrupted();
                                    if (this.d == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.d = System.nanoTime() + this.n.c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.n.c);
                                    if (System.nanoTime() - this.d >= 0) {
                                        this.d = 0L;
                                        ExecutorC0287Qc executorC0287Qc4 = this.n;
                                        synchronized (executorC0287Qc4.m) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(executorC0287Qc4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0287Qc.o;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC0287Qc4) & 2097151)) > executorC0287Qc4.a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        z = false;
                                                        f(0);
                                                        executorC0287Qc4.e(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0287Qc4) & 2097151);
                                                        if (andDecrement != i) {
                                                            Object objB = executorC0287Qc4.m.b(andDecrement);
                                                            AbstractC0500aq.j(objB);
                                                            C0253Oc c0253Oc = (C0253Oc) objB;
                                                            executorC0287Qc4.m.c(i, c0253Oc);
                                                            c0253Oc.f(i);
                                                            executorC0287Qc4.e(c0253Oc, andDecrement, i);
                                                        }
                                                        executorC0287Qc4.m.c(andDecrement, null);
                                                        this.c = enumC0270Pc4;
                                                    }
                                                }
                                                z = false;
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        z = false;
                                    }
                                    z2 = z;
                                }
                            } else {
                                ExecutorC0287Qc executorC0287Qc5 = this.n;
                                executorC0287Qc5.getClass();
                                if (this.nextParkedWorker == c3337ri) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0287Qc.n;
                                        long j2 = atomicLongFieldUpdater2.get(executorC0287Qc5);
                                        int i2 = this.indexInArray;
                                        this.nextParkedWorker = executorC0287Qc5.m.b((int) (j2 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(executorC0287Qc5, j2, ((2097152 + j2) & j) | i2)) {
                                            break;
                                        } else {
                                            j = -2097152;
                                        }
                                    }
                                }
                            }
                            z2 = z2;
                        } else {
                            if (z3) {
                                h(EnumC0270Pc.c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.e);
                                this.e = 0L;
                                break;
                            }
                            z3 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(EnumC0270Pc.e);
    }
}

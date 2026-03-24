package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class R7 implements Y8 {
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(R7.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(R7.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(R7.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(R7.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(R7.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(R7.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(R7.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(R7.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(R7.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final InterfaceC2631en b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public R7(int i, InterfaceC2631en interfaceC2631en) {
        this.a = i;
        this.b = interfaceC2631en;
        if (i < 0) {
            throw new IllegalArgumentException(Vs.l(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C2764h9 c2764h9 = T7.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = e.get(this);
        C2764h9 c2764h92 = new C2764h9(0L, null, this, 3);
        this.sendSegment$volatile = c2764h92;
        this.receiveSegment$volatile = c2764h92;
        if (w()) {
            c2764h92 = T7.a;
            AbstractC0500aq.k(c2764h92, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c2764h92;
        this._closeCause$volatile = T7.s;
    }

    public static boolean D(Object obj) {
        if (obj instanceof InterfaceC3742z8) {
            AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return T7.a((InterfaceC3742z8) obj, DK.a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final C2764h9 a(R7 r7, long j, C2764h9 c2764h9) {
        Object objU;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        r7.getClass();
        C2764h9 c2764h92 = T7.a;
        S7 s7 = S7.a;
        loop0: while (true) {
            objU = AbstractC2883jK.u(c2764h9, j, s7);
            if (!AbstractC3296qu.G(objU)) {
                ZD zdC = AbstractC3296qu.C(objU);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                    ZD zd = (ZD) atomicReferenceFieldUpdater.get(r7);
                    if (zd.c >= zdC.c) {
                        break loop0;
                    }
                    if (!zdC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(r7, zd, zdC)) {
                        if (atomicReferenceFieldUpdater.get(r7) != zd) {
                            if (zdC.f()) {
                                zdC.e();
                            }
                        }
                    }
                    if (zd.f()) {
                        zd.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zG = AbstractC3296qu.G(objU);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
        if (zG) {
            r7.l();
            if (c2764h9.c * T7.b >= atomicLongFieldUpdater2.get(r7)) {
                return null;
            }
        } else {
            c2764h9 = (C2764h9) AbstractC3296qu.C(objU);
            long j4 = c2764h9.c;
            if (j4 <= j) {
                return c2764h9;
            }
            long j5 = T7.b * j4;
            do {
                atomicLongFieldUpdater = c;
                j2 = atomicLongFieldUpdater.get(r7);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j5) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(r7, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j4 * T7.b >= atomicLongFieldUpdater2.get(r7)) {
                return null;
            }
        }
        c2764h9.b();
        return null;
    }

    public static final void c(R7 r7, Object obj, B8 b8) {
        InterfaceC2631en interfaceC2631en = r7.b;
        if (interfaceC2631en != null) {
            AbstractC3279qd.f(interfaceC2631en, obj, b8.e);
        }
        b8.resumeWith(AbstractC0115Ga.n(r7.r()));
    }

    public static final int e(R7 r7, C2764h9 c2764h9, int i, Object obj, long j, Object obj2, boolean z) {
        r7.getClass();
        c2764h9.n(i, obj);
        if (!z) {
            Object objL = c2764h9.l(i);
            if (objL == null) {
                if (r7.i(j)) {
                    if (c2764h9.k(i, null, T7.d)) {
                        return 1;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (c2764h9.k(i, null, obj2)) {
                        return 2;
                    }
                }
            } else if (objL instanceof IM) {
                c2764h9.n(i, null);
                if (r7.C(objL, obj)) {
                    c2764h9.o(i, T7.i);
                    return 0;
                }
                C3337ri c3337ri = T7.k;
                if (c2764h9.f.getAndSet((i * 2) + 1, c3337ri) != c3337ri) {
                    c2764h9.m(i, true);
                }
                return 5;
            }
        }
        return r7.F(c2764h9, i, obj, j, obj2, z);
    }

    public static void t(R7 r7) {
        r7.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if ((atomicLongFieldUpdater.addAndGet(r7, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(r7) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(IM im, boolean z) {
        if (im instanceof InterfaceC3742z8) {
            ((InterfaceC3493uc) im).resumeWith(AbstractC0115Ga.n(z ? q() : r()));
            return;
        }
        if (!(im instanceof P7)) {
            throw new IllegalStateException(("Unexpected waiter: " + im).toString());
        }
        P7 p7 = (P7) im;
        B8 b8 = p7.b;
        AbstractC0500aq.j(b8);
        p7.b = null;
        p7.a = T7.l;
        Throwable thP = p7.c.p();
        b8.resumeWith(thP == null ? Boolean.FALSE : AbstractC0115Ga.n(thP));
    }

    public final Object B() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (u(j2, true)) {
            return new C2599e9(p());
        }
        long j3 = j2 & 1152921504606846975L;
        Object obj = C2709g9.b;
        if (j >= j3) {
            return obj;
        }
        Object obj2 = T7.k;
        C2764h9 c2764h9 = (C2764h9) n.get(this);
        while (!u(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = T7.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c2764h9.c != j5) {
                C2764h9 c2764h9O = o(j5, c2764h9);
                if (c2764h9O == null) {
                    continue;
                } else {
                    c2764h9 = c2764h9O;
                }
            }
            Object objE = E(c2764h9, i, andIncrement, obj2);
            if (objE == T7.m) {
                IM im = obj2 instanceof IM ? (IM) obj2 : null;
                if (im != null) {
                    im.b(c2764h9, i);
                }
                G(andIncrement);
                c2764h9.i();
            } else if (objE == T7.o) {
                if (andIncrement < s()) {
                    c2764h9.b();
                }
            } else {
                if (objE == T7.n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                c2764h9.b();
                obj = objE;
            }
            return obj;
        }
        return new C2599e9(p());
    }

    public final boolean C(Object obj, Object obj2) {
        if (!(obj instanceof P7)) {
            if (obj instanceof InterfaceC3742z8) {
                AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return T7.a((InterfaceC3742z8) obj, obj2, this.b != null ? g() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        P7 p7 = (P7) obj;
        B8 b8 = p7.b;
        AbstractC0500aq.j(b8);
        p7.b = null;
        p7.a = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC2631en interfaceC2631en = p7.c.b;
        return T7.a(b8, bool, interfaceC2631en != null ? new O7(0, interfaceC2631en, obj2) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r11 = r2.get(r10 * 2);
        r9.n(r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return defpackage.T7.o;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(defpackage.C2764h9 r9, int r10, long r11, java.lang.Object r13) {
        /*
            r8 = this;
            java.lang.Object r0 = r9.l(r10)
            r1 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.f
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.R7.c
            if (r0 != 0) goto L2a
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L43
            if (r13 != 0) goto L1e
            ri r9 = defpackage.T7.n
            return r9
        L1e:
            boolean r0 = r9.k(r10, r0, r13)
            if (r0 == 0) goto L43
            r8.n()
            ri r9 = defpackage.T7.m
            return r9
        L2a:
            ri r6 = defpackage.T7.d
            if (r0 != r6) goto L43
            ri r6 = defpackage.T7.i
            boolean r0 = r9.k(r10, r0, r6)
            if (r0 == 0) goto L43
            r8.n()
            int r11 = r10 * 2
            java.lang.Object r11 = r2.get(r11)
            r9.n(r10, r1)
            return r11
        L43:
            java.lang.Object r0 = r9.l(r10)
            if (r0 == 0) goto Laf
            ri r6 = defpackage.T7.e
            if (r0 != r6) goto L4e
            goto Laf
        L4e:
            ri r6 = defpackage.T7.d
            if (r0 != r6) goto L68
            ri r6 = defpackage.T7.i
            boolean r0 = r9.k(r10, r0, r6)
            if (r0 == 0) goto L43
            r8.n()
        L5d:
            int r11 = r10 * 2
            java.lang.Object r11 = r2.get(r11)
            r9.n(r10, r1)
            goto Ld1
        L68:
            ri r6 = defpackage.T7.j
            if (r0 != r6) goto L6f
        L6c:
            ri r11 = defpackage.T7.o
            goto Ld1
        L6f:
            ri r7 = defpackage.T7.h
            if (r0 != r7) goto L74
            goto L6c
        L74:
            ri r7 = defpackage.T7.l
            if (r0 != r7) goto L7c
        L78:
            r8.n()
            goto L6c
        L7c:
            ri r7 = defpackage.T7.g
            if (r0 == r7) goto L43
            ri r7 = defpackage.T7.f
            boolean r7 = r9.k(r10, r0, r7)
            if (r7 == 0) goto L43
            boolean r11 = r0 instanceof defpackage.JM
            if (r11 == 0) goto L90
            JM r0 = (defpackage.JM) r0
            IM r0 = r0.a
        L90:
            boolean r12 = D(r0)
            if (r12 == 0) goto L9f
            ri r11 = defpackage.T7.i
            r9.o(r10, r11)
            r8.n()
            goto L5d
        L9f:
            r9.o(r10, r6)
            r12 = 0
            r9.m(r10, r12)
            if (r11 == 0) goto Lab
            r8.n()
        Lab:
            ri r9 = defpackage.T7.o
            r11 = r9
            goto Ld1
        Laf:
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 >= 0) goto Lc1
            ri r6 = defpackage.T7.h
            boolean r0 = r9.k(r10, r0, r6)
            if (r0 == 0) goto L43
            goto L78
        Lc1:
            if (r13 != 0) goto Lc6
            ri r11 = defpackage.T7.n
            goto Ld1
        Lc6:
            boolean r0 = r9.k(r10, r0, r13)
            if (r0 == 0) goto L43
            r8.n()
            ri r11 = defpackage.T7.m
        Ld1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.E(h9, int, long, java.lang.Object):java.lang.Object");
    }

    public final int F(C2764h9 c2764h9, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objL = c2764h9.l(i);
            if (objL == null) {
                if (!i(j) || z) {
                    if (z) {
                        if (c2764h9.k(i, null, T7.j)) {
                            c2764h9.m(i, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c2764h9.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c2764h9.k(i, null, T7.d)) {
                    return 1;
                }
            } else {
                if (objL != T7.e) {
                    C3337ri c3337ri = T7.k;
                    if (objL == c3337ri) {
                        c2764h9.n(i, null);
                        return 5;
                    }
                    if (objL == T7.h) {
                        c2764h9.n(i, null);
                        return 5;
                    }
                    if (objL == T7.l) {
                        c2764h9.n(i, null);
                        l();
                        return 4;
                    }
                    c2764h9.n(i, null);
                    if (objL instanceof JM) {
                        objL = ((JM) objL).a;
                    }
                    if (C(objL, obj)) {
                        c2764h9.o(i, T7.i);
                        return 0;
                    }
                    if (c2764h9.f.getAndSet((i * 2) + 1, c3337ri) != c3337ri) {
                        c2764h9.m(i, true);
                    }
                    return 5;
                }
                if (c2764h9.k(i, objL, T7.d)) {
                    return 1;
                }
            }
        }
    }

    public final void G(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (w()) {
            return;
        }
        do {
            atomicLongFieldUpdater = e;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = T7.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            if (i2 >= i) {
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, j6 + 4611686018427387904L);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.InterfaceC2769hE
    public final void b(Qz qz) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, qz)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3337ri c3337ri = T7.q;
            if (obj != c3337ri) {
                if (obj == T7.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C3337ri c3337ri2 = T7.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3337ri, c3337ri2)) {
                if (atomicReferenceFieldUpdater.get(this) != c3337ri) {
                    break;
                }
            }
            qz.invoke(p());
            return;
        }
    }

    @Override // defpackage.InterfaceC2929kB
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c4, code lost:
    
        r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        c(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0142, code lost:
    
        if (r23 >= r5.get(r26)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0144, code lost:
    
        r21.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        c(r26, r28, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC2769hE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(defpackage.InterfaceC3493uc r27, java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.d(uc, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2769hE
    public final boolean f(Throwable th) {
        return j(false, th);
    }

    public final Q7 g() {
        return new Q7(3, this, R7.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r1;
     */
    @Override // defpackage.InterfaceC2769hE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.h(java.lang.Object):java.lang.Object");
    }

    public final boolean i(long j) {
        return j < e.get(this) || j < d.get(this) + ((long) this.a);
    }

    @Override // defpackage.InterfaceC2929kB
    public final P7 iterator() {
        return new P7(this);
    }

    public final boolean j(boolean z, Throwable th) {
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                C2764h9 c2764h9 = T7.a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (1 << 60) + (j5 & 1152921504606846975L)));
        }
        C3337ri c3337ri = T7.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c3337ri, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c3337ri) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (3 << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j3 << 60) + j2));
        }
        l();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q;
                obj = atomicReferenceFieldUpdater2.get(this);
                C3337ri c3337ri2 = obj == null ? T7.q : T7.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c3337ri2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                AbstractC2883jK.j(1, obj);
                ((InterfaceC2631en) obj).invoke(p());
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (defpackage.C2764h9) ((defpackage.AbstractC3330rb) defpackage.AbstractC3330rb.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C2764h9 k(long r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.k(long):h9");
    }

    public final void l() {
        u(c.get(this), false);
    }

    public final void m(long j) {
        C0234Na c0234NaG;
        C2764h9 c2764h9 = (C2764h9) n.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.a + j2, e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = T7.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c2764h9.c != j4) {
                    C2764h9 c2764h9O = o(j4, c2764h9);
                    if (c2764h9O == null) {
                        continue;
                    } else {
                        c2764h9 = c2764h9O;
                    }
                }
                Object objE = E(c2764h9, i, j2, null);
                if (objE != T7.o) {
                    c2764h9.b();
                    InterfaceC2631en interfaceC2631en = this.b;
                    if (interfaceC2631en != null && (c0234NaG = AbstractC3279qd.g(interfaceC2631en, objE, null)) != null) {
                        throw c0234NaG;
                    }
                } else if (j2 < s()) {
                    c2764h9.b();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0192, code lost:
    
        t(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0195, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.n():void");
    }

    public final C2764h9 o(long j, C2764h9 c2764h9) {
        Object objU;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        C2764h9 c2764h92 = T7.a;
        S7 s7 = S7.a;
        loop0: while (true) {
            objU = AbstractC2883jK.u(c2764h9, j, s7);
            if (!AbstractC3296qu.G(objU)) {
                ZD zdC = AbstractC3296qu.C(objU);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                    ZD zd = (ZD) atomicReferenceFieldUpdater.get(this);
                    if (zd.c >= zdC.c) {
                        break loop0;
                    }
                    if (!zdC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, zd, zdC)) {
                        if (atomicReferenceFieldUpdater.get(this) != zd) {
                            if (zdC.f()) {
                                zdC.e();
                            }
                        }
                    }
                    if (zd.f()) {
                        zd.e();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3296qu.G(objU)) {
            l();
            if (c2764h9.c * T7.b >= s()) {
                return null;
            }
        } else {
            c2764h9 = (C2764h9) AbstractC3296qu.C(objU);
            boolean zW = w();
            long j3 = c2764h9.c;
            if (!zW && j <= e.get(this) / T7.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = o;
                    ZD zd2 = (ZD) atomicReferenceFieldUpdater2.get(this);
                    if (zd2.c >= j3 || !c2764h9.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, zd2, c2764h9)) {
                        if (atomicReferenceFieldUpdater2.get(this) != zd2) {
                            if (c2764h9.f()) {
                                c2764h9.e();
                            }
                        }
                    }
                    if (zd2.f()) {
                        zd2.e();
                    }
                }
            }
            if (j3 <= j) {
                return c2764h9;
            }
            long j4 = T7.b * j3;
            do {
                atomicLongFieldUpdater = d;
                j2 = atomicLongFieldUpdater.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
            if (j3 * T7.b >= s()) {
                return null;
            }
        }
        c2764h9.b();
        return null;
    }

    public final Throwable p() {
        return (Throwable) p.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new C2891ja("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new C2946ka("Channel was closed") : thP;
    }

    public final long s() {
        return c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r3 = (defpackage.C2764h9) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0.n(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
    
        r0 = (defpackage.C2764h9) ((defpackage.AbstractC3330rb) defpackage.AbstractC3330rb.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.u(long, boolean):boolean");
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j = e.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(long r5, defpackage.C2764h9 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            rb r0 = r7.c()
            h9 r0 = (defpackage.C2764h9) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            rb r5 = r7.c()
            h9 r5 = (defpackage.C2764h9) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.R7.o
            java.lang.Object r6 = r5.get(r4)
            ZD r6 = (defpackage.ZD) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R7.x(long, h9):void");
    }

    public final Object y(InterfaceC3493uc interfaceC3493uc, Object obj) {
        Throwable thR;
        B8 b8 = new B8(1, AbstractC0069Df.C(interfaceC3493uc));
        b8.s();
        InterfaceC2631en interfaceC2631en = this.b;
        if (interfaceC2631en == null || (thR = AbstractC3279qd.g(interfaceC2631en, obj, null)) == null) {
            thR = r();
        } else {
            MO.a(thR, r());
        }
        b8.resumeWith(AbstractC0115Ga.n(thR));
        Object objR = b8.r();
        return objR == EnumC0321Sc.a ? objR : DK.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [B8] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [R7, java.lang.Object] */
    public final Object z(InterfaceC3493uc interfaceC3493uc) throws Throwable {
        C2764h9 c2764h9;
        ?? r15;
        B8 b8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        C2764h9 c2764h92 = (C2764h9) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (u(atomicLongFieldUpdater.get(this), true)) {
                Throwable thQ = q();
                int i = IG.a;
                throw thQ;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = d;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j = T7.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c2764h92.c != j2) {
                C2764h9 c2764h9O = o(j2, c2764h92);
                if (c2764h9O == null) {
                    continue;
                } else {
                    c2764h9 = c2764h9O;
                }
            } else {
                c2764h9 = c2764h92;
            }
            Object objE = E(c2764h9, i2, andIncrement, null);
            C3337ri c3337ri = T7.m;
            if (objE == c3337ri) {
                throw new IllegalStateException("unexpected".toString());
            }
            C3337ri c3337ri2 = T7.o;
            if (objE == c3337ri2) {
                if (andIncrement < s()) {
                    c2764h9.b();
                }
                c2764h92 = c2764h9;
            } else {
                if (objE != T7.n) {
                    c2764h9.b();
                    return objE;
                }
                B8 b8C = AbstractC3279qd.C(AbstractC0069Df.C(interfaceC3493uc));
                try {
                    Object objE2 = E(c2764h9, i2, andIncrement, b8C);
                    try {
                        if (objE2 == c3337ri) {
                            b8 = b8C;
                            b8.b(c2764h9, i2);
                        } else {
                            b8 = b8C;
                            Q7 q7G = null;
                            InterfaceC2631en interfaceC2631en = this.b;
                            if (objE2 == c3337ri2) {
                                if (andIncrement < s()) {
                                    c2764h9.b();
                                }
                                C2764h9 c2764h93 = (C2764h9) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (u(atomicLongFieldUpdater.get(this), true)) {
                                        b8.resumeWith(AbstractC0115Ga.n(q()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                    long j3 = T7.b;
                                    long j4 = andIncrement2 / j3;
                                    int i3 = (int) (andIncrement2 % j3);
                                    if (c2764h93.c != j4) {
                                        C2764h9 c2764h9O2 = o(j4, c2764h93);
                                        if (c2764h9O2 != null) {
                                            c2764h93 = c2764h9O2;
                                        }
                                    }
                                    InterfaceC2631en interfaceC2631en2 = interfaceC2631en;
                                    objE2 = E(c2764h93, i3, andIncrement2, b8);
                                    if (objE2 == T7.m) {
                                        b8.b(c2764h93, i3);
                                        break;
                                    }
                                    if (objE2 == T7.o) {
                                        if (andIncrement2 < s()) {
                                            c2764h93.b();
                                        }
                                        interfaceC2631en = interfaceC2631en2;
                                    } else {
                                        if (objE2 == T7.n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        c2764h93.b();
                                        if (interfaceC2631en2 != null) {
                                            q7G = g();
                                        }
                                    }
                                }
                            } else {
                                c2764h9.b();
                                if (interfaceC2631en != null) {
                                    q7G = g();
                                }
                            }
                            b8.A(objE2, q7G);
                        }
                        Object objR = b8.r();
                        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
                        return objR;
                    } catch (Throwable th) {
                        th = th;
                        r15 = c3337ri;
                        r15.z();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r15 = b8C;
                }
            }
        }
    }
}

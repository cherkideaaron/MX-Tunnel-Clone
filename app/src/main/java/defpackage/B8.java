package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class B8 extends AbstractC0546bh implements InterfaceC3742z8, InterfaceC0338Tc, IM {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(B8.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(B8.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(B8.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final InterfaceC3493uc d;
    public final InterfaceC0168Jc e;

    public B8(int i, InterfaceC3493uc interfaceC3493uc) {
        super(i);
        this.d = interfaceC3493uc;
        this.e = interfaceC3493uc.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = G0.a;
    }

    public static Object C(InterfaceC3621ww interfaceC3621ww, Object obj, int i, InterfaceC3504un interfaceC3504un) {
        if ((obj instanceof C0217Ma) || !AbstractC0069Df.D(i)) {
            return obj;
        }
        if (interfaceC3504un != null || (interfaceC3621ww instanceof InterfaceC3418t8)) {
            return new C0183Ka(obj, interfaceC3621ww instanceof InterfaceC3418t8 ? (InterfaceC3418t8) interfaceC3621ww : null, interfaceC3504un, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, InterfaceC3504un interfaceC3504un) {
        B(obj, this.c, interfaceC3504un);
    }

    public final void B(Object obj, int i, InterfaceC3504un interfaceC3504un) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC3621ww) {
                Object objC = C((InterfaceC3621ww) obj2, obj, i, interfaceC3504un);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i);
                return;
            }
            if (obj2 instanceof E8) {
                E8 e8 = (E8) obj2;
                e8.getClass();
                if (E8.c.compareAndSet(e8, 0, 1)) {
                    if (interfaceC3504un != null) {
                        m(interfaceC3504un, e8.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final C3337ri D(Object obj, InterfaceC3504un interfaceC3504un) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof InterfaceC3621ww;
            C3337ri c3337ri = AbstractC0500aq.a;
            if (!z) {
                boolean z2 = obj2 instanceof C0183Ka;
                return null;
            }
            Object objC = C((InterfaceC3621ww) obj2, obj, this.c, interfaceC3504un);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                o();
            }
            return c3337ri;
        }
    }

    @Override // defpackage.InterfaceC3742z8
    public final void a(AbstractC0219Mc abstractC0219Mc) {
        DK dk = DK.a;
        InterfaceC3493uc interfaceC3493uc = this.d;
        C0444Zg c0444Zg = interfaceC3493uc instanceof C0444Zg ? (C0444Zg) interfaceC3493uc : null;
        B(dk, (c0444Zg != null ? c0444Zg.d : null) == abstractC0219Mc ? 4 : this.c, null);
    }

    @Override // defpackage.IM
    public final void b(ZD zd, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(zd);
    }

    @Override // defpackage.InterfaceC3742z8
    public final C3337ri c(Object obj, InterfaceC3504un interfaceC3504un) {
        return D(obj, interfaceC3504un);
    }

    @Override // defpackage.InterfaceC3742z8
    public final boolean cancel(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC3621ww)) {
                return false;
            }
            E8 e8 = new E8(this, th, (obj instanceof InterfaceC3418t8) || (obj instanceof ZD));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e8)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC3621ww interfaceC3621ww = (InterfaceC3621ww) obj;
            if (interfaceC3621ww instanceof InterfaceC3418t8) {
                l((InterfaceC3418t8) obj, th);
            } else if (interfaceC3621ww instanceof ZD) {
                n((ZD) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.c);
            return true;
        }
    }

    @Override // defpackage.AbstractC0546bh
    public final void d(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC3621ww) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj instanceof C0217Ma) {
                return;
            }
            if (!(obj instanceof C0183Ka)) {
                C0183Ka c0183Ka = new C0183Ka(obj, (InterfaceC3418t8) null, (InterfaceC3504un) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0183Ka)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0183Ka c0183Ka2 = (C0183Ka) obj;
            if (!(!(c0183Ka2.e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            C0183Ka c0183KaA = C0183Ka.a(c0183Ka2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0183KaA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC3418t8 interfaceC3418t8 = c0183Ka2.b;
            if (interfaceC3418t8 != null) {
                l(interfaceC3418t8, cancellationException);
            }
            InterfaceC3504un interfaceC3504un = c0183Ka2.c;
            if (interfaceC3504un != null) {
                m(interfaceC3504un, cancellationException, c0183Ka2.a);
                return;
            }
            return;
        }
    }

    @Override // defpackage.InterfaceC3742z8
    public final C3337ri e(Throwable th) {
        return D(new C0217Ma(false, th), null);
    }

    @Override // defpackage.AbstractC0546bh
    public final InterfaceC3493uc f() {
        return this.d;
    }

    @Override // defpackage.AbstractC0546bh
    public final Throwable g(Object obj) {
        Throwable thG = super.g(obj);
        if (thG != null) {
            return thG;
        }
        return null;
    }

    @Override // defpackage.InterfaceC0338Tc
    public final InterfaceC0338Tc getCallerFrame() {
        InterfaceC3493uc interfaceC3493uc = this.d;
        if (interfaceC3493uc instanceof InterfaceC0338Tc) {
            return (InterfaceC0338Tc) interfaceC3493uc;
        }
        return null;
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        return this.e;
    }

    @Override // defpackage.AbstractC0546bh
    public final Object h(Object obj) {
        return obj instanceof C0183Ka ? ((C0183Ka) obj).a : obj;
    }

    @Override // defpackage.InterfaceC3742z8
    public final void i(Object obj) {
        p(this.c);
    }

    @Override // defpackage.AbstractC0546bh
    public final Object k() {
        return m.get(this);
    }

    public final void l(InterfaceC3418t8 interfaceC3418t8, Throwable th) {
        try {
            interfaceC3418t8.a(th);
        } catch (Throwable th2) {
            AbstractC3279qd.J(this.e, new C0234Na("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(InterfaceC3504un interfaceC3504un, Throwable th, Object obj) {
        InterfaceC0168Jc interfaceC0168Jc = this.e;
        try {
            interfaceC3504un.b(th, obj, interfaceC0168Jc);
        } catch (Throwable th2) {
            AbstractC3279qd.J(interfaceC0168Jc, new C0234Na("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(ZD zd, Throwable th) {
        InterfaceC0168Jc interfaceC0168Jc = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            zd.h(i, interfaceC0168Jc);
        } catch (Throwable th2) {
            AbstractC3279qd.J(interfaceC0168Jc, new C0234Na("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        InterfaceC2680fh interfaceC2680fh = (InterfaceC2680fh) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2680fh == null) {
            return;
        }
        interfaceC2680fh.c();
        atomicReferenceFieldUpdater.set(this, C3567vw.a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z = i == 4;
                InterfaceC3493uc interfaceC3493uc = this.d;
                if (z || !(interfaceC3493uc instanceof C0444Zg) || AbstractC0069Df.D(i) != AbstractC0069Df.D(this.c)) {
                    AbstractC0069Df.X(this, interfaceC3493uc, z);
                    return;
                }
                C0444Zg c0444Zg = (C0444Zg) interfaceC3493uc;
                AbstractC0219Mc abstractC0219Mc = c0444Zg.d;
                InterfaceC0168Jc context = c0444Zg.e.getContext();
                if (abstractC0219Mc.f(context)) {
                    abstractC0219Mc.e(context, this);
                    return;
                }
                AbstractC2627ej abstractC2627ejA = RI.a();
                if (abstractC2627ejA.c >= 4294967296L) {
                    T3 t3 = abstractC2627ejA.e;
                    if (t3 == null) {
                        t3 = new T3();
                        abstractC2627ejA.e = t3;
                    }
                    t3.addLast(this);
                    return;
                }
                abstractC2627ejA.j(true);
                try {
                    AbstractC0069Df.X(this, interfaceC3493uc, true);
                    do {
                    } while (abstractC2627ejA.l());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(C0267Oq c0267Oq) {
        return c0267Oq.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (zW) {
                    z();
                }
                Object obj = m.get(this);
                if (obj instanceof C0217Ma) {
                    throw ((C0217Ma) obj).a;
                }
                if (AbstractC0069Df.D(this.c)) {
                    InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) this.e.get(C0108Fk.e);
                    if (interfaceC0029Aq != null && !interfaceC0029Aq.isActive()) {
                        CancellationException cancellationException = interfaceC0029Aq.getCancellationException();
                        d(cancellationException);
                        throw cancellationException;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC2680fh) n.get(this)) == null) {
            t();
        }
        if (zW) {
            z();
        }
        return EnumC0321Sc.a;
    }

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(Object obj) {
        Throwable thA = IC.a(obj);
        if (thA != null) {
            obj = new C0217Ma(false, thA);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        InterfaceC2680fh interfaceC2680fhT = t();
        if (interfaceC2680fhT != null && (!(m.get(this) instanceof InterfaceC3621ww))) {
            interfaceC2680fhT.c();
            n.set(this, C3567vw.a);
        }
    }

    public final InterfaceC2680fh t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) this.e.get(C0108Fk.e);
        if (interfaceC0029Aq == null) {
            return null;
        }
        InterfaceC2680fh interfaceC2680fhF = AbstractC3296qu.F(interfaceC0029Aq, true, new A9(this, 0));
        do {
            atomicReferenceFieldUpdater = n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC2680fhF)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC2680fhF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC0069Df.e0(this.d));
        sb.append("){");
        Object obj = m.get(this);
        sb.append(obj instanceof InterfaceC3621ww ? "Active" : obj instanceof E8 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0069Df.u(this));
        return sb.toString();
    }

    public final void u(InterfaceC2631en interfaceC2631en) {
        AbstractC3279qd.K(this, new C3364s8(interfaceC2631en, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
    
        x(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.B8.m
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof defpackage.G0
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof defpackage.InterfaceC3418t8
            r2 = 0
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof defpackage.ZD
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof defpackage.C0217Ma
            if (r1 == 0) goto L57
            r0 = r7
            Ma r0 = (defpackage.C0217Ma) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.C0217Ma.b
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L53
            boolean r1 = r7 instanceof defpackage.E8
            if (r1 == 0) goto L52
            boolean r1 = r7 instanceof defpackage.C0217Ma
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.a
        L43:
            boolean r0 = r10 instanceof defpackage.InterfaceC3418t8
            if (r0 == 0) goto L4d
            t8 r10 = (defpackage.InterfaceC3418t8) r10
            r9.l(r10, r2)
            goto L52
        L4d:
            ZD r10 = (defpackage.ZD) r10
            r9.n(r10, r2)
        L52:
            return
        L53:
            x(r10, r7)
            throw r2
        L57:
            boolean r1 = r7 instanceof defpackage.C0183Ka
            if (r1 == 0) goto L8b
            r1 = r7
            Ka r1 = (defpackage.C0183Ka) r1
            t8 r3 = r1.b
            if (r3 != 0) goto L87
            boolean r3 = r10 instanceof defpackage.ZD
            if (r3 == 0) goto L67
            return
        L67:
            r3 = r10
            t8 r3 = (defpackage.InterfaceC3418t8) r3
            java.lang.Throwable r4 = r1.e
            if (r4 == 0) goto L72
            r9.l(r3, r4)
            return
        L72:
            r4 = 29
            Ka r1 = defpackage.C0183Ka.a(r1, r3, r2, r4)
        L78:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L7f
            return
        L7f:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L78
            goto L0
        L87:
            x(r10, r7)
            throw r2
        L8b:
            boolean r1 = r10 instanceof defpackage.ZD
            if (r1 == 0) goto L90
            return
        L90:
            r3 = r10
            t8 r3 = (defpackage.InterfaceC3418t8) r3
            Ka r8 = new Ka
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L9e:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto La5
            return
        La5:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto L9e
            goto L0
        Lad:
            x(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B8.v(java.lang.Object):void");
    }

    public final boolean w() {
        if (this.c == 2) {
            InterfaceC3493uc interfaceC3493uc = this.d;
            AbstractC0500aq.k(interfaceC3493uc, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C0444Zg.n.get((C0444Zg) interfaceC3493uc) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        InterfaceC3493uc interfaceC3493uc = this.d;
        Throwable th = null;
        C0444Zg c0444Zg = interfaceC3493uc instanceof C0444Zg ? (C0444Zg) interfaceC3493uc : null;
        if (c0444Zg != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0444Zg.n;
                Object obj = atomicReferenceFieldUpdater.get(c0444Zg);
                C3337ri c3337ri = AbstractC0500aq.c;
                if (obj == c3337ri) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0444Zg, c3337ri, this)) {
                        if (atomicReferenceFieldUpdater.get(c0444Zg) != c3337ri) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0444Zg, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c0444Zg) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            o();
            cancel(th);
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Oq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0267Oq implements InterfaceC0029Aq, E9, Ly {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C0267Oq.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C0267Oq.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C0267Oq(boolean z) {
        this._state$volatile = z ? AbstractC2883jK.i : AbstractC2883jK.h;
    }

    public static C9 H(C0558bt c0558bt) {
        while (c0558bt.h()) {
            C0558bt c0558btE = c0558bt.e();
            if (c0558btE == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0558bt.b;
                Object obj = atomicReferenceFieldUpdater.get(c0558bt);
                while (true) {
                    c0558bt = (C0558bt) obj;
                    if (!c0558bt.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0558bt);
                }
            } else {
                c0558bt = c0558btE;
            }
        }
        while (true) {
            c0558bt = c0558bt.g();
            if (!c0558bt.h()) {
                if (c0558bt instanceof C9) {
                    return (C9) c0558bt;
                }
                if (c0558bt instanceof C3513uw) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (!(obj instanceof C0165Iq)) {
            return obj instanceof InterfaceC3344rp ? ((InterfaceC3344rp) obj).isActive() ? "Active" : "New" : obj instanceof C0217Ma ? "Cancelled" : "Completed";
        }
        C0165Iq c0165Iq = (C0165Iq) obj;
        return c0165Iq.d() ? "Cancelling" : C0165Iq.b.get(c0165Iq) != 0 ? "Completing" : "Active";
    }

    public static CancellationException P(C0267Oq c0267Oq, Throwable th) {
        c0267Oq.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C0046Bq(c0267Oq.p(), th, c0267Oq) : cancellationException;
    }

    public final void B(InterfaceC0029Aq interfaceC0029Aq) {
        C3567vw c3567vw = C3567vw.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (interfaceC0029Aq == null) {
            atomicReferenceFieldUpdater.set(this, c3567vw);
            return;
        }
        interfaceC0029Aq.start();
        B9 b9AttachChild = interfaceC0029Aq.attachChild(this);
        atomicReferenceFieldUpdater.set(this, b9AttachChild);
        if (isCompleted()) {
            b9AttachChild.c();
            atomicReferenceFieldUpdater.set(this, c3567vw);
        }
    }

    public final InterfaceC2680fh C(boolean z, AbstractC0114Fq abstractC0114Fq) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3567vw c3567vw;
        boolean z2;
        boolean zD;
        abstractC0114Fq.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C3715yi;
            c3567vw = C3567vw.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC3344rp)) {
                    z2 = false;
                    break;
                }
                InterfaceC3344rp interfaceC3344rp = (InterfaceC3344rp) obj;
                C3513uw c3513uwB = interfaceC3344rp.b();
                if (c3513uwB == null) {
                    AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M((AbstractC0114Fq) obj);
                } else {
                    if (abstractC0114Fq.j()) {
                        C0165Iq c0165Iq = interfaceC3344rp instanceof C0165Iq ? (C0165Iq) interfaceC3344rp : null;
                        Throwable thC = c0165Iq != null ? c0165Iq.c() : null;
                        if (thC != null) {
                            if (z) {
                                abstractC0114Fq.k(thC);
                            }
                            return c3567vw;
                        }
                        zD = c3513uwB.d(abstractC0114Fq, 5);
                    } else {
                        zD = c3513uwB.d(abstractC0114Fq, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                C3715yi c3715yi = (C3715yi) obj;
                if (c3715yi.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0114Fq)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                L(c3715yi);
            }
        }
        if (z2) {
            return abstractC0114Fq;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0217Ma c0217Ma = obj2 instanceof C0217Ma ? (C0217Ma) obj2 : null;
            abstractC0114Fq.k(c0217Ma != null ? c0217Ma.a : null);
        }
        return c3567vw;
    }

    public boolean D() {
        return this instanceof C7;
    }

    public final boolean E(Object obj) {
        Object objQ;
        do {
            objQ = Q(a.get(this), obj);
            if (objQ == AbstractC2883jK.c) {
                return false;
            }
            if (objQ == AbstractC2883jK.d) {
                return true;
            }
        } while (objQ == AbstractC2883jK.e);
        j(objQ);
        return true;
    }

    public final Object F(Object obj) {
        Object objQ;
        do {
            objQ = Q(a.get(this), obj);
            if (objQ == AbstractC2883jK.c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0217Ma c0217Ma = obj instanceof C0217Ma ? (C0217Ma) obj : null;
                throw new IllegalStateException(str, c0217Ma != null ? c0217Ma.a : null);
            }
        } while (objQ == AbstractC2883jK.e);
        return objQ;
    }

    public String G() {
        return getClass().getSimpleName();
    }

    public final void I(C3513uw c3513uw, Throwable th) {
        c3513uw.getClass();
        c3513uw.d(new C3074ms(4), 4);
        Object obj = C0558bt.a.get(c3513uw);
        AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C0234Na c0234Na = null;
        for (C0558bt c0558btG = (C0558bt) obj; !AbstractC0500aq.b(c0558btG, c3513uw); c0558btG = c0558btG.g()) {
            if ((c0558btG instanceof AbstractC0114Fq) && ((AbstractC0114Fq) c0558btG).j()) {
                try {
                    ((AbstractC0114Fq) c0558btG).k(th);
                } catch (Throwable th2) {
                    if (c0234Na != null) {
                        MO.a(c0234Na, th2);
                    } else {
                        c0234Na = new C0234Na("Exception in completion handler " + c0558btG + " for " + this, th2);
                    }
                }
            }
        }
        if (c0234Na != null) {
            A(c0234Na);
        }
        o(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [qp] */
    public final void L(C3715yi c3715yi) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3513uw c3513uw = new C3513uw();
        if (!c3715yi.a) {
            c3513uw = new C3291qp(c3513uw);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c3715yi, c3513uw)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c3715yi);
    }

    public final void M(AbstractC0114Fq abstractC0114Fq) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3513uw c3513uw = new C3513uw();
        abstractC0114Fq.getClass();
        C0558bt.b.set(c3513uw, abstractC0114Fq);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0558bt.a;
        atomicReferenceFieldUpdater2.set(c3513uw, abstractC0114Fq);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC0114Fq) == abstractC0114Fq) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0114Fq, abstractC0114Fq, c3513uw)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0114Fq) != abstractC0114Fq) {
                        break;
                    }
                }
                c3513uw.f(abstractC0114Fq);
                break loop0;
            }
            break;
        }
        C0558bt c0558btG = abstractC0114Fq.g();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0114Fq, c0558btG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0114Fq);
    }

    public final int N(Object obj) {
        boolean z = obj instanceof C3715yi;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((C3715yi) obj).a) {
                return 0;
            }
            C3715yi c3715yi = AbstractC2883jK.i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3715yi)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof C3291qp)) {
            return 0;
        }
        C3513uw c3513uw = ((C3291qp) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3513uw)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object Q(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC3344rp)) {
            return AbstractC2883jK.c;
        }
        if (((obj instanceof C3715yi) || (obj instanceof AbstractC0114Fq)) && !(obj instanceof C9) && !(obj2 instanceof C0217Ma)) {
            InterfaceC3344rp interfaceC3344rp = (InterfaceC3344rp) obj;
            Object c3398sp = obj2 instanceof InterfaceC3344rp ? new C3398sp((InterfaceC3344rp) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3344rp, c3398sp)) {
                    J(obj2);
                    r(interfaceC3344rp, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC3344rp);
            return AbstractC2883jK.e;
        }
        InterfaceC3344rp interfaceC3344rp2 = (InterfaceC3344rp) obj;
        C3513uw c3513uwY = y(interfaceC3344rp2);
        if (c3513uwY == null) {
            return AbstractC2883jK.e;
        }
        C0165Iq c0165Iq = interfaceC3344rp2 instanceof C0165Iq ? (C0165Iq) interfaceC3344rp2 : null;
        if (c0165Iq == null) {
            c0165Iq = new C0165Iq(c3513uwY, null);
        }
        synchronized (c0165Iq) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0165Iq.b;
                if (atomicIntegerFieldUpdater.get(c0165Iq) != 0) {
                    return AbstractC2883jK.c;
                }
                atomicIntegerFieldUpdater.set(c0165Iq, 1);
                if (c0165Iq != interfaceC3344rp2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC3344rp2, c0165Iq)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC3344rp2) {
                            return AbstractC2883jK.e;
                        }
                    }
                }
                boolean zD = c0165Iq.d();
                C0217Ma c0217Ma = obj2 instanceof C0217Ma ? (C0217Ma) obj2 : null;
                if (c0217Ma != null) {
                    c0165Iq.a(c0217Ma.a);
                }
                Throwable thC = zD ^ true ? c0165Iq.c() : null;
                if (thC != null) {
                    I(c3513uwY, thC);
                }
                C9 c9H = H(c3513uwY);
                if (c9H == null || !R(c0165Iq, c9H, obj2)) {
                    c3513uwY.d(new C3074ms(2), 2);
                    C9 c9H2 = H(c3513uwY);
                    if (c9H2 == null || !R(c0165Iq, c9H2, obj2)) {
                        return t(c0165Iq, obj2);
                    }
                }
                return AbstractC2883jK.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean R(C0165Iq c0165Iq, C9 c9, Object obj) {
        while (AbstractC3296qu.F(c9.e, false, new C0148Hq(this, c0165Iq, c9, obj)) == C3567vw.a) {
            c9 = H(c9);
            if (c9 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0029Aq
    public final B9 attachChild(E9 e9) {
        C9 c9 = new C9(e9);
        c9.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C3715yi) {
                C3715yi c3715yi = (C3715yi) obj;
                if (c3715yi.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                L(c3715yi);
            } else {
                boolean z = obj instanceof InterfaceC3344rp;
                C3567vw c3567vw = C3567vw.a;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0217Ma c0217Ma = obj2 instanceof C0217Ma ? (C0217Ma) obj2 : null;
                    c9.k(c0217Ma != null ? c0217Ma.a : null);
                    return c3567vw;
                }
                C3513uw c3513uwB = ((InterfaceC3344rp) obj).b();
                if (c3513uwB == null) {
                    AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M((AbstractC0114Fq) obj);
                } else if (!c3513uwB.d(c9, 7)) {
                    boolean zD = c3513uwB.d(c9, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C0165Iq) {
                        thC = ((C0165Iq) obj3).c();
                    } else {
                        C0217Ma c0217Ma2 = obj3 instanceof C0217Ma ? (C0217Ma) obj3 : null;
                        if (c0217Ma2 != null) {
                            thC = c0217Ma2.a;
                        }
                    }
                    c9.k(thC);
                    if (zD) {
                        break loop0;
                    }
                    return c3567vw;
                }
            }
        }
        return c9;
    }

    @Override // defpackage.InterfaceC0029Aq
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final Object fold(Object obj, InterfaceC3396sn interfaceC3396sn) {
        return interfaceC3396sn.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        return AbstractC2883jK.v(this, interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final CancellationException getCancellationException() {
        Object obj = a.get(this);
        if (!(obj instanceof C0165Iq)) {
            if (!(obj instanceof InterfaceC3344rp)) {
                return obj instanceof C0217Ma ? P(this, ((C0217Ma) obj).a) : new C0046Bq(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thC = ((C0165Iq) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = p();
        }
        return new C0046Bq(strConcat, thC, this);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC2877jE getChildren() {
        return new C3042mE(new C0199Kq(null, this), 0);
    }

    public Object getCompleted() {
        return u();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = a.get(this);
        if (!(!(obj instanceof InterfaceC3344rp))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        C0217Ma c0217Ma = obj instanceof C0217Ma ? (C0217Ma) obj : null;
        if (c0217Ma != null) {
            return c0217Ma.a;
        }
        return null;
    }

    @Override // defpackage.InterfaceC0134Hc
    public final InterfaceC0151Ic getKey() {
        return C0108Fk.e;
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC0470aE getOnJoin() {
        AbstractC2883jK.j(3, C0250Nq.a);
        return new C0215Lp(this);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC2680fh invokeOnCompletion(InterfaceC2631en interfaceC2631en) {
        return C(true, new C2735gh(interfaceC2631en, 1));
    }

    @Override // defpackage.InterfaceC0029Aq
    public boolean isActive() {
        Object obj = a.get(this);
        return (obj instanceof InterfaceC3344rp) && ((InterfaceC3344rp) obj).isActive();
    }

    @Override // defpackage.InterfaceC0029Aq
    public final boolean isCancelled() {
        Object obj = a.get(this);
        return (obj instanceof C0217Ma) || ((obj instanceof C0165Iq) && ((C0165Iq) obj).d());
    }

    @Override // defpackage.InterfaceC0029Aq
    public final boolean isCompleted() {
        return !(a.get(this) instanceof InterfaceC3344rp);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final Object join(InterfaceC3493uc interfaceC3493uc) {
        boolean z;
        while (true) {
            Object obj = a.get(this);
            if (!(obj instanceof InterfaceC3344rp)) {
                z = false;
                break;
            }
            if (N(obj) >= 0) {
                z = true;
                break;
            }
        }
        DK dk = DK.a;
        if (!z) {
            AbstractC3296qu.q(interfaceC3493uc.getContext());
            return dk;
        }
        B8 b8 = new B8(1, AbstractC0069Df.C(interfaceC3493uc));
        b8.s();
        AbstractC3279qd.K(b8, new C3364s8(AbstractC3296qu.F(this, true, new C2735gh(b8, 3)), 2));
        Object objR = b8.r();
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        if (objR != enumC0321Sc) {
            objR = dk;
        }
        return objR == enumC0321Sc ? objR : dk;
    }

    public void k(Object obj) {
        j(obj);
    }

    public final Object l(InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object obj;
        int i = 1;
        do {
            obj = a.get(this);
            if (!(obj instanceof InterfaceC3344rp)) {
                if (obj instanceof C0217Ma) {
                    throw ((C0217Ma) obj).a;
                }
                return AbstractC2883jK.S(obj);
            }
        } while (N(obj) < 0);
        C0131Gq c0131Gq = new C0131Gq(AbstractC0069Df.C(interfaceC3493uc), this);
        c0131Gq.s();
        AbstractC3279qd.K(c0131Gq, new C3364s8(AbstractC3296qu.F(this, true, new A9(c0131Gq, i)), 2));
        Object objR = c0131Gq.r();
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        return objR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r10 = defpackage.AbstractC2883jK.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0267Oq.m(java.lang.Object):boolean");
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        return AbstractC2883jK.G(this, interfaceC0151Ic);
    }

    public void n(CancellationException cancellationException) {
        m(cancellationException);
    }

    public final boolean o(Throwable th) {
        if (D()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        B9 b9 = (B9) b.get(this);
        return (b9 == null || b9 == C3567vw.a) ? z : b9.a(th) || z;
    }

    public String p() {
        return "Job was cancelled";
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc plus(InterfaceC0168Jc interfaceC0168Jc) {
        return AbstractC2883jK.I(this, interfaceC0168Jc);
    }

    public boolean q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m(th) && w();
    }

    public final void r(InterfaceC3344rp interfaceC3344rp, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        B9 b9 = (B9) atomicReferenceFieldUpdater.get(this);
        if (b9 != null) {
            b9.c();
            atomicReferenceFieldUpdater.set(this, C3567vw.a);
        }
        C0234Na c0234Na = null;
        C0217Ma c0217Ma = obj instanceof C0217Ma ? (C0217Ma) obj : null;
        Throwable th = c0217Ma != null ? c0217Ma.a : null;
        if (interfaceC3344rp instanceof AbstractC0114Fq) {
            try {
                ((AbstractC0114Fq) interfaceC3344rp).k(th);
                return;
            } catch (Throwable th2) {
                A(new C0234Na("Exception in completion handler " + interfaceC3344rp + " for " + this, th2));
                return;
            }
        }
        C3513uw c3513uwB = interfaceC3344rp.b();
        if (c3513uwB != null) {
            c3513uwB.d(new C3074ms(1), 1);
            Object obj2 = C0558bt.a.get(c3513uwB);
            AbstractC0500aq.k(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C0558bt c0558btG = (C0558bt) obj2; !AbstractC0500aq.b(c0558btG, c3513uwB); c0558btG = c0558btG.g()) {
                if (c0558btG instanceof AbstractC0114Fq) {
                    try {
                        ((AbstractC0114Fq) c0558btG).k(th);
                    } catch (Throwable th3) {
                        if (c0234Na != null) {
                            MO.a(c0234Na, th3);
                        } else {
                            c0234Na = new C0234Na("Exception in completion handler " + c0558btG + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0234Na != null) {
                A(c0234Na);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable s(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C0267Oq c0267Oq = (C0267Oq) ((Ly) obj);
        Object obj2 = a.get(c0267Oq);
        if (obj2 instanceof C0165Iq) {
            cancellationExceptionC = ((C0165Iq) obj2).c();
        } else if (obj2 instanceof C0217Ma) {
            cancellationExceptionC = ((C0217Ma) obj2).a;
        } else {
            if (obj2 instanceof InterfaceC3344rp) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException c0046Bq = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        if (c0046Bq == null) {
            c0046Bq = new C0046Bq("Parent job is ".concat(O(obj2)), cancellationExceptionC, c0267Oq);
        }
        return c0046Bq;
    }

    @Override // defpackage.InterfaceC0029Aq
    public final boolean start() {
        int iN;
        do {
            iN = N(a.get(this));
            if (iN == 0) {
                return false;
            }
        } while (iN != 1);
        return true;
    }

    public final Object t(C0165Iq c0165Iq, Object obj) {
        Throwable thV;
        C0217Ma c0217Ma = obj instanceof C0217Ma ? (C0217Ma) obj : null;
        Throwable th = c0217Ma != null ? c0217Ma.a : null;
        synchronized (c0165Iq) {
            c0165Iq.d();
            ArrayList<Throwable> arrayListE = c0165Iq.e(th);
            thV = v(c0165Iq, arrayListE);
            if (thV != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thV && th2 != thV && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        MO.a(thV, th2);
                    }
                }
            }
        }
        if (thV != null && thV != th) {
            obj = new C0217Ma(false, thV);
        }
        if (thV != null && (o(thV) || z(thV))) {
            AbstractC0500aq.k(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0217Ma.b.compareAndSet((C0217Ma) obj, 0, 1);
        }
        J(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object c3398sp = obj instanceof InterfaceC3344rp ? new C3398sp((InterfaceC3344rp) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0165Iq, c3398sp) && atomicReferenceFieldUpdater.get(this) == c0165Iq) {
        }
        r(c0165Iq, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(G() + '{' + O(a.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0069Df.u(this));
        return sb.toString();
    }

    public final Object u() throws Throwable {
        Object obj = a.get(this);
        if (!(!(obj instanceof InterfaceC3344rp))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (obj instanceof C0217Ma) {
            throw ((C0217Ma) obj).a;
        }
        return AbstractC2883jK.S(obj);
    }

    public final Throwable v(C0165Iq c0165Iq, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c0165Iq.d()) {
                return new C0046Bq(p(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C0530bJ) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C0530bJ)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean w() {
        return true;
    }

    public boolean x() {
        return this instanceof C0166Ja;
    }

    public final C3513uw y(InterfaceC3344rp interfaceC3344rp) {
        C3513uw c3513uwB = interfaceC3344rp.b();
        if (c3513uwB != null) {
            return c3513uwB;
        }
        if (interfaceC3344rp instanceof C3715yi) {
            return new C3513uw();
        }
        if (interfaceC3344rp instanceof AbstractC0114Fq) {
            M((AbstractC0114Fq) interfaceC3344rp);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC3344rp).toString());
    }

    public boolean z(Throwable th) {
        return false;
    }

    @Override // defpackage.InterfaceC0029Aq
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0046Bq(p(), null, this);
        }
        n(cancellationException);
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC2680fh invokeOnCompletion(boolean z, boolean z2, InterfaceC2631en interfaceC2631en) {
        return C(z2, z ? new C3017lq(interfaceC2631en) : new C2735gh(interfaceC2631en, 1));
    }

    @Override // defpackage.InterfaceC0029Aq
    public final InterfaceC0029Aq plus(InterfaceC0029Aq interfaceC0029Aq) {
        return interfaceC0029Aq;
    }

    @Override // defpackage.InterfaceC0029Aq
    public /* synthetic */ boolean cancel(Throwable th) {
        n(th != null ? P(this, th) : new C0046Bq(p(), null, this));
        return true;
    }

    public void K() {
    }

    public void A(C0234Na c0234Na) {
        throw c0234Na;
    }

    public void J(Object obj) {
    }

    public void j(Object obj) {
    }
}

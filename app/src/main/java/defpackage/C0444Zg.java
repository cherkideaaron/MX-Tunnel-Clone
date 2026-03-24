package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0444Zg extends AbstractC0546bh implements InterfaceC0338Tc, InterfaceC3493uc {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(C0444Zg.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final AbstractC0219Mc d;
    public final InterfaceC3493uc e;
    public Object f;
    public final Object m;

    public C0444Zg(AbstractC0219Mc abstractC0219Mc, InterfaceC3493uc interfaceC3493uc) {
        super(-1);
        this.d = abstractC0219Mc;
        this.e = interfaceC3493uc;
        this.f = AbstractC0500aq.b;
        this.m = AbstractC0136He.M(interfaceC3493uc.getContext());
    }

    @Override // defpackage.InterfaceC0338Tc
    public final InterfaceC0338Tc getCallerFrame() {
        InterfaceC3493uc interfaceC3493uc = this.e;
        if (interfaceC3493uc instanceof InterfaceC0338Tc) {
            return (InterfaceC0338Tc) interfaceC3493uc;
        }
        return null;
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.AbstractC0546bh
    public final Object k() {
        Object obj = this.f;
        this.f = AbstractC0500aq.b;
        return obj;
    }

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(Object obj) {
        Throwable thA = IC.a(obj);
        Object c0217Ma = thA == null ? obj : new C0217Ma(false, thA);
        InterfaceC3493uc interfaceC3493uc = this.e;
        InterfaceC0168Jc context = interfaceC3493uc.getContext();
        AbstractC0219Mc abstractC0219Mc = this.d;
        if (abstractC0219Mc.f(context)) {
            this.f = c0217Ma;
            this.c = 0;
            abstractC0219Mc.e(interfaceC3493uc.getContext(), this);
            return;
        }
        AbstractC2627ej abstractC2627ejA = RI.a();
        if (abstractC2627ejA.c >= 4294967296L) {
            this.f = c0217Ma;
            this.c = 0;
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
            InterfaceC0168Jc context2 = interfaceC3493uc.getContext();
            Object objP = AbstractC0136He.P(context2, this.m);
            try {
                interfaceC3493uc.resumeWith(obj);
                while (abstractC2627ejA.l()) {
                }
            } finally {
                AbstractC0136He.H(context2, objP);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + AbstractC0069Df.e0(this.e) + ']';
    }

    @Override // defpackage.AbstractC0546bh
    public final InterfaceC3493uc f() {
        return this;
    }
}

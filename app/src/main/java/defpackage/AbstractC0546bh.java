package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: bh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0546bh extends AbstractRunnableC3428tI {
    public int c;

    public AbstractC0546bh(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract InterfaceC3493uc f();

    public Throwable g(Object obj) {
        C0217Ma c0217Ma = obj instanceof C0217Ma ? (C0217Ma) obj : null;
        if (c0217Ma != null) {
            return c0217Ma.a;
        }
        return null;
    }

    public final void j(Throwable th) {
        AbstractC3279qd.J(f().getContext(), new C0372Vc("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object objN;
        try {
            InterfaceC3493uc interfaceC3493ucF = f();
            AbstractC0500aq.k(interfaceC3493ucF, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0444Zg c0444Zg = (C0444Zg) interfaceC3493ucF;
            InterfaceC3493uc interfaceC3493uc = c0444Zg.e;
            Object obj = c0444Zg.m;
            InterfaceC0168Jc context = interfaceC3493uc.getContext();
            Object objP = AbstractC0136He.P(context, obj);
            InterfaceC0029Aq interfaceC0029Aq = null;
            AK akQ = objP != AbstractC0136He.m ? MO.Q(interfaceC3493uc, context, objP) : null;
            try {
                InterfaceC0168Jc context2 = interfaceC3493uc.getContext();
                Object objK = k();
                Throwable thG = g(objK);
                if (thG == null && AbstractC0069Df.D(this.c)) {
                    interfaceC0029Aq = (InterfaceC0029Aq) context2.get(C0108Fk.e);
                }
                if (interfaceC0029Aq == null || interfaceC0029Aq.isActive()) {
                    objN = thG != null ? AbstractC0115Ga.n(thG) : h(objK);
                } else {
                    CancellationException cancellationException = interfaceC0029Aq.getCancellationException();
                    d(cancellationException);
                    objN = AbstractC0115Ga.n(cancellationException);
                }
                interfaceC3493uc.resumeWith(objN);
                if (akQ == null || akQ.V()) {
                    AbstractC0136He.H(context, objP);
                }
            } catch (Throwable th) {
                if (akQ == null || akQ.V()) {
                    AbstractC0136He.H(context, objP);
                }
                throw th;
            }
        } catch (Throwable th2) {
            j(th2);
        }
    }

    public void d(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}

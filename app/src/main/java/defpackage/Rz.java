package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class Rz extends AbstractC2862j implements Sz, Y8 {
    public final Y8 d;

    public Rz(InterfaceC0168Jc interfaceC0168Jc, R7 r7) {
        super(interfaceC0168Jc, true);
        this.d = r7;
    }

    @Override // defpackage.AbstractC2862j
    public final void S(boolean z, Throwable th) {
        if (this.d.f(th) || z) {
            return;
        }
        AbstractC3279qd.J(this.c, th);
    }

    @Override // defpackage.AbstractC2862j
    public final void T(Object obj) {
        this.d.f(null);
    }

    @Override // defpackage.InterfaceC2769hE
    public final void b(Qz qz) {
        this.d.b(qz);
    }

    @Override // defpackage.C0267Oq, defpackage.InterfaceC0029Aq
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // defpackage.C0267Oq, defpackage.InterfaceC0029Aq
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0046Bq(p(), null, this);
        }
        n(cancellationException);
    }

    @Override // defpackage.C0267Oq, defpackage.InterfaceC0029Aq
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    @Override // defpackage.InterfaceC2769hE
    public final Object d(InterfaceC3493uc interfaceC3493uc, Object obj) {
        return this.d.d(interfaceC3493uc, obj);
    }

    @Override // defpackage.InterfaceC2769hE
    public final boolean f(Throwable th) {
        return this.d.f(th);
    }

    @Override // defpackage.InterfaceC2769hE
    public final Object h(Object obj) {
        return this.d.h(obj);
    }

    @Override // defpackage.AbstractC2862j, defpackage.C0267Oq, defpackage.InterfaceC0029Aq
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // defpackage.InterfaceC2929kB
    public final P7 iterator() {
        return this.d.iterator();
    }

    @Override // defpackage.C0267Oq
    public final void n(CancellationException cancellationException) {
        CancellationException cancellationExceptionP = C0267Oq.P(this, cancellationException);
        this.d.cancel(cancellationExceptionP);
        m(cancellationExceptionP);
    }
}

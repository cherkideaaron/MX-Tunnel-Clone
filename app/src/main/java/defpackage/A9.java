package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class A9 extends AbstractC0114Fq {
    public final /* synthetic */ int e;
    public final B8 f;

    public /* synthetic */ A9(B8 b8, int i) {
        this.e = i;
        this.f = b8;
    }

    @Override // defpackage.AbstractC0114Fq
    public final boolean j() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.AbstractC0114Fq
    public final void k(Throwable th) {
        switch (this.e) {
            case 0:
                C0267Oq c0267OqI = i();
                B8 b8 = this.f;
                Throwable thQ = b8.q(c0267OqI);
                if (b8.w()) {
                    InterfaceC3493uc interfaceC3493uc = b8.d;
                    AbstractC0500aq.k(interfaceC3493uc, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    C0444Zg c0444Zg = (C0444Zg) interfaceC3493uc;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0444Zg.n;
                        Object obj = atomicReferenceFieldUpdater.get(c0444Zg);
                        C3337ri c3337ri = AbstractC0500aq.c;
                        if (AbstractC0500aq.b(obj, c3337ri)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c0444Zg, c3337ri, thQ)) {
                                if (atomicReferenceFieldUpdater.get(c0444Zg) != c3337ri) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c0444Zg, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c0444Zg) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                b8.cancel(thQ);
                if (!b8.w()) {
                    b8.o();
                    break;
                }
                break;
            default:
                Object obj2 = C0267Oq.a.get(i());
                this.f.resumeWith(obj2 instanceof C0217Ma ? AbstractC0115Ga.n(((C0217Ma) obj2).a) : AbstractC2883jK.S(obj2));
                break;
        }
    }
}

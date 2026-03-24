package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class Vr extends AbstractC0219Mc implements InterfaceC3227pg {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(Vr.class, "runningWorkers$volatile");
    public final /* synthetic */ InterfaceC3227pg c;
    public final AbstractC0219Mc d;
    public final int e;
    public final String f;
    public final C2528ct m;
    public final Object n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public Vr(AbstractC0219Mc abstractC0219Mc, int i, String str) {
        InterfaceC3227pg interfaceC3227pg = abstractC0219Mc instanceof InterfaceC3227pg ? (InterfaceC3227pg) abstractC0219Mc : null;
        this.c = interfaceC3227pg == null ? AbstractC0188Kf.a : interfaceC3227pg;
        this.d = abstractC0219Mc;
        this.e = i;
        this.f = str;
        this.m = new C2528ct();
        this.n = new Object();
    }

    @Override // defpackage.InterfaceC3227pg
    public final InterfaceC2680fh a(long j, RunnableC0584cJ runnableC0584cJ, InterfaceC0168Jc interfaceC0168Jc) {
        return this.c.a(j, runnableC0584cJ, interfaceC0168Jc);
    }

    @Override // defpackage.InterfaceC3227pg
    public final void b(long j, B8 b8) {
        this.c.b(j, b8);
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        this.m.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
        if (atomicIntegerFieldUpdater.get(this) < this.e) {
            synchronized (this.n) {
                if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableH = h();
                if (runnableH == null) {
                    return;
                }
                this.d.e(this, new RunnableC3680y0(13, this, runnableH));
            }
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}

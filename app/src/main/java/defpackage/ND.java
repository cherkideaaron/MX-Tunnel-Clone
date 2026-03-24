package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes2.dex */
public abstract class ND extends AbstractC2955kj {
    public final ExecutorC0287Qc c;

    public ND(int i, int i2, String str, long j) {
        this.c = new ExecutorC0287Qc(i, i2, str, j);
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        ExecutorC0287Qc executorC0287Qc = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0287Qc.n;
        executorC0287Qc.b(runnable, false, false);
    }
}

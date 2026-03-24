package defpackage;

import java.util.concurrent.Executor;

/* renamed from: Pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC0273Pf extends AbstractC2955kj implements Executor {
    public static final ExecutorC0273Pf c = new ExecutorC0273Pf();
    public static final AbstractC0219Mc d;

    static {
        GK gk = GK.c;
        int i = AbstractC3101nI.a;
        if (64 >= i) {
            i = 64;
        }
        d = gk.g(MO.P("kotlinx.coroutines.io.parallelism", i, 0, 0, 12), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        d.e(interfaceC0168Jc, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(C0021Ai.a, runnable);
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        return "Dispatchers.IO";
    }
}

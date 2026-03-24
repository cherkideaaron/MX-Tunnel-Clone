package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: rE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC3316rE implements Executor {
    public final Executor b;
    public volatile Runnable d;
    public final ArrayDeque a = new ArrayDeque();
    public final Object c = new Object();

    public ExecutorC3316rE(ExecutorService executorService) {
        this.b = executorService;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = !this.a.isEmpty();
        }
        return z;
    }

    public final void b() {
        synchronized (this.c) {
            try {
                Runnable runnable = (Runnable) this.a.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            try {
                this.a.add(new RunnableC3680y0(this, runnable, 19, false));
                if (this.d == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

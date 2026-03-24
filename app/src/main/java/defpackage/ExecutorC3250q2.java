package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC3250q2 implements Executor {
    public final Object a = new Object();
    public final ArrayDeque b = new ArrayDeque();
    public final Executor c;
    public Runnable d;

    public ExecutorC3250q2(ExecutorC0342Tg executorC0342Tg) {
        this.c = executorC0342Tg;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                Runnable runnable = (Runnable) this.b.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            try {
                this.b.add(new RunnableC3195p2(0, this, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

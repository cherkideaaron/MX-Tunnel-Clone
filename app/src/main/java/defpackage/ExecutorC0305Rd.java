package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: Rd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC0305Rd implements Executor {
    public final ExecutorService a;
    public final Object b = new Object();
    public Task c = Tasks.forResult(null);

    public ExecutorC0305Rd(ExecutorService executorService) {
        this.a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.b) {
            taskContinueWithTask = this.c.continueWithTask(this.a, new C0285Qa(runnable, 4));
            this.c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task b(CallableC0542bd callableC0542bd) {
        Task taskContinueWithTask;
        synchronized (this.b) {
            taskContinueWithTask = this.c.continueWithTask(this.a, new C0285Qa(callableC0542bd, 3));
            this.c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}

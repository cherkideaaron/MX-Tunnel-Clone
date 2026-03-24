package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: oP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC3163oP implements Runnable {
    private final TaskCompletionSource a;

    public AbstractRunnableC3163oP() {
        this.a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public AbstractRunnableC3163oP(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}

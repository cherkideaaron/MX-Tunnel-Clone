package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: qv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC3297qv implements Callable {
    public Object[] a;
    public final /* synthetic */ RunnableC2649f4 b;

    public CallableC3297qv(RunnableC2649f4 runnableC2649f4) {
        this.b = runnableC2649f4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        RunnableC2649f4 runnableC2649f4 = this.b;
        runnableC2649f4.e.set(true);
        Object objOnLoadInBackground = null;
        try {
            Process.setThreadPriority(10);
            objOnLoadInBackground = runnableC2649f4.n.onLoadInBackground();
            Binder.flushPendingCommands();
            return objOnLoadInBackground;
        } finally {
        }
    }
}

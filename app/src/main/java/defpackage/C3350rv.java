package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: rv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3350rv extends FutureTask {
    public final /* synthetic */ RunnableC2649f4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3350rv(RunnableC2649f4 runnableC2649f4, CallableC3297qv callableC3297qv) {
        super(callableC3297qv);
        this.a = runnableC2649f4;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC2649f4 runnableC2649f4 = this.a;
        try {
            Object obj = get();
            if (runnableC2649f4.e.get()) {
                return;
            }
            runnableC2649f4.a(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (runnableC2649f4.e.get()) {
                return;
            }
            runnableC2649f4.a(null);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}

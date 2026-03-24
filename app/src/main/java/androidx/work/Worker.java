package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.As;
import defpackage.Es;
import defpackage.VE;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    VE mFuture;

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract Es doWork();

    @Override // androidx.work.ListenableWorker
    public final As startWork() {
        this.mFuture = new VE();
        getBackgroundExecutor().execute(new a(this));
        return this.mFuture;
    }
}

package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.As;
import defpackage.C0589cO;
import defpackage.C3130nt;
import defpackage.InterfaceC3482uI;
import defpackage.PN;
import defpackage.RunnableC2705g5;
import defpackage.VE;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements PN {
    public static final String f = C3130nt.f("ConstraintTrkngWrkr");
    public final WorkerParameters a;
    public final Object b;
    public volatile boolean c;
    public final VE d;
    public ListenableWorker e;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = new Object();
        this.c = false;
        this.d = new VE();
    }

    @Override // defpackage.PN
    public final void d(ArrayList arrayList) {
        C3130nt.d().a(f, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.b) {
            this.c = true;
        }
    }

    @Override // defpackage.PN
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceC3482uI getTaskExecutor() {
        return C0589cO.S(getApplicationContext()).z;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final As startWork() {
        getBackgroundExecutor().execute(new RunnableC2705g5(this, 3));
        return this.d;
    }
}

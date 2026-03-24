package androidx.work;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ Worker a;

    public a(Worker worker) {
        this.a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.a;
        try {
            worker.mFuture.i(worker.doWork());
        } catch (Throwable th) {
            worker.mFuture.j(th);
        }
    }
}

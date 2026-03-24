package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public final class YN implements Runnable {
    public static final String m = C3130nt.f("WorkForegroundRunnable");
    public final VE a = new VE();
    public final Context b;
    public final C2834iO c;
    public final ListenableWorker d;
    public final InterfaceC0496am e;
    public final InterfaceC3482uI f;

    public YN(Context context, C2834iO c2834iO, ListenableWorker listenableWorker, C0480aO c0480aO, InterfaceC3482uI interfaceC3482uI) {
        this.b = context;
        this.c = c2834iO;
        this.d = listenableWorker;
        this.e = c0480aO;
        this.f = interfaceC3482uI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c.q || U7.b()) {
            this.a.i(null);
            return;
        }
        VE ve = new VE();
        D3 d3 = (D3) this.f;
        ((ExecutorC3531vD) d3.d).execute(new XN(this, ve, 0));
        ve.addListener(new XN(this, ve, 1), (ExecutorC3531vD) d3.d);
    }
}

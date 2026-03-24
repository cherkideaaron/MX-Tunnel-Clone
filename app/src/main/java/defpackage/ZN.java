package defpackage;

import android.content.Context;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ZN implements Runnable {
    public final /* synthetic */ VE a;
    public final /* synthetic */ UUID b;
    public final /* synthetic */ C0415Xl c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ C0480aO e;

    public ZN(C0480aO c0480aO, VE ve, UUID uuid, C0415Xl c0415Xl, Context context) {
        this.e = c0480aO;
        this.a = ve;
        this.b = uuid;
        this.c = c0415Xl;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.a.a instanceof C3027m)) {
                String string = this.b.toString();
                int iG = this.e.c.g(string);
                if (iG == 0 || Vs.d(iG)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((Oz) this.e.b).g(string, this.c);
                this.d.startService(C2773hI.a(this.d, string, this.c));
            }
            this.a.i(null);
        } catch (Throwable th) {
            this.a.j(th);
        }
    }
}

package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: nO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3107nO {
    public static final String e = C3130nt.f("WorkTimer");
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    public C3107nO() {
        ThreadFactoryC2942kO threadFactoryC2942kO = new ThreadFactoryC2942kO();
        threadFactoryC2942kO.a = 0;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(threadFactoryC2942kO);
    }

    public final void a(String str, InterfaceC2997lO interfaceC2997lO) {
        synchronized (this.d) {
            C3130nt.d().a(e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            RunnableC3052mO runnableC3052mO = new RunnableC3052mO(this, str);
            this.b.put(str, runnableC3052mO);
            this.c.put(str, interfaceC2997lO);
            this.a.schedule(runnableC3052mO, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            try {
                if (((RunnableC3052mO) this.b.remove(str)) != null) {
                    C3130nt.d().a(e, "Stopping timer for " + str, new Throwable[0]);
                    this.c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

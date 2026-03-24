package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Oz implements InterfaceC2900jj, InterfaceC0449Zl {
    public static final String r = C3130nt.f("Processor");
    public final Context b;
    public final C2770hF c;
    public final InterfaceC3482uI d;
    public final WorkDatabase e;
    public final List n;
    public final HashMap m = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet o = new HashSet();
    public final ArrayList p = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object q = new Object();

    public Oz(Context context, C2770hF c2770hF, D3 d3, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = c2770hF;
        this.d = d3;
        this.e = workDatabase;
        this.n = list;
    }

    public static boolean c(String str, RunnableC3326rO runnableC3326rO) {
        boolean zIsDone;
        if (runnableC3326rO == null) {
            C3130nt.d().a(r, AbstractC3264qG.w("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        runnableC3326rO.y = true;
        runnableC3326rO.i();
        As as = runnableC3326rO.x;
        if (as != null) {
            zIsDone = as.isDone();
            runnableC3326rO.x.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = runnableC3326rO.f;
        if (listenableWorker == null || zIsDone) {
            C3130nt.d().a(RunnableC3326rO.z, "WorkSpec " + runnableC3326rO.e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        C3130nt.d().a(r, AbstractC3264qG.w("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(InterfaceC2900jj interfaceC2900jj) {
        synchronized (this.q) {
            this.p.add(interfaceC2900jj);
        }
    }

    @Override // defpackage.InterfaceC2900jj
    public final void b(String str, boolean z) {
        synchronized (this.q) {
            try {
                this.m.remove(str);
                C3130nt.d().a(r, Oz.class.getSimpleName() + " " + str + " executed; reschedule = " + z, new Throwable[0]);
                Iterator it = this.p.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2900jj) it.next()).b(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean zContains;
        synchronized (this.q) {
            zContains = this.o.contains(str);
        }
        return zContains;
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.q) {
            try {
                z = this.m.containsKey(str) || this.f.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void f(InterfaceC2900jj interfaceC2900jj) {
        synchronized (this.q) {
            this.p.remove(interfaceC2900jj);
        }
    }

    public final void g(String str, C0415Xl c0415Xl) {
        synchronized (this.q) {
            try {
                C3130nt.d().e(r, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                RunnableC3326rO runnableC3326rO = (RunnableC3326rO) this.m.remove(str);
                if (runnableC3326rO != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock wakeLockA = LM.a(this.b, "ProcessorForegroundLck");
                        this.a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f.put(str, runnableC3326rO);
                    Intent intentC = C2773hI.c(this.b, str, c0415Xl);
                    Context context = this.b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        U1.s(context, intentC);
                    } else {
                        context.startService(intentC);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(String str, D3 d3) {
        synchronized (this.q) {
            try {
                if (e(str)) {
                    C3130nt.d().a(r, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.b;
                C2770hF c2770hF = this.c;
                InterfaceC3482uI interfaceC3482uI = this.d;
                WorkDatabase workDatabase = this.e;
                D3 d32 = new D3();
                Context applicationContext = context.getApplicationContext();
                List list = this.n;
                if (d3 == null) {
                    d3 = d32;
                }
                RunnableC3326rO runnableC3326rO = new RunnableC3326rO();
                runnableC3326rO.n = new Bs();
                runnableC3326rO.w = new VE();
                runnableC3326rO.x = null;
                runnableC3326rO.a = applicationContext;
                runnableC3326rO.m = interfaceC3482uI;
                runnableC3326rO.p = this;
                runnableC3326rO.b = str;
                runnableC3326rO.c = list;
                runnableC3326rO.d = d3;
                runnableC3326rO.f = null;
                runnableC3326rO.o = c2770hF;
                runnableC3326rO.q = workDatabase;
                runnableC3326rO.r = workDatabase.n();
                runnableC3326rO.s = workDatabase.i();
                runnableC3326rO.t = workDatabase.o();
                VE ve = runnableC3326rO.w;
                RunnableC0354Ub runnableC0354Ub = new RunnableC0354Ub(4);
                runnableC0354Ub.b = this;
                runnableC0354Ub.c = str;
                runnableC0354Ub.d = ve;
                ve.addListener(runnableC0354Ub, (ExecutorC3531vD) ((D3) this.d).d);
                this.m.put(str, runnableC3326rO);
                ((ExecutorC3316rE) ((D3) this.d).b).execute(runnableC3326rO);
                C3130nt.d().a(r, AbstractC3264qG.h(Oz.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.q) {
            try {
                if (!(!this.f.isEmpty())) {
                    Context context = this.b;
                    String str = C2773hI.p;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable th) {
                        C3130nt.d().b(r, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean zC;
        synchronized (this.q) {
            C3130nt.d().a(r, "Processor stopping foreground work " + str, new Throwable[0]);
            zC = c(str, (RunnableC3326rO) this.f.remove(str));
        }
        return zC;
    }

    public final boolean k(String str) {
        boolean zC;
        synchronized (this.q) {
            C3130nt.d().a(r, "Processor stopping background work " + str, new Throwable[0]);
            zC = c(str, (RunnableC3326rO) this.m.remove(str));
        }
        return zC;
    }
}

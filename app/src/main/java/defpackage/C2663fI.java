package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: fI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2663fI implements InterfaceC2900jj {
    public static final String q = C3130nt.f("SystemAlarmDispatcher");
    public final Context a;
    public final InterfaceC3482uI b;
    public final C3107nO c;
    public final Oz d;
    public final C0589cO e;
    public final C0064Da f;
    public final Handler m;
    public final ArrayList n;
    public Intent o;
    public InterfaceC2608eI p;

    public C2663fI(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f = new C0064Da(applicationContext);
        this.c = new C3107nO();
        C0589cO c0589cOS = C0589cO.S(context);
        this.e = c0589cOS;
        Oz oz = c0589cOS.B;
        this.d = oz;
        this.b = c0589cOS.z;
        oz.a(this);
        this.n = new ArrayList();
        this.o = null;
        this.m = new Handler(Looper.getMainLooper());
    }

    public final void a(int i, Intent intent) {
        C3130nt c3130ntD = C3130nt.d();
        String str = q;
        c3130ntD.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C3130nt.d().g(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.n) {
            try {
                boolean z = !this.n.isEmpty();
                this.n.add(intent);
                if (!z) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2900jj
    public final void b(String str, boolean z) {
        String str2 = C0064Da.d;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        f(new RunnableC2921k3(this, intent, 0, 5));
    }

    public final void c() {
        if (this.m.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.n) {
            try {
                Iterator it = this.n.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        C3130nt.d().a(q, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.d.f(this);
        ScheduledExecutorService scheduledExecutorService = this.c.a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.p = null;
    }

    public final void f(Runnable runnable) {
        this.m.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock wakeLockA = LM.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            ((D3) this.e.z).t(new RunnableC2554dI(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}

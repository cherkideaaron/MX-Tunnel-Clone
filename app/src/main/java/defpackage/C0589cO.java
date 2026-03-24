package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: cO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589cO extends MO {
    public static C0589cO F;
    public static C0589cO G;
    public static final Object H;
    public final List A;
    public final Oz B;
    public final C0607co C;
    public boolean D;
    public BroadcastReceiver.PendingResult E;
    public final Context w;
    public final C2770hF x;
    public final WorkDatabase y;
    public final InterfaceC3482uI z;

    static {
        C3130nt.f("WorkManagerImpl");
        F = null;
        G = null;
        H = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017d A[Catch: InstantiationException -> 0x0257, IllegalAccessException -> 0x026f, ClassNotFoundException -> 0x0287, TryCatch #3 {ClassNotFoundException -> 0x0287, IllegalAccessException -> 0x026f, InstantiationException -> 0x0257, blocks: (B:41:0x0175, B:45:0x0191, B:44:0x017d), top: B:82:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0589cO(android.content.Context r25, defpackage.C2770hF r26, defpackage.D3 r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0589cO.<init>(android.content.Context, hF, D3):void");
    }

    public static C0589cO R() {
        synchronized (H) {
            try {
                C0589cO c0589cO = F;
                if (c0589cO != null) {
                    return c0589cO;
                }
                return G;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0589cO S(Context context) {
        C0589cO c0589cOR;
        synchronized (H) {
            try {
                c0589cOR = R();
                if (c0589cOR == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0589cOR;
    }

    public static void T(Context context, C2770hF c2770hF) {
        synchronized (H) {
            try {
                C0589cO c0589cO = F;
                if (c0589cO != null && G != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c0589cO == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (G == null) {
                        G = new C0589cO(applicationContext, c2770hF, new D3((ExecutorService) c2770hF.e));
                    }
                    F = G;
                }
            } finally {
            }
        }
    }

    public final void U() {
        synchronized (H) {
            try {
                this.D = true;
                BroadcastReceiver.PendingResult pendingResult = this.E;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.E = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V() {
        ArrayList arrayListF;
        WorkDatabase workDatabase = this.y;
        Context context = this.w;
        String str = C2991lI.e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListF = C2991lI.f(context, jobScheduler)) != null && !arrayListF.isEmpty()) {
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                C2991lI.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        C3308r6 c3308r6N = workDatabase.n();
        TC tc = (TC) c3308r6N.a;
        tc.b();
        C2881jI c2881jI = (C2881jI) c3308r6N.o;
        C0497an c0497anA = c2881jI.a();
        tc.c();
        try {
            c0497anA.d.executeUpdateDelete();
            tc.h();
            tc.f();
            c2881jI.c(c0497anA);
            OD.a(this.x, workDatabase, this.A);
        } catch (Throwable th) {
            tc.f();
            c2881jI.c(c0497anA);
            throw th;
        }
    }

    public final void W(String str, D3 d3) {
        InterfaceC3482uI interfaceC3482uI = this.z;
        RunnableC0354Ub runnableC0354Ub = new RunnableC0354Ub(7);
        runnableC0354Ub.b = this;
        runnableC0354Ub.c = str;
        runnableC0354Ub.d = d3;
        ((D3) interfaceC3482uI).t(runnableC0354Ub);
    }

    public final void X(String str) {
        ((D3) this.z).t(new RunnableC2880jH(this, str, false));
    }
}

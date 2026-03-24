package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.AbstractC0115Ga;
import defpackage.C0147Hp;
import defpackage.C0271Pd;
import defpackage.C0295Qk;
import defpackage.C0312Rk;
import defpackage.C0413Xj;
import defpackage.C2524cp;
import defpackage.C2947kb;
import defpackage.C3002lb;
import defpackage.C3100nH;
import defpackage.C3178om;
import defpackage.C3663xk;
import defpackage.DJ;
import defpackage.GH;
import defpackage.H2;
import defpackage.InterfaceC0227Mk;
import defpackage.InterfaceC3258qA;
import defpackage.InterfaceC3411t1;
import defpackage.RunnableC3095nC;
import defpackage.Z3;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FirebaseMessaging {
    public static C2524cp k;
    public static ScheduledThreadPoolExecutor m;
    public final C3663xk a;
    public final Context b;
    public final H2 c;
    public final C3178om d;
    public final C0312Rk e;
    public final Executor f;
    public final Executor g;
    public final C0147Hp h;
    public boolean i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static InterfaceC3258qA l = new C3002lb(5);

    public FirebaseMessaging(C3663xk c3663xk, InterfaceC3258qA interfaceC3258qA, InterfaceC3258qA interfaceC3258qA2, InterfaceC0227Mk interfaceC0227Mk, InterfaceC3258qA interfaceC3258qA3, GH gh) {
        final int i = 1;
        final int i2 = 0;
        c3663xk.a();
        Context context = c3663xk.a;
        final C0147Hp c0147Hp = new C0147Hp();
        c0147Hp.b = 0;
        c0147Hp.c = context;
        c3663xk.a();
        Rpc rpc = new Rpc(c3663xk.a);
        final H2 h2 = new H2();
        h2.a = c3663xk;
        h2.b = c0147Hp;
        h2.c = rpc;
        h2.d = interfaceC3258qA;
        h2.e = interfaceC3258qA2;
        h2.f = interfaceC0227Mk;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.i = false;
        l = interfaceC3258qA3;
        this.a = c3663xk;
        this.e = new C0312Rk(this, gh);
        c3663xk.a();
        final Context context2 = c3663xk.a;
        this.b = context2;
        C0413Xj c0413Xj = new C0413Xj();
        this.h = c0147Hp;
        this.c = h2;
        this.d = new C3178om(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        c3663xk.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c0413Xj);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: Pk
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        final Context context3 = firebaseMessaging2.b;
                        AbstractC0115Ga.D(context3);
                        final boolean zF = firebaseMessaging2.f();
                        boolean zIsAtLeastQ = PlatformVersion.isAtLeastQ();
                        H2 h22 = firebaseMessaging2.c;
                        if (zIsAtLeastQ) {
                            SharedPreferences sharedPreferencesG = AbstractC3279qd.G(context3);
                            if (!sharedPreferencesG.contains("proxy_retention") || sharedPreferencesG.getBoolean("proxy_retention", false) != zF) {
                                ((Rpc) h22.c).setRetainProxiedNotifications(zF).addOnSuccessListener(new P3(1), new OnSuccessListener() { // from class: tA
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = AbstractC3279qd.G(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            ((Rpc) h22.c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f, new C0295Qk(firebaseMessaging2, 1));
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i3 = DJ.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: CJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BJ bj;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C0147Hp c0147Hp2 = c0147Hp;
                H2 h22 = h2;
                synchronized (BJ.class) {
                    try {
                        WeakReference weakReference = BJ.d;
                        bj = weakReference != null ? (BJ) weakReference.get() : null;
                        if (bj == null) {
                            BJ bj2 = new BJ(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                            bj2.b();
                            BJ.d = new WeakReference(bj2);
                            bj = bj2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new DJ(firebaseMessaging, c0147Hp2, bj, h22, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new C0295Qk(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: Pk
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.b() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        final Context context3 = firebaseMessaging2.b;
                        AbstractC0115Ga.D(context3);
                        final boolean zF = firebaseMessaging2.f();
                        boolean zIsAtLeastQ = PlatformVersion.isAtLeastQ();
                        H2 h22 = firebaseMessaging2.c;
                        if (zIsAtLeastQ) {
                            SharedPreferences sharedPreferencesG = AbstractC3279qd.G(context3);
                            if (!sharedPreferencesG.contains("proxy_retention") || sharedPreferencesG.getBoolean("proxy_retention", false) != zF) {
                                ((Rpc) h22.c).setRetainProxiedNotifications(zF).addOnSuccessListener(new P3(1), new OnSuccessListener() { // from class: tA
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = AbstractC3279qd.G(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zF);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            ((Rpc) h22.c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f, new C0295Qk(firebaseMessaging2, 1));
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(RunnableC3095nC runnableC3095nC, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                m.schedule(runnableC3095nC, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C2524cp c(Context context) {
        try {
            if (k == null) {
                k = new C2524cp(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C3663xk c3663xk) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c3663xk.b(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() throws IOException {
        Task taskContinueWithTask;
        C3100nH c3100nHD = d();
        if (!h(c3100nHD)) {
            return c3100nHD.a;
        }
        String strC = C0147Hp.c(this.a);
        C3178om c3178om = this.d;
        synchronized (c3178om) {
            taskContinueWithTask = (Task) ((Z3) c3178om.c).get(strC);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                H2 h2 = this.c;
                taskContinueWithTask = h2.h(h2.t(C0147Hp.c((C3663xk) h2.a), "*", new Bundle())).onSuccessTask(this.g, new C0271Pd(this, strC, c3100nHD, 2)).continueWithTask((Executor) c3178om.b, new C2947kb(c3178om, strC));
                ((Z3) c3178om.c).put(strC, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final C3100nH d() {
        C3100nH c3100nHB;
        C2524cp c2524cpC = c(this.b);
        C3663xk c3663xk = this.a;
        c3663xk.a();
        String strF = "[DEFAULT]".equals(c3663xk.b) ? "" : c3663xk.f();
        String strC = C0147Hp.c(this.a);
        synchronized (c2524cpC) {
            c3100nHB = C3100nH.b(((SharedPreferences) c2524cpC.b).getString(strF + "|T|" + strC + "|*", null));
        }
        return c3100nHB;
    }

    public final synchronized void e(boolean z) {
        this.i = z;
    }

    public final boolean f() {
        Context context = this.b;
        AbstractC0115Ga.D(context);
        if (!PlatformVersion.isAtLeastQ()) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "GMS core is set for proxying");
        }
        if (this.a.b(InterfaceC3411t1.class) != null) {
            return true;
        }
        return AbstractC0115Ga.q() && l != null;
    }

    public final synchronized void g(long j2) {
        b(new RunnableC3095nC(this, Math.min(Math.max(30L, 2 * j2), j)), j2);
        this.i = true;
    }

    public final boolean h(C3100nH c3100nH) {
        if (c3100nH != null) {
            String strA = this.h.a();
            if (System.currentTimeMillis() <= c3100nH.c + C3100nH.d && strA.equals(c3100nH.b)) {
                return false;
            }
        }
        return true;
    }
}

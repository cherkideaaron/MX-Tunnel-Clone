package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: id, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2841id {
    public final Context a;
    public final C0102Fe b;
    public final C3178om c;
    public final long d;
    public R2 e;
    public R2 f;
    public C2567dd g;
    public final C2578dp h;
    public final C3121nk i;
    public final L7 j;
    public final InterfaceC3627x1 k;
    public final C0487ad l;
    public final C2949kd m;
    public final C2524cp n;
    public final D3 o;

    public C2841id(C3663xk c3663xk, C2578dp c2578dp, C2949kd c2949kd, C0102Fe c0102Fe, C3519v1 c3519v1, C3519v1 c3519v12, C3121nk c3121nk, C0487ad c0487ad, C2524cp c2524cp, D3 d3) {
        this.b = c0102Fe;
        c3663xk.a();
        this.a = c3663xk.a;
        this.h = c2578dp;
        this.m = c2949kd;
        this.j = c3519v1;
        this.k = c3519v12;
        this.i = c3121nk;
        this.l = c0487ad;
        this.n = c2524cp;
        this.o = d3;
        this.d = System.currentTimeMillis();
        this.c = new C3178om(6);
    }

    public final void a(C3308r6 c3308r6) {
        D3.j();
        D3.j();
        this.e.o();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.d(new C2731gd(this));
                this.g.f();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            if (!c3308r6.f().b.a) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.g.d(c3308r6)) {
                Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
            }
            this.g.g(((TaskCompletionSource) ((AtomicReference) c3308r6.o).get()).getTask());
            c();
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(C3308r6 c3308r6) {
        String str;
        Future<?> futureSubmit = ((ExecutorC0305Rd) this.o.b).a.submit(new RunnableC2621ed(this, c3308r6, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            e = e2;
            str = "Crashlytics encountered a problem during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        } catch (TimeoutException e3) {
            e = e3;
            str = "Crashlytics timed out during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        }
    }

    public final void c() {
        D3.j();
        try {
            R2 r2 = this.e;
            C3121nk c3121nk = (C3121nk) r2.c;
            c3121nk.getClass();
            if (new File((File) c3121nk.c, (String) r2.b).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}

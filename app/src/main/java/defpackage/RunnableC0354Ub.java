package defpackage;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Ub, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0354Ub implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ RunnableC0354Ub(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        AbstractC3290qo abstractC3290qo;
        OverScroller overScroller;
        Object objCall = null;
        boolean zBooleanValue = true;
        boolean z = false;
        switch (this.a) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.d;
                Context context = (Context) this.c;
                Intent intent = (Intent) this.b;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    C3130nt.d().a(ConstraintProxyUpdateReceiver.a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    Fy.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    Fy.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    Fy.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    Fy.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                ((AbstractC0263Om) this.b).getClass();
                AbstractC0263Om.g((View) this.c, (Rect) this.d);
                return;
            case 2:
                C3373sH c3373sH = (C3373sH) this.b;
                c3373sH.getClass();
                C0312Rk c0312Rk = (C0312Rk) this.c;
                if (((EM) c0312Rk.d) == null) {
                    String str = (String) c0312Rk.b;
                    DC dc = c3373sH.r;
                    if (dc != null) {
                        dc.b(str);
                    }
                } else {
                    CC cc = c3373sH.e;
                    if (cc != null) {
                        cc.a();
                    }
                }
                if (c0312Rk.a) {
                    c3373sH.a("intermediate-response");
                } else {
                    c3373sH.c("done");
                }
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                View view = (View) this.c;
                if (view == null || (overScroller = (abstractC3290qo = (AbstractC3290qo) this.d).d) == null) {
                    return;
                }
                boolean zComputeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                if (zComputeScrollOffset) {
                    abstractC3290qo.w(coordinatorLayout, view, abstractC3290qo.d.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) abstractC3290qo).C(coordinatorLayout, appBarLayout);
                if (appBarLayout.q) {
                    appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.z(coordinatorLayout)));
                    return;
                }
                return;
            case 4:
                try {
                    zBooleanValue = ((Boolean) ((As) this.d).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((InterfaceC2900jj) this.b).b((String) this.c, zBooleanValue);
                return;
            case 5:
                C3040mC c3040mC = (C3040mC) this.d;
                C3523v5 c3523v5 = (C3523v5) this.b;
                c3040mC.b(c3523v5, (TaskCompletionSource) this.c);
                ((AtomicInteger) c3040mC.i.c).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(c3040mC.b, c3040mC.a()) * (60000.0d / c3040mC.a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + c3523v5.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            case 6:
                try {
                    objCall = ((Callable) this.b).call();
                } catch (Exception unused3) {
                }
                ((Handler) this.d).post(new RunnableC3680y0((InterfaceC2840ic) this.c, objCall, 16, z));
                return;
            case 7:
                ((C0589cO) this.b).B.h((String) this.c, (D3) this.d);
                return;
            case 8:
                C2834iO c2834iOJ = ((WorkDatabase) this.b).n().j((String) this.c);
                if (c2834iOJ == null || !c2834iOJ.b()) {
                    return;
                }
                synchronized (((C2773hI) this.d).c) {
                    ((C2773hI) this.d).f.put((String) this.c, c2834iOJ);
                    ((C2773hI) this.d).m.add(c2834iOJ);
                    C2773hI c2773hI = (C2773hI) this.d;
                    c2773hI.n.c(c2773hI.m);
                }
                return;
            case 9:
                C2833iN.h((View) this.b, (C3178om) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 10:
                VE ve = (VE) this.c;
                RunnableC3326rO runnableC3326rO = (RunnableC3326rO) this.d;
                try {
                    ((As) this.b).get();
                    C3130nt.d().a(RunnableC3326rO.z, "Starting work for " + runnableC3326rO.e.c, new Throwable[0]);
                    runnableC3326rO.x = runnableC3326rO.f.startWork();
                    ve.k(runnableC3326rO.x);
                    return;
                } catch (Throwable th) {
                    ve.j(th);
                    return;
                }
            default:
                String str3 = (String) this.c;
                RunnableC3326rO runnableC3326rO2 = (RunnableC3326rO) this.d;
                try {
                    try {
                        Es es = (Es) ((VE) this.b).get();
                        if (es == null) {
                            C3130nt.d().b(RunnableC3326rO.z, runnableC3326rO2.e.c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            C3130nt.d().a(RunnableC3326rO.z, String.format("%s returned a %s result.", runnableC3326rO2.e.c, es), new Throwable[0]);
                            runnableC3326rO2.n = es;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        C3130nt.d().b(RunnableC3326rO.z, str3 + " failed because it threw an exception/error", e);
                    } catch (CancellationException e2) {
                        C3130nt.d().e(RunnableC3326rO.z, str3 + " was cancelled", e2);
                    } catch (ExecutionException e3) {
                        e = e3;
                        C3130nt.d().b(RunnableC3326rO.z, str3 + " failed because it threw an exception/error", e);
                    }
                    runnableC3326rO2.c();
                    return;
                } catch (Throwable th2) {
                    runnableC3326rO2.c();
                    throw th2;
                }
        }
    }

    public RunnableC0354Ub(View view, C3106nN c3106nN, C3178om c3178om, ValueAnimator valueAnimator) {
        this.a = 9;
        this.b = view;
        this.c = c3178om;
        this.d = valueAnimator;
    }

    public /* synthetic */ RunnableC0354Ub(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ RunnableC0354Ub(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}

package rased.vpn.app.activities;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import defpackage.AbstractC0500aq;
import defpackage.C0360Uh;
import defpackage.C3460tx;
import defpackage.C3492ub;
import defpackage.InterfaceC0409Xf;
import defpackage.Mz;
import defpackage.Or;
import defpackage.YD;

/* loaded from: classes2.dex */
public class OpenVPNApplication extends Application implements Application.ActivityLifecycleCallbacks, InterfaceC0409Xf {
    public static Context e;
    public C3460tx a;
    public Activity b;
    public YD c;
    public C3492ub d;

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void a(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final void b(Or or) {
        C3460tx c3460tx = this.a;
        Activity activity = this.b;
        int i = C3460tx.e;
        c3460tx.b(activity, new C0360Uh(22));
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void e(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void f(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final void g(Or or) {
    }

    @Override // defpackage.InterfaceC0409Xf
    public final /* synthetic */ void h(Or or) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.a.c) {
            return;
        }
        this.b = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        e = getApplicationContext();
        this.c = new YD(this);
        this.d = C3492ub.c(this);
        MobileAds.initialize(this);
        Mz.o.f.a(this);
        this.a = new C3460tx(this);
        AbstractC0500aq.i(getApplicationContext());
    }
}

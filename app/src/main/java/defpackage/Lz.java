package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class Lz extends AbstractC3769zi {
    final /* synthetic */ Mz this$0;

    public Lz(Mz mz) {
        this.this$0 = mz;
    }

    @Override // defpackage.AbstractC3769zi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0500aq.m(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC2930kC.b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0500aq.k(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC2930kC) fragmentFindFragmentByTag).a = this.this$0.n;
        }
    }

    @Override // defpackage.AbstractC3769zi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        Mz mz = this.this$0;
        int i = mz.b - 1;
        mz.b = i;
        if (i == 0) {
            Handler handler = mz.e;
            AbstractC0500aq.j(handler);
            handler.postDelayed(mz.m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0500aq.m(activity, "activity");
        N3.d(activity, new Kz(this.this$0));
    }

    @Override // defpackage.AbstractC3769zi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        Mz mz = this.this$0;
        int i = mz.a - 1;
        mz.a = i;
        if (i == 0 && mz.c) {
            mz.f.e(Hr.ON_STOP);
            mz.d = true;
        }
    }
}

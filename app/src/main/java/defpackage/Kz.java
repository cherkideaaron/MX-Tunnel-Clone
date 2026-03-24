package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class Kz extends AbstractC3769zi {
    final /* synthetic */ Mz this$0;

    public Kz(Mz mz) {
        this.this$0 = mz;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        Mz mz = this.this$0;
        int i = mz.a + 1;
        mz.a = i;
        if (i == 1 && mz.d) {
            mz.f.e(Hr.ON_START);
            mz.d = false;
        }
    }
}

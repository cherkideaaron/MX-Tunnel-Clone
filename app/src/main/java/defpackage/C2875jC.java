package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: jC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2875jC implements Application.ActivityLifecycleCallbacks {

    @NotNull
    public static final C2822iC Companion = new C2822iC();

    public static final void registerIn(@NotNull Activity activity) {
        Companion.getClass();
        AbstractC0500aq.m(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new C2875jC());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        AbstractC0500aq.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        AbstractC0500aq.m(activity, "activity");
        int i = FragmentC2930kC.b;
        AbstractC0500aq.y(activity, Hr.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        int i = FragmentC2930kC.b;
        AbstractC0500aq.y(activity, Hr.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        int i = FragmentC2930kC.b;
        AbstractC0500aq.y(activity, Hr.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        int i = FragmentC2930kC.b;
        AbstractC0500aq.y(activity, Hr.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        int i = FragmentC2930kC.b;
        AbstractC0500aq.y(activity, Hr.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
        int i = FragmentC2930kC.b;
        AbstractC0500aq.y(activity, Hr.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        AbstractC0500aq.m(activity, "activity");
        AbstractC0500aq.m(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        AbstractC0500aq.m(activity, "activity");
    }
}

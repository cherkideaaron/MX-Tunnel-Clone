package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;

/* loaded from: classes.dex */
public abstract class N3 {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void c(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void d(Activity activity, Kz kz) {
        AbstractC0500aq.m(activity, "activity");
        activity.registerActivityLifecycleCallbacks(kz);
    }

    public static void e(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void f(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void g(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}

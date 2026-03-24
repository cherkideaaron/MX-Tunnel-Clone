package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import java.io.File;
import java.util.Locale;

/* renamed from: wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3600wb {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static Context b(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList c(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static File d(Context context) {
        return context.getDataDir();
    }

    public static DecimalFormatSymbols e(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList f(Configuration configuration) {
        return configuration.getLocales();
    }

    public static boolean g(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void h(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void i(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}

package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3140o2 {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}

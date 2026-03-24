package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3574w2 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static Us b(Configuration configuration) {
        return Us.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(Us us) {
        LocaleList.setDefault(LocaleList.forLanguageTags(us.a.a()));
    }

    public static void d(Configuration configuration, Us us) {
        configuration.setLocales(LocaleList.forLanguageTags(us.a.a()));
    }
}

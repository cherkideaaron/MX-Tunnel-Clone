package defpackage;

import android.os.LocaleList;
import android.widget.TextView;

/* renamed from: m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3031m3 {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}

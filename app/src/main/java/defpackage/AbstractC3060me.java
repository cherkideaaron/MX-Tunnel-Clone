package defpackage;

import android.os.LocaleList;

/* renamed from: me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3060me {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}

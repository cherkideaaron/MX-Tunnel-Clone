package defpackage;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Us {
    public static final Us b = a(new Locale[0]);
    public final Xs a;

    public Us(Xs xs) {
        this.a = xs;
    }

    public static Us a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new Us(new Ys(AbstractC3600wb.c(localeArr))) : new Us(new Ws(localeArr));
    }

    public static Us b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = Ts.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Us) {
            if (this.a.equals(((Us) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

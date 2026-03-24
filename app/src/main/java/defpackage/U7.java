package defpackage;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class U7 {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            W.c(30);
        }
        if (i >= 30) {
            W.c(31);
        }
        if (i >= 30) {
            W.c(33);
        }
        if (i >= 30) {
            W.c(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (AbstractC0500aq.b("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        AbstractC0500aq.l(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        AbstractC0500aq.l(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                AbstractC0500aq.l(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                AbstractC0500aq.l(str, "CODENAME");
                if (a("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            if (i >= 34) {
                String str = Build.VERSION.CODENAME;
                AbstractC0500aq.l(str, "CODENAME");
                if (a("VanillaIceCream", str)) {
                }
            }
            return false;
        }
        return true;
    }
}

package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3293qr {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public C3293qr(int i) {
        this.c = i;
    }

    public static String b(int i, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean c(String str) {
        String strB = b(this.c, "com.crashlytics.version-control-info");
        if (this.a.size() >= this.b && !this.a.containsKey(strB)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.b, null);
            return false;
        }
        String strB2 = b(this.c, str);
        String str2 = (String) this.a.get(strB);
        if (str2 == null ? strB2 == null : str2.equals(strB2)) {
            return false;
        }
        this.a.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.c, str);
                if (this.a.size() < this.b || this.a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.a.put(strB, str2 == null ? "" : b(this.c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

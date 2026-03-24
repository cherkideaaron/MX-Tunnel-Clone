package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: hL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2776hL {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static C2776hL d;
    public final C3397so a;

    public C2776hL(C3397so c3397so) {
        this.a = c3397so;
    }

    public final boolean a(C3686y6 c3686y6) {
        if (TextUtils.isEmpty(c3686y6.c)) {
            return true;
        }
        long j = c3686y6.f + c3686y6.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}

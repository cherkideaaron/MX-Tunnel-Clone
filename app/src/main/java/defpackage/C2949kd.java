package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2949kd {
    public static final C0108Fk c = new C0108Fk(11);
    public final Dy a;
    public final AtomicReference b = new AtomicReference(null);

    public C2949kd(Dy dy) {
        this.a = dy;
        dy.a(new C0285Qa(this, 1));
    }

    public final C0108Fk a(String str) {
        C2949kd c2949kd = (C2949kd) this.b.get();
        return c2949kd == null ? c : c2949kd.a(str);
    }

    public final boolean b() {
        C2949kd c2949kd = (C2949kd) this.b.get();
        return c2949kd != null && c2949kd.b();
    }

    public final boolean c(String str) {
        C2949kd c2949kd = (C2949kd) this.b.get();
        return c2949kd != null && c2949kd.c(str);
    }

    public final void d(String str, String str2, long j, E6 e6) {
        String strW = AbstractC3264qG.w("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strW, null);
        }
        this.a.a(new C2894jd(str, str2, j, e6, 0));
    }
}

package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class BJ {
    public static WeakReference d;
    public final SharedPreferences a;
    public C2811i1 b;
    public final Executor c;

    public BJ(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.a = sharedPreferences;
    }

    public final synchronized C3537vJ a() {
        C3537vJ c3537vJ;
        String strU = this.b.u();
        Pattern pattern = C3537vJ.d;
        c3537vJ = null;
        if (!TextUtils.isEmpty(strU)) {
            String[] strArrSplit = strU.split("!", -1);
            if (strArrSplit.length == 2) {
                c3537vJ = new C3537vJ(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c3537vJ;
    }

    public final synchronized void b() {
        this.b = C2811i1.m(this.a, this.c);
    }

    public final synchronized void c(C3537vJ c3537vJ) {
        this.b.y(c3537vJ.c);
    }
}

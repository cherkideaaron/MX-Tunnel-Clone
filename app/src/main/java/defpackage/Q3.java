package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class Q3 extends AbstractC0115Ga {
    public static volatile Q3 t;
    public static final P3 u = new P3(0);
    public final C2952kg s = new C2952kg();

    public static Q3 X() {
        if (t != null) {
            return t;
        }
        synchronized (Q3.class) {
            try {
                if (t == null) {
                    t = new Q3();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public final void Y(Runnable runnable) {
        C2952kg c2952kg = this.s;
        if (c2952kg.u == null) {
            synchronized (c2952kg.s) {
                try {
                    if (c2952kg.u == null) {
                        c2952kg.u = C2952kg.X(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c2952kg.u.post(runnable);
    }
}

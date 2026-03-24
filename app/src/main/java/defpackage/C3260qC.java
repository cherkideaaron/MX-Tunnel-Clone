package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: qC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3260qC {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final C2776hL a;
    public long b;
    public int c;

    public C3260qC() {
        if (C3397so.n == null) {
            Pattern pattern = C2776hL.c;
            C3397so.n = new C3397so(27);
        }
        C3397so c3397so = C3397so.n;
        if (C2776hL.d == null) {
            C2776hL.d = new C2776hL(c3397so);
        }
        this.a = C2776hL.d;
    }

    public final synchronized long a(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return d;
        }
        double dPow = Math.pow(2.0d, this.c);
        this.a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            hL r0 = r4.a     // Catch: java.lang.Throwable -> L19
            so r0 = r0.a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3260qC.b():boolean");
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            c();
            return;
        }
        this.c++;
        long jA = a(i);
        this.a.a.getClass();
        this.b = System.currentTimeMillis() + jA;
    }
}

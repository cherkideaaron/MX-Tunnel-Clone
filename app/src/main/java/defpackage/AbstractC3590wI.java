package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3590wI {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final C0108Fk f;

    static {
        String property;
        int i = AbstractC3101nI.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = MO.O(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = AbstractC3101nI.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = MO.P("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        d = MO.P("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(MO.O(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = C0108Fk.f;
    }
}

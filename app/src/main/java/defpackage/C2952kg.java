package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: kg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2952kg extends AbstractC0115Ga {
    public final Object s = new Object();
    public final ExecutorService t = Executors.newFixedThreadPool(4, new ThreadFactoryC2843ig(0));
    public volatile Handler u;

    public static Handler X(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2897jg.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}

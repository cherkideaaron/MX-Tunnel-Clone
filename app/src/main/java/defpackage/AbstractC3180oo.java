package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.Nullable;

/* renamed from: oo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3180oo {

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objN;
        try {
            objN = new C3125no(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objN = AbstractC0115Ga.n(th);
        }
        if (objN instanceof HC) {
            objN = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            objNewInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC0500aq.k(objNewInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                objNewInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) objNewInstance;
    }
}

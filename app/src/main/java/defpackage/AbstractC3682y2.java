package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3682y2 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, F2 f2) {
        Objects.requireNonNull(f2);
        C3628x2 c3628x2 = new C3628x2(f2, 0);
        U.n(obj).registerOnBackInvokedCallback(1000000, c3628x2);
        return c3628x2;
    }

    public static void c(Object obj, Object obj2) {
        U.n(obj).unregisterOnBackInvokedCallback(U.k(obj2));
    }
}

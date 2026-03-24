package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class NL {
    public static AN a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        AN anG = AN.g(null, rootWindowInsets);
        C3703yN c3703yN = anG.a;
        c3703yN.p(anG);
        c3703yN.d(view.getRootView());
        return anG;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}

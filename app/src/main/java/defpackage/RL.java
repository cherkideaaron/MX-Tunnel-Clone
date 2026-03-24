package defpackage;

import android.view.View;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public abstract class RL {
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    public static FN b(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new FN(windowInsetsController);
        }
        return null;
    }

    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}

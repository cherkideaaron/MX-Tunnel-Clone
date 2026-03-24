package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* renamed from: pG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3209pG extends C2524cp {
    public View d;
    public WindowInsetsController e;

    @Override // defpackage.C2524cp
    public final void w() {
        View view = this.d;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.e;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.w();
    }
}

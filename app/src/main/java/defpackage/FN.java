package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class FN {
    public final VP a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [DN] */
    /* JADX WARN: Type inference failed for: r4v6, types: [DN] */
    public FN(Window window, View view) {
        BN cn2;
        C2827iH c2827iH = new C2827iH(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ?? en = new EN(window.getInsetsController(), c2827iH);
            en.c = window;
            cn2 = en;
        } else if (i >= 30) {
            ?? dn = new DN(window.getInsetsController(), c2827iH);
            dn.c = window;
            cn2 = dn;
        } else {
            cn2 = i >= 26 ? new CN(window, c2827iH) : new BN(window, c2827iH);
        }
        this.a = cn2;
    }

    public FN(WindowInsetsController windowInsetsController) {
        this.a = Build.VERSION.SDK_INT >= 35 ? new EN(windowInsetsController, new C2827iH(windowInsetsController)) : new DN(windowInsetsController, new C2827iH(windowInsetsController));
    }
}

package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class LL implements View.OnApplyWindowInsetsListener {
    public AN a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ Uw c;

    public LL(View view, Uw uw) {
        this.b = view;
        this.c = uw;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AN anG = AN.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        Uw uw = this.c;
        if (i < 30) {
            ML.a(windowInsets, this.b);
            if (anG.equals(this.a)) {
                return uw.j(view, anG).f();
            }
        }
        this.a = anG;
        AN anJ = uw.j(view, anG);
        if (i >= 30) {
            return anJ.f();
        }
        WeakHashMap weakHashMap = UL.a;
        KL.c(view);
        return anJ.f();
    }
}

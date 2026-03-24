package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Nu extends C3725ys implements Bu {
    public static final Method K;
    public Bu J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.C3725ys
    public final C0054Ch a(Context context, boolean z) {
        Mu mu = new Mu(context, z);
        mu.setHoverListener(this);
        return mu;
    }

    @Override // defpackage.Bu
    public final void d(MenuC3511uu menuC3511uu, MenuItem menuItem) {
        Bu bu = this.J;
        if (bu != null) {
            bu.d(menuC3511uu, menuItem);
        }
    }

    @Override // defpackage.Bu
    public final void n(MenuC3511uu menuC3511uu, Cu cu) {
        Bu bu = this.J;
        if (bu != null) {
            bu.n(menuC3511uu, cu);
        }
    }
}

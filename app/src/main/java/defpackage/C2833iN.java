package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.mxtunnel.pro.R;
import java.util.List;

/* renamed from: iN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2833iN extends AbstractC3051mN {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final C0294Qj f = new C0294Qj(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view) {
        C0147Hp c0147HpJ = j(view);
        if (c0147HpJ != null) {
            ((View) c0147HpJ.d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z) {
        C0147Hp c0147HpJ = j(view);
        if (c0147HpJ != null) {
            c0147HpJ.c = windowInsets;
            if (!z) {
                View view2 = (View) c0147HpJ.d;
                int[] iArr = (int[]) c0147HpJ.e;
                view2.getLocationOnScreen(iArr);
                z = true;
                c0147HpJ.a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void g(View view, AN an, List list) {
        C0147Hp c0147HpJ = j(view);
        if (c0147HpJ != null) {
            c0147HpJ.f(an, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), an, list);
            }
        }
    }

    public static void h(View view, C3178om c3178om) {
        C0147Hp c0147HpJ = j(view);
        if (c0147HpJ != null) {
            View view2 = (View) c0147HpJ.d;
            int[] iArr = (int[]) c0147HpJ.e;
            view2.getLocationOnScreen(iArr);
            int i = c0147HpJ.a - iArr[1];
            c0147HpJ.b = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), c3178om);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0147Hp j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC2778hN) {
            return ((ViewOnApplyWindowInsetsListenerC2778hN) tag).a;
        }
        return null;
    }
}

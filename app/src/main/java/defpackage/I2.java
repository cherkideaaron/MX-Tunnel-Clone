package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import com.mxtunnel.pro.R;

/* loaded from: classes.dex */
public final class I2 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static I2 c;
    public C3584wC a;

    public static synchronized I2 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return C3584wC.h(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            I2 i2 = new I2();
            c = i2;
            i2.a = C3584wC.d();
            C3584wC c3584wC = c.a;
            H2 h2 = new H2();
            h2.a = new int[]{2131230836, 2131230834, 2131230760};
            h2.b = new int[]{2131230784, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            h2.c = new int[]{2131230833, 2131230835, 2131230777, R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
            h2.d = new int[]{2131230809, R.drawable.abc_cab_background_internal_bg, 2131230808};
            h2.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            h2.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            c3584wC.l(h2);
        }
    }

    public static void e(Drawable drawable, C2609eJ c2609eJ, int[] iArr) {
        PorterDuff.Mode mode = C3584wC.h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c2609eJ.d;
        if (z || c2609eJ.c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z ? c2609eJ.a : null;
            PorterDuff.Mode mode2 = c2609eJ.c ? c2609eJ.b : C3584wC.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = C3584wC.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}

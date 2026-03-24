package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.mxtunnel.pro.R;

/* loaded from: classes.dex */
public class Ju {
    public final Context a;
    public final MenuC3511uu b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public Ou i;
    public Hu j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final Iu l = new Iu(this);

    public Ju(int i, int i2, MenuC3511uu menuC3511uu, Context context, View view, boolean z) {
        this.a = context;
        this.b = menuC3511uu;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final Hu a() {
        Hu rg;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                rg = new M8(this.a, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                int i = this.e;
                boolean z = this.c;
                Context context2 = this.a;
                rg = new RG(this.d, i, this.b, context2, view, z);
            }
            rg.k(this.b);
            rg.q(this.l);
            rg.m(this.f);
            rg.f(this.i);
            rg.n(this.h);
            rg.o(this.g);
            this.j = rg;
        }
        return this.j;
    }

    public final boolean b() {
        Hu hu = this.j;
        return hu != null && hu.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        Hu huA = a();
        huA.r(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            huA.p(i);
            huA.s(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            huA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        huA.show();
    }
}

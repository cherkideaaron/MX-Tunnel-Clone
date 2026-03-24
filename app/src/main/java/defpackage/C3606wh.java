package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.ArrayList;

/* renamed from: wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3606wh extends AbstractC0069Df {
    public final int k;
    public WL l;
    public final RunnableC2705g5 m = new RunnableC2705g5(this, 8);
    public final /* synthetic */ DrawerLayout n;

    public C3606wh(DrawerLayout drawerLayout, int i) {
        this.n = drawerLayout;
        this.k = i;
    }

    @Override // defpackage.AbstractC0069Df
    public final void K(int i, int i2) {
        int i3 = i & 1;
        DrawerLayout drawerLayout = this.n;
        View viewD = drawerLayout.d(i3 == 1 ? 3 : 5);
        if (viewD == null || drawerLayout.g(viewD) != 0) {
            return;
        }
        this.l.b(viewD, i2);
    }

    @Override // defpackage.AbstractC0069Df
    public final void L() {
        this.n.postDelayed(this.m, 160L);
    }

    @Override // defpackage.AbstractC0069Df
    public final void O(View view, int i) {
        ((C3498uh) view.getLayoutParams()).c = false;
        int i2 = this.k == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.n;
        View viewD = drawerLayout.d(i2);
        if (viewD != null) {
            drawerLayout.b(viewD);
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final void P(int i) {
        int i2;
        int size;
        int size2;
        View rootView;
        int size3;
        View view = this.l.t;
        DrawerLayout drawerLayout = this.n;
        int i3 = drawerLayout.m.a;
        int i4 = drawerLayout.n.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C3498uh) view.getLayoutParams()).b;
            if (f == 0.0f) {
                C3498uh c3498uh = (C3498uh) view.getLayoutParams();
                if ((c3498uh.d & 1) == 1) {
                    c3498uh.d = 0;
                    ArrayList arrayList = drawerLayout.y;
                    if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
                        Vs.u(drawerLayout.y.get(size3));
                        throw null;
                    }
                    drawerLayout.q(view, false);
                    drawerLayout.p(view);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C3498uh c3498uh2 = (C3498uh) view.getLayoutParams();
                if ((c3498uh2.d & 1) == 0) {
                    c3498uh2.d = 1;
                    ArrayList arrayList2 = drawerLayout.y;
                    if (arrayList2 != null && (size2 = arrayList2.size() - 1) >= 0) {
                        Vs.u(drawerLayout.y.get(size2));
                        throw null;
                    }
                    drawerLayout.q(view, true);
                    drawerLayout.p(view);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != drawerLayout.q) {
            drawerLayout.q = i2;
            ArrayList arrayList3 = drawerLayout.y;
            if (arrayList3 == null || (size = arrayList3.size() - 1) < 0) {
                return;
            }
            Vs.u(drawerLayout.y.get(size));
            throw null;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final void Q(View view, int i, int i2) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.n;
        float width2 = (drawerLayout.a(view, 3) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.o(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // defpackage.AbstractC0069Df
    public final void R(View view, float f, float f2) {
        int i;
        DrawerLayout drawerLayout = this.n;
        drawerLayout.getClass();
        float f3 = ((C3498uh) view.getLayoutParams()).b;
        int width = view.getWidth();
        if (drawerLayout.a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.l.q(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.AbstractC0069Df
    public final int f(View view, int i) {
        int width;
        int width2;
        DrawerLayout drawerLayout = this.n;
        if (drawerLayout.a(view, 3)) {
            width2 = -view.getWidth();
            width = 0;
        } else {
            width = drawerLayout.getWidth();
            width2 = width - view.getWidth();
        }
        return Math.max(width2, Math.min(i, width));
    }

    @Override // defpackage.AbstractC0069Df
    public final boolean f0(View view, int i) {
        DrawerLayout drawerLayout = this.n;
        drawerLayout.getClass();
        return DrawerLayout.l(view) && drawerLayout.a(view, this.k) && drawerLayout.g(view) == 0;
    }

    @Override // defpackage.AbstractC0069Df
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.AbstractC0069Df
    public final int y(View view) {
        this.n.getClass();
        if (DrawerLayout.l(view)) {
            return view.getWidth();
        }
        return 0;
    }
}

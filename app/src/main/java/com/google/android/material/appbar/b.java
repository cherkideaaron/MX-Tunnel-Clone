package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.C0513b2;
import defpackage.M;
import defpackage.V;
import defpackage.Z;

/* loaded from: classes2.dex */
public final class b extends M {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.M
    public final void d(View view, Z z) {
        AppBarLayout.BaseBehavior baseBehavior;
        View viewX;
        this.a.onInitializeAccessibilityNodeInfo(view, z.a);
        z.i(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.d;
        if (appBarLayout.getTotalScrollRange() == 0 || (viewX = AppBarLayout.BaseBehavior.x((baseBehavior = this.f), this.e)) == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0513b2) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.u() != (-appBarLayout.getTotalScrollRange())) {
                    z.b(V.h);
                    z.j(true);
                }
                if (baseBehavior.u() != 0) {
                    if (viewX.canScrollVertically(-1) && (-appBarLayout.getDownNestedPreScrollRange()) == 0) {
                        return;
                    }
                    z.b(V.i);
                    z.j(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.M
    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        if (baseBehavior.u() != 0) {
            View viewX = AppBarLayout.BaseBehavior.x(baseBehavior, this.e);
            if (!viewX.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                CoordinatorLayout coordinatorLayout = this.e;
                AppBarLayout appBarLayout2 = this.d;
                this.f.A(coordinatorLayout, appBarLayout2, viewX, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}

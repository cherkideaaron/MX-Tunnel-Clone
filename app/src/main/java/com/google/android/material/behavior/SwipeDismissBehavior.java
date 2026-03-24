package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC3763zc;
import defpackage.C2827iH;
import defpackage.C3588wG;
import defpackage.UL;
import defpackage.V;
import defpackage.WL;
import defpackage.XH;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC3763zc {
    public WL a;
    public C2827iH b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public final float f = 0.5f;
    public float g = 0.0f;
    public float h = 0.5f;
    public final XH i = new XH(this);

    @Override // defpackage.AbstractC3763zc
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!zO) {
            return false;
        }
        if (this.a == null) {
            this.a = new WL(coordinatorLayout.getContext(), coordinatorLayout, this.i);
        }
        return !this.d && this.a.r(motionEvent);
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            UL.i(view, 1048576);
            UL.g(view, 0);
            if (s(view)) {
                UL.j(view, V.l, new C3588wG(this));
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}

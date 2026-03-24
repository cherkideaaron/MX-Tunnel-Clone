package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3763zc;
import defpackage.AccessibilityManagerTouchExplorationStateChangeListenerC0078Do;
import defpackage.C0049Cc;
import defpackage.C0095Eo;
import defpackage.C3028m0;
import defpackage.J8;
import defpackage.S1;
import defpackage.Vs;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends AbstractC3763zc {
    public AbstractC0500aq a;
    public AccessibilityManager b;
    public AccessibilityManager.TouchExplorationStateChangeListener c;
    public int f;
    public int g;
    public TimeInterpolator h;
    public TimeInterpolator i;
    public ViewPropertyAnimator l;
    public final boolean d = true;
    public final LinkedHashSet e = new LinkedHashSet();
    public int j = 0;
    public int k = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC0078Do accessibilityManagerTouchExplorationStateChangeListenerC0078Do = new AccessibilityManagerTouchExplorationStateChangeListenerC0078Do(this, view, 1);
            this.c = accessibilityManagerTouchExplorationStateChangeListenerC0078Do;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC0078Do);
            view.addOnAttachStateChangeListener(new J8(this, 4));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((C0049Cc) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            i2 = 1;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            i2 = (absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0;
        }
        s(i2);
        this.j = this.a.I(view, marginLayoutParams);
        this.f = AbstractC0069Df.U(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = AbstractC0069Df.U(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = AbstractC0069Df.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, S1.d);
        this.i = AbstractC0069Df.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, S1.c);
        return false;
    }

    @Override // defpackage.AbstractC3763zc
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                t(view);
                return;
            }
            return;
        }
        if (this.k == 1) {
            return;
        }
        if (this.d && (accessibilityManager = this.b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = 1;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
        this.l = this.a.L(view, this.j).setInterpolator(this.i).setDuration(this.g).setListener(new C3028m0(this, 4));
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void s(int i) {
        C0095Eo c0095Eo;
        AbstractC0500aq abstractC0500aq = this.a;
        if (abstractC0500aq == null || abstractC0500aq.K() != i) {
            if (i == 0) {
                c0095Eo = new C0095Eo(2);
            } else if (i == 1) {
                c0095Eo = new C0095Eo(0);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(Vs.l(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                c0095Eo = new C0095Eo(1);
            }
            this.a = c0095Eo;
        }
    }

    public final void t(View view) {
        if (this.k == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = 2;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
        this.a.getClass();
        this.l = this.a.L(view, 0).setInterpolator(this.h).setDuration(this.f).setListener(new C3028m0(this, 4));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}

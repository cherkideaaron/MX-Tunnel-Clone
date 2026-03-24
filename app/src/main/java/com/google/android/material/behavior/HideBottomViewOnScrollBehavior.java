package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC3763zc;
import defpackage.AccessibilityManagerTouchExplorationStateChangeListenerC0078Do;
import defpackage.C3028m0;
import defpackage.J8;
import defpackage.S1;
import defpackage.Vs;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC3763zc {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public AccessibilityManager.TouchExplorationStateChangeListener h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.AbstractC3763zc
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = AbstractC0069Df.U(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = AbstractC0069Df.U(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = AbstractC0069Df.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, S1.d);
        this.e = AbstractC0069Df.V(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, S1.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || this.h != null) {
            return false;
        }
        AccessibilityManagerTouchExplorationStateChangeListenerC0078Do accessibilityManagerTouchExplorationStateChangeListenerC0078Do = new AccessibilityManagerTouchExplorationStateChangeListenerC0078Do(this, view, 0);
        this.h = accessibilityManagerTouchExplorationStateChangeListenerC0078Do;
        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC0078Do);
        view.addOnAttachStateChangeListener(new J8(this, 3));
        return false;
    }

    @Override // defpackage.AbstractC3763zc
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
        this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new C3028m0(this, 3));
    }

    @Override // defpackage.AbstractC3763zc
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
        this.k = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new C3028m0(this, 3));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}

package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mxtunnel.pro.R;
import defpackage.AbstractC3279qd;
import defpackage.AbstractC3296qu;
import defpackage.AbstractC3763zc;
import defpackage.C0049Cc;
import defpackage.C2638eu;
import defpackage.C2878jF;
import defpackage.I7;
import defpackage.InterfaceC2918k0;
import defpackage.K7;
import defpackage.RA;
import defpackage.TF;
import defpackage.UL;
import defpackage.V;
import defpackage.Vs;
import defpackage.WL;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends AbstractC3763zc {
    public AbstractC3279qd a;
    public final C2638eu b;
    public final ColorStateList c;
    public final C2878jF d;
    public final K7 e;
    public final float f;
    public final boolean g;
    public int h;
    public WL i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final I7 v;

    public SideSheetBehavior() {
        this.e = new K7(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new I7(this, 1);
    }

    @Override // defpackage.AbstractC3763zc
    public final void c(C0049Cc c0049Cc) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.AbstractC3763zc
    public final void f() {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        WL wl;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && UL.d(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (wl = this.i) == null || !wl.r(motionEvent)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010e A[PHI: r2
      0x010e: PHI (r2v16 jF) = (r2v11 jF), (r2v20 jF) binds: [B:72:0x0155, B:55:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC3763zc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.AbstractC3763zc
    public final void n(View view, Parcelable parcelable) {
        int i = ((TF) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.AbstractC3763zc
    public final Parcelable o(View view) {
        return new TF(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.AbstractC3763zc
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.j && t()) {
            float fAbs = Math.abs(this.t - motionEvent.getX());
            WL wl = this.i;
            if (fAbs > wl.b) {
                wl.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void s(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
        v();
    }

    public final boolean t() {
        return this.i != null && (this.g || this.h == 1);
    }

    public final void u(View view, boolean z, int i) {
        int iY;
        if (i == 3) {
            iY = this.a.y();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(Vs.k(i, "Invalid state to get outer edge offset: "));
            }
            iY = this.a.z();
        }
        WL wl = this.i;
        if (wl == null || (!z ? wl.s(view, iY, view.getTop()) : wl.q(iY, view.getTop()))) {
            s(i);
        } else {
            s(2);
            this.e.a(i);
        }
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        UL.i(view, 262144);
        UL.g(view, 0);
        UL.i(view, 1048576);
        UL.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            UL.j(view, V.l, new InterfaceC2918k0() { // from class: SF
                @Override // defpackage.InterfaceC2918k0
                public final boolean b(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.a;
                    sideSheetBehavior.getClass();
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(AbstractC3264qG.l(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.s(i2);
                    } else {
                        View view3 = (View) sideSheetBehavior.p.get();
                        RunnableC3746zC runnableC3746zC = new RunnableC3746zC(i2, 1, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                            view3.post(runnableC3746zC);
                        } else {
                            runnableC3746zC.run();
                        }
                    }
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            UL.j(view, V.j, new InterfaceC2918k0() { // from class: SF
                @Override // defpackage.InterfaceC2918k0
                public final boolean b(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.a;
                    sideSheetBehavior.getClass();
                    int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(AbstractC3264qG.l(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.s(i22);
                    } else {
                        View view3 = (View) sideSheetBehavior.p.get();
                        RunnableC3746zC runnableC3746zC = new RunnableC3746zC(i22, 1, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                            view3.post(runnableC3746zC);
                        } else {
                            runnableC3746zC.run();
                        }
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new K7(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new I7(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.B);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = AbstractC3296qu.x(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = C2878jF.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        C2878jF c2878jF = this.d;
        if (c2878jF != null) {
            C2638eu c2638eu = new C2638eu(c2878jF);
            this.b = c2638eu;
            c2638eu.l(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

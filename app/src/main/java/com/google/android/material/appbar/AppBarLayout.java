package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.mxtunnel.pro.R;
import defpackage.AN;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2644f;
import defpackage.AbstractC2883jK;
import defpackage.AbstractC3279qd;
import defpackage.AbstractC3290qo;
import defpackage.AbstractC3296qu;
import defpackage.AbstractC3343ro;
import defpackage.AbstractC3763zc;
import defpackage.C0049Cc;
import defpackage.C0458a2;
import defpackage.C0513b2;
import defpackage.C2638eu;
import defpackage.C2827iH;
import defpackage.InterfaceC0561bw;
import defpackage.InterfaceC3709yc;
import defpackage.ML;
import defpackage.MO;
import defpackage.R2;
import defpackage.RA;
import defpackage.S1;
import defpackage.UL;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements InterfaceC3709yc {
    public static final /* synthetic */ int G = 0;
    public int[] A;
    public int B;
    public Drawable C;
    public Integer D;
    public final float E;
    public Behavior F;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public AN m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ColorStateList r;
    public int s;
    public WeakReference t;
    public ValueAnimator u;
    public ValueAnimator.AnimatorUpdateListener v;
    public final ArrayList w;
    public final LinkedHashSet x;
    public final long y;
    public final TimeInterpolator z;

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC3290qo {
        public int j;
        public int k;
        public ValueAnimator l;
        public d m;
        public WeakReference n;

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void D(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L5a
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                b2 r0 = (defpackage.C0513b2) r0
                int r0 = r0.a
                r1 = r0 & 1
                if (r1 == 0) goto L5a
                int r1 = r4.getMinimumHeight()
                r3 = 1
                if (r9 <= 0) goto L48
                r9 = r0 & 12
                if (r9 == 0) goto L48
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L48:
                r9 = r0 & 2
                if (r9 == 0) goto L5a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L5a:
                r3 = r2
            L5b:
                boolean r8 = r7.q
                if (r8 == 0) goto L67
                android.view.View r8 = z(r6)
                boolean r3 = r7.f(r8)
            L67:
                boolean r8 = r7.e(r3)
                if (r10 != 0) goto La7
                if (r8 == 0) goto Lce
                KJ r8 = r6.b
                java.lang.Object r8 = r8.b
                WF r8 = (defpackage.WF) r8
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r6 = r6.d
                r6.clear()
                if (r8 == 0) goto L85
                r6.addAll(r8)
            L85:
                int r8 = r6.size()
            L89:
                if (r2 >= r8) goto Lce
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                Cc r9 = (defpackage.C0049Cc) r9
                zc r9 = r9.a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.f
                if (r6 == 0) goto Lce
                goto La7
            La4:
                int r2 = r2 + 1
                goto L89
            La7:
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                if (r6 == 0) goto Lb4
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                r6.jumpToCurrentState()
            Lb4:
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                if (r6 == 0) goto Lc1
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                r6.jumpToCurrentState()
            Lc1:
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                if (r6 == 0) goto Lce
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                r6.jumpToCurrentState()
            Lce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public static View x(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((C0049Cc) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC0561bw) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int downNestedPreScrollRange;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    iArr[1] = v(coordinatorLayout, appBarLayout, u() - i, i3, i4);
                }
            }
            if (appBarLayout.q) {
                appBarLayout.e(appBarLayout.f(view));
            }
        }

        public final d B(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC2644f.b;
                    }
                    d dVar = new d(parcelable);
                    boolean z = iS == 0;
                    dVar.d = z;
                    dVar.c = !z && (-iS) >= appBarLayout.getTotalScrollRange();
                    dVar.e = i;
                    dVar.m = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    dVar.f = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iU = u() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0513b2 c0513b2 = (C0513b2) childAt.getLayoutParams();
                if ((c0513b2.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c0513b2).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c0513b2).bottomMargin;
                }
                int i2 = -iU;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                C0513b2 c0513b22 = (C0513b2) childAt2.getLayoutParams();
                int i3 = c0513b22.a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iU < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) c0513b22).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c0513b22).bottomMargin;
                    }
                    if (iU < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    y(coordinatorLayout, appBarLayout, MO.h(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        @Override // defpackage.AbstractC2777hM, defpackage.AbstractC3763zc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
            /*
                r4 = this;
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                super.h(r5, r6, r7)
                int r7 = r6.getPendingAction()
                com.google.android.material.appbar.d r0 = r4.m
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L58
                r3 = r7 & 8
                if (r3 != 0) goto L58
                boolean r7 = r0.c
                if (r7 == 0) goto L20
                int r7 = r6.getTotalScrollRange()
                int r7 = -r7
            L1c:
                r4.w(r5, r6, r7)
                goto L78
            L20:
                boolean r7 = r0.d
                if (r7 == 0) goto L28
            L24:
                r4.w(r5, r6, r1)
                goto L78
            L28:
                int r7 = r0.e
                android.view.View r7 = r6.getChildAt(r7)
                int r0 = r7.getBottom()
                int r0 = -r0
                com.google.android.material.appbar.d r3 = r4.m
                boolean r3 = r3.m
                if (r3 == 0) goto L44
                int r7 = r7.getMinimumHeight()
                int r3 = r6.getTopInset()
                int r3 = r3 + r7
                int r3 = r3 + r0
                goto L54
            L44:
                int r7 = r7.getHeight()
                float r7 = (float) r7
                com.google.android.material.appbar.d r3 = r4.m
                float r3 = r3.f
                float r7 = r7 * r3
                int r7 = java.lang.Math.round(r7)
                int r3 = r7 + r0
            L54:
                r4.w(r5, r6, r3)
                goto L78
            L58:
                if (r7 == 0) goto L78
                r0 = r7 & 4
                if (r0 == 0) goto L60
                r0 = r2
                goto L61
            L60:
                r0 = r1
            L61:
                r3 = r7 & 2
                if (r3 == 0) goto L70
                int r7 = r6.getUpNestedPreScrollRange()
                int r7 = -r7
                if (r0 == 0) goto L1c
                r4.y(r5, r6, r7)
                goto L78
            L70:
                r7 = r7 & r2
                if (r7 == 0) goto L78
                if (r0 == 0) goto L24
                r4.y(r5, r6, r1)
            L78:
                r6.f = r1
                r7 = 0
                r4.m = r7
                int r7 = r4.s()
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                int r7 = defpackage.MO.h(r7, r0, r1)
                a7 r0 = r4.a
                if (r0 == 0) goto L98
                int r3 = r0.c
                if (r3 == r7) goto L9a
                r0.c = r7
                r0.b()
                goto L9a
            L98:
                r4.b = r7
            L9a:
                int r7 = r4.s()
                D(r5, r6, r7, r1, r2)
                int r7 = r4.s()
                r6.a = r7
                boolean r7 = r6.willNotDraw()
                if (r7 != 0) goto Lb0
                r6.postInvalidateOnAnimation()
            Lb0:
                android.view.View$AccessibilityDelegate r7 = defpackage.UL.c(r5)
                if (r7 == 0) goto Lb7
                goto Lbf
            Lb7:
                com.google.android.material.appbar.b r7 = new com.google.android.material.appbar.b
                r7.<init>(r5, r4, r6)
                defpackage.UL.l(r5, r7)
            Lbf:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
        }

        @Override // defpackage.AbstractC3763zc
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((C0049Cc) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.AbstractC3763zc
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            A(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.AbstractC3763zc
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = v(coordinatorLayout, appBarLayout, u() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i3 == 0 && UL.c(coordinatorLayout) == null) {
                UL.l(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            }
        }

        @Override // defpackage.AbstractC3763zc
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof d) {
                this.m = (d) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // defpackage.AbstractC3763zc
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            d dVarB = B(absSavedState, (AppBarLayout) view);
            return dVarB == null ? absSavedState : dVarB;
        }

        @Override // defpackage.AbstractC3763zc
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.q || appBarLayout.p || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        @Override // defpackage.AbstractC3763zc
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.q) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        @Override // defpackage.AbstractC3290qo
        public final int u() {
            return s() + this.j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
        @Override // defpackage.AbstractC3290qo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int v(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 425
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(u() - i);
            float fAbs = Math.abs(0.0f);
            float f = iAbs;
            int iRound = fAbs > 0.0f ? Math.round((f / fAbs) * 1000.0f) * 3 : (int) (((f / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iU = u();
            if (iU == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(S1.e);
                this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iU, i);
            this.l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC3343ro {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.AbstractC3763zc
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.AbstractC3763zc
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC3763zc abstractC3763zc = ((C0049Cc) view2.getLayoutParams()).a;
            if (abstractC3763zc instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC3763zc).j) + this.e) - u(view2);
                WeakHashMap weakHashMap = UL.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.q) {
                return false;
            }
            appBarLayout.e(appBarLayout.f(view));
            return false;
        }

        @Override // defpackage.AbstractC3763zc
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                UL.l(coordinatorLayout, null);
            }
        }

        @Override // defpackage.AbstractC3763zc
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutV = v(coordinatorLayout.j(view));
            if (appBarLayoutV != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutV.d(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.z);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC3279qd.n0(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        int i = 1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.w = new ArrayList();
        this.x = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayS = AbstractC3279qd.S(context3, attributeSet, MO.k, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayS.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayS.getResourceId(0, 0)));
            }
            typedArrayS.recycle();
            TypedArray typedArrayS2 = AbstractC3279qd.S(context2, attributeSet, RA.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.r = AbstractC3296qu.x(context2, typedArrayS2, 6);
            this.y = AbstractC0069Df.U(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.z = AbstractC0069Df.V(context2, R.attr.motionEasingStandardInterpolator, S1.a);
            if (typedArrayS2.hasValue(4)) {
                d(typedArrayS2.getBoolean(4, false), false, false);
            }
            if (typedArrayS2.hasValue(3)) {
                MO.G(this, typedArrayS2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayS2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayS2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayS2.getBoolean(2, false));
                }
                if (typedArrayS2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayS2.getBoolean(1, false));
                }
            }
            this.E = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.q = typedArrayS2.getBoolean(5, false);
            this.s = typedArrayS2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayS2.getDrawable(8));
            typedArrayS2.recycle();
            C2827iH c2827iH = new C2827iH(this, i);
            WeakHashMap weakHashMap = UL.a;
            ML.k(this, c2827iH);
        } catch (Throwable th) {
            typedArrayS.recycle();
            throw th;
        }
    }

    public static C0513b2 b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C0513b2 c0513b2 = new C0513b2((LinearLayout.LayoutParams) layoutParams);
            c0513b2.a = 1;
            return c0513b2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0513b2 c0513b22 = new C0513b2((ViewGroup.MarginLayoutParams) layoutParams);
            c0513b22.a = 1;
            return c0513b22;
        }
        C0513b2 c0513b23 = new C0513b2(layoutParams);
        c0513b23.a = 1;
        return c0513b23;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0513b2 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0513b2 c0513b2 = new C0513b2(context, attributeSet);
        c0513b2.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RA.b);
        c0513b2.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        c0513b2.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new R2(6);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            c0513b2.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0513b2;
    }

    public final void c() {
        Behavior behavior = this.F;
        d dVarB = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.B(AbstractC2644f.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (dVarB != null) {
            Behavior behavior2 = this.F;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = dVarB;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0513b2;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.C == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.C.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[PHI: r0 r3
      0x0025: PHI (r0v8 float) = (r0v7 float), (r0v9 float) binds: [B:23:0x0035, B:14:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0025: PHI (r3v4 float) = (r3v1 float), (r3v6 float) binds: [B:23:0x0035, B:14:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.n
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L38
            boolean r0 = r4.p
            if (r0 == r5) goto L38
            r4.p = r5
            r4.refreshDrawableState()
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            boolean r0 = r0 instanceof defpackage.C2638eu
            if (r0 == 0) goto L39
            android.content.res.ColorStateList r0 = r4.r
            r2 = 0
            if (r0 == 0) goto L2a
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L22
            r3 = r2
            goto L23
        L22:
            r3 = r0
        L23:
            if (r5 == 0) goto L26
        L25:
            r2 = r0
        L26:
            r4.g(r3, r2)
            goto L39
        L2a:
            boolean r0 = r4.q
            if (r0 == 0) goto L39
            float r0 = r4.E
            if (r5 == 0) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = r0
        L35:
            if (r5 == 0) goto L26
            goto L25
        L38:
            r1 = 0
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.e(boolean):boolean");
    }

    public final boolean f(View view) {
        int i;
        if (this.t == null && (i = this.s) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.s);
            }
            if (viewFindViewById != null) {
                this.t = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.t;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final void g(float f, float f2) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.y);
        this.u.setInterpolator(this.z);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.v;
        if (animatorUpdateListener != null) {
            this.u.addUpdateListener(animatorUpdateListener);
        }
        this.u.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0513b2 c0513b2 = new C0513b2(-1, -2);
        c0513b2.a = 1;
        return c0513b2;
    }

    @Override // defpackage.InterfaceC3709yc
    public AbstractC3763zc getBehavior() {
        Behavior behavior = new Behavior();
        this.F = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C0513b2 c0513b2 = (C0513b2) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c0513b2.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) c0513b2).topMargin + ((LinearLayout.LayoutParams) c0513b2).bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0513b2 c0513b2 = (C0513b2) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c0513b2).topMargin + ((LinearLayout.LayoutParams) c0513b2).bottomMargin + childAt.getMeasuredHeight();
                int i3 = c0513b2.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.s;
    }

    public C2638eu getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C2638eu) {
            return (C2638eu) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.C;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        AN an = this.m;
        if (an != null) {
            return an.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0513b2 c0513b2 = (C0513b2) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c0513b2.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c0513b2).topMargin + ((LinearLayout.LayoutParams) c0513b2).bottomMargin + minimumHeight;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2638eu) {
            AbstractC2883jK.K(this, (C2638eu) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.A == null) {
            this.A = new int[4];
        }
        int[] iArr = this.A;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.o;
        iArr[0] = z ? R.attr.state_liftable : -2130969741;
        iArr[1] = (z && this.p) ? R.attr.state_lifted : -2130969742;
        iArr[2] = z ? R.attr.state_collapsible : -2130969737;
        iArr[3] = (z && this.p) ? R.attr.state_collapsed : -2130969736;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.t = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = false;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = UL.a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C0513b2) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.n) {
            return;
        }
        if (this.q) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((C0513b2) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.o != z2) {
            this.o = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = MO.h(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final C2638eu c2638eu;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer numValueOf = null;
        if (drawable instanceof C2638eu) {
            c2638eu = (C2638eu) drawable;
        } else {
            ColorStateList colorStateListY = AbstractC3296qu.y(drawable);
            if (colorStateListY == null) {
                c2638eu = null;
            } else {
                C2638eu c2638eu2 = new C2638eu();
                c2638eu2.o(colorStateListY);
                c2638eu = c2638eu2;
            }
        }
        if (c2638eu != null && (colorStateList = c2638eu.b.d) != null) {
            this.B = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.r;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue typedValueS = AbstractC0069Df.S(context2, R.attr.colorSurface);
                if (typedValueS != null) {
                    int i = typedValueS.resourceId;
                    numValueOf = Integer.valueOf(i != 0 ? context2.getColor(i) : typedValueS.data);
                }
                this.v = new ValueAnimator.AnimatorUpdateListener() { // from class: Z1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        int i2 = AppBarLayout.G;
                        AppBarLayout appBarLayout = this.a;
                        appBarLayout.getClass();
                        int iP = AbstractC0500aq.P(appBarLayout.B, colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iP);
                        C2638eu c2638eu3 = c2638eu;
                        c2638eu3.o(colorStateListValueOf);
                        if (appBarLayout.C != null && (num = appBarLayout.D) != null && num.equals(numValueOf)) {
                            appBarLayout.C.setTint(iP);
                        }
                        ArrayList arrayList = appBarLayout.w;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Vs.u(it.next());
                                if (c2638eu3.b.d != null) {
                                    throw null;
                                }
                            }
                        }
                        LinkedHashSet linkedHashSet = appBarLayout.x;
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            Vs.u(it2.next());
                            throw null;
                        }
                    }
                };
            } else {
                c2638eu.l(context);
                this.v = new C0458a2(0, this, c2638eu);
            }
            drawable = c2638eu;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C2638eu) {
            ((C2638eu) background).n(f);
        }
    }

    public void setExpanded(boolean z) {
        d(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.q = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.s = -1;
        if (view != null) {
            this.t = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.t = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.s = i;
        WeakReference weakReference = this.t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.t = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setPendingAction(int i) {
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStatusBarForeground(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.C
            if (r0 == r4) goto L72
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r4 == 0) goto L11
            android.graphics.drawable.Drawable r4 = r4.mutate()
            goto L12
        L11:
            r4 = r1
        L12:
            r3.C = r4
            boolean r0 = r4 instanceof defpackage.C2638eu
            if (r0 == 0) goto L21
            eu r4 = (defpackage.C2638eu) r4
            int r4 = r4.B
        L1c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L2c
        L21:
            android.content.res.ColorStateList r4 = defpackage.AbstractC3296qu.y(r4)
            if (r4 == 0) goto L2c
            int r4 = r4.getDefaultColor()
            goto L1c
        L2c:
            r3.D = r1
            android.graphics.drawable.Drawable r4 = r3.C
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L5f
            boolean r4 = r4.isStateful()
            if (r4 == 0) goto L43
            android.graphics.drawable.Drawable r4 = r3.C
            int[] r2 = r3.getDrawableState()
            r4.setState(r2)
        L43:
            android.graphics.drawable.Drawable r4 = r3.C
            int r2 = r3.getLayoutDirection()
            r4.setLayoutDirection(r2)
            android.graphics.drawable.Drawable r4 = r3.C
            int r2 = r3.getVisibility()
            if (r2 != 0) goto L56
            r2 = r0
            goto L57
        L56:
            r2 = r1
        L57:
            r4.setVisible(r2, r1)
            android.graphics.drawable.Drawable r4 = r3.C
            r4.setCallback(r3)
        L5f:
            android.graphics.drawable.Drawable r4 = r3.C
            if (r4 == 0) goto L6a
            int r4 = r3.getTopInset()
            if (r4 <= 0) goto L6a
            r1 = r0
        L6a:
            r4 = r1 ^ 1
            r3.setWillNotDraw(r4)
            r3.postInvalidateOnAnimation()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setStatusBarForeground(android.graphics.drawable.Drawable):void");
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AbstractC0500aq.F(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) throws Resources.NotFoundException {
        MO.G(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.C;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        C0513b2 c0513b2 = new C0513b2(-1, -2);
        c0513b2.a = 1;
        return c0513b2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}

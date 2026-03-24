package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.common.api.Api;
import defpackage.A0;
import defpackage.AbstractC2527cs;
import defpackage.AbstractC3264qG;
import defpackage.AbstractC3270qM;
import defpackage.B0;
import defpackage.C0;
import defpackage.C0360Uh;
import defpackage.C0557bs;
import defpackage.C2524cp;
import defpackage.C3572w0;
import defpackage.C3734z0;
import defpackage.Cu;
import defpackage.D0;
import defpackage.InterfaceC3403su;
import defpackage.InterfaceC3457tu;
import defpackage.MenuC3511uu;
import defpackage.Ou;
import defpackage.Su;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC2527cs implements InterfaceC3457tu, Su {
    public Ou A;
    public InterfaceC3403su B;
    public boolean C;
    public int D;
    public final int E;
    public final int F;
    public D0 G;
    public MenuC3511uu v;
    public Context w;
    public int x;
    public boolean y;
    public A0 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = (int) (56.0f * f);
        this.F = (int) (f * 4.0f);
        this.w = context;
        this.x = 0;
    }

    public static C0 j() {
        C0 c0 = new C0(-2, -2);
        c0.a = false;
        ((LinearLayout.LayoutParams) c0).gravity = 16;
        return c0;
    }

    public static C0 k(ViewGroup.LayoutParams layoutParams) {
        C0 c0;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0) {
            C0 c02 = (C0) layoutParams;
            c0 = new C0(c02);
            c0.a = c02.a;
        } else {
            c0 = new C0(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0).gravity = 16;
        }
        return c0;
    }

    @Override // defpackage.InterfaceC3457tu
    public final boolean a(Cu cu) {
        return this.v.q(cu, null, 0);
    }

    @Override // defpackage.Su
    public final void b(MenuC3511uu menuC3511uu) {
        this.v = menuC3511uu;
    }

    @Override // defpackage.AbstractC2527cs, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.AbstractC2527cs
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0557bs generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.AbstractC2527cs
    /* renamed from: g */
    public final C0557bs generateLayoutParams(AttributeSet attributeSet) {
        return new C0(getContext(), attributeSet);
    }

    @Override // defpackage.AbstractC2527cs, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.AbstractC2527cs, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.v == null) {
            Context context = getContext();
            MenuC3511uu menuC3511uu = new MenuC3511uu(context);
            this.v = menuC3511uu;
            menuC3511uu.e = new C2524cp(this, 2);
            A0 a0 = new A0(context);
            this.z = a0;
            a0.r = true;
            a0.s = true;
            Ou c0360Uh = this.A;
            if (c0360Uh == null) {
                c0360Uh = new C0360Uh(8);
            }
            a0.e = c0360Uh;
            this.v.b(a0, this.w);
            A0 a02 = this.z;
            a02.n = this;
            this.v = a02.c;
        }
        return this.v;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        A0 a0 = this.z;
        C3734z0 c3734z0 = a0.o;
        if (c3734z0 != null) {
            return c3734z0.getDrawable();
        }
        if (a0.q) {
            return a0.p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.AbstractC2527cs
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0557bs generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof B0)) {
            zA = ((B0) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof B0)) ? zA : zA | ((B0) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0 a0 = this.z;
        if (a0 != null) {
            a0.h();
            if (this.z.k()) {
                this.z.i();
                this.z.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0 a0 = this.z;
        if (a0 != null) {
            a0.i();
            C3572w0 c3572w0 = a0.z;
            if (c3572w0 == null || !c3572w0.b()) {
                return;
            }
            c3572w0.j.dismiss();
        }
    }

    @Override // defpackage.AbstractC2527cs, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.C) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = AbstractC3270qM.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0 c0 = (C0) childAt.getLayoutParams();
                if (c0.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0).leftMargin) + ((LinearLayout.LayoutParams) c0).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0 c02 = (C0) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c02.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c02).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c02).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0 c03 = (C0) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c03.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c03).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = AbstractC3264qG.d(measuredWidth4, ((LinearLayout.LayoutParams) c03).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // defpackage.AbstractC2527cs, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        ?? r1;
        int i10;
        int i11;
        int i12;
        MenuC3511uu menuC3511uu;
        boolean z2 = this.C;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.C = z3;
        if (z2 != z3) {
            this.D = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.C && (menuC3511uu = this.v) != null && size != this.D) {
            this.D = size;
            menuC3511uu.p(true);
        }
        int childCount = getChildCount();
        if (!this.C || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C0 c0 = (C0) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) c0).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.E;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int i19 = 0;
        int iMax = 0;
        int i20 = 0;
        boolean z4 = false;
        int i21 = 0;
        int iMax2 = 0;
        long j = 0;
        while (true) {
            i3 = this.F;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            if (childAt.getVisibility() == 8) {
                i10 = i14;
                i11 = paddingBottom;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i23 = i19 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0 c02 = (C0) childAt.getLayoutParams();
                c02.f = false;
                c02.c = 0;
                c02.b = 0;
                c02.d = false;
                ((LinearLayout.LayoutParams) c02).leftMargin = 0;
                ((LinearLayout.LayoutParams) c02).rightMargin = 0;
                c02.e = z5 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i24 = c02.a ? 1 : i16;
                C0 c03 = (C0) childAt.getLayoutParams();
                i10 = i14;
                i11 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i24 <= 0 || (z6 && i24 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i24 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i18;
                    if (measuredWidth % i18 != 0) {
                        i12++;
                    }
                    if (z6 && i12 < 2) {
                        i12 = 2;
                    }
                }
                c03.d = !c03.a && z6;
                c03.b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i18, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i12);
                if (c02.d) {
                    i21++;
                }
                if (c02.a) {
                    z4 = true;
                }
                i16 -= i12;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j |= 1 << i20;
                }
                i19 = i23;
            }
            i20++;
            size3 = i22;
            paddingBottom = i11;
            i14 = i10;
        }
        int i25 = i14;
        int i26 = size3;
        int i27 = iMax2;
        boolean z7 = z4 && i19 == 2;
        boolean z8 = false;
        while (i21 > 0 && i16 > 0) {
            int i28 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i29 = 0;
            int i30 = 0;
            long j2 = 0;
            while (i30 < childCount2) {
                int i31 = i27;
                C0 c04 = (C0) getChildAt(i30).getLayoutParams();
                boolean z9 = z8;
                if (c04.d) {
                    int i32 = c04.b;
                    if (i32 < i28) {
                        j2 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        i29++;
                        j2 |= 1 << i30;
                    }
                }
                i30++;
                z8 = z9;
                i27 = i31;
            }
            i5 = i27;
            z = z8;
            j |= j2;
            if (i29 > i16) {
                i4 = mode;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0 c05 = (C0) childAt2.getLayoutParams();
                int i35 = mode;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j3 = 1 << i34;
                if ((j2 & j3) != 0) {
                    if (z7 && c05.e) {
                        r1 = 1;
                        r1 = 1;
                        if (i16 == 1) {
                            childAt2.setPadding(i3 + i18, 0, i3, 0);
                        }
                    } else {
                        r1 = 1;
                    }
                    c05.b += r1;
                    c05.f = r1;
                    i16--;
                } else if (c05.b == i33) {
                    j |= j3;
                }
                i34++;
                childMeasureSpec = i36;
                mode = i35;
                childCount2 = i37;
            }
            i27 = i5;
            z8 = true;
        }
        i4 = mode;
        i5 = i27;
        z = z8;
        int i38 = childMeasureSpec;
        int i39 = childCount2;
        boolean z10 = !z4 && i19 == 1;
        if (i16 <= 0 || j == 0 || (i16 >= i19 - 1 && !z10 && iMax <= 1)) {
            i6 = i39;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i40 = i39 - 1;
                if ((j & (1 << i40)) != 0 && !((C0) getChildAt(i40).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : 0;
            i6 = i39;
            for (int i42 = 0; i42 < i6; i42++) {
                if ((j & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    C0 c06 = (C0) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c06.c = i41;
                        c06.f = true;
                        if (i42 == 0 && !c06.e) {
                            ((LinearLayout.LayoutParams) c06).leftMargin = (-i41) / 2;
                        }
                        z = true;
                    } else if (c06.a) {
                        c06.c = i41;
                        c06.f = true;
                        ((LinearLayout.LayoutParams) c06).rightMargin = (-i41) / 2;
                        z = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) c06).leftMargin = i41 / 2;
                        }
                        if (i42 != i6 - 1) {
                            ((LinearLayout.LayoutParams) c06).rightMargin = i41 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            int i43 = 0;
            while (i43 < i6) {
                View childAt4 = getChildAt(i43);
                C0 c07 = (C0) childAt4.getLayoutParams();
                if (c07.f) {
                    i9 = i38;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c07.b * i18) + c07.c, 1073741824), i9);
                } else {
                    i9 = i38;
                }
                i43++;
                i38 = i9;
            }
        }
        if (i4 != 1073741824) {
            i8 = i25;
            i7 = i5;
        } else {
            i7 = i26;
            i8 = i25;
        }
        setMeasuredDimension(i8, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.z.w = z;
    }

    public void setOnMenuItemClickListener(D0 d0) {
        this.G = d0;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        A0 a0 = this.z;
        C3734z0 c3734z0 = a0.o;
        if (c3734z0 != null) {
            c3734z0.setImageDrawable(drawable);
        } else {
            a0.q = true;
            a0.p = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.y = z;
    }

    public void setPopupTheme(int i) {
        if (this.x != i) {
            this.x = i;
            if (i == 0) {
                this.w = getContext();
            } else {
                this.w = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(A0 a0) {
        this.z = a0;
        a0.n = this;
        this.v = a0.c;
    }

    @Override // defpackage.AbstractC2527cs, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mxtunnel.pro.R;
import defpackage.A0;
import defpackage.AN;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3325rN;
import defpackage.C0130Gp;
import defpackage.C2668fN;
import defpackage.C2827iH;
import defpackage.C2937kJ;
import defpackage.C3028m0;
import defpackage.C3161oN;
import defpackage.C3193p0;
import defpackage.C3212pJ;
import defpackage.C3216pN;
import defpackage.C3248q0;
import defpackage.C3271qN;
import defpackage.C3623wy;
import defpackage.C3703yN;
import defpackage.InterfaceC0086Ef;
import defpackage.InterfaceC0103Ff;
import defpackage.InterfaceC2585dw;
import defpackage.InterfaceC2640ew;
import defpackage.InterfaceC3138o0;
import defpackage.KL;
import defpackage.LA;
import defpackage.ML;
import defpackage.MenuC3511uu;
import defpackage.RunnableC3083n0;
import defpackage.UL;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0086Ef, InterfaceC2585dw, InterfaceC2640ew {
    public static final int[] I = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final AN J;
    public static final Rect K;
    public InterfaceC3138o0 A;
    public OverScroller B;
    public ViewPropertyAnimator C;
    public final C3028m0 D;
    public final RunnableC3083n0 E;
    public final RunnableC3083n0 F;
    public final LA G;
    public final C3248q0 H;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public InterfaceC0103Ff e;
    public Drawable f;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public AN w;
    public AN x;
    public AN y;
    public AN z;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC3325rN c3271qN = i >= 30 ? new C3271qN() : i >= 29 ? new C3216pN() : new C3161oN();
        c3271qN.g(C0130Gp.b(0, 1, 0, 1));
        J = c3271qN.b();
        K = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        AN an = AN.b;
        this.w = an;
        this.x = an;
        this.y = an;
        this.z = an;
        this.D = new C3028m0(this, 0);
        this.E = new RunnableC3083n0(this, 0);
        this.F = new RunnableC3083n0(this, 1);
        i(context);
        this.G = new LA(3);
        C3248q0 c3248q0 = new C3248q0(context);
        c3248q0.setWillNotDraw(true);
        this.H = c3248q0;
        addView(c3248q0);
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        C3193p0 c3193p0 = (C3193p0) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c3193p0).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c3193p0).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c3193p0).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c3193p0).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c3193p0).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c3193p0).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c3193p0).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c3193p0).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.InterfaceC2640ew
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.InterfaceC2585dw
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.InterfaceC2585dw
    public final boolean c(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3193p0;
    }

    @Override // defpackage.InterfaceC2585dw
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    @Override // defpackage.InterfaceC2585dw
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.InterfaceC2585dw
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3193p0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3193p0(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        LA la = this.G;
        return la.c | la.b;
    }

    public CharSequence getTitle() {
        k();
        return ((C3212pJ) this.e).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.B = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((C3212pJ) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C3212pJ) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0103Ff wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0103Ff) {
                wrapper = (InterfaceC0103Ff) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(MenuC3511uu menuC3511uu, C2827iH c2827iH) {
        k();
        C3212pJ c3212pJ = (C3212pJ) this.e;
        A0 a0 = c3212pJ.m;
        Toolbar toolbar = c3212pJ.a;
        if (a0 == null) {
            c3212pJ.m = new A0(toolbar.getContext());
        }
        A0 a02 = c3212pJ.m;
        a02.e = c2827iH;
        if (menuC3511uu == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        MenuC3511uu menuC3511uu2 = toolbar.a.v;
        if (menuC3511uu2 == menuC3511uu) {
            return;
        }
        if (menuC3511uu2 != null) {
            menuC3511uu2.r(toolbar.Q);
            menuC3511uu2.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new C2937kJ(toolbar);
        }
        a02.w = true;
        if (menuC3511uu != null) {
            menuC3511uu.b(a02, toolbar.p);
            menuC3511uu.b(toolbar.R, toolbar.p);
        } else {
            a02.j(toolbar.p, null);
            toolbar.R.j(toolbar.p, null);
            a02.h();
            toolbar.R.h();
        }
        toolbar.a.setPopupTheme(toolbar.q);
        toolbar.a.setPresenter(a02);
        toolbar.Q = a02;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        AN anG = AN.g(this, windowInsets);
        boolean zG = g(this.d, new Rect(anG.b(), anG.d(), anG.c(), anG.a()), false);
        WeakHashMap weakHashMap = UL.a;
        Rect rect = this.s;
        ML.b(this, anG, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C3703yN c3703yN = anG.a;
        AN anL = c3703yN.l(i, i2, i3, i4);
        this.w = anL;
        boolean z = true;
        if (!this.x.equals(anL)) {
            this.x = this.w;
            zG = true;
        }
        Rect rect2 = this.t;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c3703yN.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = UL.a;
        KL.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C3193p0 c3193p0 = (C3193p0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c3193p0).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c3193p0).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.o || !z) {
            return false;
        }
        this.B.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (this.B.getFinalY() > this.d.getHeight()) {
            h();
            this.F.run();
        } else {
            h();
            this.E.run();
        }
        this.p = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C2668fN c2668fN;
        C3623wy c3623wy;
        this.G.b = i;
        this.q = getActionBarHideOffset();
        h();
        InterfaceC3138o0 interfaceC3138o0 = this.A;
        if (interfaceC3138o0 == null || (c3623wy = (c2668fN = (C2668fN) interfaceC3138o0).E) == null) {
            return;
        }
        c3623wy.a();
        c2668fN.E = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.o || this.p) {
            return;
        }
        if (this.q <= this.d.getHeight()) {
            h();
            postDelayed(this.E, 600L);
        } else {
            h();
            postDelayed(this.F, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.r ^ i;
        this.r = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0;
        InterfaceC3138o0 interfaceC3138o0 = this.A;
        if (interfaceC3138o0 != null) {
            ((C2668fN) interfaceC3138o0).A = !z2;
            if (z || !z2) {
                C2668fN c2668fN = (C2668fN) interfaceC3138o0;
                if (c2668fN.B) {
                    c2668fN.B = false;
                    c2668fN.Z(true);
                }
            } else {
                C2668fN c2668fN2 = (C2668fN) interfaceC3138o0;
                if (!c2668fN2.B) {
                    c2668fN2.B = true;
                    c2668fN2.Z(true);
                }
            }
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 || this.A == null) {
            return;
        }
        WeakHashMap weakHashMap = UL.a;
        KL.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        InterfaceC3138o0 interfaceC3138o0 = this.A;
        if (interfaceC3138o0 != null) {
            ((C2668fN) interfaceC3138o0).z = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC3138o0 interfaceC3138o0) {
        this.A = interfaceC3138o0;
        if (getWindowToken() != null) {
            ((C2668fN) this.A).z = this.b;
            int i = this.r;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = UL.a;
                KL.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        C3212pJ c3212pJ = (C3212pJ) this.e;
        c3212pJ.d = i != 0 ? AbstractC0500aq.F(c3212pJ.a.getContext(), i) : null;
        c3212pJ.c();
    }

    public void setLogo(int i) {
        k();
        C3212pJ c3212pJ = (C3212pJ) this.e;
        c3212pJ.e = i != 0 ? AbstractC0500aq.F(c3212pJ.a.getContext(), i) : null;
        c3212pJ.c();
    }

    public void setOverlayMode(boolean z) {
        this.m = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.InterfaceC0086Ef
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((C3212pJ) this.e).k = callback;
    }

    @Override // defpackage.InterfaceC0086Ef
    public void setWindowTitle(CharSequence charSequence) {
        k();
        C3212pJ c3212pJ = (C3212pJ) this.e;
        if (c3212pJ.g) {
            return;
        }
        c3212pJ.h = charSequence;
        if ((c3212pJ.b & 8) != 0) {
            Toolbar toolbar = c3212pJ.a;
            toolbar.setTitle(charSequence);
            if (c3212pJ.g) {
                UL.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C3193p0(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        C3212pJ c3212pJ = (C3212pJ) this.e;
        c3212pJ.d = drawable;
        c3212pJ.c();
    }
}

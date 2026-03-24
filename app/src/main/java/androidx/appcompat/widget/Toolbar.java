package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.mxtunnel.pro.R;
import defpackage.A0;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2547dB;
import defpackage.AbstractC2882jJ;
import defpackage.AbstractC3270qM;
import defpackage.Au;
import defpackage.C0607co;
import defpackage.C2524cp;
import defpackage.C2937kJ;
import defpackage.C2992lJ;
import defpackage.C3102nJ;
import defpackage.C3212pJ;
import defpackage.C3341rm;
import defpackage.C3413t3;
import defpackage.Cu;
import defpackage.D3;
import defpackage.InterfaceC0103Ff;
import defpackage.InterfaceC3047mJ;
import defpackage.InterfaceC3619wu;
import defpackage.M2;
import defpackage.MO;
import defpackage.MenuC3511uu;
import defpackage.O2;
import defpackage.Qu;
import defpackage.RH;
import defpackage.RunnableC2705g5;
import defpackage.RunnableC2829iJ;
import defpackage.UL;
import defpackage.ViewOnClickListenerC0510b;
import defpackage.ViewOnClickListenerC2537d1;
import defpackage.YC;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC3619wu {
    public int A;
    public int B;
    public final int C;
    public CharSequence D;
    public CharSequence E;
    public ColorStateList F;
    public ColorStateList G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final int[] L;
    public final Au M;
    public ArrayList N;
    public final C0607co O;
    public C3212pJ P;
    public A0 Q;
    public C2937kJ R;
    public boolean S;
    public OnBackInvokedCallback T;
    public OnBackInvokedDispatcher U;
    public boolean V;
    public final RunnableC2705g5 W;
    public ActionMenuView a;
    public C3413t3 b;
    public C3413t3 c;
    public M2 d;
    public O2 e;
    public final Drawable f;
    public final CharSequence m;
    public M2 n;
    public View o;
    public Context p;
    public int q;
    public int r;
    public int s;
    public final int t;
    public final int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public YC z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new RH(getContext());
    }

    public static C2992lJ h() {
        C2992lJ c2992lJ = new C2992lJ(-2, -2);
        c2992lJ.b = 0;
        c2992lJ.a = 8388627;
        return c2992lJ;
    }

    public static C2992lJ i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C2992lJ;
        if (z) {
            C2992lJ c2992lJ = (C2992lJ) layoutParams;
            C2992lJ c2992lJ2 = new C2992lJ(c2992lJ);
            c2992lJ2.b = 0;
            c2992lJ2.b = c2992lJ.b;
            return c2992lJ2;
        }
        if (z) {
            C2992lJ c2992lJ3 = new C2992lJ((C2992lJ) layoutParams);
            c2992lJ3.b = 0;
            return c2992lJ3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C2992lJ c2992lJ4 = new C2992lJ(layoutParams);
            c2992lJ4.b = 0;
            return c2992lJ4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C2992lJ c2992lJ5 = new C2992lJ(marginLayoutParams);
        c2992lJ5.b = 0;
        ((ViewGroup.MarginLayoutParams) c2992lJ5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c2992lJ5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c2992lJ5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c2992lJ5).bottomMargin = marginLayoutParams.bottomMargin;
        return c2992lJ5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C2992lJ c2992lJ = (C2992lJ) childAt.getLayoutParams();
                if (c2992lJ.b == 0 && s(childAt)) {
                    int i3 = c2992lJ.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C2992lJ c2992lJ2 = (C2992lJ) childAt2.getLayoutParams();
            if (c2992lJ2.b == 0 && s(childAt2)) {
                int i5 = c2992lJ2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3619wu
    public final void addMenuProvider(Qu qu) {
        Au au = this.M;
        au.b.add(qu);
        au.a.run();
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C2992lJ c2992lJH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (C2992lJ) layoutParams;
        c2992lJH.b = 1;
        if (!z || this.o == null) {
            addView(view, c2992lJH);
        } else {
            view.setLayoutParams(c2992lJH);
            this.K.add(view);
        }
    }

    public final void c() {
        if (this.n == null) {
            M2 m2 = new M2(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.n = m2;
            m2.setImageDrawable(this.f);
            this.n.setContentDescription(this.m);
            C2992lJ c2992lJH = h();
            c2992lJH.a = (this.t & 112) | 8388611;
            c2992lJH.b = 2;
            this.n.setLayoutParams(c2992lJH);
            this.n.setOnClickListener(new ViewOnClickListenerC0510b(this, 7));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2992lJ);
    }

    public final void d() {
        if (this.z == null) {
            YC yc = new YC();
            yc.a = 0;
            yc.b = 0;
            yc.c = Integer.MIN_VALUE;
            yc.d = Integer.MIN_VALUE;
            yc.e = 0;
            yc.f = 0;
            yc.g = false;
            yc.h = false;
            this.z = yc;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.v == null) {
            MenuC3511uu menuC3511uu = (MenuC3511uu) actionMenuView.getMenu();
            if (this.R == null) {
                this.R = new C2937kJ(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            menuC3511uu.b(this.R, this.p);
            t();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.q);
            this.a.setOnMenuItemClickListener(this.O);
            ActionMenuView actionMenuView2 = this.a;
            C2524cp c2524cp = new C2524cp(this, 27);
            actionMenuView2.A = null;
            actionMenuView2.B = c2524cp;
            C2992lJ c2992lJH = h();
            c2992lJH.a = (this.t & 112) | 8388613;
            this.a.setLayoutParams(c2992lJH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new M2(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C2992lJ c2992lJH = h();
            c2992lJH.a = (this.t & 112) | 8388611;
            this.d.setLayoutParams(c2992lJH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C2992lJ c2992lJ = new C2992lJ(context, attributeSet);
        c2992lJ.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2547dB.b);
        c2992lJ.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c2992lJ.b = 0;
        return c2992lJ;
    }

    public CharSequence getCollapseContentDescription() {
        M2 m2 = this.n;
        if (m2 != null) {
            return m2.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        M2 m2 = this.n;
        if (m2 != null) {
            return m2.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        YC yc = this.z;
        if (yc != null) {
            return yc.g ? yc.a : yc.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.B;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        YC yc = this.z;
        if (yc != null) {
            return yc.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        YC yc = this.z;
        if (yc != null) {
            return yc.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        YC yc = this.z;
        if (yc != null) {
            return yc.g ? yc.b : yc.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC3511uu menuC3511uu;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (menuC3511uu = actionMenuView.v) == null || !menuC3511uu.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.B, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.A, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        O2 o2 = this.e;
        if (o2 != null) {
            return o2.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        O2 o2 = this.e;
        if (o2 != null) {
            return o2.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        M2 m2 = this.d;
        if (m2 != null) {
            return m2.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        M2 m2 = this.d;
        if (m2 != null) {
            return m2.getDrawable();
        }
        return null;
    }

    public A0 getOuterActionMenuPresenter() {
        return this.Q;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.p;
    }

    public int getPopupTheme() {
        return this.q;
    }

    public CharSequence getSubtitle() {
        return this.E;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.D;
    }

    public int getTitleMarginBottom() {
        return this.y;
    }

    public int getTitleMarginEnd() {
        return this.w;
    }

    public int getTitleMarginStart() {
        return this.v;
    }

    public int getTitleMarginTop() {
        return this.x;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public InterfaceC0103Ff getWrapper() {
        Drawable drawable;
        if (this.P == null) {
            C3212pJ c3212pJ = new C3212pJ();
            c3212pJ.n = 0;
            c3212pJ.a = this;
            c3212pJ.h = getTitle();
            c3212pJ.i = getSubtitle();
            c3212pJ.g = c3212pJ.h != null;
            c3212pJ.f = getNavigationIcon();
            D3 d3L = D3.L(R.attr.actionBarStyle, 0, getContext(), null, AbstractC2547dB.a);
            c3212pJ.o = d3L.x(15);
            TypedArray typedArray = (TypedArray) d3L.b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c3212pJ.g = true;
                c3212pJ.h = text;
                if ((c3212pJ.b & 8) != 0) {
                    Toolbar toolbar = c3212pJ.a;
                    toolbar.setTitle(text);
                    if (c3212pJ.g) {
                        UL.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c3212pJ.i = text2;
                if ((c3212pJ.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableX = d3L.x(20);
            if (drawableX != null) {
                c3212pJ.e = drawableX;
                c3212pJ.c();
            }
            Drawable drawableX2 = d3L.x(17);
            if (drawableX2 != null) {
                c3212pJ.d = drawableX2;
                c3212pJ.c();
            }
            if (c3212pJ.f == null && (drawable = c3212pJ.o) != null) {
                c3212pJ.f = drawable;
                int i = c3212pJ.b & 4;
                Toolbar toolbar2 = c3212pJ.a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c3212pJ.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c3212pJ.c;
                if (view != null && (c3212pJ.b & 16) != 0) {
                    removeView(view);
                }
                c3212pJ.c = viewInflate;
                if (viewInflate != null && (c3212pJ.b & 16) != 0) {
                    addView(viewInflate);
                }
                c3212pJ.a(c3212pJ.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.z.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.r = resourceId2;
                C3413t3 c3413t3 = this.b;
                if (c3413t3 != null) {
                    c3413t3.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.s = resourceId3;
                C3413t3 c3413t32 = this.c;
                if (c3413t32 != null) {
                    c3413t32.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            d3L.P();
            if (R.string.abc_action_bar_up_description != c3212pJ.n) {
                c3212pJ.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = c3212pJ.n;
                    c3212pJ.j = i2 != 0 ? getContext().getString(i2) : null;
                    c3212pJ.b();
                }
            }
            c3212pJ.j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC2537d1(c3212pJ));
            this.P = c3212pJ;
        }
        return this.P;
    }

    public final int j(View view, int i) {
        C2992lJ c2992lJ = (C2992lJ) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c2992lJ.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.C & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c2992lJ).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c2992lJ).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c2992lJ).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.M.b.iterator();
        while (it2.hasNext()) {
            ((C3341rm) ((Qu) it2.next())).a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.N = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.K.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        C2992lJ c2992lJ = (C2992lJ) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c2992lJ).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c2992lJ).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.W);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x028e A[LOOP:0: B:110:0x028c->B:111:0x028e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ab A[LOOP:1: B:113:0x02a9->B:114:0x02ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c9 A[LOOP:2: B:116:0x02c7->B:117:0x02c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0317 A[LOOP:3: B:125:0x0315->B:126:0x0317, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0217  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = AbstractC3270qM.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (s(this.d)) {
            r(this.d, i, 0, i2, this.u);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.n)) {
            r(this.n, i, 0, i2, this.u);
            iK = k(this.n) + this.n.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.n) + this.n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.L;
        iArr[c2] = iMax4;
        if (s(this.a)) {
            r(this.a, i, iMax3, i2, this.u);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.o)) {
            iMax5 += q(this.o, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.o) + this.o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.o.getMeasuredState());
        }
        if (s(this.e)) {
            iMax5 += q(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C2992lJ) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.x + this.y;
        int i6 = this.v + this.w;
        if (s(this.b)) {
            q(this.b, i, iMax5 + i6, i2, i5, iArr);
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.c)) {
            iMax2 = Math.max(iMax2, q(this.c, i, iMax5 + i6, i2, iL + i5, iArr));
            iL = l(this.c) + this.c.getMeasuredHeight() + iL;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.S) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C3102nJ)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3102nJ c3102nJ = (C3102nJ) parcelable;
        super.onRestoreInstanceState(c3102nJ.a);
        ActionMenuView actionMenuView = this.a;
        MenuC3511uu menuC3511uu = actionMenuView != null ? actionMenuView.v : null;
        int i = c3102nJ.c;
        if (i != 0 && this.R != null && menuC3511uu != null && (menuItemFindItem = menuC3511uu.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c3102nJ.d) {
            RunnableC2705g5 runnableC2705g5 = this.W;
            removeCallbacks(runnableC2705g5);
            post(runnableC2705g5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            YC r0 = r2.z
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.g
            if (r1 != r3) goto L12
            goto L45
        L12:
            r0.g = r1
            boolean r3 = r0.h
            if (r3 == 0) goto L3d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2f
            int r1 = r0.d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.e
        L23:
            r0.a = r1
            int r1 = r0.c
            if (r1 == r3) goto L2a
            goto L2c
        L2a:
            int r1 = r0.f
        L2c:
            r0.b = r1
            goto L45
        L2f:
            int r1 = r0.c
            if (r1 == r3) goto L34
            goto L36
        L34:
            int r1 = r0.e
        L36:
            r0.a = r1
            int r1 = r0.d
            if (r1 == r3) goto L2a
            goto L2c
        L3d:
            int r3 = r0.e
            r0.a = r3
            int r3 = r0.f
            r0.b = r3
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        A0 a0;
        Cu cu;
        C3102nJ c3102nJ = new C3102nJ(super.onSaveInstanceState());
        C2937kJ c2937kJ = this.R;
        if (c2937kJ != null && (cu = c2937kJ.b) != null) {
            c3102nJ.c = cu.a;
        }
        ActionMenuView actionMenuView = this.a;
        c3102nJ.d = (actionMenuView == null || (a0 = actionMenuView.z) == null || !a0.k()) ? false : true;
        return c3102nJ;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        C2992lJ c2992lJ = (C2992lJ) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c2992lJ).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c2992lJ).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // defpackage.InterfaceC3619wu
    public final void removeMenuProvider(Qu qu) {
        this.M.b(qu);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.V != z) {
            this.V = z;
            t();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0500aq.F(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.B) {
            this.B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0500aq.F(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0500aq.F(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.q != i) {
            this.q = i;
            if (i == 0) {
                this.p = getContext();
            } else {
                this.p = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.y = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = AbstractC2882jJ.a(this);
            C2937kJ c2937kJ = this.R;
            boolean z = (c2937kJ == null || c2937kJ.b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.V) ? false : true;
            if (z && this.U == null) {
                if (this.T == null) {
                    this.T = AbstractC2882jJ.b(new RunnableC2829iJ(this, 0));
                }
                AbstractC2882jJ.c(onBackInvokedDispatcherA, this.T);
            } else {
                if (z || (onBackInvokedDispatcher = this.U) == null) {
                    return;
                }
                AbstractC2882jJ.d(onBackInvokedDispatcher, this.T);
                onBackInvokedDispatcherA = null;
            }
            this.U = onBackInvokedDispatcherA;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.C = 8388627;
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new int[2];
        this.M = new Au(new RunnableC2829iJ(this, 1));
        this.N = new ArrayList();
        this.O = new C0607co(this);
        this.W = new RunnableC2705g5(this, 28);
        Context context2 = getContext();
        int[] iArr = AbstractC2547dB.x;
        D3 d3L = D3.L(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        UL.k(this, context, iArr, attributeSet, (TypedArray) d3L.b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) d3L.b;
        this.r = typedArray.getResourceId(28, 0);
        this.s = typedArray.getResourceId(19, 0);
        this.C = typedArray.getInteger(0, 8388627);
        this.t = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.y = dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.v = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.w = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.x = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.y = dimensionPixelOffset5;
        }
        this.u = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        YC yc = this.z;
        yc.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            yc.e = dimensionPixelSize;
            yc.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            yc.f = dimensionPixelSize2;
            yc.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            yc.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.B = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = d3L.x(4);
        this.m = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.p = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableX = d3L.x(16);
        if (drawableX != null) {
            setNavigationIcon(drawableX);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableX2 = d3L.x(11);
        if (drawableX2 != null) {
            setLogo(drawableX2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(d3L.w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(d3L.w(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        d3L.P();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        M2 m2 = this.n;
        if (m2 != null) {
            m2.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.n.setImageDrawable(drawable);
        } else {
            M2 m2 = this.n;
            if (m2 != null) {
                m2.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new O2(getContext(), null, 0);
            }
            if (!n(this.e)) {
                b(this.e, true);
            }
        } else {
            O2 o2 = this.e;
            if (o2 != null && n(o2)) {
                removeView(this.e);
                this.K.remove(this.e);
            }
        }
        O2 o22 = this.e;
        if (o22 != null) {
            o22.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new O2(getContext(), null, 0);
        }
        O2 o2 = this.e;
        if (o2 != null) {
            o2.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        M2 m2 = this.d;
        if (m2 != null) {
            m2.setContentDescription(charSequence);
            MO.I(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            M2 m2 = this.d;
            if (m2 != null && n(m2)) {
                removeView(this.d);
                this.K.remove(this.d);
            }
        }
        M2 m22 = this.d;
        if (m22 != null) {
            m22.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C3413t3 c3413t3 = this.c;
            if (c3413t3 != null && n(c3413t3)) {
                removeView(this.c);
                this.K.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                C3413t3 c3413t32 = new C3413t3(context, null);
                this.c = c3413t32;
                c3413t32.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.s;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        }
        C3413t3 c3413t33 = this.c;
        if (c3413t33 != null) {
            c3413t33.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        C3413t3 c3413t3 = this.c;
        if (c3413t3 != null) {
            c3413t3.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C3413t3 c3413t3 = this.b;
            if (c3413t3 != null && n(c3413t3)) {
                removeView(this.b);
                this.K.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                C3413t3 c3413t32 = new C3413t3(context, null);
                this.b = c3413t32;
                c3413t32.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.r;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        }
        C3413t3 c3413t33 = this.b;
        if (c3413t33 != null) {
            c3413t33.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        C3413t3 c3413t3 = this.b;
        if (c3413t3 != null) {
            c3413t3.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setOnMenuItemClickListener(InterfaceC3047mJ interfaceC3047mJ) {
    }
}

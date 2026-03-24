package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import defpackage.AN;
import defpackage.C0130Gp;
import defpackage.C0607co;
import defpackage.C3336rh;
import defpackage.C3390sh;
import defpackage.C3498uh;
import defpackage.C3552vh;
import defpackage.C3606wh;
import defpackage.InterfaceC3444th;
import defpackage.ML;
import defpackage.UL;
import defpackage.V;
import defpackage.ViewOnApplyWindowInsetsListenerC3283qh;
import defpackage.Vs;
import defpackage.WL;
import defpackage.ZA;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] I = {R.attr.colorPrimaryDark};
    public static final int[] J = {R.attr.layout_gravity};
    public static final boolean K;
    public static final boolean L;
    public static final boolean M;
    public float A;
    public Drawable B;
    public Object C;
    public boolean D;
    public final ArrayList E;
    public Rect F;
    public Matrix G;
    public final C0607co H;
    public final C3390sh a;
    public float b;
    public final int c;
    public int d;
    public float e;
    public final Paint f;
    public final WL m;
    public final WL n;
    public final C3606wh o;
    public final C3606wh p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public ArrayList y;
    public float z;

    static {
        int i = Build.VERSION.SDK_INT;
        K = true;
        L = true;
        M = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.mxtunnel.pro.R.attr.drawerLayoutStyle);
        this.a = new C3390sh(0);
        this.d = -1728053248;
        this.f = new Paint();
        this.s = true;
        this.t = 3;
        this.u = 3;
        this.v = 3;
        this.w = 3;
        this.H = new C0607co(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C3606wh c3606wh = new C3606wh(this, 3);
        this.o = c3606wh;
        C3606wh c3606wh2 = new C3606wh(this, 5);
        this.p = c3606wh2;
        WL wl = new WL(getContext(), this, c3606wh);
        wl.b = (int) (wl.b * 1.0f);
        this.m = wl;
        wl.q = 1;
        wl.n = f2;
        c3606wh.l = wl;
        WL wl2 = new WL(getContext(), this, c3606wh2);
        wl2.b = (int) (1.0f * wl2.b);
        this.n = wl2;
        wl2.q = 2;
        wl2.n = f2;
        c3606wh2.l = wl2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = UL.a;
        setImportantForAccessibility(1);
        UL.l(this, new C3336rh(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC3283qh());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(I);
            try {
                this.B = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ZA.a, com.mxtunnel.pro.R.attr.drawerLayoutStyle, 0);
        try {
            this.b = typedArrayObtainStyledAttributes2.hasValue(0) ? typedArrayObtainStyledAttributes2.getDimension(0, 0.0f) : getResources().getDimension(com.mxtunnel.pro.R.dimen.def_drawer_elevation);
            typedArrayObtainStyledAttributes2.recycle();
            this.E = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static boolean i(View view) {
        WeakHashMap weakHashMap = UL.a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean j(View view) {
        return ((C3498uh) view.getLayoutParams()).a == 0;
    }

    public static boolean k(View view) {
        if (l(view)) {
            return (((C3498uh) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean l(View view) {
        int i = ((C3498uh) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = UL.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view, int i) {
        return (h(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.E;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!l(childAt)) {
                arrayList2.add(childAt);
            } else if (k(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        super.addView(view, i, layoutParams);
        if (e() != null || l(view)) {
            WeakHashMap weakHashMap = UL.a;
            i2 = 4;
        } else {
            WeakHashMap weakHashMap2 = UL.a;
            i2 = 1;
        }
        view.setImportantForAccessibility(i2);
        if (K) {
            return;
        }
        UL.l(view, this.a);
    }

    public final void b(View view) {
        int width;
        int top;
        WL wl;
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C3498uh c3498uh = (C3498uh) view.getLayoutParams();
        if (this.s) {
            c3498uh.b = 0.0f;
            c3498uh.d = 0;
        } else {
            c3498uh.d |= 4;
            if (a(view, 3)) {
                width = -view.getWidth();
                top = view.getTop();
                wl = this.m;
            } else {
                width = getWidth();
                top = view.getTop();
                wl = this.n;
            }
            wl.s(view, width, top);
        }
        invalidate();
    }

    public final void c(boolean z) {
        int width;
        int top;
        WL wl;
        int childCount = getChildCount();
        boolean zS = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C3498uh c3498uh = (C3498uh) childAt.getLayoutParams();
            if (l(childAt) && (!z || c3498uh.c)) {
                int width2 = childAt.getWidth();
                if (a(childAt, 3)) {
                    width = -width2;
                    top = childAt.getTop();
                    wl = this.m;
                } else {
                    width = getWidth();
                    top = childAt.getTop();
                    wl = this.n;
                }
                zS |= wl.s(childAt, width, top);
                c3498uh.c = false;
            }
        }
        C3606wh c3606wh = this.o;
        c3606wh.n.removeCallbacks(c3606wh.m);
        C3606wh c3606wh2 = this.p;
        c3606wh2.n.removeCallbacks(c3606wh2.m);
        if (zS) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3498uh) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C3498uh) getChildAt(i).getLayoutParams()).b);
        }
        this.e = fMax;
        boolean zG = this.m.g();
        boolean zG2 = this.n.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = UL.a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i) {
        WeakHashMap weakHashMap = UL.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.F == null) {
                this.F = new Rect();
            }
            childAt.getHitRect(this.F);
            if (this.F.contains((int) x, (int) y) && !j(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.G == null) {
                            this.G = new Matrix();
                        }
                        matrix.invert(this.G);
                        motionEventObtain.transform(this.G);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zJ = j(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zJ) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && l(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.e;
        if (f > 0.0f && zJ) {
            int i4 = this.d;
            Paint paint = this.f;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C3498uh) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (l(childAt)) {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((C3498uh) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int g(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((C3498uh) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = UL.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.t;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.v : this.w;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.u;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.w : this.v;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.v;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.t : this.u;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.w;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.u : this.t;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C3498uh c3498uh = new C3498uh(-1, -1);
        c3498uh.a = 0;
        return c3498uh;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3498uh c3498uh = new C3498uh(context, attributeSet);
        c3498uh.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J);
        c3498uh.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return c3498uh;
    }

    public float getDrawerElevation() {
        if (L) {
            return this.b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.B;
    }

    public final int h(View view) {
        int i = ((C3498uh) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = UL.a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    public final void m(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C3498uh c3498uh = (C3498uh) view.getLayoutParams();
        if (this.s) {
            c3498uh.b = 1.0f;
            c3498uh.d = 1;
            q(view, true);
            p(view);
        } else {
            c3498uh.d |= 2;
            if (a(view, 3)) {
                this.m.s(view, 0, view.getTop());
            } else {
                this.n.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void n(int i, int i2) {
        View viewD;
        WeakHashMap weakHashMap = UL.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.t = i;
        } else if (i2 == 5) {
            this.u = i;
        } else if (i2 == 8388611) {
            this.v = i;
        } else if (i2 == 8388613) {
            this.w = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.m : this.n).a();
        }
        if (i != 1) {
            if (i == 2 && (viewD = d(absoluteGravity)) != null) {
                m(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2);
        }
    }

    public final void o(View view, float f) {
        int size;
        C3498uh c3498uh = (C3498uh) view.getLayoutParams();
        if (f == c3498uh.b) {
            return;
        }
        c3498uh.b = f;
        if (this.y == null || r2.size() - 1 < 0) {
            return;
        }
        Vs.u(this.y.get(size));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.D || this.B == null) {
            return;
        }
        Object obj = this.C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.B.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            WL r1 = r8.m
            boolean r2 = r1.r(r9)
            WL r3 = r8.n
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f
            r5 = r5[r0]
            float[] r6 = r1.d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.g
            r6 = r6[r0]
            float[] r7 = r1.e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            wh r9 = r8.o
            g5 r0 = r9.m
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.n
            r9.removeCallbacks(r0)
            wh r9 = r8.p
            g5 r0 = r9.m
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.n
            r9.removeCallbacks(r0)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.c(r3)
            r8.x = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.z = r0
            r8.A = r9
            float r5 = r8.e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = j(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.x = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            uh r1 = (defpackage.C3498uh) r1
            boolean r1 = r1.c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.x
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || f() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewF = f();
        if (viewF != null && g(viewF) == 0) {
            c(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        boolean z2 = true;
        this.r = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C3498uh c3498uh = (C3498uh) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i10 = ((ViewGroup.MarginLayoutParams) c3498uh).leftMargin;
                    childAt.layout(i10, ((ViewGroup.MarginLayoutParams) c3498uh).topMargin, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3498uh).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c3498uh.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i8 - r11) / f3;
                        i5 = i8 - ((int) (c3498uh.b * f3));
                    }
                    boolean z3 = f != c3498uh.b ? z2 : false;
                    int i11 = c3498uh.a & 112;
                    if (i11 != 16) {
                        if (i11 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) c3498uh).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i12 = i4 - i2;
                            measuredHeight = (i12 - ((ViewGroup.MarginLayoutParams) c3498uh).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i12 - ((ViewGroup.MarginLayoutParams) c3498uh).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight2) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) c3498uh).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight2;
                            int i17 = i13 - ((ViewGroup.MarginLayoutParams) c3498uh).bottomMargin;
                            if (i16 > i17) {
                                i14 = i17 - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight2 + i14);
                    }
                    if (z3) {
                        o(childAt, f);
                    }
                    int i18 = c3498uh.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i9++;
            z2 = true;
        }
        if (M && (rootWindowInsets = getRootWindowInsets()) != null) {
            C0130Gp c0130GpI = AN.g(null, rootWindowInsets).a.i();
            WL wl = this.m;
            wl.o = Math.max(wl.p, c0130GpI.a);
            WL wl2 = this.n;
            wl2.o = Math.max(wl2.p, c0130GpI.c);
        }
        this.r = false;
        this.s = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof C3552vh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3552vh c3552vh = (C3552vh) parcelable;
        super.onRestoreInstanceState(c3552vh.a);
        int i = c3552vh.c;
        if (i != 0 && (viewD = d(i)) != null) {
            m(viewD);
        }
        int i2 = c3552vh.d;
        if (i2 != 3) {
            n(i2, 3);
        }
        int i3 = c3552vh.e;
        if (i3 != 3) {
            n(i3, 5);
        }
        int i4 = c3552vh.f;
        if (i4 != 3) {
            n(i4, 8388611);
        }
        int i5 = c3552vh.m;
        if (i5 != 3) {
            n(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (L) {
            return;
        }
        WeakHashMap weakHashMap = UL.a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C3552vh c3552vh = new C3552vh(super.onSaveInstanceState());
        c3552vh.c = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3498uh c3498uh = (C3498uh) getChildAt(i).getLayoutParams();
            int i2 = c3498uh.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c3552vh.c = c3498uh.a;
                break;
            }
        }
        c3552vh.d = this.t;
        c3552vh.e = this.u;
        c3552vh.f = this.v;
        c3552vh.m = this.w;
        return c3552vh;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            WL r0 = r6.m
            r0.k(r7)
            WL r1 = r6.n
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.c(r3)
            r6.x = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = j(r4)
            if (r4 == 0) goto L54
            float r4 = r6.z
            float r1 = r1 - r4
            float r4 = r6.A
            float r7 = r7 - r4
            int r0 = r0.b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L54
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.c(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.z = r0
            r6.A = r7
            r6.x = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        V v = V.l;
        UL.i(view, v.a());
        UL.g(view, 0);
        if (!k(view) || g(view) == 2) {
            return;
        }
        UL.j(view, v, this.H);
    }

    public final void q(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || l(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = UL.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = UL.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (l(childAt)) {
                float f2 = this.b;
                WeakHashMap weakHashMap = UL.a;
                ML.j(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC3444th interfaceC3444th) {
        if (interfaceC3444th != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(interfaceC3444th);
        }
    }

    public void setDrawerLockMode(int i) {
        n(i, 3);
        n(i, 5);
    }

    public void setScrimColor(int i) {
        this.d = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.B = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.B = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C3498uh) {
            C3498uh c3498uh = (C3498uh) layoutParams;
            C3498uh c3498uh2 = new C3498uh(c3498uh);
            c3498uh2.a = 0;
            c3498uh2.a = c3498uh.a;
            return c3498uh2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C3498uh c3498uh3 = new C3498uh((ViewGroup.MarginLayoutParams) layoutParams);
            c3498uh3.a = 0;
            return c3498uh3;
        }
        C3498uh c3498uh4 = new C3498uh(layoutParams);
        c3498uh4.a = 0;
        return c3498uh4;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.B = drawable;
        invalidate();
    }
}

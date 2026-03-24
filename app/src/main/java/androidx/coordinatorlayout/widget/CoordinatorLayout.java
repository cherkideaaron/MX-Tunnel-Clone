package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.mxtunnel.pro.R;
import defpackage.AN;
import defpackage.AbstractC3763zc;
import defpackage.C0049Cc;
import defpackage.C0083Ec;
import defpackage.C2588dz;
import defpackage.C2643ez;
import defpackage.C2827iH;
import defpackage.G3;
import defpackage.InterfaceC0015Ac;
import defpackage.InterfaceC2585dw;
import defpackage.InterfaceC2640ew;
import defpackage.InterfaceC3709yc;
import defpackage.KJ;
import defpackage.KL;
import defpackage.LA;
import defpackage.ML;
import defpackage.UL;
import defpackage.ViewGroupOnHierarchyChangeListenerC0032Bc;
import defpackage.ViewTreeObserverOnPreDrawListenerC0066Dc;
import defpackage.WF;
import defpackage.XA;
import defpackage.YL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC2585dw, InterfaceC2640ew {
    public static final Class[] A;
    public static final ThreadLocal B;
    public static final G3 C;
    public static final C2643ez D;
    public static final String z;
    public final ArrayList a;
    public final KJ b;
    public final ArrayList c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean m;
    public boolean n;
    public final int[] o;
    public View p;
    public View q;
    public ViewTreeObserverOnPreDrawListenerC0066Dc r;
    public boolean s;
    public AN t;
    public boolean u;
    public Drawable v;
    public ViewGroup.OnHierarchyChangeListener w;
    public C2827iH x;
    public final LA y;

    static {
        int i = 2;
        Package r1 = CoordinatorLayout.class.getPackage();
        z = r1 != null ? r1.getName() : null;
        C = new G3(i);
        A = new Class[]{Context.class, AttributeSet.class};
        B = new ThreadLocal();
        D = new C2643ez();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.a = new ArrayList();
        KJ kj = new KJ();
        kj.a = new C2588dz(10);
        kj.b = new WF();
        kj.c = new ArrayList();
        kj.d = new HashSet();
        this.b = kj;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.y = new LA(3);
        int[] iArr = XA.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.o = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.o[i] = (int) (r2[i] * f);
            }
        }
        this.v = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0032Bc(this));
        WeakHashMap weakHashMap = UL.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) D.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, C0049Cc c0049Cc, int i2, int i3) {
        int i4 = c0049Cc.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0049Cc.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0049Cc n(View view) {
        C0049Cc c0049Cc = (C0049Cc) view.getLayoutParams();
        if (!c0049Cc.b) {
            if (view instanceof InterfaceC3709yc) {
                AbstractC3763zc behavior = ((InterfaceC3709yc) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0049Cc.b(behavior);
            } else {
                InterfaceC0015Ac interfaceC0015Ac = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    interfaceC0015Ac = (InterfaceC0015Ac) superclass.getAnnotation(InterfaceC0015Ac.class);
                    if (interfaceC0015Ac != null) {
                        break;
                    }
                }
                if (interfaceC0015Ac != null) {
                    try {
                        c0049Cc.b((AbstractC3763zc) interfaceC0015Ac.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0015Ac.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            c0049Cc.b = true;
        }
        return c0049Cc;
    }

    public static void v(View view, int i) {
        C0049Cc c0049Cc = (C0049Cc) view.getLayoutParams();
        int i2 = c0049Cc.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = UL.a;
            view.offsetLeftAndRight(i - i2);
            c0049Cc.i = i;
        }
    }

    public static void w(View view, int i) {
        C0049Cc c0049Cc = (C0049Cc) view.getLayoutParams();
        int i2 = c0049Cc.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = UL.a;
            view.offsetTopAndBottom(i - i2);
            c0049Cc.j = i;
        }
    }

    @Override // defpackage.InterfaceC2640ew
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC3763zc abstractC3763zc;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0049Cc c0049Cc = (C0049Cc) childAt.getLayoutParams();
                if (c0049Cc.a(i5) && (abstractC3763zc = c0049Cc.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3763zc.l(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            p(1);
        }
    }

    @Override // defpackage.InterfaceC2585dw
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // defpackage.InterfaceC2585dw
    public final boolean c(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0049Cc c0049Cc = (C0049Cc) childAt.getLayoutParams();
                AbstractC3763zc abstractC3763zc = c0049Cc.a;
                if (abstractC3763zc != null) {
                    boolean zP = abstractC3763zc.p(this, childAt, view, i, i2);
                    z2 |= zP;
                    if (i2 == 0) {
                        c0049Cc.n = zP;
                    } else if (i2 == 1) {
                        c0049Cc.o = zP;
                    }
                } else if (i2 == 0) {
                    c0049Cc.n = false;
                } else if (i2 == 1) {
                    c0049Cc.o = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0049Cc) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.InterfaceC2585dw
    public final void d(View view, View view2, int i, int i2) {
        LA la = this.y;
        if (i2 == 1) {
            la.c = i;
        } else {
            la.b = i;
        }
        this.q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0049Cc) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC3763zc abstractC3763zc = ((C0049Cc) view.getLayoutParams()).a;
        if (abstractC3763zc != null) {
            abstractC3763zc.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.InterfaceC2585dw
    public final void e(View view, int i) {
        LA la = this.y;
        if (i == 1) {
            la.c = 0;
        } else {
            la.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0049Cc c0049Cc = (C0049Cc) childAt.getLayoutParams();
            if (c0049Cc.a(i)) {
                AbstractC3763zc abstractC3763zc = c0049Cc.a;
                if (abstractC3763zc != null) {
                    abstractC3763zc.q(this, childAt, view, i);
                }
                if (i == 0) {
                    c0049Cc.n = false;
                } else if (i == 1) {
                    c0049Cc.o = false;
                }
                c0049Cc.p = false;
            }
        }
        this.q = null;
    }

    @Override // defpackage.InterfaceC2585dw
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC3763zc abstractC3763zc;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0049Cc c0049Cc = (C0049Cc) childAt.getLayoutParams();
                if (c0049Cc.a(i3) && (abstractC3763zc = c0049Cc.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3763zc.k(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0049Cc();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0049Cc(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.a);
    }

    public final AN getLastWindowInsets() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        LA la = this.y;
        return la.c | la.b;
    }

    public Drawable getStatusBarBackground() {
        return this.v;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C0049Cc c0049Cc, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0049Cc).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0049Cc).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0049Cc).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0049Cc).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        WF wf = (WF) this.b.b;
        int i = wf.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) wf.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(wf.g(i2));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = YL.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = YL.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        YL.a(this, view, matrix);
        ThreadLocal threadLocal3 = YL.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        StringBuilder sb;
        int[] iArr = this.o;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        C2643ez c2643ez = D;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i, i2);
        } finally {
            rectG.setEmpty();
            c2643ez.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.s) {
            if (this.r == null) {
                this.r = new ViewTreeObserverOnPreDrawListenerC0066Dc(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.r);
        }
        if (this.t == null) {
            WeakHashMap weakHashMap = UL.a;
            if (getFitsSystemWindows()) {
                KL.c(this);
            }
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.s && this.r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.r);
        }
        View view = this.q;
        if (view != null) {
            e(view, 0);
        }
        this.n = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.u || this.v == null) {
            return;
        }
        AN an = this.t;
        int iD = an != null ? an.d() : 0;
        if (iD > 0) {
            this.v.setBounds(0, 0, getWidth(), iD);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AbstractC3763zc abstractC3763zc;
        WeakHashMap weakHashMap = UL.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC3763zc = ((C0049Cc) view.getLayoutParams()).a) == null || !abstractC3763zc.h(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0049Cc c0049Cc = (C0049Cc) childAt.getLayoutParams();
                if (c0049Cc.a(0)) {
                    AbstractC3763zc abstractC3763zc = c0049Cc.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC3763zc abstractC3763zc;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0049Cc c0049Cc = (C0049Cc) childAt.getLayoutParams();
                if (c0049Cc.a(0) && (abstractC3763zc = c0049Cc.a) != null) {
                    zJ |= abstractC3763zc.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        b(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0083Ec)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0083Ec c0083Ec = (C0083Ec) parcelable;
        super.onRestoreInstanceState(c0083Ec.a);
        SparseArray sparseArray = c0083Ec.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3763zc abstractC3763zc = n(childAt).a;
            if (id != -1 && abstractC3763zc != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC3763zc.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        C0083Ec c0083Ec = new C0083Ec(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3763zc abstractC3763zc = ((C0049Cc) childAt.getLayoutParams()).a;
            if (id != -1 && abstractC3763zc != null && (parcelableO = abstractC3763zc.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        c0083Ec.c = sparseArray;
        return c0083Ec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            Cc r6 = (defpackage.C0049Cc) r6
            zc r6 = r6.a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.p
            boolean r6 = r6.r(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.p
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.u(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0044 A[EDGE_INSN: B:146:0x0044->B:10:0x0044 BREAK  A[LOOP:2: B:122:0x02d4->B:139:0x030d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect rectG;
        Rect rectG2;
        C0049Cc c0049Cc = (C0049Cc) view.getLayoutParams();
        View view2 = c0049Cc.k;
        if (view2 == null && c0049Cc.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C2643ez c2643ez = D;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(view2, rectG);
                C0049Cc c0049Cc2 = (C0049Cc) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectG, rectG2, c0049Cc2, measuredWidth, measuredHeight);
                h(c0049Cc2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                c2643ez.c(rectG);
                rectG2.setEmpty();
                c2643ez.c(rectG2);
            }
        }
        int i2 = c0049Cc.e;
        if (i2 < 0) {
            C0049Cc c0049Cc3 = (C0049Cc) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0049Cc3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0049Cc3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0049Cc3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0049Cc3).bottomMargin);
            if (this.t != null) {
                WeakHashMap weakHashMap = UL.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.t.b() + rectG.left;
                    rectG.top = this.t.d() + rectG.top;
                    rectG.right -= this.t.c();
                    rectG.bottom -= this.t.a();
                }
            }
            rectG2 = g();
            int i3 = c0049Cc3.c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        C0049Cc c0049Cc4 = (C0049Cc) view.getLayoutParams();
        int i4 = c0049Cc4.c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iM = m(i2) - measuredWidth2;
        if (i5 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0049Cc4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0049Cc4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0049Cc4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0049Cc4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void r(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC3763zc abstractC3763zc = ((C0049Cc) view.getLayoutParams()).a;
        if (abstractC3763zc == null || !abstractC3763zc.m(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.m) {
            return;
        }
        u(false);
        this.m = true;
    }

    public final boolean s(MotionEvent motionEvent, int i) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        G3 g3 = C;
        if (g3 != null) {
            Collections.sort(arrayList, g3);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zG = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            C0049Cc c0049Cc = (C0049Cc) view.getLayoutParams();
            AbstractC3763zc abstractC3763zc = c0049Cc.a;
            if (!(zG || z3) || actionMasked == 0) {
                if (!zG && abstractC3763zc != null) {
                    if (i == 0) {
                        zG = abstractC3763zc.g(this, view, motionEvent);
                    } else if (i == 1) {
                        zG = abstractC3763zc.r(this, view, motionEvent);
                    }
                    if (zG) {
                        this.p = view;
                    }
                }
                if (c0049Cc.a == null) {
                    c0049Cc.m = false;
                }
                boolean z4 = c0049Cc.m;
                if (z4) {
                    z2 = true;
                } else {
                    c0049Cc.m = z4;
                    z2 = z4;
                }
                z3 = z2 && !z4;
                if (z2 && !z3) {
                    break;
                }
            } else if (abstractC3763zc != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC3763zc.g(this, view, motionEventObtain);
                } else if (i == 1) {
                    abstractC3763zc.r(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zG;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.v = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable3 = this.v;
                WeakHashMap weakHashMap = UL.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            WeakHashMap weakHashMap2 = UL.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.v;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.v.setVisible(z2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC3763zc abstractC3763zc = ((C0049Cc) childAt.getLayoutParams()).a;
            if (abstractC3763zc != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC3763zc.g(this, childAt, motionEventObtain);
                } else {
                    abstractC3763zc.r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0049Cc) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = null;
        this.m = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public final void x() {
        WeakHashMap weakHashMap = UL.a;
        if (!getFitsSystemWindows()) {
            ML.k(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new C2827iH(this, 7);
        }
        ML.k(this, this.x);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0049Cc ? new C0049Cc((C0049Cc) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0049Cc((ViewGroup.MarginLayoutParams) layoutParams) : new C0049Cc(layoutParams);
    }
}

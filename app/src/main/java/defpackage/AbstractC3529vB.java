package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: vB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3529vB {
    public D3 a;
    public RecyclerView b;
    public final C3178om c;
    public final C3178om d;
    public C2801hs e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public AbstractC3529vB() {
        C2827iH c2827iH = new C2827iH(this, 25);
        C0607co c0607co = new C0607co(this);
        this.c = new C3178om(c2827iH);
        this.d = new C3178om(c0607co);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((C3583wB) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C3583wB) view.getLayoutParams()).a.c();
    }

    public static C3475uB I(Context context, AttributeSet attributeSet, int i, int i2) {
        C3475uB c3475uB = new C3475uB();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0522bB.a, i, i2);
        c3475uB.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c3475uB.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c3475uB.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c3475uB.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c3475uB;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        Rect rect = c3583wB.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c3583wB).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c3583wB).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c3583wB).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c3583wB).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3529vB.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((C3583wB) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void A0(C2801hs c2801hs) {
        C2801hs c2801hs2 = this.e;
        if (c2801hs2 != null && c2801hs != c2801hs2 && c2801hs2.e) {
            c2801hs2.i();
        }
        this.e = c2801hs;
        RecyclerView recyclerView = this.b;
        IB ib = recyclerView.g0;
        ib.m.removeCallbacks(ib);
        ib.c.abortAnimation();
        if (c2801hs.h) {
            Log.w("RecyclerView", "An instance of " + c2801hs.getClass().getSimpleName() + " was started more than once. Each instance of" + c2801hs.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c2801hs.b = recyclerView;
        c2801hs.c = this;
        int i = c2801hs.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.j0.a = i;
        c2801hs.e = true;
        c2801hs.d = true;
        c2801hs.f = recyclerView.r.q(i);
        c2801hs.b.g0.a();
        c2801hs.h = true;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        AbstractC3149oB adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = UL.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(BB bb, GB gb) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C3583wB) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.p;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iV = recyclerView.e.v();
            for (int i2 = 0; i2 < iV; i2++) {
                recyclerView.e.u(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iV = recyclerView.e.v();
            for (int i2 = 0; i2 < iV; i2++) {
                recyclerView.e.u(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, BB bb, GB gb);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        BB bb = recyclerView.b;
        GB gb = recyclerView.j0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC3149oB abstractC3149oB = this.b.q;
        if (abstractC3149oB != null) {
            accessibilityEvent.setItemCount(abstractC3149oB.a());
        }
    }

    public final void W(View view, Z z) {
        JB jbI = RecyclerView.I(view);
        if (jbI == null || jbI.j() || ((ArrayList) this.a.d).contains(jbI.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        V(recyclerView.b, recyclerView.j0, view, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r9, boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3529vB.b(android.view.View, boolean, int):void");
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(BB bb, GB gb);

    public abstract boolean d();

    public abstract void d0(GB gb);

    public abstract boolean e();

    public boolean f(C3583wB c3583wB) {
        return c3583wB != null;
    }

    public Parcelable f0() {
        return null;
    }

    public void h0() {
        n0();
    }

    public final void i0(BB bb) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).q()) {
                View viewU = u(iV);
                l0(iV);
                bb.g(viewU);
            }
        }
    }

    public abstract int j(GB gb);

    public final void j0(BB bb) {
        ArrayList arrayList;
        int size = bb.a.size();
        int i = size - 1;
        while (true) {
            arrayList = bb.a;
            if (i < 0) {
                break;
            }
            View view = ((JB) arrayList.get(i)).a;
            JB jbI = RecyclerView.I(view);
            if (!jbI.q()) {
                jbI.p(false);
                if (jbI.l()) {
                    this.b.removeDetachedView(view, false);
                }
                AbstractC3367sB abstractC3367sB = this.b.O;
                if (abstractC3367sB != null) {
                    abstractC3367sB.d(jbI);
                }
                jbI.p(true);
                JB jbI2 = RecyclerView.I(view);
                jbI2.n = null;
                jbI2.o = false;
                jbI2.j &= -33;
                bb.h(jbI2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = bb.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int k(GB gb);

    public final void k0(View view, BB bb) {
        D3 d3 = this.a;
        C2827iH c2827iH = (C2827iH) d3.b;
        int iIndexOfChild = ((RecyclerView) c2827iH.b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((D9) d3.c).f(iIndexOfChild)) {
                d3.V(view);
            }
            c2827iH.C(iIndexOfChild);
        }
        bb.g(view);
    }

    public abstract int l(GB gb);

    public final void l0(int i) {
        if (u(i) != null) {
            D3 d3 = this.a;
            int iB = d3.B(i);
            C2827iH c2827iH = (C2827iH) d3.b;
            View childAt = ((RecyclerView) c2827iH.b).getChildAt(iB);
            if (childAt == null) {
                return;
            }
            if (((D9) d3.c).f(iB)) {
                d3.V(childAt);
            }
            c2827iH.C(iB);
        }
    }

    public abstract int m(GB gb);

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.n
            r8.y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.b0(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3529vB.m0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int n(GB gb);

    public final void n0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(GB gb);

    public abstract int o0(int i, BB bb, GB gb);

    public final void p(BB bb) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            JB jbI = RecyclerView.I(viewU);
            if (!jbI.q()) {
                if (!jbI.h() || jbI.j() || this.b.q.b) {
                    u(iV);
                    this.a.o(iV);
                    bb.i(viewU);
                    this.b.f.K(jbI);
                } else {
                    l0(iV);
                    bb.h(jbI);
                }
            }
        }
    }

    public abstract void p0(int i);

    public View q(int i) {
        int iV = v();
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            JB jbI = RecyclerView.I(viewU);
            if (jbI != null && jbI.c() == i && !jbI.q() && (this.b.j0.g || !jbI.j())) {
                return viewU;
            }
        }
        return null;
    }

    public abstract int q0(int i, BB bb, GB gb);

    public abstract C3583wB r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public C3583wB s(Context context, AttributeSet attributeSet) {
        return new C3583wB(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.C0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.C0;
        }
    }

    public C3583wB t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3583wB ? new C3583wB((C3583wB) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3583wB((ViewGroup.MarginLayoutParams) layoutParams) : new C3583wB(layoutParams);
    }

    public void t0(Rect rect, int i, int i2) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = UL.a;
        this.b.setMeasuredDimension(g(i, iF, recyclerView.getMinimumWidth()), g(i2, iD, this.b.getMinimumHeight()));
    }

    public final View u(int i) {
        D3 d3 = this.a;
        if (d3 != null) {
            return d3.u(i);
        }
        return null;
    }

    public final void u0(int i, int i2) {
        int iV = v();
        if (iV == 0) {
            this.b.n(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            Rect rect = this.b.n;
            y(viewU, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.n.set(i6, i4, i3, i5);
        t0(this.b.n, i, i2);
    }

    public final int v() {
        D3 d3 = this.a;
        if (d3 != null) {
            return d3.v();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            height = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.e;
            this.n = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.o = height;
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final boolean w0(View view, int i, int i2, C3583wB c3583wB) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c3583wB).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c3583wB).height)) ? false : true;
    }

    public int x(BB bb, GB gb) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.C0;
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        Rect rect2 = c3583wB.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c3583wB).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c3583wB).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c3583wB).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c3583wB).bottomMargin);
    }

    public final boolean y0(View view, int i, int i2, C3583wB c3583wB) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c3583wB).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c3583wB).height)) ? false : true;
    }

    public abstract void z0(RecyclerView recyclerView, int i);

    public void R(RecyclerView recyclerView) {
    }

    public void e0(Parcelable parcelable) {
    }

    public void g0(int i) {
    }

    public void Q() {
    }

    public void Y() {
    }

    public void X(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void i(int i, C0463a7 c0463a7) {
    }

    public void V(BB bb, GB gb, View view, Z z) {
    }

    public void h(int i, int i2, GB gb, C0463a7 c0463a7) {
    }
}

package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api;
import defpackage.AB;
import defpackage.AbstractC3149oB;
import defpackage.AbstractC3264qG;
import defpackage.AbstractC3367sB;
import defpackage.AbstractC3421tB;
import defpackage.AbstractC3529vB;
import defpackage.AbstractC3637xB;
import defpackage.AbstractC3691yB;
import defpackage.BB;
import defpackage.C0108Fk;
import defpackage.C0362Uj;
import defpackage.C0463a7;
import defpackage.C2531cw;
import defpackage.C2756h1;
import defpackage.C2801hs;
import defpackage.C2811i1;
import defpackage.C2827iH;
import defpackage.C3094nB;
import defpackage.C3178om;
import defpackage.C3240pt;
import defpackage.C3313rB;
import defpackage.C3583wB;
import defpackage.C3745zB;
import defpackage.CB;
import defpackage.D3;
import defpackage.D9;
import defpackage.DB;
import defpackage.GB;
import defpackage.HB;
import defpackage.IB;
import defpackage.InterfaceC0561bw;
import defpackage.InterfaceC3259qB;
import defpackage.InterpolatorC3039mB;
import defpackage.JB;
import defpackage.JJ;
import defpackage.LA;
import defpackage.LB;
import defpackage.ML;
import defpackage.RunnableC0162In;
import defpackage.RunnableC2705g5;
import defpackage.UL;
import defpackage.VD;
import defpackage.WF;
import defpackage.ZL;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements VD, InterfaceC0561bw {
    public static final int[] C0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] D0;
    public static final InterpolatorC3039mB E0;
    public boolean A;
    public int A0;
    public boolean B;
    public final C3094nB B0;
    public boolean C;
    public int D;
    public final AccessibilityManager E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public C3313rB J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public AbstractC3367sB O;
    public int P;
    public int Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final C0108Fk a;
    public AbstractC3637xB a0;
    public final BB b;
    public final int b0;
    public DB c;
    public final int c0;
    public final C2811i1 d;
    public final float d0;
    public final D3 e;
    public final float e0;
    public final C3178om f;
    public boolean f0;
    public final IB g0;
    public RunnableC0162In h0;
    public final C0463a7 i0;
    public final GB j0;
    public AbstractC3691yB k0;
    public ArrayList l0;
    public boolean m;
    public boolean m0;
    public final Rect n;
    public boolean n0;
    public final Rect o;
    public final C3094nB o0;
    public final RectF p;
    public boolean p0;
    public AbstractC3149oB q;
    public LB q0;
    public AbstractC3529vB r;
    public final int[] r0;
    public final ArrayList s;
    public C2531cw s0;
    public final ArrayList t;
    public final int[] t0;
    public final ArrayList u;
    public final int[] u0;
    public C0362Uj v;
    public final int[] v0;
    public boolean w;
    public final ArrayList w0;
    public boolean x;
    public final RunnableC2705g5 x0;
    public boolean y;
    public boolean y0;
    public int z;
    public int z0;

    static {
        Class cls = Integer.TYPE;
        D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        E0 = new InterpolatorC3039mB(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.mxtunnel.pro.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static JB I(View view) {
        if (view == null) {
            return null;
        }
        return ((C3583wB) view.getLayoutParams()).a;
    }

    private C2531cw getScrollingChildHelper() {
        if (this.s0 == null) {
            this.s0 = new C2531cw(this);
        }
        return this.s0;
    }

    public static void j(JB jb) {
        WeakReference weakReference = jb.b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == jb.a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                jb.b = null;
                return;
            }
        }
    }

    public final View A(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0362Uj c0362Uj = (C0362Uj) arrayList.get(i);
            int i2 = c0362Uj.v;
            if (i2 == 1) {
                boolean zD = c0362Uj.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = c0362Uj.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        c0362Uj.w = 1;
                        c0362Uj.p = (int) motionEvent.getX();
                    } else if (zD) {
                        c0362Uj.w = 2;
                        c0362Uj.m = (int) motionEvent.getY();
                    }
                    c0362Uj.f(2);
                }
            } else {
                z = i2 == 2;
            }
            if (z && action != 3) {
                this.v = c0362Uj;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int iV = this.e.v();
        if (iV == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iV; i3++) {
            JB jbI = I(this.e.u(i3));
            if (!jbI.q()) {
                int iC = jbI.c();
                if (iC < i) {
                    i = iC;
                }
                if (iC > i2) {
                    i2 = iC;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final JB E(int i) {
        JB jb = null;
        if (this.F) {
            return null;
        }
        int iE = this.e.E();
        for (int i2 = 0; i2 < iE; i2++) {
            JB jbI = I(this.e.D(i2));
            if (jbI != null && !jbI.j() && F(jbI) == i) {
                if (!this.e.J(jbI.a)) {
                    return jbI;
                }
                jb = jbI;
            }
        }
        return jb;
    }

    public final int F(JB jb) {
        if (jb.e(524) || !jb.g()) {
            return -1;
        }
        C2811i1 c2811i1 = this.d;
        int i = jb.c;
        ArrayList arrayList = (ArrayList) c2811i1.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2756h1 c2756h1 = (C2756h1) arrayList.get(i2);
            int i3 = c2756h1.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c2756h1.b;
                    if (i4 <= i) {
                        int i5 = c2756h1.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c2756h1.b;
                    if (i6 == i) {
                        i = c2756h1.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c2756h1.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c2756h1.b <= i) {
                i += c2756h1.d;
            }
        }
        return i;
    }

    public final long G(JB jb) {
        return this.q.b ? jb.e : jb.c;
    }

    public final JB H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        boolean z = c3583wB.c;
        Rect rect = c3583wB.b;
        if (!z) {
            return rect;
        }
        if (this.j0.g && (c3583wB.a.m() || c3583wB.a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.n;
            rect2.set(0, 0, 0, 0);
            ((AbstractC3421tB) arrayList.get(i)).getClass();
            ((C3583wB) view.getLayoutParams()).a.c();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c3583wB.c = false;
        return rect;
    }

    public final boolean K() {
        return !this.y || this.F || this.d.s();
    }

    public final boolean L() {
        return this.H > 0;
    }

    public final void M(int i) {
        if (this.r == null) {
            return;
        }
        setScrollState(2);
        this.r.p0(i);
        awakenScrollBars();
    }

    public final void N() {
        int iE = this.e.E();
        for (int i = 0; i < iE; i++) {
            ((C3583wB) this.e.D(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.b.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3583wB c3583wB = (C3583wB) ((JB) arrayList.get(i2)).a.getLayoutParams();
            if (c3583wB != null) {
                c3583wB.c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iE = this.e.E();
        for (int i4 = 0; i4 < iE; i4++) {
            JB jbI = I(this.e.D(i4));
            if (jbI != null && !jbI.q()) {
                int i5 = jbI.c;
                GB gb = this.j0;
                if (i5 >= i3) {
                    jbI.n(-i2, z);
                    gb.f = true;
                } else if (i5 >= i) {
                    jbI.b(8);
                    jbI.n(-i2, z);
                    jbI.c = i - 1;
                    gb.f = true;
                }
            }
        }
        BB bb = this.b;
        ArrayList arrayList = bb.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            JB jb = (JB) arrayList.get(size);
            if (jb != null) {
                int i6 = jb.c;
                if (i6 >= i3) {
                    jb.n(-i2, z);
                } else if (i6 >= i) {
                    jb.b(8);
                    bb.f(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.H++;
    }

    public final void Q(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.H - 1;
        this.H = i2;
        if (i2 < 1) {
            this.H = 0;
            if (z) {
                int i3 = this.D;
                this.D = 0;
                if (i3 != 0 && (accessibilityManager = this.E) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.w0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    JB jb = (JB) arrayList.get(size);
                    if (jb.a.getParent() == this && !jb.q() && (i = jb.q) != -1) {
                        WeakHashMap weakHashMap = UL.a;
                        jb.a.setImportantForAccessibility(i);
                        jb.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.U = x;
            this.S = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.V = y;
            this.T = y;
        }
    }

    public final void S() {
        if (this.p0 || !this.w) {
            return;
        }
        WeakHashMap weakHashMap = UL.a;
        postOnAnimation(this.x0);
        this.p0 = true;
    }

    public final void T() {
        boolean z;
        if (this.F) {
            C2811i1 c2811i1 = this.d;
            c2811i1.x((ArrayList) c2811i1.b);
            c2811i1.x((ArrayList) c2811i1.c);
            if (this.G) {
                this.r.Y();
            }
        }
        if (this.O == null || !this.r.B0()) {
            this.d.l();
        } else {
            this.d.w();
        }
        boolean z2 = this.m0 || this.n0;
        boolean z3 = this.y && this.O != null && ((z = this.F) || z2 || this.r.f) && (!z || this.q.b);
        GB gb = this.j0;
        gb.j = z3;
        gb.k = z3 && z2 && !this.F && this.O != null && this.r.B0();
    }

    public final void U(boolean z) {
        this.G = z | this.G;
        this.F = true;
        int iE = this.e.E();
        for (int i = 0; i < iE; i++) {
            JB jbI = I(this.e.D(i));
            if (jbI != null && !jbI.q()) {
                jbI.b(6);
            }
        }
        N();
        BB bb = this.b;
        ArrayList arrayList = bb.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            JB jb = (JB) arrayList.get(i2);
            if (jb != null) {
                jb.b(6);
                jb.a(null);
            }
        }
        AbstractC3149oB abstractC3149oB = bb.h.q;
        if (abstractC3149oB == null || !abstractC3149oB.b) {
            bb.e();
        }
    }

    public final void V(JB jb, LA la) {
        jb.j &= -8193;
        boolean z = this.j0.h;
        C3178om c3178om = this.f;
        if (z && jb.m() && !jb.j() && !jb.q()) {
            ((C3240pt) c3178om.c).g(G(jb), jb);
        }
        WF wf = (WF) c3178om.b;
        ZL zlA = (ZL) wf.get(jb);
        if (zlA == null) {
            zlA = ZL.a();
            wf.put(jb, zlA);
        }
        zlA.b = la;
        zlA.a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C3583wB) {
            C3583wB c3583wB = (C3583wB) layoutParams;
            if (!c3583wB.c) {
                int i = rect.left;
                Rect rect2 = c3583wB.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.r.m0(this, view, this.n, !this.y, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        e0(0);
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = UL.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Z(int[] iArr, int i, int i2) {
        JB jb;
        D3 d3 = this.e;
        c0();
        P();
        int i3 = JJ.a;
        Trace.beginSection("RV Scroll");
        GB gb = this.j0;
        z(gb);
        BB bb = this.b;
        int iO0 = i != 0 ? this.r.o0(i, bb, gb) : 0;
        int iQ0 = i2 != 0 ? this.r.q0(i2, bb, gb) : 0;
        Trace.endSection();
        int iV = d3.v();
        for (int i4 = 0; i4 < iV; i4++) {
            View viewU = d3.u(i4);
            JB jbH = H(viewU);
            if (jbH != null && (jb = jbH.i) != null) {
                int left = viewU.getLeft();
                int top = viewU.getTop();
                View view = jb.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = iO0;
            iArr[1] = iQ0;
        }
    }

    public final void a0(int i) {
        C2801hs c2801hs;
        if (this.B) {
            return;
        }
        setScrollState(0);
        IB ib = this.g0;
        ib.m.removeCallbacks(ib);
        ib.c.abortAnimation();
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && (c2801hs = abstractC3529vB.e) != null) {
            c2801hs.i();
        }
        AbstractC3529vB abstractC3529vB2 = this.r;
        if (abstractC3529vB2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC3529vB2.p0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null) {
            abstractC3529vB.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i, int i2, boolean z) {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        if (!abstractC3529vB.d()) {
            i = 0;
        }
        if (!this.r.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().h(i3, 1);
        }
        this.g0.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i = this.z + 1;
        this.z = i;
        if (i != 1 || this.B) {
            return;
        }
        this.A = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3583wB) && this.r.f((C3583wB) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && abstractC3529vB.d()) {
            return this.r.j(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && abstractC3529vB.d()) {
            return this.r.k(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && abstractC3529vB.d()) {
            return this.r.l(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && abstractC3529vB.e()) {
            return this.r.m(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && abstractC3529vB.e()) {
            return this.r.n(this.j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && abstractC3529vB.e()) {
            return this.r.o(this.j0);
        }
        return 0;
    }

    public final void d0(boolean z) {
        if (this.z < 1) {
            this.z = 1;
        }
        if (!z && !this.B) {
            this.A = false;
        }
        if (this.z == 1) {
            if (z && this.A && !this.B && this.r != null && this.q != null) {
                o();
            }
            if (!this.B) {
                this.A = false;
            }
        }
        this.z--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        float paddingRight;
        float paddingBottom;
        super.draw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC3421tB) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.m ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.m) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.m ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.m) {
                paddingRight = getPaddingRight() + (-getWidth());
                paddingBottom = getPaddingBottom() + (-getHeight());
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.O == null || arrayList.size() <= 0 || !this.O.f()) ? z : true) {
            WeakHashMap weakHashMap = UL.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void f(JB jb) {
        View view = jb.a;
        boolean z = view.getParent() == this;
        this.b.k(H(view));
        if (jb.l()) {
            this.e.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.e.f(view, true, -1);
            return;
        }
        D3 d3 = this.e;
        int iIndexOfChild = ((RecyclerView) ((C2827iH) d3.b).b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((D9) d3.c).h(iIndexOfChild);
            d3.H(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(AbstractC3421tB abstractC3421tB) {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null) {
            abstractC3529vB.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC3421tB);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null) {
            return abstractC3529vB.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null) {
            return abstractC3529vB.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC3149oB getAdapter() {
        return this.q;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB == null) {
            return super.getBaseline();
        }
        abstractC3529vB.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.m;
    }

    public LB getCompatAccessibilityDelegate() {
        return this.q0;
    }

    public C3313rB getEdgeEffectFactory() {
        return this.J;
    }

    public AbstractC3367sB getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.t.size();
    }

    public AbstractC3529vB getLayoutManager() {
        return this.r;
    }

    public int getMaxFlingVelocity() {
        return this.c0;
    }

    public int getMinFlingVelocity() {
        return this.b0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC3637xB getOnFlingListener() {
        return this.a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f0;
    }

    public AB getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.P;
    }

    public final void h(AbstractC3691yB abstractC3691yB) {
        if (this.l0 == null) {
            this.l0 = new ArrayList();
        }
        this.l0.add(abstractC3691yB);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int iE = this.e.E();
        for (int i = 0; i < iE; i++) {
            JB jbI = I(this.e.D(i));
            if (!jbI.q()) {
                jbI.d = -1;
                jbI.g = -1;
            }
        }
        BB bb = this.b;
        ArrayList arrayList = bb.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            JB jb = (JB) arrayList.get(i2);
            jb.d = -1;
            jb.g = -1;
        }
        ArrayList arrayList2 = bb.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            JB jb2 = (JB) arrayList2.get(i3);
            jb2.d = -1;
            jb2.g = -1;
        }
        ArrayList arrayList3 = bb.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                JB jb3 = (JB) bb.b.get(i4);
                jb3.d = -1;
                jb3.g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.K.onRelease();
            zIsFinished = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = UL.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        C2811i1 c2811i1 = this.d;
        if (!this.y || this.F) {
            int i = JJ.a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (c2811i1.s()) {
            c2811i1.getClass();
            if (c2811i1.s()) {
                int i2 = JJ.a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = UL.a;
        setMeasuredDimension(AbstractC3529vB.g(i, paddingRight, getMinimumWidth()), AbstractC3529vB.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f3  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.H = r0
            r1 = 1
            r5.w = r1
            boolean r2 = r5.y
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.y = r2
            vB r2 = r5.r
            if (r2 == 0) goto L21
            r2.g = r1
            r2.R(r5)
        L21:
            r5.p0 = r0
            java.lang.ThreadLocal r0 = defpackage.RunnableC0162In.e
            java.lang.Object r1 = r0.get()
            In r1 = (defpackage.RunnableC0162In) r1
            r5.h0 = r1
            if (r1 != 0) goto L6b
            In r1 = new In
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            r5.h0 = r1
            java.util.WeakHashMap r1 = defpackage.UL.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            In r2 = r5.h0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L6b:
            In r0 = r5.h0
            java.util.ArrayList r0 = r0.a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2801hs c2801hs;
        super.onDetachedFromWindow();
        AbstractC3367sB abstractC3367sB = this.O;
        if (abstractC3367sB != null) {
            abstractC3367sB.e();
        }
        setScrollState(0);
        IB ib = this.g0;
        ib.m.removeCallbacks(ib);
        ib.c.abortAnimation();
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null && (c2801hs = abstractC3529vB.e) != null) {
            c2801hs.i();
        }
        this.w = false;
        AbstractC3529vB abstractC3529vB2 = this.r;
        if (abstractC3529vB2 != null) {
            abstractC3529vB2.g = false;
            abstractC3529vB2.S(this);
        }
        this.w0.clear();
        removeCallbacks(this.x0);
        this.f.getClass();
        while (ZL.d.a() != null) {
        }
        RunnableC0162In runnableC0162In = this.h0;
        if (runnableC0162In != null) {
            runnableC0162In.a.remove(this);
            this.h0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3421tB) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.B) {
            return false;
        }
        this.v = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB == null) {
            return false;
        }
        boolean zD = abstractC3529vB.d();
        boolean zE = this.r.e();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.C) {
                this.C = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.U = x;
            this.S = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.V = y;
            this.T = y;
            if (this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.u0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zD;
            if (zE) {
                i = (zD ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i, 0);
        } else if (actionMasked == 1) {
            this.R.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i2 = x2 - this.S;
                int i3 = y2 - this.T;
                if (zD == 0 || Math.abs(i2) <= this.W) {
                    z = false;
                } else {
                    this.U = x2;
                    z = true;
                }
                if (zE && Math.abs(i3) > this.W) {
                    this.V = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x3;
            this.S = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y3;
            this.T = y3;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = JJ.a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB == null) {
            n(i, i2);
            return;
        }
        boolean zL = abstractC3529vB.L();
        boolean z = false;
        GB gb = this.j0;
        if (!zL) {
            if (this.x) {
                this.r.b.n(i, i2);
                return;
            }
            if (gb.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC3149oB abstractC3149oB = this.q;
            if (abstractC3149oB != null) {
                gb.e = abstractC3149oB.a();
            } else {
                gb.e = 0;
            }
            c0();
            this.r.b.n(i, i2);
            d0(false);
            gb.g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.r.b.n(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.y0 = z;
        if (z || this.q == null) {
            return;
        }
        if (gb.d == 1) {
            p();
        }
        this.r.s0(i, i2);
        gb.i = true;
        q();
        this.r.u0(i, i2);
        if (this.r.x0()) {
            this.r.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            gb.i = true;
            q();
            this.r.u0(i, i2);
        }
        this.z0 = getMeasuredWidth();
        this.A0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DB)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DB db = (DB) parcelable;
        this.c = db;
        super.onRestoreInstanceState(db.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        DB db = new DB(super.onSaveInstanceState());
        DB db2 = this.c;
        if (db2 != null) {
            db.c = db2.c;
        } else {
            AbstractC3529vB abstractC3529vB = this.r;
            db.c = abstractC3529vB != null ? abstractC3529vB.f0() : null;
        }
        return db;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f8 A[PHI: r0
      0x01f8: PHI (r0v51 int) = (r0v38 int), (r0v55 int) binds: [B:90:0x01e3, B:95:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        c0();
        P();
        GB gb = this.j0;
        gb.a(6);
        this.d.l();
        gb.e = this.q.a();
        gb.c = 0;
        if (this.c != null) {
            AbstractC3149oB abstractC3149oB = this.q;
            int iA = AbstractC3264qG.A(abstractC3149oB.c);
            if (iA == 1 ? abstractC3149oB.a() > 0 : iA != 2) {
                Parcelable parcelable = this.c.c;
                if (parcelable != null) {
                    this.r.e0(parcelable);
                }
                this.c = null;
            }
        }
        gb.g = false;
        this.r.c0(this.b, gb);
        gb.f = false;
        gb.j = gb.j && this.O != null;
        gb.d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        JB jbI = I(view);
        if (jbI != null) {
            if (jbI.l()) {
                jbI.j &= -257;
            } else if (!jbI.q()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + jbI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C2801hs c2801hs = this.r.e;
        if ((c2801hs == null || !c2801hs.e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.r.m0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0362Uj) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.z != 0 || this.B) {
            this.A = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.B) {
            return;
        }
        boolean zD = abstractC3529vB.d();
        boolean zE = this.r.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i2 = 0;
            }
            Y(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.D |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(LB lb) {
        this.q0 = lb;
        UL.l(this, lb);
    }

    public void setAdapter(AbstractC3149oB abstractC3149oB) {
        setLayoutFrozen(false);
        AbstractC3149oB abstractC3149oB2 = this.q;
        C0108Fk c0108Fk = this.a;
        if (abstractC3149oB2 != null) {
            abstractC3149oB2.a.unregisterObserver(c0108Fk);
            this.q.getClass();
        }
        AbstractC3367sB abstractC3367sB = this.O;
        if (abstractC3367sB != null) {
            abstractC3367sB.e();
        }
        AbstractC3529vB abstractC3529vB = this.r;
        BB bb = this.b;
        if (abstractC3529vB != null) {
            abstractC3529vB.i0(bb);
            this.r.j0(bb);
        }
        bb.a.clear();
        bb.e();
        C2811i1 c2811i1 = this.d;
        c2811i1.x((ArrayList) c2811i1.b);
        c2811i1.x((ArrayList) c2811i1.c);
        AbstractC3149oB abstractC3149oB3 = this.q;
        this.q = abstractC3149oB;
        if (abstractC3149oB != null) {
            abstractC3149oB.a.registerObserver(c0108Fk);
        }
        AbstractC3529vB abstractC3529vB2 = this.r;
        if (abstractC3529vB2 != null) {
            abstractC3529vB2.Q();
        }
        AbstractC3149oB abstractC3149oB4 = this.q;
        bb.a.clear();
        bb.e();
        AB abC = bb.c();
        if (abstractC3149oB3 != null) {
            abC.b--;
        }
        if (abC.b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = abC.a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C3745zB) sparseArray.valueAt(i)).a.clear();
                i++;
            }
        }
        if (abstractC3149oB4 != null) {
            abC.b++;
        }
        this.j0.f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC3259qB interfaceC3259qB) {
        if (interfaceC3259qB == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.m) {
            this.N = null;
            this.L = null;
            this.M = null;
            this.K = null;
        }
        this.m = z;
        super.setClipToPadding(z);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C3313rB c3313rB) {
        c3313rB.getClass();
        this.J = c3313rB;
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void setHasFixedSize(boolean z) {
        this.x = z;
    }

    public void setItemAnimator(AbstractC3367sB abstractC3367sB) {
        AbstractC3367sB abstractC3367sB2 = this.O;
        if (abstractC3367sB2 != null) {
            abstractC3367sB2.e();
            this.O.a = null;
        }
        this.O = abstractC3367sB;
        if (abstractC3367sB != null) {
            abstractC3367sB.a = this.o0;
        }
    }

    public void setItemViewCacheSize(int i) {
        BB bb = this.b;
        bb.e = i;
        bb.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC3529vB abstractC3529vB) {
        C2827iH c2827iH;
        C2801hs c2801hs;
        if (abstractC3529vB == this.r) {
            return;
        }
        setScrollState(0);
        IB ib = this.g0;
        ib.m.removeCallbacks(ib);
        ib.c.abortAnimation();
        AbstractC3529vB abstractC3529vB2 = this.r;
        if (abstractC3529vB2 != null && (c2801hs = abstractC3529vB2.e) != null) {
            c2801hs.i();
        }
        AbstractC3529vB abstractC3529vB3 = this.r;
        BB bb = this.b;
        if (abstractC3529vB3 != null) {
            AbstractC3367sB abstractC3367sB = this.O;
            if (abstractC3367sB != null) {
                abstractC3367sB.e();
            }
            this.r.i0(bb);
            this.r.j0(bb);
            bb.a.clear();
            bb.e();
            if (this.w) {
                AbstractC3529vB abstractC3529vB4 = this.r;
                abstractC3529vB4.g = false;
                abstractC3529vB4.S(this);
            }
            this.r.v0(null);
            this.r = null;
        } else {
            bb.a.clear();
            bb.e();
        }
        D3 d3 = this.e;
        ((D9) d3.c).g();
        ArrayList arrayList = (ArrayList) d3.d;
        int size = arrayList.size() - 1;
        while (true) {
            c2827iH = (C2827iH) d3.b;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            c2827iH.getClass();
            JB jbI = I(view);
            if (jbI != null) {
                int i = jbI.p;
                RecyclerView recyclerView = (RecyclerView) c2827iH.b;
                if (recyclerView.L()) {
                    jbI.q = i;
                    recyclerView.w0.add(jbI);
                } else {
                    WeakHashMap weakHashMap = UL.a;
                    jbI.a.setImportantForAccessibility(i);
                }
                jbI.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = (RecyclerView) c2827iH.b;
        int childCount = recyclerView2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.r = abstractC3529vB;
        if (abstractC3529vB != null) {
            if (abstractC3529vB.b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC3529vB + " is already attached to a RecyclerView:" + abstractC3529vB.b.y());
            }
            abstractC3529vB.v0(this);
            if (this.w) {
                AbstractC3529vB abstractC3529vB5 = this.r;
                abstractC3529vB5.g = true;
                abstractC3529vB5.R(this);
            }
        }
        bb.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C2531cw scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = UL.a;
            ML.m(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(AbstractC3637xB abstractC3637xB) {
        this.a0 = abstractC3637xB;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC3691yB abstractC3691yB) {
        this.k0 = abstractC3691yB;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f0 = z;
    }

    public void setRecycledViewPool(AB ab) {
        BB bb = this.b;
        if (bb.g != null) {
            r1.b--;
        }
        bb.g = ab;
        if (ab == null || bb.h.getAdapter() == null) {
            return;
        }
        bb.g.b++;
    }

    public void setScrollState(int i) {
        C2801hs c2801hs;
        if (i == this.P) {
            return;
        }
        this.P = i;
        if (i != 2) {
            IB ib = this.g0;
            ib.m.removeCallbacks(ib);
            ib.c.abortAnimation();
            AbstractC3529vB abstractC3529vB = this.r;
            if (abstractC3529vB != null && (c2801hs = abstractC3529vB.e) != null) {
                c2801hs.i();
            }
        }
        AbstractC3529vB abstractC3529vB2 = this.r;
        if (abstractC3529vB2 != null) {
            abstractC3529vB2.g0(i);
        }
        AbstractC3691yB abstractC3691yB = this.k0;
        if (abstractC3691yB != null) {
            abstractC3691yB.a(i);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC3691yB) this.l0.get(size)).a(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.W = scaledTouchSlop;
    }

    public void setViewCacheExtension(HB hb) {
        this.b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        C2801hs c2801hs;
        if (z != this.B) {
            i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.B = false;
                if (this.A && this.r != null && this.q != null) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.B = true;
            this.C = true;
            setScrollState(0);
            IB ib = this.g0;
            ib.m.removeCallbacks(ib);
            ib.c.abortAnimation();
            AbstractC3529vB abstractC3529vB = this.r;
            if (abstractC3529vB == null || (c2801hs = abstractC3529vB.e) == null) {
                return;
            }
            c2801hs.i();
        }
    }

    public final void t(int i, int i2) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC3691yB abstractC3691yB = this.k0;
        if (abstractC3691yB != null) {
            abstractC3691yB.b(this, i, i2);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC3691yB) this.l0.get(size)).b(this, i, i2);
            }
        }
        this.I--;
    }

    public final void u() {
        int measuredWidth;
        int measuredHeight;
        if (this.N != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.m) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void v() {
        int measuredHeight;
        int measuredWidth;
        if (this.K != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.m) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void w() {
        int measuredHeight;
        int measuredWidth;
        if (this.M != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.m) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void x() {
        int measuredWidth;
        int measuredHeight;
        if (this.L != null) {
            return;
        }
        this.J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.L = edgeEffect;
        if (this.m) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.q + ", layout:" + this.r + ", context:" + getContext();
    }

    public final void z(GB gb) {
        if (getScrollState() != 2) {
            gb.getClass();
            return;
        }
        OverScroller overScroller = this.g0.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        gb.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:43|(1:45)(13:47|(1:50)|99|51|(1:53)(1:64)|65|97|66|67|95|68|69|76)|46|99|51|(0)(0)|65|97|66|67|95|68|69|76) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x031e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x031f, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0322, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0323, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0329, code lost:
    
        r15 = null;
        r4 = r3.getConstructor(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0339, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x033a, code lost:
    
        r0.initCause(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x035b, code lost:
    
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02dc A[Catch: ClassCastException -> 0x02e5, IllegalAccessException -> 0x02e8, InstantiationException -> 0x02eb, InvocationTargetException -> 0x02ee, ClassNotFoundException -> 0x02f1, TryCatch #5 {ClassCastException -> 0x02e5, ClassNotFoundException -> 0x02f1, IllegalAccessException -> 0x02e8, InstantiationException -> 0x02eb, InvocationTargetException -> 0x02ee, blocks: (B:51:0x02d6, B:53:0x02dc, B:65:0x02f8, B:66:0x0302, B:68:0x030d, B:76:0x032b, B:74:0x0325, B:78:0x033a, B:79:0x035b, B:64:0x02f4), top: B:99:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f4 A[Catch: ClassCastException -> 0x02e5, IllegalAccessException -> 0x02e8, InstantiationException -> 0x02eb, InvocationTargetException -> 0x02ee, ClassNotFoundException -> 0x02f1, TryCatch #5 {ClassCastException -> 0x02e5, ClassNotFoundException -> 0x02f1, IllegalAccessException -> 0x02e8, InstantiationException -> 0x02eb, InvocationTargetException -> 0x02ee, blocks: (B:51:0x02d6, B:53:0x02dc, B:65:0x02f8, B:66:0x0302, B:68:0x030d, B:76:0x032b, B:74:0x0325, B:78:0x033a, B:79:0x035b, B:64:0x02f4), top: B:99:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC3529vB abstractC3529vB = this.r;
        if (abstractC3529vB != null) {
            return abstractC3529vB.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Deprecated
    public void setRecyclerListener(CB cb) {
    }
}

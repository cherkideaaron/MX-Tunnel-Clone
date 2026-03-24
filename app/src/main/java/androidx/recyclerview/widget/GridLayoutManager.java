package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.AbstractC3264qG;
import defpackage.AbstractC3529vB;
import defpackage.BB;
import defpackage.C0463a7;
import defpackage.C2581ds;
import defpackage.C2636es;
import defpackage.C2691fs;
import defpackage.C2797ho;
import defpackage.C3178om;
import defpackage.C3583wB;
import defpackage.GB;
import defpackage.UL;
import defpackage.Vs;
import defpackage.Z;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final C3178om K;
    public final Rect L;

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new C3178om(2);
        this.L = new Rect();
        n1(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final boolean B0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(GB gb, C2691fs c2691fs, C0463a7 c0463a7) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = c2691fs.d) >= 0 && i < gb.b() && i2 > 0; i3++) {
            c0463a7.a(c2691fs.d, Math.max(0, c2691fs.g));
            this.K.getClass();
            i2--;
            c2691fs.d += c2691fs.e;
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final int J(BB bb, GB gb) {
        if (this.p == 0) {
            return this.F;
        }
        if (gb.b() < 1) {
            return 0;
        }
        return j1(gb.b() - 1, bb, gb) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(BB bb, GB gb, boolean z, boolean z2) {
        int i;
        int iV;
        int iV2 = v();
        int i2 = 1;
        if (z2) {
            iV = v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iV2;
            iV = 0;
        }
        int iB = gb.b();
        I0();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iH = AbstractC3529vB.H(viewU);
            if (iH >= 0 && iH < iB && k1(iH, bb, gb) == 0) {
                if (((C3583wB) viewU.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (r13 == (r2 > r15)) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r23, int r24, defpackage.BB r25, defpackage.GB r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, BB, GB):android.view.View");
    }

    @Override // defpackage.AbstractC3529vB
    public final void V(BB bb, GB gb, View view, Z z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2797ho)) {
            W(view, z);
            return;
        }
        C2797ho c2797ho = (C2797ho) layoutParams;
        int iJ1 = j1(c2797ho.a.c(), bb, gb);
        int i5 = this.p;
        AccessibilityNodeInfo accessibilityNodeInfo = z.a;
        if (i5 == 0) {
            i4 = c2797ho.e;
            i3 = c2797ho.f;
            z2 = false;
            i2 = 1;
            z3 = false;
            i = iJ1;
        } else {
            i = c2797ho.e;
            i2 = c2797ho.f;
            z2 = false;
            i3 = 1;
            z3 = false;
            i4 = iJ1;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i3, i, i2, z2, z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(BB bb, GB gb, C2691fs c2691fs, C2636es c2636es) {
        int i;
        int i2;
        int i3;
        int iD;
        int iE;
        int iG;
        int iD2;
        int iW;
        int iW2;
        ?? r8;
        int i4;
        View viewB;
        int iJ = this.r.j();
        boolean z = iJ != 1073741824;
        int i5 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            o1();
        }
        boolean z2 = c2691fs.e == 1;
        int iK1 = this.F;
        if (!z2) {
            iK1 = k1(c2691fs.d, bb, gb) + l1(c2691fs.d, bb, gb);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = c2691fs.d) >= 0 && i4 < gb.b() && iK1 > 0) {
            int i7 = c2691fs.d;
            int iL1 = l1(i7, bb, gb);
            if (iL1 > this.F) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iL1);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC3264qG.j(sb, this.F, " spans."));
            }
            iK1 -= iL1;
            if (iK1 < 0 || (viewB = c2691fs.b(bb)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            c2636es.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            C2797ho c2797ho = (C2797ho) view.getLayoutParams();
            int iL12 = l1(AbstractC3529vB.H(view), bb, gb);
            c2797ho.f = iL12;
            c2797ho.e = i8;
            i8 += iL12;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (c2691fs.k != null) {
                r8 = 0;
                r8 = 0;
                if (z2) {
                    b(view2, true, -1);
                } else {
                    b(view2, true, 0);
                }
            } else if (z2) {
                r8 = 0;
                b(view2, false, -1);
            } else {
                r8 = 0;
                b(view2, false, 0);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.J(view2));
            }
            m1(view2, r8, iJ);
            int iC = this.r.c(view2);
            if (iC > i9) {
                i9 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((C2797ho) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z) {
            g1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                m1(view3, true, 1073741824);
                int iC2 = this.r.c(view3);
                if (iC2 > i9) {
                    i9 = iC2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.c(view4) != i9) {
                C2797ho c2797ho2 = (C2797ho) view4.getLayoutParams();
                Rect rect2 = c2797ho2.b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2797ho2).topMargin + ((ViewGroup.MarginLayoutParams) c2797ho2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c2797ho2).leftMargin + ((ViewGroup.MarginLayoutParams) c2797ho2).rightMargin;
                int iI1 = i1(c2797ho2.e, c2797ho2.f);
                if (this.p == 1) {
                    iW2 = AbstractC3529vB.w(false, iI1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c2797ho2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iW = AbstractC3529vB.w(false, iI1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c2797ho2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (y0(view4, iW2, iW, (C3583wB) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        c2636es.a = i9;
        if (this.p == 1) {
            int i15 = c2691fs.f;
            iD2 = c2691fs.b;
            if (i15 == -1) {
                iG = iD2 - i9;
                iE = 0;
                iD = 0;
            } else {
                iG = iD2;
                iD = 0;
                iD2 += i9;
                iE = 0;
            }
        } else {
            int i16 = c2691fs.f;
            int i17 = c2691fs.b;
            if (i16 == -1) {
                iE = i17 - i9;
                iD = i17;
            } else {
                iD = i17 + i9;
                iE = i17;
            }
            iG = 0;
            iD2 = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.H[i18];
            C2797ho c2797ho3 = (C2797ho) view5.getLayoutParams();
            if (this.p != 1) {
                iG = G() + this.G[c2797ho3.e];
                iD2 = this.r.d(view5) + iG;
            } else if (U0()) {
                int iE2 = E() + this.G[this.F - c2797ho3.e];
                iD = iE2;
                iE = iE2 - this.r.d(view5);
            } else {
                iE = E() + this.G[c2797ho3.e];
                iD = this.r.d(view5) + iE;
            }
            AbstractC3529vB.N(view5, iE, iG, iD, iD2);
            if (c2797ho3.a.j() || c2797ho3.a.m()) {
                c2636es.c = true;
            }
            c2636es.d = view5.hasFocusable() | c2636es.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(BB bb, GB gb, C2581ds c2581ds, int i) {
        o1();
        if (gb.b() > 0 && !gb.g) {
            boolean z = i == 1;
            int iK1 = k1(c2581ds.b, bb, gb);
            if (z) {
                while (iK1 > 0) {
                    int i2 = c2581ds.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c2581ds.b = i3;
                    iK1 = k1(i3, bb, gb);
                }
            } else {
                int iB = gb.b() - 1;
                int i4 = c2581ds.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iK12 = k1(i5, bb, gb);
                    if (iK12 <= iK1) {
                        break;
                    }
                    i4 = i5;
                    iK1 = iK12;
                }
                c2581ds.b = i4;
            }
        }
        h1();
    }

    @Override // defpackage.AbstractC3529vB
    public final void X(int i, int i2) {
        C3178om c3178om = this.K;
        c3178om.E();
        ((SparseIntArray) c3178om.c).clear();
    }

    @Override // defpackage.AbstractC3529vB
    public final void Y() {
        C3178om c3178om = this.K;
        c3178om.E();
        ((SparseIntArray) c3178om.c).clear();
    }

    @Override // defpackage.AbstractC3529vB
    public final void Z(int i, int i2) {
        C3178om c3178om = this.K;
        c3178om.E();
        ((SparseIntArray) c3178om.c).clear();
    }

    @Override // defpackage.AbstractC3529vB
    public final void a0(int i, int i2) {
        C3178om c3178om = this.K;
        c3178om.E();
        ((SparseIntArray) c3178om.c).clear();
    }

    @Override // defpackage.AbstractC3529vB
    public final void b0(int i, int i2) {
        C3178om c3178om = this.K;
        c3178om.E();
        ((SparseIntArray) c3178om.c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final void c0(BB bb, GB gb) {
        boolean z = gb.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                C2797ho c2797ho = (C2797ho) u(i).getLayoutParams();
                int iC = c2797ho.a.c();
                sparseIntArray2.put(iC, c2797ho.f);
                sparseIntArray.put(iC, c2797ho.e);
            }
        }
        super.c0(bb, gb);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.c1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final void d0(GB gb) {
        super.d0(gb);
        this.E = false;
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean f(C3583wB c3583wB) {
        return c3583wB instanceof C2797ho;
    }

    public final void g1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void h1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int i1(int i, int i2) {
        if (this.p != 1 || !U0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int j1(int i, BB bb, GB gb) {
        boolean z = gb.g;
        C3178om c3178om = this.K;
        if (!z) {
            int i2 = this.F;
            c3178om.getClass();
            return C3178om.z(i, i2);
        }
        int iB = bb.b(i);
        if (iB != -1) {
            int i3 = this.F;
            c3178om.getClass();
            return C3178om.z(iB, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final int k(GB gb) {
        return F0(gb);
    }

    public final int k1(int i, BB bb, GB gb) {
        boolean z = gb.g;
        C3178om c3178om = this.K;
        if (!z) {
            int i2 = this.F;
            c3178om.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = bb.b(i);
        if (iB != -1) {
            int i4 = this.F;
            c3178om.getClass();
            return iB % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final int l(GB gb) {
        return G0(gb);
    }

    public final int l1(int i, BB bb, GB gb) {
        boolean z = gb.g;
        C3178om c3178om = this.K;
        if (!z) {
            c3178om.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (bb.b(i) != -1) {
            c3178om.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void m1(View view, boolean z, int i) {
        int iW;
        int iW2;
        C2797ho c2797ho = (C2797ho) view.getLayoutParams();
        Rect rect = c2797ho.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2797ho).topMargin + ((ViewGroup.MarginLayoutParams) c2797ho).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2797ho).leftMargin + ((ViewGroup.MarginLayoutParams) c2797ho).rightMargin;
        int iI1 = i1(c2797ho.e, c2797ho.f);
        if (this.p == 1) {
            iW2 = AbstractC3529vB.w(false, iI1, i, i3, ((ViewGroup.MarginLayoutParams) c2797ho).width);
            iW = AbstractC3529vB.w(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) c2797ho).height);
        } else {
            int iW3 = AbstractC3529vB.w(false, iI1, i, i2, ((ViewGroup.MarginLayoutParams) c2797ho).height);
            int iW4 = AbstractC3529vB.w(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) c2797ho).width);
            iW = iW3;
            iW2 = iW4;
        }
        C3583wB c3583wB = (C3583wB) view.getLayoutParams();
        if (z ? y0(view, iW2, iW, c3583wB) : w0(view, iW2, iW, c3583wB)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final int n(GB gb) {
        return F0(gb);
    }

    public final void n1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(Vs.k(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.E();
        n0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final int o(GB gb) {
        return G0(gb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final int o0(int i, BB bb, GB gb) {
        o1();
        h1();
        return super.o0(i, bb, gb);
    }

    public final void o1() {
        int iD;
        int iG;
        if (this.p == 1) {
            iD = this.n - F();
            iG = E();
        } else {
            iD = this.o - D();
            iG = G();
        }
        g1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final int q0(int i, BB bb, GB gb) {
        o1();
        h1();
        return super.q0(i, bb, gb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final C3583wB r() {
        return this.p == 0 ? new C2797ho(-2, -1) : new C2797ho(-1, -2);
    }

    @Override // defpackage.AbstractC3529vB
    public final C3583wB s(Context context, AttributeSet attributeSet) {
        C2797ho c2797ho = new C2797ho(context, attributeSet);
        c2797ho.e = -1;
        c2797ho.f = 0;
        return c2797ho;
    }

    @Override // defpackage.AbstractC3529vB
    public final C3583wB t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C2797ho c2797ho = new C2797ho((ViewGroup.MarginLayoutParams) layoutParams);
            c2797ho.e = -1;
            c2797ho.f = 0;
            return c2797ho;
        }
        C2797ho c2797ho2 = new C2797ho(layoutParams);
        c2797ho2.e = -1;
        c2797ho2.f = 0;
        return c2797ho2;
    }

    @Override // defpackage.AbstractC3529vB
    public final void t0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.t0(rect, i, i2);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = UL.a;
            iG2 = AbstractC3529vB.g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = AbstractC3529vB.g(i, iArr[iArr.length - 1] + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = UL.a;
            iG = AbstractC3529vB.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = AbstractC3529vB.g(i2, iArr2[iArr2.length - 1] + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.AbstractC3529vB
    public final int x(BB bb, GB gb) {
        if (this.p == 1) {
            return this.F;
        }
        if (gb.b() < 1) {
            return 0;
        }
        return j1(gb.b() - 1, bb, gb) + 1;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new C3178om(2);
        this.L = new Rect();
        n1(AbstractC3529vB.I(context, attributeSet, i, i2).b);
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.Api;
import defpackage.AbstractC0492ai;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3529vB;
import defpackage.BB;
import defpackage.C0463a7;
import defpackage.C2801hs;
import defpackage.C3178om;
import defpackage.C3454tr;
import defpackage.C3475uB;
import defpackage.C3583wB;
import defpackage.FB;
import defpackage.GB;
import defpackage.KG;
import defpackage.LG;
import defpackage.NG;
import defpackage.OG;
import defpackage.RunnableC2705g5;
import defpackage.UL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC3529vB implements FB {
    public final C3178om B;
    public final int C;
    public boolean D;
    public boolean E;
    public NG F;
    public final Rect G;
    public final KG H;
    public final boolean I;
    public int[] J;
    public final RunnableC2705g5 K;
    public final int p;
    public final OG[] q;
    public final AbstractC0492ai r;
    public final AbstractC0492ai s;
    public final int t;
    public int u;
    public final C3454tr v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        C3178om c3178om = new C3178om(14, false);
        this.B = c3178om;
        this.C = 2;
        this.G = new Rect();
        this.H = new KG(this);
        this.I = true;
        this.K = new RunnableC2705g5(this, 26);
        C3475uB c3475uBI = AbstractC3529vB.I(context, attributeSet, i, i2);
        int i3 = c3475uBI.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            AbstractC0492ai abstractC0492ai = this.r;
            this.r = this.s;
            this.s = abstractC0492ai;
            n0();
        }
        int i4 = c3475uBI.b;
        c(null);
        if (i4 != this.p) {
            c3178om.e();
            n0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new OG[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new OG(this, i5);
            }
            n0();
        }
        boolean z = c3475uBI.c;
        c(null);
        NG ng = this.F;
        if (ng != null && ng.n != z) {
            ng.n = z;
        }
        this.w = z;
        n0();
        C3454tr c3454tr = new C3454tr();
        c3454tr.a = true;
        c3454tr.f = 0;
        c3454tr.g = 0;
        this.v = c3454tr;
        this.r = AbstractC0492ai.a(this, this.t);
        this.s = AbstractC0492ai.a(this, 1 - this.t);
    }

    public static int f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean B0() {
        return this.F == null;
    }

    public final int C0(int i) {
        if (v() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < M0()) != this.x ? -1 : 1;
    }

    public final boolean D0() {
        int iM0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iM0 = N0();
                M0();
            } else {
                iM0 = M0();
                N0();
            }
            C3178om c3178om = this.B;
            if (iM0 == 0 && R0() != null) {
                c3178om.e();
                this.f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int E0(GB gb) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0492ai abstractC0492ai = this.r;
        boolean z = this.I;
        return AbstractC0500aq.p(gb, abstractC0492ai, J0(!z), I0(!z), this, this.I);
    }

    public final int F0(GB gb) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0492ai abstractC0492ai = this.r;
        boolean z = this.I;
        return AbstractC0500aq.q(gb, abstractC0492ai, J0(!z), I0(!z), this, this.I, this.x);
    }

    public final int G0(GB gb) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0492ai abstractC0492ai = this.r;
        boolean z = this.I;
        return AbstractC0500aq.r(gb, abstractC0492ai, J0(!z), I0(!z), this, this.I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int H0(BB bb, C3454tr c3454tr, GB gb) {
        OG og;
        ?? r6;
        int i;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.y.set(0, this.p, true);
        C3454tr c3454tr2 = this.v;
        int i8 = c3454tr2.i ? c3454tr.e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE : c3454tr.e == 1 ? c3454tr.g + c3454tr.b : c3454tr.f - c3454tr.b;
        int i9 = c3454tr.e;
        for (int i10 = 0; i10 < this.p; i10++) {
            if (!this.q[i10].a.isEmpty()) {
                e1(this.q[i10], i9, i8);
            }
        }
        int iG = this.x ? this.r.g() : this.r.k();
        boolean z = false;
        while (true) {
            int i11 = c3454tr.c;
            if (((i11 < 0 || i11 >= gb.b()) ? i6 : i7) == 0 || (!c3454tr2.i && this.y.isEmpty())) {
                break;
            }
            View viewD = bb.d(c3454tr.c);
            c3454tr.c += c3454tr.d;
            LG lg = (LG) viewD.getLayoutParams();
            int iC3 = lg.a.c();
            C3178om c3178om = this.B;
            int[] iArr = (int[]) c3178om.b;
            int i12 = (iArr == null || iC3 >= iArr.length) ? -1 : iArr[iC3];
            if (i12 == -1) {
                if (V0(c3454tr.e)) {
                    i5 = this.p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.p;
                    i5 = i6;
                }
                OG og2 = null;
                if (c3454tr.e == i7) {
                    int iK2 = this.r.k();
                    int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    while (i5 != i4) {
                        OG og3 = this.q[i5];
                        int iF = og3.f(iK2);
                        if (iF < i13) {
                            i13 = iF;
                            og2 = og3;
                        }
                        i5 += i3;
                    }
                } else {
                    int iG2 = this.r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        OG og4 = this.q[i5];
                        int iH2 = og4.h(iG2);
                        if (iH2 > i14) {
                            og2 = og4;
                            i14 = iH2;
                        }
                        i5 += i3;
                    }
                }
                og = og2;
                c3178om.u(iC3);
                ((int[]) c3178om.b)[iC3] = og.e;
            } else {
                og = this.q[i12];
            }
            lg.e = og;
            if (c3454tr.e == 1) {
                r6 = 0;
                b(viewD, false, -1);
            } else {
                r6 = 0;
                b(viewD, false, 0);
            }
            if (this.t == 1) {
                i = 1;
                T0(viewD, AbstractC3529vB.w(r6, this.u, this.l, r6, ((ViewGroup.MarginLayoutParams) lg).width), AbstractC3529vB.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) lg).height));
            } else {
                i = 1;
                T0(viewD, AbstractC3529vB.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) lg).width), AbstractC3529vB.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) lg).height));
            }
            if (c3454tr.e == i) {
                iC = og.f(iG);
                iH = this.r.c(viewD) + iC;
            } else {
                iH = og.h(iG);
                iC = iH - this.r.c(viewD);
            }
            if (c3454tr.e == 1) {
                OG og5 = lg.e;
                og5.getClass();
                LG lg2 = (LG) viewD.getLayoutParams();
                lg2.e = og5;
                ArrayList arrayList = og5.a;
                arrayList.add(viewD);
                og5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    og5.b = Integer.MIN_VALUE;
                }
                if (lg2.a.j() || lg2.a.m()) {
                    og5.d = og5.f.r.c(viewD) + og5.d;
                }
            } else {
                OG og6 = lg.e;
                og6.getClass();
                LG lg3 = (LG) viewD.getLayoutParams();
                lg3.e = og6;
                ArrayList arrayList2 = og6.a;
                arrayList2.add(0, viewD);
                og6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    og6.c = Integer.MIN_VALUE;
                }
                if (lg3.a.j() || lg3.a.m()) {
                    og6.d = og6.f.r.c(viewD) + og6.d;
                }
            }
            if (S0() && this.t == 1) {
                iC2 = this.s.g() - (((this.p - 1) - og.e) * this.u);
                iK = iC2 - this.s.c(viewD);
            } else {
                iK = this.s.k() + (og.e * this.u);
                iC2 = this.s.c(viewD) + iK;
            }
            if (this.t == 1) {
                AbstractC3529vB.N(viewD, iK, iC, iC2, iH);
            } else {
                AbstractC3529vB.N(viewD, iC, iK, iH, iC2);
            }
            e1(og, c3454tr2.e, i8);
            X0(bb, c3454tr2);
            if (c3454tr2.h && viewD.hasFocusable()) {
                i2 = 0;
                this.y.set(og.e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z = true;
        }
        int i15 = i6;
        if (!z) {
            X0(bb, c3454tr2);
        }
        int iK3 = c3454tr2.e == -1 ? this.r.k() - P0(this.r.k()) : O0(this.r.g()) - this.r.g();
        return iK3 > 0 ? Math.min(c3454tr.b, iK3) : i15;
    }

    public final View I0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.r.e(viewU);
            int iB = this.r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View J0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = this.r.e(viewU);
            if (this.r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void K0(BB bb, GB gb, boolean z) {
        int iG;
        int iO0 = O0(Integer.MIN_VALUE);
        if (iO0 != Integer.MIN_VALUE && (iG = this.r.g() - iO0) > 0) {
            int i = iG - (-b1(-iG, bb, gb));
            if (!z || i <= 0) {
                return;
            }
            this.r.p(i);
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean L() {
        return this.C != 0;
    }

    public final void L0(BB bb, GB gb, boolean z) {
        int iK;
        int iP0 = P0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iP0 != Integer.MAX_VALUE && (iK = iP0 - this.r.k()) > 0) {
            int iB1 = iK - b1(iK, bb, gb);
            if (!z || iB1 <= 0) {
                return;
            }
            this.r.p(-iB1);
        }
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC3529vB.H(u(0));
    }

    public final int N0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return AbstractC3529vB.H(u(iV - 1));
    }

    @Override // defpackage.AbstractC3529vB
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            OG og = this.q[i2];
            int i3 = og.b;
            if (i3 != Integer.MIN_VALUE) {
                og.b = i3 + i;
            }
            int i4 = og.c;
            if (i4 != Integer.MIN_VALUE) {
                og.c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int iF = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iF2 = this.q[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // defpackage.AbstractC3529vB
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            OG og = this.q[i2];
            int i3 = og.b;
            if (i3 != Integer.MIN_VALUE) {
                og.b = i3 + i;
            }
            int i4 = og.c;
            if (i4 != Integer.MIN_VALUE) {
                og.c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // defpackage.AbstractC3529vB
    public final void Q() {
        this.B.e();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L9
            int r0 = r7.N0()
            goto Ld
        L9:
            int r0 = r7.M0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            om r4 = r7.B
            r4.D(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.H(r8, r5)
            r4.G(r9, r5)
            goto L3a
        L33:
            r4.H(r8, r9)
            goto L3a
        L37:
            r4.G(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.x
            if (r8 == 0) goto L46
            int r8 = r7.M0()
            goto L4a
        L46:
            int r8 = r7.N0()
        L4a:
            if (r3 > r8) goto L4f
            r7.n0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View R0() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0():android.view.View");
    }

    @Override // defpackage.AbstractC3529vB
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0() {
        return C() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    @Override // defpackage.AbstractC3529vB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r9, int r10, defpackage.BB r11, defpackage.GB r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, BB, GB):android.view.View");
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        LG lg = (LG) view.getLayoutParams();
        int iF1 = f1(i, ((ViewGroup.MarginLayoutParams) lg).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) lg).rightMargin + rect.right);
        int iF12 = f1(i2, ((ViewGroup.MarginLayoutParams) lg).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) lg).bottomMargin + rect.bottom);
        if (w0(view, iF1, iF12, lg)) {
            view.measure(iF1, iF12);
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewJ0 = J0(false);
            View viewI0 = I0(false);
            if (viewJ0 == null || viewI0 == null) {
                return;
            }
            int iH = AbstractC3529vB.H(viewJ0);
            int iH2 = AbstractC3529vB.H(viewI0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(defpackage.BB r17, defpackage.GB r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0(BB, GB, boolean):void");
    }

    public final boolean V0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == S0();
    }

    public final void W0(int i, GB gb) {
        int iM0;
        int i2;
        if (i > 0) {
            iM0 = N0();
            i2 = 1;
        } else {
            iM0 = M0();
            i2 = -1;
        }
        C3454tr c3454tr = this.v;
        c3454tr.a = true;
        d1(iM0, gb);
        c1(i2);
        c3454tr.c = iM0 + c3454tr.d;
        c3454tr.b = Math.abs(i);
    }

    @Override // defpackage.AbstractC3529vB
    public final void X(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void X0(BB bb, C3454tr c3454tr) {
        if (!c3454tr.a || c3454tr.i) {
            return;
        }
        if (c3454tr.b == 0) {
            if (c3454tr.e == -1) {
                Y0(bb, c3454tr.g);
                return;
            } else {
                Z0(bb, c3454tr.f);
                return;
            }
        }
        int i = 1;
        if (c3454tr.e == -1) {
            int i2 = c3454tr.f;
            int iH = this.q[0].h(i2);
            while (i < this.p) {
                int iH2 = this.q[i].h(i2);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i3 = i2 - iH;
            Y0(bb, i3 < 0 ? c3454tr.g : c3454tr.g - Math.min(i3, c3454tr.b));
            return;
        }
        int i4 = c3454tr.g;
        int iF = this.q[0].f(i4);
        while (i < this.p) {
            int iF2 = this.q[i].f(i4);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i5 = iF - c3454tr.g;
        Z0(bb, i5 < 0 ? c3454tr.f : Math.min(i5, c3454tr.b) + c3454tr.f);
    }

    @Override // defpackage.AbstractC3529vB
    public final void Y() {
        this.B.e();
        n0();
    }

    public final void Y0(BB bb, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.r.e(viewU) < i || this.r.o(viewU) < i) {
                return;
            }
            LG lg = (LG) viewU.getLayoutParams();
            lg.getClass();
            if (lg.e.a.size() == 1) {
                return;
            }
            OG og = lg.e;
            ArrayList arrayList = og.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            LG lg2 = (LG) view.getLayoutParams();
            lg2.e = null;
            if (lg2.a.j() || lg2.a.m()) {
                og.d -= og.f.r.c(view);
            }
            if (size == 1) {
                og.b = Integer.MIN_VALUE;
            }
            og.c = Integer.MIN_VALUE;
            k0(viewU, bb);
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final void Z(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final void Z0(BB bb, int i) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.r.b(viewU) > i || this.r.n(viewU) > i) {
                return;
            }
            LG lg = (LG) viewU.getLayoutParams();
            lg.getClass();
            if (lg.e.a.size() == 1) {
                return;
            }
            OG og = lg.e;
            ArrayList arrayList = og.a;
            View view = (View) arrayList.remove(0);
            LG lg2 = (LG) view.getLayoutParams();
            lg2.e = null;
            if (arrayList.size() == 0) {
                og.c = Integer.MIN_VALUE;
            }
            if (lg2.a.j() || lg2.a.m()) {
                og.d -= og.f.r.c(view);
            }
            og.b = Integer.MIN_VALUE;
            k0(viewU, bb);
        }
    }

    @Override // defpackage.FB
    public final PointF a(int i) {
        int iC0 = C0(i);
        PointF pointF = new PointF();
        if (iC0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = iC0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iC0;
        }
        return pointF;
    }

    @Override // defpackage.AbstractC3529vB
    public final void a0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final void a1() {
        this.x = (this.t == 1 || !S0()) ? this.w : !this.w;
    }

    @Override // defpackage.AbstractC3529vB
    public final void b0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final int b1(int i, BB bb, GB gb) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, gb);
        C3454tr c3454tr = this.v;
        int iH0 = H0(bb, c3454tr, gb);
        if (c3454tr.b >= iH0) {
            i = i < 0 ? -iH0 : iH0;
        }
        this.r.p(-i);
        this.D = this.x;
        c3454tr.b = 0;
        X0(bb, c3454tr);
        return i;
    }

    @Override // defpackage.AbstractC3529vB
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final void c0(BB bb, GB gb) {
        U0(bb, gb, true);
    }

    public final void c1(int i) {
        C3454tr c3454tr = this.v;
        c3454tr.e = i;
        c3454tr.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.AbstractC3529vB
    public final void d0(GB gb) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void d1(int i, GB gb) {
        int iL;
        int iL2;
        int i2;
        C3454tr c3454tr = this.v;
        boolean z = false;
        c3454tr.b = 0;
        c3454tr.c = i;
        C2801hs c2801hs = this.e;
        if (!(c2801hs != null && c2801hs.e) || (i2 = gb.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iL = this.r.l();
                iL2 = 0;
            } else {
                iL2 = this.r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.m) {
            c3454tr.g = this.r.f() + iL;
            c3454tr.f = -iL2;
        } else {
            c3454tr.f = this.r.k() - iL2;
            c3454tr.g = this.r.g() + iL;
        }
        c3454tr.h = false;
        c3454tr.a = true;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z = true;
        }
        c3454tr.i = z;
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.AbstractC3529vB
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof NG) {
            NG ng = (NG) parcelable;
            this.F = ng;
            if (this.z != -1) {
                ng.d = null;
                ng.c = 0;
                ng.a = -1;
                ng.b = -1;
                ng.d = null;
                ng.c = 0;
                ng.e = 0;
                ng.f = null;
                ng.m = null;
            }
            n0();
        }
    }

    public final void e1(OG og, int i, int i2) {
        int i3 = og.d;
        int i4 = og.e;
        if (i == -1) {
            int i5 = og.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) og.a.get(0);
                LG lg = (LG) view.getLayoutParams();
                og.b = og.f.r.e(view);
                lg.getClass();
                i5 = og.b;
            }
            if (i5 + i3 > i2) {
                return;
            }
        } else {
            int i6 = og.c;
            if (i6 == Integer.MIN_VALUE) {
                og.a();
                i6 = og.c;
            }
            if (i6 - i3 < i2) {
                return;
            }
        }
        this.y.set(i4, false);
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean f(C3583wB c3583wB) {
        return c3583wB instanceof LG;
    }

    @Override // defpackage.AbstractC3529vB
    public final Parcelable f0() {
        int iH;
        int iK;
        int[] iArr;
        NG ng = this.F;
        if (ng != null) {
            NG ng2 = new NG();
            ng2.c = ng.c;
            ng2.a = ng.a;
            ng2.b = ng.b;
            ng2.d = ng.d;
            ng2.e = ng.e;
            ng2.f = ng.f;
            ng2.n = ng.n;
            ng2.o = ng.o;
            ng2.p = ng.p;
            ng2.m = ng.m;
            return ng2;
        }
        NG ng3 = new NG();
        ng3.n = this.w;
        ng3.o = this.D;
        ng3.p = this.E;
        C3178om c3178om = this.B;
        if (c3178om == null || (iArr = (int[]) c3178om.b) == null) {
            ng3.e = 0;
        } else {
            ng3.f = iArr;
            ng3.e = iArr.length;
            ng3.m = (List) c3178om.c;
        }
        if (v() > 0) {
            ng3.a = this.D ? N0() : M0();
            View viewI0 = this.x ? I0(true) : J0(true);
            ng3.b = viewI0 != null ? AbstractC3529vB.H(viewI0) : -1;
            int i = this.p;
            ng3.c = i;
            ng3.d = new int[i];
            for (int i2 = 0; i2 < this.p; i2++) {
                if (this.D) {
                    iH = this.q[i2].f(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.r.g();
                        iH -= iK;
                    }
                } else {
                    iH = this.q[i2].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.r.k();
                        iH -= iK;
                    }
                }
                ng3.d[i2] = iH;
            }
        } else {
            ng3.a = -1;
            ng3.b = -1;
            ng3.c = 0;
        }
        return ng3;
    }

    @Override // defpackage.AbstractC3529vB
    public final void g0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final void h(int i, int i2, GB gb, C0463a7 c0463a7) {
        C3454tr c3454tr;
        int iF;
        int iH;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, gb);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            c3454tr = this.v;
            if (i3 >= i5) {
                break;
            }
            if (c3454tr.d == -1) {
                iF = c3454tr.f;
                iH = this.q[i3].h(iF);
            } else {
                iF = this.q[i3].f(c3454tr.g);
                iH = c3454tr.g;
            }
            int i6 = iF - iH;
            if (i6 >= 0) {
                this.J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c3454tr.c;
            if (i8 < 0 || i8 >= gb.b()) {
                return;
            }
            c0463a7.a(c3454tr.c, this.J[i7]);
            c3454tr.c += c3454tr.d;
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final int j(GB gb) {
        return E0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final int k(GB gb) {
        return F0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final int l(GB gb) {
        return G0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final int m(GB gb) {
        return E0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final int n(GB gb) {
        return F0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final int o(GB gb) {
        return G0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final int o0(int i, BB bb, GB gb) {
        return b1(i, bb, gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final void p0(int i) {
        NG ng = this.F;
        if (ng != null && ng.a != i) {
            ng.d = null;
            ng.c = 0;
            ng.a = -1;
            ng.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        n0();
    }

    @Override // defpackage.AbstractC3529vB
    public final int q0(int i, BB bb, GB gb) {
        return b1(i, bb, gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final C3583wB r() {
        return this.t == 0 ? new LG(-2, -1) : new LG(-1, -2);
    }

    @Override // defpackage.AbstractC3529vB
    public final C3583wB s(Context context, AttributeSet attributeSet) {
        return new LG(context, attributeSet);
    }

    @Override // defpackage.AbstractC3529vB
    public final C3583wB t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LG((ViewGroup.MarginLayoutParams) layoutParams) : new LG(layoutParams);
    }

    @Override // defpackage.AbstractC3529vB
    public final void t0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        int i3 = this.p;
        int iF = F() + E();
        int iD = D() + G();
        if (this.t == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = UL.a;
            iG2 = AbstractC3529vB.g(i2, iHeight, recyclerView.getMinimumHeight());
            iG = AbstractC3529vB.g(i, (this.u * i3) + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = UL.a;
            iG = AbstractC3529vB.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = AbstractC3529vB.g(i2, (this.u * i3) + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.AbstractC3529vB
    public final void z0(RecyclerView recyclerView, int i) {
        C2801hs c2801hs = new C2801hs(recyclerView.getContext());
        c2801hs.a = i;
        A0(c2801hs);
    }
}

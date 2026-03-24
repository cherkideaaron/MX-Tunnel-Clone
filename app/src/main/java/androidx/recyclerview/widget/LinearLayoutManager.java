package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.AbstractC0492ai;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3529vB;
import defpackage.BB;
import defpackage.C0463a7;
import defpackage.C2581ds;
import defpackage.C2636es;
import defpackage.C2691fs;
import defpackage.C2746gs;
import defpackage.C2801hs;
import defpackage.C3475uB;
import defpackage.C3583wB;
import defpackage.FB;
import defpackage.GB;
import defpackage.Vs;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC3529vB implements FB {
    public final C2581ds A;
    public final C2636es B;
    public final int C;
    public final int[] D;
    public int p;
    public C2691fs q;
    public AbstractC0492ai r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public C2746gs z;

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new C2581ds();
        this.B = new C2636es();
        this.C = 2;
        this.D = new int[2];
        b1(i);
        c(null);
        if (this.t) {
            this.t = false;
            n0();
        }
    }

    @Override // defpackage.AbstractC3529vB
    public boolean B0() {
        return this.z == null && this.s == this.v;
    }

    public void C0(GB gb, int[] iArr) {
        int i;
        int iL = gb.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void D0(GB gb, C2691fs c2691fs, C0463a7 c0463a7) {
        int i = c2691fs.d;
        if (i < 0 || i >= gb.b()) {
            return;
        }
        c0463a7.a(i, Math.max(0, c2691fs.g));
    }

    public final int E0(GB gb) {
        if (v() == 0) {
            return 0;
        }
        I0();
        AbstractC0492ai abstractC0492ai = this.r;
        boolean z = !this.w;
        return AbstractC0500aq.p(gb, abstractC0492ai, L0(z), K0(z), this, this.w);
    }

    public final int F0(GB gb) {
        if (v() == 0) {
            return 0;
        }
        I0();
        AbstractC0492ai abstractC0492ai = this.r;
        boolean z = !this.w;
        return AbstractC0500aq.q(gb, abstractC0492ai, L0(z), K0(z), this, this.w, this.u);
    }

    public final int G0(GB gb) {
        if (v() == 0) {
            return 0;
        }
        I0();
        AbstractC0492ai abstractC0492ai = this.r;
        boolean z = !this.w;
        return AbstractC0500aq.r(gb, abstractC0492ai, L0(z), K0(z), this, this.w);
    }

    public final int H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && U0()) ? -1 : 1 : (this.p != 1 && U0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.q == null) {
            C2691fs c2691fs = new C2691fs();
            c2691fs.a = true;
            c2691fs.h = 0;
            c2691fs.i = 0;
            c2691fs.k = null;
            this.q = c2691fs;
        }
    }

    public final int J0(BB bb, C2691fs c2691fs, GB gb, boolean z) {
        int i;
        int i2 = c2691fs.c;
        int i3 = c2691fs.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c2691fs.g = i3 + i2;
            }
            X0(bb, c2691fs);
        }
        int i4 = c2691fs.c + c2691fs.h;
        while (true) {
            if ((!c2691fs.l && i4 <= 0) || (i = c2691fs.d) < 0 || i >= gb.b()) {
                break;
            }
            C2636es c2636es = this.B;
            c2636es.a = 0;
            c2636es.b = false;
            c2636es.c = false;
            c2636es.d = false;
            V0(bb, gb, c2691fs, c2636es);
            if (!c2636es.b) {
                int i5 = c2691fs.b;
                int i6 = c2636es.a;
                c2691fs.b = (c2691fs.f * i6) + i5;
                if (!c2636es.c || c2691fs.k != null || !gb.g) {
                    c2691fs.c -= i6;
                    i4 -= i6;
                }
                int i7 = c2691fs.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c2691fs.g = i8;
                    int i9 = c2691fs.c;
                    if (i9 < 0) {
                        c2691fs.g = i8 + i9;
                    }
                    X0(bb, c2691fs);
                }
                if (z && c2636es.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c2691fs.c;
    }

    public final View K0(boolean z) {
        int iV;
        int iV2;
        if (this.u) {
            iV = 0;
            iV2 = v();
        } else {
            iV = v() - 1;
            iV2 = -1;
        }
        return O0(iV, iV2, z);
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z) {
        int iV;
        int iV2;
        if (this.u) {
            iV = v() - 1;
            iV2 = -1;
        } else {
            iV = 0;
            iV2 = v();
        }
        return O0(iV, iV2, z);
    }

    public final int M0() {
        View viewO0 = O0(v() - 1, -1, false);
        if (viewO0 == null) {
            return -1;
        }
        return AbstractC3529vB.H(viewO0);
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        I0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.p == 0 ? this.c : this.d).v(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z) {
        I0();
        return (this.p == 0 ? this.c : this.d).v(i, i2, z ? 24579 : 320, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View P0(defpackage.BB r17, defpackage.GB r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.I0()
            int r1 = r16.v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            ai r7 = r0.r
            int r7 = r7.k()
            ai r8 = r0.r
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = defpackage.AbstractC3529vB.H(r12)
            ai r14 = r0.r
            int r14 = r14.e(r12)
            ai r15 = r0.r
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            wB r13 = (defpackage.C3583wB) r13
            JB r13 = r13.a
            boolean r13 = r13.j()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            goto L84
        L7f:
            if (r10 == 0) goto L83
            r9 = r10
            goto L84
        L83:
            r9 = r11
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.P0(BB, GB, boolean, boolean):android.view.View");
    }

    public final int Q0(int i, BB bb, GB gb, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -a1(-iG2, bb, gb);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.p(iG);
        return iG + i2;
    }

    public final int R0(int i, BB bb, GB gb, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -a1(iK2, bb, gb);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.p(-iK);
        return i2 - iK;
    }

    public final View S0() {
        return u(this.u ? 0 : v() - 1);
    }

    @Override // defpackage.AbstractC3529vB
    public View T(View view, int i, BB bb, GB gb) {
        int iH0;
        Z0();
        if (v() == 0 || (iH0 = H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        d1(iH0, (int) (this.r.l() * 0.33333334f), false, gb);
        C2691fs c2691fs = this.q;
        c2691fs.g = Integer.MIN_VALUE;
        c2691fs.a = false;
        J0(bb, c2691fs, gb, true);
        View viewN0 = iH0 == -1 ? this.u ? N0(v() - 1, -1) : N0(0, v()) : this.u ? N0(0, v()) : N0(v() - 1, -1);
        View viewT0 = iH0 == -1 ? T0() : S0();
        if (!viewT0.hasFocusable()) {
            return viewN0;
        }
        if (viewN0 == null) {
            return null;
        }
        return viewT0;
    }

    public final View T0() {
        return u(this.u ? v() - 1 : 0);
    }

    @Override // defpackage.AbstractC3529vB
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewO0 = O0(0, v(), false);
            accessibilityEvent.setFromIndex(viewO0 == null ? -1 : AbstractC3529vB.H(viewO0));
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final boolean U0() {
        return C() == 1;
    }

    public void V0(BB bb, GB gb, C2691fs c2691fs, C2636es c2636es) {
        int iE;
        int i;
        int i2;
        int iD;
        View viewB = c2691fs.b(bb);
        if (viewB == null) {
            c2636es.b = true;
            return;
        }
        C3583wB c3583wB = (C3583wB) viewB.getLayoutParams();
        if (c2691fs.k == null) {
            if (this.u == (c2691fs.f == -1)) {
                b(viewB, false, -1);
            } else {
                b(viewB, false, 0);
            }
        } else {
            if (this.u == (c2691fs.f == -1)) {
                b(viewB, true, -1);
            } else {
                b(viewB, true, 0);
            }
        }
        C3583wB c3583wB2 = (C3583wB) viewB.getLayoutParams();
        Rect rectJ = this.b.J(viewB);
        int i3 = rectJ.left + rectJ.right;
        int i4 = rectJ.top + rectJ.bottom;
        int iW = AbstractC3529vB.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) c3583wB2).leftMargin + ((ViewGroup.MarginLayoutParams) c3583wB2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c3583wB2).width);
        int iW2 = AbstractC3529vB.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) c3583wB2).topMargin + ((ViewGroup.MarginLayoutParams) c3583wB2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c3583wB2).height);
        if (w0(viewB, iW, iW2, c3583wB2)) {
            viewB.measure(iW, iW2);
        }
        c2636es.a = this.r.c(viewB);
        if (this.p == 1) {
            if (U0()) {
                iD = this.n - F();
                iE = iD - this.r.d(viewB);
            } else {
                iE = E();
                iD = this.r.d(viewB) + iE;
            }
            if (c2691fs.f == -1) {
                i = c2691fs.b;
                i2 = i - c2636es.a;
            } else {
                i2 = c2691fs.b;
                i = c2636es.a + i2;
            }
        } else {
            int iG = G();
            int iD2 = this.r.d(viewB) + iG;
            int i5 = c2691fs.f;
            int i6 = c2691fs.b;
            if (i5 == -1) {
                int i7 = i6 - c2636es.a;
                iD = i6;
                i = iD2;
                iE = i7;
                i2 = iG;
            } else {
                int i8 = c2636es.a + i6;
                iE = i6;
                i = iD2;
                i2 = iG;
                iD = i8;
            }
        }
        AbstractC3529vB.N(viewB, iE, i2, iD, i);
        if (c3583wB.a.j() || c3583wB.a.m()) {
            c2636es.c = true;
        }
        c2636es.d = viewB.hasFocusable();
    }

    public final void X0(BB bb, C2691fs c2691fs) {
        if (!c2691fs.a || c2691fs.l) {
            return;
        }
        int i = c2691fs.g;
        int i2 = c2691fs.i;
        if (c2691fs.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.e(viewU) < iF || this.r.o(viewU) < iF) {
                        Y0(bb, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.e(viewU2) < iF || this.r.o(viewU2) < iF) {
                    Y0(bb, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.b(viewU3) > i6 || this.r.n(viewU3) > i6) {
                    Y0(bb, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.b(viewU4) > i6 || this.r.n(viewU4) > i6) {
                Y0(bb, i8, i9);
                return;
            }
        }
    }

    public final void Y0(BB bb, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewU = u(i);
                l0(i);
                bb.g(viewU);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewU2 = u(i3);
            l0(i3);
            bb.g(viewU2);
        }
    }

    public final void Z0() {
        this.u = (this.p == 1 || !U0()) ? this.t : !this.t;
    }

    @Override // defpackage.FB
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC3529vB.H(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final int a1(int i, BB bb, GB gb) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        I0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        d1(i2, iAbs, true, gb);
        C2691fs c2691fs = this.q;
        int iJ0 = J0(bb, c2691fs, gb, false) + c2691fs.g;
        if (iJ0 < 0) {
            return 0;
        }
        if (iAbs > iJ0) {
            i = i2 * iJ0;
        }
        this.r.p(-i);
        this.q.j = i;
        return i;
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Vs.k(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.p || this.r == null) {
            AbstractC0492ai abstractC0492aiA = AbstractC0492ai.a(this, i);
            this.r = abstractC0492aiA;
            this.A.a = abstractC0492aiA;
            this.p = i;
            n0();
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
    @Override // defpackage.AbstractC3529vB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c0(defpackage.BB r18, defpackage.GB r19) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c0(BB, GB):void");
    }

    public void c1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        n0();
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean d() {
        return this.p == 0;
    }

    @Override // defpackage.AbstractC3529vB
    public void d0(GB gb) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void d1(int i, int i2, boolean z, GB gb) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(gb, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C2691fs c2691fs = this.q;
        int i3 = z2 ? iMax2 : iMax;
        c2691fs.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c2691fs.i = iMax;
        if (z2) {
            c2691fs.h = this.r.h() + i3;
            View viewS0 = S0();
            C2691fs c2691fs2 = this.q;
            c2691fs2.e = this.u ? -1 : 1;
            int iH = AbstractC3529vB.H(viewS0);
            C2691fs c2691fs3 = this.q;
            c2691fs2.d = iH + c2691fs3.e;
            c2691fs3.b = this.r.b(viewS0);
            iK = this.r.b(viewS0) - this.r.g();
        } else {
            View viewT0 = T0();
            C2691fs c2691fs4 = this.q;
            c2691fs4.h = this.r.k() + c2691fs4.h;
            C2691fs c2691fs5 = this.q;
            c2691fs5.e = this.u ? 1 : -1;
            int iH2 = AbstractC3529vB.H(viewT0);
            C2691fs c2691fs6 = this.q;
            c2691fs5.d = iH2 + c2691fs6.e;
            c2691fs6.b = this.r.e(viewT0);
            iK = (-this.r.e(viewT0)) + this.r.k();
        }
        C2691fs c2691fs7 = this.q;
        c2691fs7.c = i2;
        if (z) {
            c2691fs7.c = i2 - iK;
        }
        c2691fs7.g = iK;
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.AbstractC3529vB
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof C2746gs) {
            C2746gs c2746gs = (C2746gs) parcelable;
            this.z = c2746gs;
            if (this.x != -1) {
                c2746gs.a = -1;
            }
            n0();
        }
    }

    public final void e1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        C2691fs c2691fs = this.q;
        c2691fs.e = this.u ? -1 : 1;
        c2691fs.d = i;
        c2691fs.f = 1;
        c2691fs.b = i2;
        c2691fs.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.AbstractC3529vB
    public final Parcelable f0() {
        C2746gs c2746gs = this.z;
        if (c2746gs != null) {
            C2746gs c2746gs2 = new C2746gs();
            c2746gs2.a = c2746gs.a;
            c2746gs2.b = c2746gs.b;
            c2746gs2.c = c2746gs.c;
            return c2746gs2;
        }
        C2746gs c2746gs3 = new C2746gs();
        if (v() > 0) {
            I0();
            boolean z = this.s ^ this.u;
            c2746gs3.c = z;
            if (z) {
                View viewS0 = S0();
                c2746gs3.b = this.r.g() - this.r.b(viewS0);
                c2746gs3.a = AbstractC3529vB.H(viewS0);
            } else {
                View viewT0 = T0();
                c2746gs3.a = AbstractC3529vB.H(viewT0);
                c2746gs3.b = this.r.e(viewT0) - this.r.k();
            }
        } else {
            c2746gs3.a = -1;
        }
        return c2746gs3;
    }

    public final void f1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        C2691fs c2691fs = this.q;
        c2691fs.d = i;
        c2691fs.e = this.u ? 1 : -1;
        c2691fs.f = -1;
        c2691fs.b = i2;
        c2691fs.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.AbstractC3529vB
    public final void h(int i, int i2, GB gb, C0463a7 c0463a7) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, gb);
        D0(gb, this.q, c0463a7);
    }

    @Override // defpackage.AbstractC3529vB
    public final void i(int i, C0463a7 c0463a7) {
        boolean z;
        int i2;
        C2746gs c2746gs = this.z;
        if (c2746gs == null || (i2 = c2746gs.a) < 0) {
            Z0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c2746gs.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            c0463a7.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.AbstractC3529vB
    public final int j(GB gb) {
        return E0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public int k(GB gb) {
        return F0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public int l(GB gb) {
        return G0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final int m(GB gb) {
        return E0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public int n(GB gb) {
        return F0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public int o(GB gb) {
        return G0(gb);
    }

    @Override // defpackage.AbstractC3529vB
    public int o0(int i, BB bb, GB gb) {
        if (this.p == 1) {
            return 0;
        }
        return a1(i, bb, gb);
    }

    @Override // defpackage.AbstractC3529vB
    public final void p0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        C2746gs c2746gs = this.z;
        if (c2746gs != null) {
            c2746gs.a = -1;
        }
        n0();
    }

    @Override // defpackage.AbstractC3529vB
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i - AbstractC3529vB.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (AbstractC3529vB.H(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.AbstractC3529vB
    public int q0(int i, BB bb, GB gb) {
        if (this.p == 0) {
            return 0;
        }
        return a1(i, bb, gb);
    }

    @Override // defpackage.AbstractC3529vB
    public C3583wB r() {
        return new C3583wB(-2, -2);
    }

    @Override // defpackage.AbstractC3529vB
    public final boolean x0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i = 0; i < iV; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC3529vB
    public void z0(RecyclerView recyclerView, int i) {
        C2801hs c2801hs = new C2801hs(recyclerView.getContext());
        c2801hs.a = i;
        A0(c2801hs);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new C2581ds();
        this.B = new C2636es();
        this.C = 2;
        this.D = new int[2];
        C3475uB c3475uBI = AbstractC3529vB.I(context, attributeSet, i, i2);
        b1(c3475uBI.a);
        boolean z = c3475uBI.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            n0();
        }
        c1(c3475uBI.d);
    }

    @Override // defpackage.AbstractC3529vB
    public final void S(RecyclerView recyclerView) {
    }

    public void W0(BB bb, GB gb, C2581ds c2581ds, int i) {
    }
}

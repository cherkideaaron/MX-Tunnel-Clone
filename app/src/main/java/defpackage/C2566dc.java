package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2566dc {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final C0167Jb H;
    public final C0167Jb I;
    public final C0167Jb J;
    public final C0167Jb K;
    public final C0167Jb L;
    public final C0167Jb M;
    public final C0167Jb N;
    public final C0167Jb O;
    public final C0167Jb[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public C2566dc S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public Q8 b;
    public int b0;
    public Q8 c;
    public float c0;
    public float d0;
    public Object e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public boolean j;
    public final float[] j0;
    public boolean k;
    public final C2566dc[] k0;
    public boolean l;
    public final C2566dc[] l0;
    public boolean m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public int t;
    public int u;
    public float v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean a = false;
    public C0129Go d = null;
    public EL e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public C2566dc() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = 0;
        this.u = 0;
        this.v = 1.0f;
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = -1;
        this.A = 1.0f;
        this.B = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        C0167Jb c0167Jb = new C0167Jb(this, 2);
        this.H = c0167Jb;
        C0167Jb c0167Jb2 = new C0167Jb(this, 3);
        this.I = c0167Jb2;
        C0167Jb c0167Jb3 = new C0167Jb(this, 4);
        this.J = c0167Jb3;
        C0167Jb c0167Jb4 = new C0167Jb(this, 5);
        this.K = c0167Jb4;
        C0167Jb c0167Jb5 = new C0167Jb(this, 6);
        this.L = c0167Jb5;
        C0167Jb c0167Jb6 = new C0167Jb(this, 8);
        this.M = c0167Jb6;
        C0167Jb c0167Jb7 = new C0167Jb(this, 9);
        this.N = c0167Jb7;
        C0167Jb c0167Jb8 = new C0167Jb(this, 7);
        this.O = c0167Jb8;
        this.P = new C0167Jb[]{c0167Jb, c0167Jb3, c0167Jb2, c0167Jb4, c0167Jb5, c0167Jb8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new C2566dc[]{null, null};
        this.l0 = new C2566dc[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(c0167Jb);
        arrayList.add(c0167Jb2);
        arrayList.add(c0167Jb3);
        arrayList.add(c0167Jb4);
        arrayList.add(c0167Jb6);
        arrayList.add(c0167Jb7);
        arrayList.add(c0167Jb8);
        arrayList.add(c0167Jb5);
    }

    public final void A() {
        C2566dc c2566dc = this.S;
        if (c2566dc != null && (c2566dc instanceof C2620ec)) {
            ((C2620ec) c2566dc).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0167Jb) arrayList.get(i)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0167Jb c0167Jb = (C0167Jb) arrayList.get(i);
            c0167Jb.c = false;
            c0167Jb.b = 0;
        }
    }

    public void C(D3 d3) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i) {
        this.Z = i;
        this.D = i > 0;
    }

    public final void E(int i, int i2) {
        if (this.j) {
            return;
        }
        this.H.l(i);
        this.J.l(i2);
        this.X = i;
        this.T = i2 - i;
        this.j = true;
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.D) {
            this.L.l(i + this.Z);
        }
        this.k = true;
    }

    public final void G(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void H(int i) {
        this.o0[0] = i;
    }

    public final void I(int i) {
        this.o0[1] = i;
    }

    public final void J(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void K(boolean z, boolean z2) {
        int i;
        int i2;
        C0129Go c0129Go = this.d;
        boolean z3 = z & c0129Go.g;
        EL el = this.e;
        boolean z4 = z2 & el.g;
        int i3 = c0129Go.h.g;
        int i4 = el.h.g;
        int i5 = c0129Go.i.g;
        int i6 = el.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void L(C2855is c2855is, boolean z) {
        int i;
        int i2;
        EL el;
        C0129Go c0129Go;
        C0167Jb c0167Jb = this.H;
        c2855is.getClass();
        int iN = C2855is.n(c0167Jb);
        int iN2 = C2855is.n(this.I);
        int iN3 = C2855is.n(this.J);
        int iN4 = C2855is.n(this.K);
        if (z && (c0129Go = this.d) != null) {
            C0121Gg c0121Gg = c0129Go.h;
            if (c0121Gg.j) {
                C0121Gg c0121Gg2 = c0129Go.i;
                if (c0121Gg2.j) {
                    iN = c0121Gg.g;
                    iN3 = c0121Gg2.g;
                }
            }
        }
        if (z && (el = this.e) != null) {
            C0121Gg c0121Gg3 = el.h;
            if (c0121Gg3.j) {
                C0121Gg c0121Gg4 = el.i;
                if (c0121Gg4.j) {
                    iN2 = c0121Gg3.g;
                    iN4 = c0121Gg4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        }
        int i9 = this.u;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(this.T, i9);
        }
        int i10 = this.x;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(C2620ec c2620ec, C2855is c2855is, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC3296qu.i(c2620ec, c2855is, this);
            hashSet.remove(this);
            b(c2855is, c2620ec.R(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C0167Jb) it.next()).d.a(c2620ec, c2855is, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C0167Jb) it2.next()).d.a(c2620ec, c2855is, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C0167Jb) it3.next()).d.a(c2620ec, c2855is, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C0167Jb) it4.next()).d.a(c2620ec, c2855is, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C0167Jb) it5.next()).d.a(c2620ec, c2855is, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x070d  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.C2855is r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2566dc.b(is, boolean):void");
    }

    public boolean c() {
        return this.f0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.C2855is r31, boolean r32, boolean r33, boolean r34, boolean r35, defpackage.C3318rG r36, defpackage.C3318rG r37, int r38, boolean r39, defpackage.C0167Jb r40, defpackage.C0167Jb r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2566dc.d(is, boolean, boolean, boolean, boolean, rG, rG, int, boolean, Jb, Jb, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x015f A[PHI: r11 r13
      0x015f: PHI (r11v3 Jb) = (r11v2 Jb), (r11v5 Jb) binds: [B:84:0x018a, B:75:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r13v6 Jb) = (r13v5 Jb), (r13v8 Jb) binds: [B:84:0x018a, B:75:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r11, defpackage.C2566dc r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2566dc.e(int, dc, int, int):void");
    }

    public final void f(C0167Jb c0167Jb, C0167Jb c0167Jb2, int i) {
        if (c0167Jb.d == this) {
            e(c0167Jb.e, c0167Jb2.d, c0167Jb2.e, i);
        }
    }

    public final void g(C2855is c2855is) {
        c2855is.k(this.H);
        c2855is.k(this.I);
        c2855is.k(this.J);
        c2855is.k(this.K);
        if (this.Z > 0) {
            c2855is.k(this.L);
        }
    }

    public final void h() {
        if (this.d == null) {
            C0129Go c0129Go = new C0129Go(this);
            c0129Go.h.e = 4;
            c0129Go.i.e = 5;
            c0129Go.f = 0;
            this.d = c0129Go;
        }
        if (this.e == null) {
            EL el = new EL(this);
            C0121Gg c0121Gg = new C0121Gg(el);
            el.k = c0121Gg;
            el.l = null;
            el.h.e = 6;
            el.i.e = 7;
            c0121Gg.e = 8;
            el.f = 1;
            this.e = el;
        }
    }

    public C0167Jb i(int i) {
        switch (AbstractC3264qG.A(i)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(AbstractC3264qG.z(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.o0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final C2566dc l(int i) {
        C0167Jb c0167Jb;
        C0167Jb c0167Jb2;
        if (i != 0) {
            if (i == 1 && (c0167Jb2 = (c0167Jb = this.K).f) != null && c0167Jb2.f == c0167Jb) {
                return c0167Jb2.d;
            }
            return null;
        }
        C0167Jb c0167Jb3 = this.J;
        C0167Jb c0167Jb4 = c0167Jb3.f;
        if (c0167Jb4 == null || c0167Jb4.f != c0167Jb3) {
            return null;
        }
        return c0167Jb4.d;
    }

    public final C2566dc m(int i) {
        C0167Jb c0167Jb;
        C0167Jb c0167Jb2;
        if (i != 0) {
            if (i == 1 && (c0167Jb2 = (c0167Jb = this.I).f) != null && c0167Jb2.f == c0167Jb) {
                return c0167Jb2.d;
            }
            return null;
        }
        C0167Jb c0167Jb3 = this.H;
        C0167Jb c0167Jb4 = c0167Jb3.f;
        if (c0167Jb4 == null || c0167Jb4.f != c0167Jb3) {
            return null;
        }
        return c0167Jb4.d;
    }

    public final int n() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int o() {
        C2566dc c2566dc = this.S;
        return (c2566dc == null || !(c2566dc instanceof C2620ec)) ? this.X : ((C2620ec) c2566dc).w0 + this.X;
    }

    public final int p() {
        C2566dc c2566dc = this.S;
        return (c2566dc == null || !(c2566dc instanceof C2620ec)) ? this.Y : ((C2620ec) c2566dc).x0 + this.Y;
    }

    public final boolean q(int i) {
        if (i == 0) {
            return (this.H.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2;
        }
        return ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0)) + (this.L.f != null ? 1 : 0) < 2;
    }

    public final boolean r(int i, int i2) {
        C0167Jb c0167Jb;
        C0167Jb c0167Jb2;
        C0167Jb c0167Jb3;
        C0167Jb c0167Jb4;
        if (i == 0) {
            C0167Jb c0167Jb5 = this.H;
            C0167Jb c0167Jb6 = c0167Jb5.f;
            if (c0167Jb6 != null && c0167Jb6.c && (c0167Jb4 = (c0167Jb3 = this.J).f) != null && c0167Jb4.c) {
                return (c0167Jb4.d() - c0167Jb3.e()) - (c0167Jb5.e() + c0167Jb5.f.d()) >= i2;
            }
        } else {
            C0167Jb c0167Jb7 = this.I;
            C0167Jb c0167Jb8 = c0167Jb7.f;
            if (c0167Jb8 != null && c0167Jb8.c && (c0167Jb2 = (c0167Jb = this.K).f) != null && c0167Jb2.c) {
                return (c0167Jb2.d() - c0167Jb.e()) - (c0167Jb7.e() + c0167Jb7.f.d()) >= i2;
            }
        }
        return false;
    }

    public final void s(int i, int i2, int i3, int i4, C2566dc c2566dc) {
        i(i).b(c2566dc.i(i2), i3, i4, true);
    }

    public final boolean t(int i) {
        C0167Jb c0167Jb;
        C0167Jb c0167Jb2;
        int i2 = i * 2;
        C0167Jb[] c0167JbArr = this.P;
        C0167Jb c0167Jb3 = c0167JbArr[i2];
        C0167Jb c0167Jb4 = c0167Jb3.f;
        return (c0167Jb4 == null || c0167Jb4.f == c0167Jb3 || (c0167Jb2 = (c0167Jb = c0167JbArr[i2 + 1]).f) == null || c0167Jb2.f != c0167Jb) ? false : true;
    }

    public String toString() {
        StringBuilder sbN = AbstractC3264qG.n("");
        sbN.append(this.g0 != null ? AbstractC3264qG.l(new StringBuilder("id: "), this.g0, " ") : "");
        sbN.append("(");
        sbN.append(this.X);
        sbN.append(", ");
        sbN.append(this.Y);
        sbN.append(") - (");
        sbN.append(this.T);
        sbN.append(" x ");
        return AbstractC3264qG.j(sbN, this.U, ")");
    }

    public final boolean u() {
        C0167Jb c0167Jb = this.H;
        C0167Jb c0167Jb2 = c0167Jb.f;
        if (c0167Jb2 != null && c0167Jb2.f == c0167Jb) {
            return true;
        }
        C0167Jb c0167Jb3 = this.J;
        C0167Jb c0167Jb4 = c0167Jb3.f;
        return c0167Jb4 != null && c0167Jb4.f == c0167Jb3;
    }

    public final boolean v() {
        C0167Jb c0167Jb = this.I;
        C0167Jb c0167Jb2 = c0167Jb.f;
        if (c0167Jb2 != null && c0167Jb2.f == c0167Jb) {
            return true;
        }
        C0167Jb c0167Jb3 = this.K;
        C0167Jb c0167Jb4 = c0167Jb3.f;
        return c0167Jb4 != null && c0167Jb4.f == c0167Jb3;
    }

    public final boolean w() {
        return this.g && this.f0 != 8;
    }

    public boolean x() {
        return this.j || (this.H.c && this.J.c);
    }

    public boolean y() {
        return this.k || (this.I.c && this.K.c);
    }

    public void z() {
        this.H.j();
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.S = null;
        this.C = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.n = -1;
        this.o = -1;
        int[] iArr2 = this.B;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.q = 0;
        this.r = 0;
        this.v = 1.0f;
        this.y = 1.0f;
        this.u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.x = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.t = 0;
        this.w = 0;
        this.z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.s;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }
}

package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2620ec extends C2566dc {
    public P8[] A0;
    public P8[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final C3417t7 K0;
    public ArrayList p0 = new ArrayList();
    public final D3 q0 = new D3(this);
    public final C0104Fg r0;
    public int s0;
    public C0286Qb t0;
    public boolean u0;
    public final C2855is v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public C2620ec() {
        C0104Fg c0104Fg = new C0104Fg();
        c0104Fg.b = true;
        c0104Fg.c = true;
        c0104Fg.e = new ArrayList();
        new ArrayList();
        c0104Fg.f = null;
        c0104Fg.g = new C3417t7();
        c0104Fg.h = new ArrayList();
        c0104Fg.a = this;
        c0104Fg.d = this;
        this.r0 = c0104Fg;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new C2855is();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new P8[4];
        this.B0 = new P8[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new C3417t7();
    }

    public static void Q(C2566dc c2566dc, C0286Qb c0286Qb, C3417t7 c3417t7) {
        int i;
        int i2;
        if (c0286Qb == null) {
            return;
        }
        if (c2566dc.f0 == 8 || (c2566dc instanceof C2905jo) || (c2566dc instanceof C0572c7)) {
            c3417t7.e = 0;
            c3417t7.f = 0;
            return;
        }
        int[] iArr = c2566dc.o0;
        c3417t7.a = iArr[0];
        c3417t7.b = iArr[1];
        c3417t7.c = c2566dc.n();
        c3417t7.d = c2566dc.k();
        c3417t7.i = false;
        c3417t7.j = 0;
        boolean z = c3417t7.a == 3;
        boolean z2 = c3417t7.b == 3;
        boolean z3 = z && c2566dc.V > 0.0f;
        boolean z4 = z2 && c2566dc.V > 0.0f;
        if (z && c2566dc.q(0) && c2566dc.q == 0 && !z3) {
            c3417t7.a = 2;
            if (z2 && c2566dc.r == 0) {
                c3417t7.a = 1;
            }
            z = false;
        }
        if (z2 && c2566dc.q(1) && c2566dc.r == 0 && !z4) {
            c3417t7.b = 2;
            if (z && c2566dc.q == 0) {
                c3417t7.b = 1;
            }
            z2 = false;
        }
        if (c2566dc.x()) {
            c3417t7.a = 1;
            z = false;
        }
        if (c2566dc.y()) {
            c3417t7.b = 1;
            z2 = false;
        }
        int[] iArr2 = c2566dc.s;
        if (z3) {
            if (iArr2[0] == 4) {
                c3417t7.a = 1;
            } else if (!z2) {
                if (c3417t7.b == 1) {
                    i2 = c3417t7.d;
                } else {
                    c3417t7.a = 2;
                    c0286Qb.b(c2566dc, c3417t7);
                    i2 = c3417t7.f;
                }
                c3417t7.a = 1;
                c3417t7.c = (int) (c2566dc.V * i2);
            }
        }
        if (z4) {
            if (iArr2[1] == 4) {
                c3417t7.b = 1;
            } else if (!z) {
                if (c3417t7.a == 1) {
                    i = c3417t7.c;
                } else {
                    c3417t7.b = 2;
                    c0286Qb.b(c2566dc, c3417t7);
                    i = c3417t7.e;
                }
                c3417t7.b = 1;
                c3417t7.d = c2566dc.W == -1 ? (int) (i / c2566dc.V) : (int) (c2566dc.V * i);
            }
        }
        c0286Qb.b(c2566dc, c3417t7);
        c2566dc.J(c3417t7.e);
        c2566dc.G(c3417t7.f);
        c2566dc.D = c3417t7.h;
        c2566dc.D(c3417t7.g);
        c3417t7.j = 0;
    }

    @Override // defpackage.C2566dc
    public final void C(D3 d3) {
        super.C(d3);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((C2566dc) this.p0.get(i)).C(d3);
        }
    }

    @Override // defpackage.C2566dc
    public final void K(boolean z, boolean z2) {
        super.K(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((C2566dc) this.p0.get(i)).K(z, z2);
        }
    }

    public final void M(C2566dc c2566dc, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            P8[] p8Arr = this.B0;
            if (i2 >= p8Arr.length) {
                this.B0 = (P8[]) Arrays.copyOf(p8Arr, p8Arr.length * 2);
            }
            P8[] p8Arr2 = this.B0;
            int i3 = this.y0;
            p8Arr2[i3] = new P8(c2566dc, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            P8[] p8Arr3 = this.A0;
            if (i4 >= p8Arr3.length) {
                this.A0 = (P8[]) Arrays.copyOf(p8Arr3, p8Arr3.length * 2);
            }
            P8[] p8Arr4 = this.A0;
            int i5 = this.z0;
            p8Arr4[i5] = new P8(c2566dc, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void N(C2855is c2855is) {
        boolean zR = R(64);
        b(c2855is, zR);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C2566dc c2566dc = (C2566dc) this.p0.get(i);
            boolean[] zArr = c2566dc.R;
            zArr[0] = false;
            zArr[1] = false;
            if (c2566dc instanceof C0572c7) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C2566dc c2566dc2 = (C2566dc) this.p0.get(i2);
                if (c2566dc2 instanceof C0572c7) {
                    C0572c7 c0572c7 = (C0572c7) c2566dc2;
                    for (int i3 = 0; i3 < c0572c7.q0; i3++) {
                        C2566dc c2566dc3 = c0572c7.p0[i3];
                        if (c0572c7.s0 || c2566dc3.c()) {
                            int i4 = c0572c7.r0;
                            if (i4 == 0 || i4 == 1) {
                                c2566dc3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c2566dc3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C2566dc c2566dc4 = (C2566dc) this.p0.get(i5);
            c2566dc4.getClass();
            boolean z2 = c2566dc4 instanceof C3122nl;
            if (z2 || (c2566dc4 instanceof C2905jo)) {
                if (z2) {
                    hashSet.add(c2566dc4);
                } else {
                    c2566dc4.b(c2855is, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3122nl c3122nl = (C3122nl) ((C2566dc) it.next());
                for (int i6 = 0; i6 < c3122nl.q0; i6++) {
                    if (hashSet.contains(c3122nl.p0[i6])) {
                        c3122nl.b(c2855is, zR);
                        hashSet.remove(c3122nl);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C2566dc) it2.next()).b(c2855is, zR);
                }
                hashSet.clear();
            }
        }
        if (C2855is.p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C2566dc c2566dc5 = (C2566dc) this.p0.get(i7);
                c2566dc5.getClass();
                if (!(c2566dc5 instanceof C3122nl) && !(c2566dc5 instanceof C2905jo)) {
                    hashSet2.add(c2566dc5);
                }
            }
            a(this, c2855is, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C2566dc c2566dc6 = (C2566dc) it3.next();
                AbstractC3296qu.i(this, c2855is, c2566dc6);
                c2566dc6.b(c2855is, zR);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C2566dc c2566dc7 = (C2566dc) this.p0.get(i8);
                if (c2566dc7 instanceof C2620ec) {
                    int[] iArr = c2566dc7.o0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c2566dc7.H(1);
                    }
                    if (i10 == 2) {
                        c2566dc7.I(1);
                    }
                    c2566dc7.b(c2855is, zR);
                    if (i9 == 2) {
                        c2566dc7.H(i9);
                    }
                    if (i10 == 2) {
                        c2566dc7.I(i10);
                    }
                } else {
                    AbstractC3296qu.i(this, c2855is, c2566dc7);
                    if (!(c2566dc7 instanceof C3122nl) && !(c2566dc7 instanceof C2905jo)) {
                        c2566dc7.b(c2855is, zR);
                    }
                }
            }
        }
        if (this.y0 > 0) {
            AbstractC0136He.b(this, c2855is, null, 0);
        }
        if (this.z0 > 0) {
            AbstractC0136He.b(this, c2855is, null, 1);
        }
    }

    public final boolean O(int i, boolean z) {
        boolean z2;
        C0325Sg c0325Sg;
        int iK;
        boolean z3 = true;
        boolean z4 = z & true;
        C0104Fg c0104Fg = this.r0;
        C2620ec c2620ec = c0104Fg.a;
        int iJ = c2620ec.j(0);
        int iJ2 = c2620ec.j(1);
        int iO = c2620ec.o();
        int iP = c2620ec.p();
        ArrayList arrayList = c0104Fg.e;
        if (z4 && (iJ == 2 || iJ2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ZM zm = (ZM) it.next();
                if (zm.f == i && !zm.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && iJ == 2) {
                    c2620ec.H(1);
                    c2620ec.J(c0104Fg.d(c2620ec, 0));
                    c0325Sg = c2620ec.d.e;
                    iK = c2620ec.n();
                    c0325Sg.d(iK);
                }
            } else if (z4 && iJ2 == 2) {
                c2620ec.I(1);
                c2620ec.G(c0104Fg.d(c2620ec, 1));
                c0325Sg = c2620ec.e.e;
                iK = c2620ec.k();
                c0325Sg.d(iK);
            }
        }
        int[] iArr = c2620ec.o0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iN = c2620ec.n() + iO;
                c2620ec.d.i.d(iN);
                c2620ec.d.e.d(iN - iO);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iK2 = c2620ec.k() + iP;
                c2620ec.e.i.d(iK2);
                c2620ec.e.e.d(iK2 - iP);
                z2 = true;
            }
            z2 = false;
        }
        c0104Fg.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ZM zm2 = (ZM) it2.next();
            if (zm2.f == i && (zm2.b != c2620ec || zm2.g)) {
                zm2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ZM zm3 = (ZM) it3.next();
            if (zm3.f == i && (z2 || zm3.b != c2620ec)) {
                if (!zm3.h.j || !zm3.i.j || (!(zm3 instanceof Q8) && !zm3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        c2620ec.H(iJ);
        c2620ec.I(iJ2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0666 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0809 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0815 A[LOOP:14: B:499:0x0813->B:500:0x0815, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 2299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2620ec.P():void");
    }

    public final boolean R(int i) {
        return (this.C0 & i) == i;
    }

    public final void S() {
        this.p0.clear();
        super.z();
    }

    @Override // defpackage.C2566dc
    public final void z() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        S();
    }
}

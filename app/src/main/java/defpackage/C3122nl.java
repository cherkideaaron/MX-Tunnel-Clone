package defpackage;

import java.util.ArrayList;

/* renamed from: nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3122nl extends AbstractC3775zo {
    public C3417t7 A0;
    public C0286Qb B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public C2566dc[] W0;
    public C2566dc[] X0;
    public int[] Y0;
    public C2566dc[] Z0;
    public int a1;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;

    @Override // defpackage.AbstractC3775zo
    public final void N() {
        for (int i = 0; i < this.q0; i++) {
            C2566dc c2566dc = this.p0[i];
            if (c2566dc != null) {
                c2566dc.E = true;
            }
        }
    }

    public final int O(C2566dc c2566dc, int i) {
        if (c2566dc == null) {
            return 0;
        }
        int[] iArr = c2566dc.o0;
        if (iArr[1] == 3) {
            int i2 = c2566dc.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c2566dc.y * i);
                if (i3 != c2566dc.k()) {
                    c2566dc.g = true;
                    R(iArr[0], c2566dc.n(), 1, i3, c2566dc);
                }
                return i3;
            }
            if (i2 == 1) {
                return c2566dc.k();
            }
            if (i2 == 3) {
                return (int) ((c2566dc.n() * c2566dc.V) + 0.5f);
            }
        }
        return c2566dc.k();
    }

    public final int P(C2566dc c2566dc, int i) {
        if (c2566dc == null) {
            return 0;
        }
        int[] iArr = c2566dc.o0;
        if (iArr[0] == 3) {
            int i2 = c2566dc.q;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c2566dc.v * i);
                if (i3 != c2566dc.n()) {
                    c2566dc.g = true;
                    R(1, i3, iArr[1], c2566dc.k(), c2566dc);
                }
                return i3;
            }
            if (i2 == 1) {
                return c2566dc.n();
            }
            if (i2 == 3) {
                return (int) ((c2566dc.k() * c2566dc.V) + 0.5f);
            }
        }
        return c2566dc.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3122nl.Q(int, int, int, int):void");
    }

    public final void R(int i, int i2, int i3, int i4, C2566dc c2566dc) {
        C0286Qb c0286Qb;
        C2566dc c2566dc2;
        while (true) {
            c0286Qb = this.B0;
            if (c0286Qb != null || (c2566dc2 = this.S) == null) {
                break;
            } else {
                this.B0 = ((C2620ec) c2566dc2).t0;
            }
        }
        C3417t7 c3417t7 = this.A0;
        c3417t7.a = i;
        c3417t7.b = i3;
        c3417t7.c = i2;
        c3417t7.d = i4;
        c0286Qb.b(c2566dc, c3417t7);
        c2566dc.J(c3417t7.e);
        c2566dc.G(c3417t7.f);
        c2566dc.D = c3417t7.h;
        c2566dc.D(c3417t7.g);
    }

    @Override // defpackage.C2566dc
    public final void b(C2855is c2855is, boolean z) {
        C2566dc c2566dc;
        float f;
        int i;
        super.b(c2855is, z);
        C2566dc c2566dc2 = this.S;
        boolean z2 = c2566dc2 != null && ((C2620ec) c2566dc2).u0;
        int i2 = this.S0;
        ArrayList arrayList = this.V0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C3012ll) arrayList.get(i3)).b(z2, i3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2 && this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i4 = 0; i4 < this.a1; i4++) {
                    this.Z0[i4].A();
                }
                int[] iArr = this.Y0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                float f2 = this.I0;
                C2566dc c2566dc3 = null;
                int i7 = 0;
                while (i7 < i5) {
                    if (z2) {
                        i = (i5 - i7) - 1;
                        f = 1.0f - this.I0;
                    } else {
                        f = f2;
                        i = i7;
                    }
                    C2566dc c2566dc4 = this.X0[i];
                    if (c2566dc4 != null && c2566dc4.f0 != 8) {
                        C0167Jb c0167Jb = c2566dc4.H;
                        if (i7 == 0) {
                            c2566dc4.f(c0167Jb, this.H, this.v0);
                            c2566dc4.h0 = this.C0;
                            c2566dc4.c0 = f;
                        }
                        if (i7 == i5 - 1) {
                            c2566dc4.f(c2566dc4.J, this.J, this.w0);
                        }
                        if (i7 > 0 && c2566dc3 != null) {
                            int i8 = this.O0;
                            C0167Jb c0167Jb2 = c2566dc3.J;
                            c2566dc4.f(c0167Jb, c0167Jb2, i8);
                            c2566dc3.f(c0167Jb2, c0167Jb, 0);
                        }
                        c2566dc3 = c2566dc4;
                    }
                    i7++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i6; i9++) {
                    C2566dc c2566dc5 = this.W0[i9];
                    if (c2566dc5 != null && c2566dc5.f0 != 8) {
                        C0167Jb c0167Jb3 = c2566dc5.I;
                        if (i9 == 0) {
                            c2566dc5.f(c0167Jb3, this.I, this.r0);
                            c2566dc5.i0 = this.D0;
                            c2566dc5.d0 = this.J0;
                        }
                        if (i9 == i6 - 1) {
                            c2566dc5.f(c2566dc5.K, this.K, this.s0);
                        }
                        if (i9 > 0 && c2566dc3 != null) {
                            int i10 = this.P0;
                            C0167Jb c0167Jb4 = c2566dc3.K;
                            c2566dc5.f(c0167Jb3, c0167Jb4, i10);
                            c2566dc3.f(c0167Jb4, c0167Jb3, 0);
                        }
                        c2566dc3 = c2566dc5;
                    }
                }
                for (int i11 = 0; i11 < i5; i11++) {
                    for (int i12 = 0; i12 < i6; i12++) {
                        int i13 = (i12 * i5) + i11;
                        if (this.U0 == 1) {
                            i13 = (i11 * i6) + i12;
                        }
                        C2566dc[] c2566dcArr = this.Z0;
                        if (i13 < c2566dcArr.length && (c2566dc = c2566dcArr[i13]) != null && c2566dc.f0 != 8) {
                            C2566dc c2566dc6 = this.X0[i11];
                            C2566dc c2566dc7 = this.W0[i12];
                            if (c2566dc != c2566dc6) {
                                c2566dc.f(c2566dc.H, c2566dc6.H, 0);
                                c2566dc.f(c2566dc.J, c2566dc6.J, 0);
                            }
                            if (c2566dc != c2566dc7) {
                                c2566dc.f(c2566dc.I, c2566dc7.I, 0);
                                c2566dc.f(c2566dc.K, c2566dc7.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C3012ll) arrayList.get(0)).b(z2, 0, true);
        }
        this.x0 = false;
    }
}

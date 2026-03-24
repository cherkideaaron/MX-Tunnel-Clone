package defpackage;

/* renamed from: c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572c7 extends AbstractC3775zo {
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final boolean O() {
        int i;
        C0167Jb c0167JbI;
        C0167Jb c0167JbI2;
        C0167Jb c0167JbI3;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            C2566dc c2566dc = this.p0[i4];
            if ((this.s0 || c2566dc.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !c2566dc.x()) || (((i3 = this.r0) == 2 || i3 == 3) && !c2566dc.y()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.q0; i5++) {
            C2566dc c2566dc2 = this.p0[i5];
            if (this.s0 || c2566dc2.c()) {
                if (!z2) {
                    int i6 = this.r0;
                    if (i6 == 0) {
                        c0167JbI3 = c2566dc2.i(2);
                    } else if (i6 == 1) {
                        c0167JbI3 = c2566dc2.i(4);
                    } else if (i6 == 2) {
                        c0167JbI3 = c2566dc2.i(3);
                    } else {
                        if (i6 == 3) {
                            c0167JbI3 = c2566dc2.i(5);
                        }
                        z2 = true;
                    }
                    iMax = c0167JbI3.d();
                    z2 = true;
                }
                int i7 = this.r0;
                if (i7 == 0) {
                    c0167JbI2 = c2566dc2.i(2);
                } else {
                    if (i7 == 1) {
                        c0167JbI = c2566dc2.i(4);
                    } else if (i7 == 2) {
                        c0167JbI2 = c2566dc2.i(3);
                    } else if (i7 == 3) {
                        c0167JbI = c2566dc2.i(5);
                    }
                    iMax = Math.max(iMax, c0167JbI.d());
                }
                iMax = Math.min(iMax, c0167JbI2.d());
            }
        }
        int i8 = iMax + this.t0;
        int i9 = this.r0;
        if (i9 == 0 || i9 == 1) {
            E(i8, i8);
        } else {
            F(i8, i8);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.C2566dc
    public final void b(C2855is c2855is, boolean z) {
        boolean z2;
        C3318rG c3318rG;
        C0167Jb c0167Jb;
        int i;
        int i2;
        C3318rG c3318rG2;
        int i3;
        C0167Jb[] c0167JbArr = this.P;
        C0167Jb c0167Jb2 = this.H;
        c0167JbArr[0] = c0167Jb2;
        C0167Jb c0167Jb3 = this.I;
        int i4 = 2;
        c0167JbArr[2] = c0167Jb3;
        C0167Jb c0167Jb4 = this.J;
        c0167JbArr[1] = c0167Jb4;
        C0167Jb c0167Jb5 = this.K;
        c0167JbArr[3] = c0167Jb5;
        for (C0167Jb c0167Jb6 : c0167JbArr) {
            c0167Jb6.i = c2855is.k(c0167Jb6);
        }
        int i5 = this.r0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C0167Jb c0167Jb7 = c0167JbArr[i5];
        if (!this.u0) {
            O();
        }
        if (this.u0) {
            this.u0 = false;
            int i6 = this.r0;
            if (i6 == 0 || i6 == 1) {
                c2855is.d(c0167Jb2.i, this.X);
                c3318rG2 = c0167Jb4.i;
                i3 = this.X;
            } else {
                if (i6 != 2 && i6 != 3) {
                    return;
                }
                c2855is.d(c0167Jb3.i, this.Y);
                c3318rG2 = c0167Jb5.i;
                i3 = this.Y;
            }
            c2855is.d(c3318rG2, i3);
            return;
        }
        for (int i7 = 0; i7 < this.q0; i7++) {
            C2566dc c2566dc = this.p0[i7];
            if ((this.s0 || c2566dc.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && c2566dc.o0[0] == 3 && c2566dc.H.f != null && c2566dc.J.f != null) || ((i2 == 2 || i2 == 3) && c2566dc.o0[1] == 3 && c2566dc.I.f != null && c2566dc.K.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = c0167Jb2.g() || c0167Jb4.g();
        boolean z4 = c0167Jb3.g() || c0167Jb5.g();
        int i8 = (z2 || !(((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.q0) {
            C2566dc c2566dc2 = this.p0[i9];
            if (this.s0 || c2566dc2.c()) {
                C3318rG c3318rGK = c2855is.k(c2566dc2.P[this.r0]);
                int i10 = this.r0;
                C0167Jb c0167Jb8 = c2566dc2.P[i10];
                c0167Jb8.i = c3318rGK;
                C0167Jb c0167Jb9 = c0167Jb8.f;
                int i11 = (c0167Jb9 == null || c0167Jb9.d != this) ? 0 : c0167Jb8.g;
                if (i10 == 0 || i10 == i4) {
                    C3318rG c3318rG3 = c0167Jb7.i;
                    int i12 = this.t0 - i11;
                    C0515b4 c0515b4L = c2855is.l();
                    C3318rG c3318rGM = c2855is.m();
                    c3318rGM.d = 0;
                    c0515b4L.c(c3318rG3, c3318rGK, c3318rGM, i12);
                    c2855is.c(c0515b4L);
                } else {
                    C3318rG c3318rG4 = c0167Jb7.i;
                    int i13 = this.t0 + i11;
                    C0515b4 c0515b4L2 = c2855is.l();
                    C3318rG c3318rGM2 = c2855is.m();
                    c3318rGM2.d = 0;
                    c0515b4L2.b(c3318rG4, c3318rGK, c3318rGM2, i13);
                    c2855is.c(c0515b4L2);
                }
                c2855is.e(c0167Jb7.i, c3318rGK, this.t0 + i11, i8);
            }
            i9++;
            i4 = 2;
        }
        int i14 = this.r0;
        if (i14 == 0) {
            c2855is.e(c0167Jb4.i, c0167Jb2.i, 0, 8);
            c2855is.e(c0167Jb2.i, this.S.J.i, 0, 4);
            c3318rG = c0167Jb2.i;
            c0167Jb = this.S.H;
        } else if (i14 == 1) {
            c2855is.e(c0167Jb2.i, c0167Jb4.i, 0, 8);
            c2855is.e(c0167Jb2.i, this.S.H.i, 0, 4);
            c3318rG = c0167Jb2.i;
            c0167Jb = this.S.J;
        } else if (i14 == 2) {
            c2855is.e(c0167Jb5.i, c0167Jb3.i, 0, 8);
            c2855is.e(c0167Jb3.i, this.S.K.i, 0, 4);
            c3318rG = c0167Jb3.i;
            c0167Jb = this.S.I;
        } else {
            if (i14 != 3) {
                return;
            }
            c2855is.e(c0167Jb3.i, c0167Jb5.i, 0, 8);
            c2855is.e(c0167Jb3.i, this.S.I.i, 0, 4);
            c3318rG = c0167Jb3.i;
            c0167Jb = this.S.K;
        }
        c2855is.e(c3318rG, c0167Jb.i, 0, 0);
    }

    @Override // defpackage.C2566dc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.C2566dc
    public final String toString() {
        String strL = AbstractC3264qG.l(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            C2566dc c2566dc = this.p0[i];
            if (i > 0) {
                strL = AbstractC3264qG.g(strL, ", ");
            }
            StringBuilder sbN = AbstractC3264qG.n(strL);
            sbN.append(c2566dc.g0);
            strL = sbN.toString();
        }
        return AbstractC3264qG.g(strL, "}");
    }

    @Override // defpackage.C2566dc
    public final boolean x() {
        return this.u0;
    }

    @Override // defpackage.C2566dc
    public final boolean y() {
        return this.u0;
    }
}

package defpackage;

/* renamed from: ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3012ll {
    public int a;
    public C0167Jb d;
    public C0167Jb e;
    public C0167Jb f;
    public C0167Jb g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ C3122nl r;
    public C2566dc b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public C3012ll(C3122nl c3122nl, int i, C0167Jb c0167Jb, C0167Jb c0167Jb2, C0167Jb c0167Jb3, C0167Jb c0167Jb4, int i2) {
        this.r = c3122nl;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.q = 0;
        this.a = i;
        this.d = c0167Jb;
        this.e = c0167Jb2;
        this.f = c0167Jb3;
        this.g = c0167Jb4;
        this.h = c3122nl.v0;
        this.i = c3122nl.r0;
        this.j = c3122nl.w0;
        this.k = c3122nl.s0;
        this.q = i2;
    }

    public final void a(C2566dc c2566dc) {
        int i = this.a;
        C3122nl c3122nl = this.r;
        if (i == 0) {
            int iP = c3122nl.P(c2566dc, this.q);
            if (c2566dc.o0[0] == 3) {
                this.p++;
                iP = 0;
            }
            this.l = iP + (c2566dc.f0 != 8 ? c3122nl.O0 : 0) + this.l;
            int iO = c3122nl.O(c2566dc, this.q);
            if (this.b == null || this.c < iO) {
                this.b = c2566dc;
                this.c = iO;
                this.m = iO;
            }
        } else {
            int iP2 = c3122nl.P(c2566dc, this.q);
            int iO2 = c3122nl.O(c2566dc, this.q);
            if (c2566dc.o0[1] == 3) {
                this.p++;
                iO2 = 0;
            }
            this.m = iO2 + (c2566dc.f0 != 8 ? c3122nl.P0 : 0) + this.m;
            if (this.b == null || this.c < iP2) {
                this.b = c2566dc;
                this.c = iP2;
                this.l = iP2;
            }
        }
        this.o++;
    }

    public final void b(boolean z, int i, boolean z2) {
        C3122nl c3122nl;
        int i2;
        int i3;
        int i4;
        C2566dc c2566dc;
        char c;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            c3122nl = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= c3122nl.a1) {
                break;
            }
            C2566dc c2566dc2 = c3122nl.Z0[i8];
            if (c2566dc2 != null) {
                c2566dc2.A();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= c3122nl.a1) {
                break;
            }
            if (c3122nl.Z0[i14].f0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.a != 0) {
            C2566dc c2566dc3 = this.b;
            c2566dc3.h0 = c3122nl.C0;
            int i15 = this.h;
            if (i > 0) {
                i15 += c3122nl.O0;
            }
            C0167Jb c0167Jb = c2566dc3.H;
            C0167Jb c0167Jb2 = c2566dc3.J;
            if (z) {
                c0167Jb2.a(this.f, i15);
                if (z2) {
                    c0167Jb.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.H.a(c0167Jb2, 0);
                }
            } else {
                c0167Jb.a(this.d, i15);
                if (z2) {
                    c0167Jb2.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.J.a(c0167Jb, 0);
                }
            }
            int i16 = 0;
            C2566dc c2566dc4 = null;
            while (i16 < i9) {
                int i17 = this.n + i16;
                if (i17 >= c3122nl.a1) {
                    return;
                }
                C2566dc c2566dc5 = c3122nl.Z0[i17];
                if (i16 == 0) {
                    c2566dc5.f(c2566dc5.I, this.e, this.i);
                    int i18 = c3122nl.D0;
                    float f = c3122nl.J0;
                    if (this.n == 0) {
                        int i19 = c3122nl.F0;
                        i4 = -1;
                        if (i19 != -1) {
                            f = c3122nl.L0;
                        }
                        i18 = i19;
                        c2566dc5.i0 = i18;
                        c2566dc5.d0 = f;
                    } else {
                        i4 = -1;
                    }
                    if (z2 && (i19 = c3122nl.H0) != i4) {
                        f = c3122nl.N0;
                        i18 = i19;
                    }
                    c2566dc5.i0 = i18;
                    c2566dc5.d0 = f;
                }
                if (i16 == i9 - 1) {
                    c2566dc5.f(c2566dc5.K, this.g, this.k);
                }
                if (c2566dc4 != null) {
                    C0167Jb c0167Jb3 = c2566dc5.I;
                    int i20 = c3122nl.P0;
                    C0167Jb c0167Jb4 = c2566dc4.K;
                    c0167Jb3.a(c0167Jb4, i20);
                    C0167Jb c0167Jb5 = c2566dc5.I;
                    if (i16 == i11) {
                        int i21 = this.i;
                        if (c0167Jb5.h()) {
                            c0167Jb5.h = i21;
                        }
                    }
                    c0167Jb4.a(c0167Jb5, 0);
                    if (i16 == i12 + 1) {
                        int i22 = this.k;
                        if (c0167Jb4.h()) {
                            c0167Jb4.h = i22;
                        }
                    }
                }
                if (c2566dc5 != c2566dc3) {
                    if (z) {
                        int i23 = c3122nl.Q0;
                        if (i23 == 0) {
                            i3 = 0;
                        } else if (i23 == 1) {
                            c2566dc5.H.a(c0167Jb, 0);
                        } else if (i23 == 2) {
                            i3 = 0;
                            c2566dc5.H.a(c0167Jb, 0);
                        }
                        c2566dc5.J.a(c0167Jb2, i3);
                    } else {
                        int i24 = c3122nl.Q0;
                        if (i24 != 0) {
                            if (i24 == 1) {
                                i2 = 0;
                            } else if (i24 == 2) {
                                C0167Jb c0167Jb6 = c2566dc5.H;
                                if (z3) {
                                    c0167Jb6.a(this.d, this.h);
                                    c2566dc5.J.a(this.f, this.j);
                                } else {
                                    i2 = 0;
                                    c0167Jb6.a(c0167Jb, 0);
                                }
                            }
                            c2566dc5.J.a(c0167Jb2, i2);
                        } else {
                            c2566dc5.H.a(c0167Jb, 0);
                        }
                    }
                }
                i16++;
                c2566dc4 = c2566dc5;
            }
            return;
        }
        C2566dc c2566dc6 = this.b;
        c2566dc6.i0 = c3122nl.D0;
        int i25 = this.i;
        if (i > 0) {
            i25 += c3122nl.P0;
        }
        C0167Jb c0167Jb7 = this.e;
        C0167Jb c0167Jb8 = c2566dc6.I;
        c0167Jb8.a(c0167Jb7, i25);
        C0167Jb c0167Jb9 = c2566dc6.K;
        if (z2) {
            c0167Jb9.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.d.K.a(c0167Jb8, 0);
        }
        if (c3122nl.R0 != 3 || c2566dc6.D) {
            c2566dc = c2566dc6;
        } else {
            for (int i26 = 0; i26 < i9; i26++) {
                int i27 = this.n + (z ? (i9 - 1) - i26 : i26);
                if (i27 >= c3122nl.a1) {
                    break;
                }
                c2566dc = c3122nl.Z0[i27];
                if (c2566dc.D) {
                    break;
                }
            }
            c2566dc = c2566dc6;
        }
        int i28 = 0;
        C2566dc c2566dc7 = null;
        while (i28 < i9) {
            int i29 = z ? (i9 - 1) - i28 : i28;
            int i30 = this.n + i29;
            if (i30 >= c3122nl.a1) {
                return;
            }
            C2566dc c2566dc8 = c3122nl.Z0[i30];
            if (i28 == 0) {
                c2566dc8.f(c2566dc8.H, this.d, this.h);
            }
            if (i29 == 0) {
                int i31 = c3122nl.C0;
                float f2 = z ? 1.0f - c3122nl.I0 : c3122nl.I0;
                if (this.n == 0) {
                    int i32 = c3122nl.E0;
                    i6 = i31;
                    if (i32 != -1) {
                        f2 = z ? 1.0f - c3122nl.K0 : c3122nl.K0;
                        i7 = i32;
                    }
                    c2566dc8.h0 = i7;
                    c2566dc8.c0 = f2;
                } else {
                    i6 = i31;
                }
                if (!z2 || (i7 = c3122nl.G0) == -1) {
                    i7 = i6;
                } else {
                    f2 = z ? 1.0f - c3122nl.M0 : c3122nl.M0;
                }
                c2566dc8.h0 = i7;
                c2566dc8.c0 = f2;
            }
            if (i28 == i9 - 1) {
                c2566dc8.f(c2566dc8.J, this.f, this.j);
            }
            if (c2566dc7 != null) {
                C0167Jb c0167Jb10 = c2566dc8.H;
                int i33 = c3122nl.O0;
                C0167Jb c0167Jb11 = c2566dc7.J;
                c0167Jb10.a(c0167Jb11, i33);
                C0167Jb c0167Jb12 = c2566dc8.H;
                if (i28 == i11) {
                    int i34 = this.h;
                    if (c0167Jb12.h()) {
                        c0167Jb12.h = i34;
                    }
                }
                c0167Jb11.a(c0167Jb12, 0);
                if (i28 == i12 + 1) {
                    int i35 = this.j;
                    if (c0167Jb11.h()) {
                        c0167Jb11.h = i35;
                    }
                }
            }
            if (c2566dc8 != c2566dc6) {
                int i36 = c3122nl.R0;
                c = 3;
                if (i36 == 3 && c2566dc.D && c2566dc8 != c2566dc && c2566dc8.D) {
                    c2566dc8.L.a(c2566dc.L, 0);
                } else if (i36 != 0) {
                    if (i36 != 1) {
                        C0167Jb c0167Jb13 = c2566dc8.I;
                        if (z3) {
                            c0167Jb13.a(this.e, this.i);
                            c2566dc8.K.a(this.g, this.k);
                        } else {
                            i5 = 0;
                            c0167Jb13.a(c0167Jb8, 0);
                        }
                    } else {
                        i5 = 0;
                    }
                    c2566dc8.K.a(c0167Jb9, i5);
                } else {
                    c2566dc8.I.a(c0167Jb8, 0);
                }
            } else {
                c = 3;
            }
            i28++;
            c2566dc7 = c2566dc8;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.P0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.O0 : this.l;
    }

    public final void e(int i) {
        C3122nl c3122nl;
        int i2;
        int i3;
        int iN;
        int iK;
        int i4 = this.p;
        if (i4 == 0) {
            return;
        }
        int i5 = this.o;
        int i6 = i / i4;
        int i7 = 0;
        while (true) {
            c3122nl = this.r;
            if (i7 >= i5 || (i2 = this.n + i7) >= c3122nl.a1) {
                break;
            }
            C2566dc c2566dc = c3122nl.Z0[i2];
            int i8 = 1;
            if (this.a == 0) {
                if (c2566dc != null) {
                    int[] iArr = c2566dc.o0;
                    if (iArr[0] == 3 && c2566dc.q == 0) {
                        int i9 = iArr[1];
                        i3 = 1;
                        iN = i6;
                        i8 = i9;
                        iK = c2566dc.k();
                        c3122nl.R(i3, iN, i8, iK, c2566dc);
                    }
                }
            } else if (c2566dc != null) {
                int[] iArr2 = c2566dc.o0;
                if (iArr2[1] == 3 && c2566dc.r == 0) {
                    i3 = iArr2[0];
                    iN = c2566dc.n();
                    iK = i6;
                    c3122nl.R(i3, iN, i8, iK, c2566dc);
                }
            }
            i7++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i10 = this.o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.n + i11;
            if (i12 >= c3122nl.a1) {
                return;
            }
            C2566dc c2566dc2 = c3122nl.Z0[i12];
            if (this.a == 0) {
                int iN2 = c2566dc2.n();
                int i13 = c3122nl.O0;
                if (c2566dc2.f0 == 8) {
                    i13 = 0;
                }
                this.l = iN2 + i13 + this.l;
                int iO = c3122nl.O(c2566dc2, this.q);
                if (this.b == null || this.c < iO) {
                    this.b = c2566dc2;
                    this.c = iO;
                    this.m = iO;
                }
            } else {
                int iP = c3122nl.P(c2566dc2, this.q);
                int iO2 = c3122nl.O(c2566dc2, this.q);
                int i14 = c3122nl.P0;
                if (c2566dc2.f0 == 8) {
                    i14 = 0;
                }
                this.m = iO2 + i14 + this.m;
                if (this.b == null || this.c < iP) {
                    this.b = c2566dc2;
                    this.c = iP;
                    this.l = iP;
                }
            }
        }
    }

    public final void f(int i, C0167Jb c0167Jb, C0167Jb c0167Jb2, C0167Jb c0167Jb3, C0167Jb c0167Jb4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = c0167Jb;
        this.e = c0167Jb2;
        this.f = c0167Jb3;
        this.g = c0167Jb4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}

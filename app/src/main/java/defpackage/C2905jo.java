package defpackage;

import java.util.ArrayList;

/* renamed from: jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2905jo extends C2566dc {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public C0167Jb s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public C2905jo() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // defpackage.C2566dc
    public final void L(C2855is c2855is, boolean z) {
        if (this.S == null) {
            return;
        }
        C0167Jb c0167Jb = this.s0;
        c2855is.getClass();
        int iN = C2855is.n(c0167Jb);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i) {
        this.s0.l(i);
        this.u0 = true;
    }

    public final void N(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        this.s0 = this.t0 == 1 ? this.H : this.I;
        arrayList.add(this.s0);
        C0167Jb[] c0167JbArr = this.P;
        int length = c0167JbArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0167JbArr[i2] = this.s0;
        }
    }

    @Override // defpackage.C2566dc
    public final void b(C2855is c2855is, boolean z) {
        C3318rG c3318rGK;
        C3318rG c3318rGK2;
        C3318rG c3318rGK3;
        C2620ec c2620ec = (C2620ec) this.S;
        if (c2620ec == null) {
            return;
        }
        Object objI = c2620ec.i(2);
        Object objI2 = c2620ec.i(4);
        C2566dc c2566dc = this.S;
        boolean z2 = c2566dc != null && c2566dc.o0[0] == 2;
        if (this.t0 == 0) {
            objI = c2620ec.i(3);
            objI2 = c2620ec.i(5);
            C2566dc c2566dc2 = this.S;
            z2 = c2566dc2 != null && c2566dc2.o0[1] == 2;
        }
        if (this.u0) {
            C0167Jb c0167Jb = this.s0;
            if (c0167Jb.c) {
                C3318rG c3318rGK4 = c2855is.k(c0167Jb);
                c2855is.d(c3318rGK4, this.s0.d());
                if (this.q0 != -1) {
                    if (z2) {
                        c3318rGK3 = c2855is.k(objI2);
                        c2855is.f(c3318rGK3, c3318rGK4, 0, 5);
                    }
                } else if (this.r0 != -1 && z2) {
                    c3318rGK3 = c2855is.k(objI2);
                    c2855is.f(c3318rGK4, c2855is.k(objI), 0, 5);
                    c2855is.f(c3318rGK3, c3318rGK4, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            c3318rGK = c2855is.k(this.s0);
            c2855is.e(c3318rGK, c2855is.k(objI), this.q0, 8);
            if (!z2) {
                return;
            } else {
                c3318rGK2 = c2855is.k(objI2);
            }
        } else {
            if (this.r0 == -1) {
                if (this.p0 != -1.0f) {
                    C3318rG c3318rGK5 = c2855is.k(this.s0);
                    C3318rG c3318rGK6 = c2855is.k(objI2);
                    float f = this.p0;
                    C0515b4 c0515b4L = c2855is.l();
                    c0515b4L.d.j(c3318rGK5, -1.0f);
                    c0515b4L.d.j(c3318rGK6, f);
                    c2855is.c(c0515b4L);
                    return;
                }
                return;
            }
            c3318rGK = c2855is.k(this.s0);
            c3318rGK2 = c2855is.k(objI2);
            c2855is.e(c3318rGK, c3318rGK2, -this.r0, 8);
            if (!z2) {
                return;
            } else {
                c2855is.f(c3318rGK, c2855is.k(objI), 0, 5);
            }
        }
        c2855is.f(c3318rGK2, c3318rGK, 0, 5);
    }

    @Override // defpackage.C2566dc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.C2566dc
    public final C0167Jb i(int i) {
        int iA = AbstractC3264qG.A(i);
        if (iA != 1) {
            if (iA != 2) {
                if (iA != 3) {
                    if (iA != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
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

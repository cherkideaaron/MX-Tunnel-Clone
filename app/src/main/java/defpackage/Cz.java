package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Cz extends C0515b4 {
    public C3318rG[] f;
    public C3318rG[] g;
    public int h;
    public C3178om i;

    @Override // defpackage.C0515b4
    public final C3318rG d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C3318rG[] c3318rGArr = this.f;
            C3318rG c3318rG = c3318rGArr[i2];
            if (!zArr[c3318rG.b]) {
                C3178om c3178om = this.i;
                c3178om.b = c3318rG;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((C3318rG) c3178om.b).n[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C3318rG c3318rG2 = c3318rGArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c3318rG2.n[i3];
                            float f3 = ((C3318rG) c3178om.b).n[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.C0515b4
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.C0515b4
    public final void i(C2855is c2855is, C0515b4 c0515b4, boolean z) {
        C3318rG c3318rG = c0515b4.a;
        if (c3318rG == null) {
            return;
        }
        U3 u3 = c0515b4.d;
        int iF = u3.f();
        for (int i = 0; i < iF; i++) {
            C3318rG c3318rGG = u3.g(i);
            float fH = u3.h(i);
            C3178om c3178om = this.i;
            c3178om.b = c3318rGG;
            boolean z2 = c3318rGG.a;
            float[] fArr = c3318rG.n;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C3318rG) c3178om.b).n;
                    float f = (fArr[i2] * fH) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C3318rG) c3178om.b).n[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((Cz) c3178om.c).k((C3318rG) c3178om.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fH;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C3318rG) c3178om.b).n[i3] = f3;
                    } else {
                        ((C3318rG) c3178om.b).n[i3] = 0.0f;
                    }
                }
                j(c3318rGG);
            }
            this.b = (c0515b4.b * fH) + this.b;
        }
        k(c3318rG);
    }

    public final void j(C3318rG c3318rG) {
        int i;
        int i2 = this.h + 1;
        C3318rG[] c3318rGArr = this.f;
        if (i2 > c3318rGArr.length) {
            C3318rG[] c3318rGArr2 = (C3318rG[]) Arrays.copyOf(c3318rGArr, c3318rGArr.length * 2);
            this.f = c3318rGArr2;
            this.g = (C3318rG[]) Arrays.copyOf(c3318rGArr2, c3318rGArr2.length * 2);
        }
        C3318rG[] c3318rGArr3 = this.f;
        int i3 = this.h;
        c3318rGArr3[i3] = c3318rG;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c3318rGArr3[i3].b > c3318rG.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new G3(5));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        c3318rG.a = true;
        c3318rG.a(this);
    }

    public final void k(C3318rG c3318rG) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == c3318rG) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c3318rG.a = false;
                        return;
                    } else {
                        C3318rG[] c3318rGArr = this.f;
                        int i3 = i + 1;
                        c3318rGArr[i] = c3318rGArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.C0515b4
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C3318rG c3318rG = this.f[i];
            C3178om c3178om = this.i;
            c3178om.b = c3318rG;
            str = str + c3178om + " ";
        }
        return str;
    }
}

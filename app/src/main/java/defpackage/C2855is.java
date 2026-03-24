package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* renamed from: is, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2855is {
    public static boolean p = false;
    public static int q = 1000;
    public final Cz c;
    public C0515b4[] f;
    public final D3 l;
    public C0515b4 o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public C3318rG[] m = new C3318rG[q];
    public int n = 0;

    public C2855is() {
        this.f = null;
        this.f = new C0515b4[32];
        s();
        D3 d3 = new D3(5);
        d3.b = new C2588dz();
        d3.c = new C2588dz();
        d3.d = new C3318rG[32];
        this.l = d3;
        Cz cz = new Cz(d3);
        cz.f = new C3318rG[UserVerificationMethods.USER_VERIFY_PATTERN];
        cz.g = new C3318rG[UserVerificationMethods.USER_VERIFY_PATTERN];
        cz.h = 0;
        cz.i = new C3178om(cz, 9);
        this.c = cz;
        this.o = new C0515b4(d3);
    }

    public static int n(C0167Jb c0167Jb) {
        C3318rG c3318rG = c0167Jb.i;
        if (c3318rG != null) {
            return (int) (c3318rG.e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C3318rG a(int i) {
        C2588dz c2588dz = (C2588dz) this.l.c;
        int i2 = c2588dz.b;
        C3318rG c3318rG = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = c2588dz.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            c2588dz.b = i3;
            c3318rG = r4;
        }
        C3318rG c3318rG2 = c3318rG;
        if (c3318rG2 == null) {
            c3318rG2 = new C3318rG(i);
        } else {
            c3318rG2.c();
        }
        c3318rG2.r = i;
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (C3318rG[]) Arrays.copyOf(this.m, i6);
        }
        C3318rG[] c3318rGArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        c3318rGArr[i7] = c3318rG2;
        return c3318rG2;
    }

    public final void b(C3318rG c3318rG, C3318rG c3318rG2, int i, float f, C3318rG c3318rG3, C3318rG c3318rG4, int i2, int i3) {
        int i4;
        float f2;
        C0515b4 c0515b4L = l();
        if (c3318rG2 == c3318rG3) {
            c0515b4L.d.j(c3318rG, 1.0f);
            c0515b4L.d.j(c3318rG4, 1.0f);
            c0515b4L.d.j(c3318rG2, -2.0f);
        } else {
            if (f == 0.5f) {
                c0515b4L.d.j(c3318rG, 1.0f);
                c0515b4L.d.j(c3318rG2, -1.0f);
                c0515b4L.d.j(c3318rG3, -1.0f);
                c0515b4L.d.j(c3318rG4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                c0515b4L.d.j(c3318rG, -1.0f);
                c0515b4L.d.j(c3318rG2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                c0515b4L.d.j(c3318rG4, -1.0f);
                c0515b4L.d.j(c3318rG3, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                c0515b4L.d.j(c3318rG, f3 * 1.0f);
                c0515b4L.d.j(c3318rG2, f3 * (-1.0f));
                c0515b4L.d.j(c3318rG3, (-1.0f) * f);
                c0515b4L.d.j(c3318rG4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c0515b4L.b = (i2 * f) + ((-i) * f3);
                }
            }
            c0515b4L.b = f2;
        }
        if (i3 != 8) {
            c0515b4L.a(this, i3);
        }
        c(c0515b4L);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C0515b4 r17) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2855is.c(b4):void");
    }

    public final void d(C3318rG c3318rG, int i) {
        C0515b4 c0515b4L;
        U3 u3;
        float f;
        int i2 = c3318rG.c;
        if (i2 == -1) {
            c3318rG.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                C3318rG c3318rG2 = ((C3318rG[]) this.l.d)[i3];
            }
            return;
        }
        if (i2 != -1) {
            C0515b4 c0515b4 = this.f[i2];
            if (!c0515b4.e) {
                if (c0515b4.d.f() == 0) {
                    c0515b4.e = true;
                } else {
                    c0515b4L = l();
                    if (i < 0) {
                        c0515b4L.b = i * (-1);
                        u3 = c0515b4L.d;
                        f = 1.0f;
                    } else {
                        c0515b4L.b = i;
                        u3 = c0515b4L.d;
                        f = -1.0f;
                    }
                    u3.j(c3318rG, f);
                }
            }
            c0515b4.b = i;
            return;
        }
        c0515b4L = l();
        c0515b4L.a = c3318rG;
        float f2 = i;
        c3318rG.e = f2;
        c0515b4L.b = f2;
        c0515b4L.e = true;
        c(c0515b4L);
    }

    public final void e(C3318rG c3318rG, C3318rG c3318rG2, int i, int i2) {
        if (i2 == 8 && c3318rG2.f && c3318rG.c == -1) {
            c3318rG.d(this, c3318rG2.e + i);
            return;
        }
        C0515b4 c0515b4L = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0515b4L.b = i;
        }
        if (z) {
            c0515b4L.d.j(c3318rG, 1.0f);
            c0515b4L.d.j(c3318rG2, -1.0f);
        } else {
            c0515b4L.d.j(c3318rG, -1.0f);
            c0515b4L.d.j(c3318rG2, 1.0f);
        }
        if (i2 != 8) {
            c0515b4L.a(this, i2);
        }
        c(c0515b4L);
    }

    public final void f(C3318rG c3318rG, C3318rG c3318rG2, int i, int i2) {
        C0515b4 c0515b4L = l();
        C3318rG c3318rGM = m();
        c3318rGM.d = 0;
        c0515b4L.b(c3318rG, c3318rG2, c3318rGM, i);
        if (i2 != 8) {
            c0515b4L.d.j(j(i2), (int) (c0515b4L.d.e(c3318rGM) * (-1.0f)));
        }
        c(c0515b4L);
    }

    public final void g(C3318rG c3318rG, C3318rG c3318rG2, int i, int i2) {
        C0515b4 c0515b4L = l();
        C3318rG c3318rGM = m();
        c3318rGM.d = 0;
        c0515b4L.c(c3318rG, c3318rG2, c3318rGM, i);
        if (i2 != 8) {
            c0515b4L.d.j(j(i2), (int) (c0515b4L.d.e(c3318rGM) * (-1.0f)));
        }
        c(c0515b4L);
    }

    public final void h(C0515b4 c0515b4) {
        int i;
        if (c0515b4.e) {
            c0515b4.a.d(this, c0515b4.b);
        } else {
            C0515b4[] c0515b4Arr = this.f;
            int i2 = this.j;
            c0515b4Arr[i2] = c0515b4;
            C3318rG c3318rG = c0515b4.a;
            c3318rG.c = i2;
            this.j = i2 + 1;
            c3318rG.e(this, c0515b4);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                C0515b4 c0515b42 = this.f[i3];
                if (c0515b42 != null && c0515b42.e) {
                    c0515b42.a.d(this, c0515b42.b);
                    ((C2588dz) this.l.b).b(c0515b42);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        C0515b4[] c0515b4Arr2 = this.f;
                        int i6 = i4 - 1;
                        C0515b4 c0515b43 = c0515b4Arr2[i4];
                        c0515b4Arr2[i6] = c0515b43;
                        C3318rG c3318rG2 = c0515b43.a;
                        if (c3318rG2.c == i4) {
                            c3318rG2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            C0515b4 c0515b4 = this.f[i];
            c0515b4.a.e = c0515b4.b;
        }
    }

    public final C3318rG j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        C3318rG c3318rGA = a(4);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        c3318rGA.b = i2;
        c3318rGA.d = i;
        ((C3318rG[]) this.l.d)[i2] = c3318rGA;
        Cz cz = this.c;
        cz.i.b = c3318rGA;
        float[] fArr = c3318rGA.n;
        Arrays.fill(fArr, 0.0f);
        fArr[c3318rGA.d] = 1.0f;
        cz.j(c3318rGA);
        return c3318rGA;
    }

    public final C3318rG k(Object obj) {
        C3318rG c3318rG = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof C0167Jb) {
            C0167Jb c0167Jb = (C0167Jb) obj;
            c3318rG = c0167Jb.i;
            if (c3318rG == null) {
                c0167Jb.k();
                c3318rG = c0167Jb.i;
            }
            int i = c3318rG.b;
            D3 d3 = this.l;
            if (i == -1 || i > this.b || ((C3318rG[]) d3.d)[i] == null) {
                if (i != -1) {
                    c3318rG.c();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.i++;
                c3318rG.b = i2;
                c3318rG.r = 1;
                ((C3318rG[]) d3.d)[i2] = c3318rG;
            }
        }
        return c3318rG;
    }

    public final C0515b4 l() {
        Object obj;
        D3 d3 = this.l;
        C2588dz c2588dz = (C2588dz) d3.b;
        int i = c2588dz.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2588dz.a;
            obj = objArr[i2];
            objArr[i2] = null;
            c2588dz.b = i2;
        } else {
            obj = null;
        }
        C0515b4 c0515b4 = (C0515b4) obj;
        if (c0515b4 == null) {
            return new C0515b4(d3);
        }
        c0515b4.a = null;
        c0515b4.d.b();
        c0515b4.b = 0.0f;
        c0515b4.e = false;
        return c0515b4;
    }

    public final C3318rG m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        C3318rG c3318rGA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        c3318rGA.b = i;
        ((C3318rG[]) this.l.d)[i] = c3318rGA;
        return c3318rGA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (C0515b4[]) Arrays.copyOf(this.f, i);
        D3 d3 = this.l;
        d3.d = (C3318rG[]) Arrays.copyOf((C3318rG[]) d3.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        Cz cz = this.c;
        if (cz.e()) {
            i();
            return;
        }
        if (this.g) {
            for (int i = 0; i < this.j; i++) {
                if (this.f[i].e) {
                }
            }
            i();
            return;
        }
        q(cz);
    }

    public final void q(Cz cz) {
        int i = 0;
        while (true) {
            if (i >= this.j) {
                break;
            }
            C0515b4 c0515b4 = this.f[i];
            int i2 = 1;
            if (c0515b4.a.r != 1) {
                float f = 0.0f;
                if (c0515b4.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            C0515b4 c0515b42 = this.f[i6];
                            if (c0515b42.a.r != i2 && !c0515b42.e && c0515b42.b < f) {
                                int iF = c0515b42.d.f();
                                int i8 = 0;
                                while (i8 < iF) {
                                    C3318rG c3318rGG = c0515b42.d.g(i8);
                                    float fE = c0515b42.d.e(c3318rGG);
                                    if (fE > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c3318rGG.m[i9] / fE;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = c3318rGG.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0515b4 c0515b43 = this.f[i4];
                            c0515b43.a.c = -1;
                            c0515b43.g(((C3318rG[]) this.l.d)[i5]);
                            C3318rG c3318rG = c0515b43.a;
                            c3318rG.c = i4;
                            c3318rG.e(this, c0515b43);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(cz);
        i();
    }

    public final void r(C0515b4 c0515b4) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            C3318rG c3318rG = c0515b4.a;
            if (c3318rG != null) {
                this.h[c3318rG.b] = true;
            }
            C3318rG c3318rGD = c0515b4.d(this.h);
            if (c3318rGD != null) {
                boolean[] zArr = this.h;
                int i3 = c3318rGD.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (c3318rGD != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    C0515b4 c0515b42 = this.f[i5];
                    if (c0515b42.a.r != 1 && !c0515b42.e && c0515b42.d.c(c3318rGD)) {
                        float fE = c0515b42.d.e(c3318rGD);
                        if (fE < 0.0f) {
                            float f2 = (-c0515b42.b) / fE;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0515b4 c0515b43 = this.f[i4];
                    c0515b43.a.c = -1;
                    c0515b43.g(c3318rGD);
                    C3318rG c3318rG2 = c0515b43.a;
                    c3318rG2.c = i4;
                    c3318rG2.e(this, c0515b43);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            C0515b4 c0515b4 = this.f[i];
            if (c0515b4 != null) {
                ((C2588dz) this.l.b).b(c0515b4);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        D3 d3;
        int i = 0;
        while (true) {
            d3 = this.l;
            C3318rG[] c3318rGArr = (C3318rG[]) d3.d;
            if (i >= c3318rGArr.length) {
                break;
            }
            C3318rG c3318rG = c3318rGArr[i];
            if (c3318rG != null) {
                c3318rG.c();
            }
            i++;
        }
        C2588dz c2588dz = (C2588dz) d3.c;
        C3318rG[] c3318rGArr2 = this.m;
        int length = this.n;
        c2588dz.getClass();
        if (length > c3318rGArr2.length) {
            length = c3318rGArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C3318rG c3318rG2 = c3318rGArr2[i2];
            int i3 = c2588dz.b;
            Object[] objArr = c2588dz.a;
            if (i3 < objArr.length) {
                objArr[i3] = c3318rG2;
                c2588dz.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((C3318rG[]) d3.d, (Object) null);
        this.b = 0;
        Cz cz = this.c;
        cz.h = 0;
        cz.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            C0515b4 c0515b4 = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new C0515b4(d3);
    }
}

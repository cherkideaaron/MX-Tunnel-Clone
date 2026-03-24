package defpackage;

import java.util.ArrayList;

/* renamed from: b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0515b4 {
    public final U3 d;
    public C3318rG a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public C0515b4(D3 d3) {
        this.d = new U3(this, d3);
    }

    public final void a(C2855is c2855is, int i) {
        this.d.j(c2855is.j(i), 1.0f);
        this.d.j(c2855is.j(i), -1.0f);
    }

    public final void b(C3318rG c3318rG, C3318rG c3318rG2, C3318rG c3318rG3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(c3318rG, 1.0f);
            this.d.j(c3318rG2, -1.0f);
            this.d.j(c3318rG3, -1.0f);
        } else {
            this.d.j(c3318rG, -1.0f);
            this.d.j(c3318rG2, 1.0f);
            this.d.j(c3318rG3, 1.0f);
        }
    }

    public final void c(C3318rG c3318rG, C3318rG c3318rG2, C3318rG c3318rG3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(c3318rG, 1.0f);
            this.d.j(c3318rG2, -1.0f);
            this.d.j(c3318rG3, 1.0f);
        } else {
            this.d.j(c3318rG, -1.0f);
            this.d.j(c3318rG2, 1.0f);
            this.d.j(c3318rG3, -1.0f);
        }
    }

    public C3318rG d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }

    public final C3318rG f(boolean[] zArr, C3318rG c3318rG) {
        int i;
        int iF = this.d.f();
        C3318rG c3318rG2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iF; i2++) {
            float fH = this.d.h(i2);
            if (fH < 0.0f) {
                C3318rG c3318rGG = this.d.g(i2);
                if ((zArr == null || !zArr[c3318rGG.b]) && c3318rGG != c3318rG && (((i = c3318rGG.r) == 3 || i == 4) && fH < f)) {
                    f = fH;
                    c3318rG2 = c3318rGG;
                }
            }
        }
        return c3318rG2;
    }

    public final void g(C3318rG c3318rG) {
        C3318rG c3318rG2 = this.a;
        if (c3318rG2 != null) {
            this.d.j(c3318rG2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fK = this.d.k(c3318rG, true) * (-1.0f);
        this.a = c3318rG;
        if (fK == 1.0f) {
            return;
        }
        this.b /= fK;
        this.d.d(fK);
    }

    public final void h(C2855is c2855is, C3318rG c3318rG, boolean z) {
        if (c3318rG == null || !c3318rG.f) {
            return;
        }
        float fE = this.d.e(c3318rG);
        this.b = (c3318rG.e * fE) + this.b;
        this.d.k(c3318rG, z);
        if (z) {
            c3318rG.b(this);
        }
        if (this.d.f() == 0) {
            this.e = true;
            c2855is.a = true;
        }
    }

    public void i(C2855is c2855is, C0515b4 c0515b4, boolean z) {
        float fL = this.d.l(c0515b4, z);
        this.b = (c0515b4.b * fL) + this.b;
        if (z) {
            c0515b4.a.b(this);
        }
        if (this.a == null || this.d.f() != 0) {
            return;
        }
        this.e = true;
        c2855is.a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            rG r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            rG r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.AbstractC3264qG.g(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.AbstractC3264qG.n(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            U3 r5 = r10.d
            int r5 = r5.f()
        L3c:
            if (r4 >= r5) goto L98
            U3 r6 = r10.d
            rG r6 = r6.g(r4)
            if (r6 != 0) goto L47
            goto L95
        L47:
            U3 r7 = r10.d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L95
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L72
            java.lang.String r1 = "- "
        L60:
            java.lang.String r0 = defpackage.AbstractC3264qG.g(r0, r1)
            float r7 = r7 * r9
            goto L72
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.AbstractC3264qG.g(r0, r1)
            goto L72
        L6f:
            java.lang.String r1 = " - "
            goto L60
        L72:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L7d
            java.lang.String r0 = defpackage.AbstractC3264qG.g(r0, r6)
            goto L94
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L94:
            r1 = r3
        L95:
            int r4 = r4 + 1
            goto L3c
        L98:
            if (r1 != 0) goto La0
            java.lang.String r1 = "0.0"
            java.lang.String r0 = defpackage.AbstractC3264qG.g(r0, r1)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0515b4.toString():java.lang.String");
    }
}

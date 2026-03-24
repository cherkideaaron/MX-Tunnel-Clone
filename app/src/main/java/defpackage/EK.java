package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class EK {
    public static final EK f = new EK(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public EK(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int iZ0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iZ0 = C3221pa.z0(i4, ((Long) this.c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.c[i2]).getClass();
                iZ0 = C3221pa.l0(i4);
            } else if (i5 == 2) {
                iZ0 = C3221pa.h0(i4, (C0519b8) this.c[i2]);
            } else if (i5 == 3) {
                iB = ((EK) this.c[i2]).b() + (C3221pa.w0(i4) * 2) + iB;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(C2744gq.b());
                }
                ((Integer) this.c[i2]).getClass();
                iZ0 = C3221pa.k0(i4);
            }
            iB = iZ0 + iB;
        }
        this.d = iB;
        return iB;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(C2524cp c2524cp) {
        if (this.a == 0) {
            return;
        }
        c2524cp.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c2524cp.G(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c2524cp.C(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c2524cp.y(i3, (C0519b8) obj);
            } else if (i4 == 3) {
                C3221pa c3221pa = (C3221pa) c2524cp.b;
                c3221pa.U0(i3, 3);
                ((EK) obj).d(c2524cp);
                c3221pa.U0(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(C2744gq.b());
                }
                c2524cp.B(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EK)) {
            return false;
        }
        EK ek = (EK) obj;
        int i = this.a;
        if (i == ek.a) {
            int[] iArr = this.b;
            int[] iArr2 = ek.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = ek.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}

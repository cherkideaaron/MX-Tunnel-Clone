package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3221pa extends AbstractC3296qu {
    public static final Logger o = Logger.getLogger(C3221pa.class.getName());
    public static final boolean p = PK.e;
    public C2524cp j;
    public final byte[] k;
    public final int l;
    public int m;
    public final OutputStream n;

    public C3221pa(C3646xK c3646xK, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.k = new byte[iMax];
        this.l = iMax;
        this.n = c3646xK;
    }

    public static int A0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int g0(int i) {
        return w0(i) + 1;
    }

    public static int h0(int i, C0519b8 c0519b8) {
        int iW0 = w0(i);
        int size = c0519b8.size();
        return y0(size) + size + iW0;
    }

    public static int i0(int i) {
        return w0(i) + 8;
    }

    public static int j0(int i, int i2) {
        return A0(i2) + w0(i);
    }

    public static int k0(int i) {
        return w0(i) + 4;
    }

    public static int l0(int i) {
        return w0(i) + 8;
    }

    public static int m0(int i) {
        return w0(i) + 4;
    }

    public static int n0(int i, AbstractC3733z abstractC3733z, PD pd) {
        return abstractC3733z.b(pd) + (w0(i) * 2);
    }

    public static int o0(int i, int i2) {
        return A0(i2) + w0(i);
    }

    public static int p0(int i, long j) {
        return A0(j) + w0(i);
    }

    public static int q0(int i) {
        return w0(i) + 4;
    }

    public static int r0(int i) {
        return w0(i) + 8;
    }

    public static int s0(int i, int i2) {
        return y0((i2 >> 31) ^ (i2 << 1)) + w0(i);
    }

    public static int t0(int i, long j) {
        return A0((j >> 63) ^ (j << 1)) + w0(i);
    }

    public static int u0(int i, String str) {
        return v0(str) + w0(i);
    }

    public static int v0(String str) {
        int length;
        try {
            length = AbstractC2557dL.a(str);
        } catch (C0586cL unused) {
            length = str.getBytes(AbstractC0368Up.a).length;
        }
        return y0(length) + length;
    }

    public static int w0(int i) {
        return y0(i << 3);
    }

    public static int x0(int i, int i2) {
        return y0(i2) + w0(i);
    }

    public static int y0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int z0(int i, long j) {
        return A0(j) + w0(i);
    }

    public final void B0() {
        this.n.write(this.k, 0, this.m);
        this.m = 0;
    }

    public final void C0(int i) {
        if (this.l - this.m < i) {
            B0();
        }
    }

    public final void D0(String str, C0586cL c0586cL) throws C3166oa {
        o.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c0586cL);
        byte[] bytes = str.getBytes(AbstractC0368Up.a);
        try {
            W0(bytes.length);
            Y(0, bytes, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3166oa(e);
        }
    }

    public final void E0(byte b) {
        if (this.m == this.l) {
            B0();
        }
        int i = this.m;
        this.m = i + 1;
        this.k[i] = b;
    }

    public final void F0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.m;
        int i4 = this.l;
        int i5 = i4 - i3;
        byte[] bArr2 = this.k;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.m += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.m = i4;
        B0();
        if (i7 > i4) {
            this.n.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.m = i7;
        }
    }

    public final void G0(int i, boolean z) {
        C0(11);
        d0(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.m;
        this.m = i2 + 1;
        this.k[i2] = b;
    }

    public final void H0(int i, byte[] bArr) throws IOException {
        W0(i);
        F0(bArr, 0, i);
    }

    public final void I0(int i, C0519b8 c0519b8) {
        U0(i, 2);
        J0(c0519b8);
    }

    public final void J0(C0519b8 c0519b8) throws IOException {
        W0(c0519b8.size());
        Y(c0519b8.e(), c0519b8.b, c0519b8.size());
    }

    public final void K0(int i, int i2) {
        C0(14);
        d0(i, 5);
        b0(i2);
    }

    public final void L0(int i) {
        C0(4);
        b0(i);
    }

    public final void M0(int i, long j) {
        C0(18);
        d0(i, 1);
        c0(j);
    }

    public final void N0(long j) {
        C0(8);
        c0(j);
    }

    public final void O0(int i, int i2) {
        C0(20);
        d0(i, 0);
        if (i2 >= 0) {
            e0(i2);
        } else {
            f0(i2);
        }
    }

    public final void P0(int i) {
        if (i >= 0) {
            W0(i);
        } else {
            Y0(i);
        }
    }

    public final void Q0(int i, AbstractC3733z abstractC3733z, PD pd) {
        U0(i, 2);
        W0(abstractC3733z.b(pd));
        pd.b(abstractC3733z, this.j);
    }

    public final void R0(AbstractC3733z abstractC3733z) {
        W0(((AbstractC0247Nn) abstractC3733z).b(null));
        abstractC3733z.c(this);
    }

    public final void S0(int i, String str) throws IOException {
        U0(i, 2);
        T0(str);
    }

    public final void T0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iY0 = y0(length);
            int i = iY0 + length;
            int i2 = this.l;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iR = AbstractC2557dL.a.r(str, bArr, 0, length);
                W0(iR);
                F0(bArr, 0, iR);
                return;
            }
            if (i > i2 - this.m) {
                B0();
            }
            int iY02 = y0(str.length());
            int i3 = this.m;
            byte[] bArr2 = this.k;
            try {
                try {
                    if (iY02 == iY0) {
                        int i4 = i3 + iY02;
                        this.m = i4;
                        int iR2 = AbstractC2557dL.a.r(str, bArr2, i4, i2 - i4);
                        this.m = i3;
                        e0((iR2 - i3) - iY02);
                        this.m = iR2;
                    } else {
                        int iA = AbstractC2557dL.a(str);
                        e0(iA);
                        this.m = AbstractC2557dL.a.r(str, bArr2, this.m, iA);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C3166oa(e);
                }
            } catch (C0586cL e2) {
                this.m = i3;
                throw e2;
            }
        } catch (C0586cL e3) {
            D0(str, e3);
        }
    }

    public final void U0(int i, int i2) {
        W0((i << 3) | i2);
    }

    public final void V0(int i, int i2) {
        C0(20);
        d0(i, 0);
        e0(i2);
    }

    public final void W0(int i) {
        C0(5);
        e0(i);
    }

    public final void X0(int i, long j) {
        C0(20);
        d0(i, 0);
        f0(j);
    }

    @Override // defpackage.AbstractC3296qu
    public final void Y(int i, byte[] bArr, int i2) throws IOException {
        F0(bArr, i, i2);
    }

    public final void Y0(long j) {
        C0(10);
        f0(j);
    }

    public final void b0(int i) {
        int i2 = this.m;
        byte[] bArr = this.k;
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        this.m = i2 + 4;
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public final void c0(long j) {
        int i = this.m;
        byte[] bArr = this.k;
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) (255 & (j >> 24));
        bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
        bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
        bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
        this.m = i + 8;
        bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void d0(int i, int i2) {
        e0((i << 3) | i2);
    }

    public final void e0(int i) {
        boolean z = p;
        byte[] bArr = this.k;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.m;
                this.m = i2 + 1;
                PK.j(bArr, i2, (byte) ((i | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                i >>>= 7;
            }
            int i3 = this.m;
            this.m = i3 + 1;
            PK.j(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.m;
            this.m = i4 + 1;
            bArr[i4] = (byte) ((i | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
            i >>>= 7;
        }
        int i5 = this.m;
        this.m = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void f0(long j) {
        boolean z = p;
        byte[] bArr = this.k;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.m;
                this.m = i + 1;
                PK.j(bArr, i, (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
                j >>>= 7;
            }
            int i2 = this.m;
            this.m = i2 + 1;
            PK.j(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.m;
            this.m = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
            j >>>= 7;
        }
        int i4 = this.m;
        this.m = i4 + 1;
        bArr[i4] = (byte) j;
    }
}

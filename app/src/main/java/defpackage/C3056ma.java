package defpackage;

import com.google.android.gms.common.api.Api;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3056ma extends AbstractC3111na {
    public final InputStream e;
    public final byte[] f;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    public C3056ma(FileInputStream fileInputStream) {
        super(0);
        this.r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Charset charset = AbstractC0368Up.a;
        this.e = fileInputStream;
        this.f = new byte[4096];
        this.m = 0;
        this.o = 0;
        this.q = 0;
    }

    @Override // defpackage.AbstractC3111na
    public final int A() throws C2744gq {
        if (i()) {
            this.p = 0;
            return 0;
        }
        int iM = M();
        this.p = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new C2744gq("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC3111na
    public final int B() {
        return M();
    }

    @Override // defpackage.AbstractC3111na
    public final long C() {
        return N();
    }

    @Override // defpackage.AbstractC3111na
    public final boolean F(int i) throws C2744gq {
        int iM;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                iM = 8;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        G();
                        c(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    if (i2 != 5) {
                        throw C2744gq.b();
                    }
                    R(4);
                    return true;
                }
                iM = M();
            }
            R(iM);
            return true;
        }
        int i4 = this.m - this.o;
        byte[] bArr = this.f;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.o;
                this.o = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw C2744gq.c();
        }
        while (i3 < 10) {
            if (this.o == this.m) {
                Q(1);
            }
            int i6 = this.o;
            this.o = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw C2744gq.c();
        return true;
    }

    public final byte[] H(int i) throws IOException {
        byte[] bArrI = I(i);
        if (bArrI != null) {
            return bArrI;
        }
        int i2 = this.o;
        int i3 = this.m;
        int length = i3 - i2;
        this.q += i3;
        this.o = 0;
        this.m = 0;
        ArrayList arrayListJ = J(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, length);
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i) throws IOException {
        if (i == 0) {
            return AbstractC0368Up.b;
        }
        if (i < 0) {
            throw C2744gq.d();
        }
        int i2 = this.q;
        int i3 = this.o;
        int i4 = i2 + i3 + i;
        if (i4 - this.c > 0) {
            throw new C2744gq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.r;
        if (i4 > i5) {
            R((i5 - i2) - i3);
            throw C2744gq.e();
        }
        int i6 = this.m - i3;
        int i7 = i - i6;
        InputStream inputStream = this.e;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C2744gq e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.o, bArr, 0, i6);
        this.q += this.m;
        this.o = 0;
        this.m = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw C2744gq.e();
                }
                this.q += i8;
                i6 += i8;
            } catch (C2744gq e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C2744gq.e();
                }
                this.q += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws C2744gq {
        int i = this.o;
        if (this.m - i < 4) {
            Q(4);
            i = this.o;
        }
        this.o = i + 4;
        byte[] bArr = this.f;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long L() throws C2744gq {
        int i = this.o;
        if (this.m - i < 8) {
            Q(8);
            i = this.o;
        }
        this.o = i + 8;
        byte[] bArr = this.f;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int M() {
        int i;
        int i2 = this.o;
        int i3 = this.m;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f;
            byte b = bArr[i2];
            if (b >= 0) {
                this.o = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.o = i5;
                return i;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.o;
        int i2 = this.m;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f;
            byte b = bArr[i];
            if (b >= 0) {
                this.o = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.o = i4;
                return j;
            }
        }
        return O();
    }

    public final long O() throws C2744gq {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.o == this.m) {
                Q(1);
            }
            int i2 = this.o;
            this.o = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.f[i2] & 128) == 0) {
                return j;
            }
        }
        throw C2744gq.c();
    }

    public final void P() {
        int i = this.m + this.n;
        this.m = i;
        int i2 = this.q + i;
        int i3 = this.r;
        if (i2 <= i3) {
            this.n = 0;
            return;
        }
        int i4 = i2 - i3;
        this.n = i4;
        this.m = i - i4;
    }

    public final void Q(int i) throws C2744gq {
        if (S(i)) {
            return;
        }
        if (i <= (this.c - this.q) - this.o) {
            throw C2744gq.e();
        }
        throw new C2744gq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i) throws C2744gq {
        int i2 = this.m;
        int i3 = this.o;
        if (i <= i2 - i3 && i >= 0) {
            this.o = i3 + i;
            return;
        }
        InputStream inputStream = this.e;
        if (i < 0) {
            throw C2744gq.d();
        }
        int i4 = this.q;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.r;
        if (i6 > i7) {
            R((i7 - i4) - i3);
            throw C2744gq.e();
        }
        this.q = i5;
        int i8 = i2 - i3;
        this.m = 0;
        this.o = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (C2744gq e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.q += i8;
                P();
                throw th;
            }
        }
        this.q += i8;
        P();
        if (i8 >= i) {
            return;
        }
        int i9 = this.m;
        int i10 = i9 - this.o;
        this.o = i9;
        while (true) {
            Q(1);
            int i11 = i - i10;
            int i12 = this.m;
            if (i11 <= i12) {
                this.o = i11;
                return;
            } else {
                i10 += i12;
                this.o = i12;
            }
        }
    }

    public final boolean S(int i) throws IOException {
        int i2 = this.o;
        int i3 = i2 + i;
        int i4 = this.m;
        if (i3 <= i4) {
            throw new IllegalStateException(Vs.l(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.q;
        int i6 = this.c;
        if (i > (i6 - i5) - i2 || i5 + i2 + i > this.r) {
            return false;
        }
        byte[] bArr = this.f;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.q += i2;
            this.m -= i2;
            this.o = 0;
        }
        int i7 = this.m;
        int iMin = Math.min(bArr.length - i7, (i6 - this.q) - i7);
        InputStream inputStream = this.e;
        try {
            int i8 = inputStream.read(bArr, i7, iMin);
            if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 <= 0) {
                return false;
            }
            this.m += i8;
            P();
            if (this.m >= i) {
                return true;
            }
            return S(i);
        } catch (C2744gq e) {
            e.a = true;
            throw e;
        }
    }

    @Override // defpackage.AbstractC3111na
    public final void c(int i) throws C2744gq {
        if (this.p != i) {
            throw new C2744gq("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC3111na
    public final int g() {
        return this.q + this.o;
    }

    @Override // defpackage.AbstractC3111na
    public final boolean i() {
        return this.o == this.m && !S(1);
    }

    @Override // defpackage.AbstractC3111na
    public final void j(int i) {
        this.r = i;
        P();
    }

    @Override // defpackage.AbstractC3111na
    public final int k(int i) throws C2744gq {
        if (i < 0) {
            throw C2744gq.d();
        }
        int i2 = this.q + this.o + i;
        if (i2 < 0) {
            throw new C2744gq("Failed to parse the message.");
        }
        int i3 = this.r;
        if (i2 > i3) {
            throw C2744gq.e();
        }
        this.r = i2;
        P();
        return i3;
    }

    @Override // defpackage.AbstractC3111na
    public final boolean l() {
        return N() != 0;
    }

    @Override // defpackage.AbstractC3111na
    public final C0519b8 m() throws IOException {
        int iM = M();
        int i = this.m;
        int i2 = this.o;
        int i3 = i - i2;
        byte[] bArr = this.f;
        if (iM <= i3 && iM > 0) {
            C0519b8 c0519b8C = C0519b8.c(i2, bArr, iM);
            this.o += iM;
            return c0519b8C;
        }
        if (iM == 0) {
            return C0519b8.c;
        }
        if (iM < 0) {
            throw C2744gq.d();
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return C0519b8.c(0, bArrI, bArrI.length);
        }
        int i4 = this.o;
        int i5 = this.m;
        int length = i5 - i4;
        this.q += i5;
        this.o = 0;
        this.m = 0;
        ArrayList arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0519b8 c0519b8 = C0519b8.c;
        return new C0519b8(bArr2);
    }

    @Override // defpackage.AbstractC3111na
    public final double n() {
        return Double.longBitsToDouble(L());
    }

    @Override // defpackage.AbstractC3111na
    public final int o() {
        return M();
    }

    @Override // defpackage.AbstractC3111na
    public final int p() {
        return K();
    }

    @Override // defpackage.AbstractC3111na
    public final long q() {
        return L();
    }

    @Override // defpackage.AbstractC3111na
    public final float r() {
        return Float.intBitsToFloat(K());
    }

    @Override // defpackage.AbstractC3111na
    public final int s() {
        return M();
    }

    @Override // defpackage.AbstractC3111na
    public final long t() {
        return N();
    }

    @Override // defpackage.AbstractC3111na
    public final int u() {
        return K();
    }

    @Override // defpackage.AbstractC3111na
    public final long v() {
        return L();
    }

    @Override // defpackage.AbstractC3111na
    public final int w() {
        int iM = M();
        return (-(iM & 1)) ^ (iM >>> 1);
    }

    @Override // defpackage.AbstractC3111na
    public final long x() {
        long jN = N();
        return (-(jN & 1)) ^ (jN >>> 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // defpackage.AbstractC3111na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y() throws defpackage.C2744gq {
        /*
            r5 = this;
            int r0 = r5.M()
            byte[] r1 = r5.f
            if (r0 <= 0) goto L1c
            int r2 = r5.m
            int r3 = r5.o
            int r2 = r2 - r3
            if (r0 > r2) goto L1c
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r4 = defpackage.AbstractC0368Up.a
            r2.<init>(r1, r3, r0, r4)
        L16:
            int r1 = r5.o
            int r1 = r1 + r0
            r5.o = r1
            return r2
        L1c:
            if (r0 != 0) goto L21
            java.lang.String r0 = ""
            return r0
        L21:
            if (r0 < 0) goto L40
            int r2 = r5.m
            if (r0 > r2) goto L34
            r5.Q(r0)
            java.lang.String r2 = new java.lang.String
            int r3 = r5.o
            java.nio.charset.Charset r4 = defpackage.AbstractC0368Up.a
            r2.<init>(r1, r3, r0, r4)
            goto L16
        L34:
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r5.H(r0)
            java.nio.charset.Charset r2 = defpackage.AbstractC0368Up.a
            r1.<init>(r0, r2)
            return r1
        L40:
            gq r0 = defpackage.C2744gq.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3056ma.y():java.lang.String");
    }

    @Override // defpackage.AbstractC3111na
    public final String z() throws IOException {
        int iM = M();
        int i = this.o;
        int i2 = this.m;
        int i3 = i2 - i;
        byte[] bArrH = this.f;
        if (iM <= i3 && iM > 0) {
            this.o = i + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                throw C2744gq.d();
            }
            i = 0;
            if (iM <= i2) {
                Q(iM);
                this.o = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return AbstractC2557dL.a.o(i, bArrH, iM);
    }
}

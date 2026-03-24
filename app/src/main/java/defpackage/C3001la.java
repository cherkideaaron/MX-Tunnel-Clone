package defpackage;

import com.google.android.gms.common.api.Api;

/* renamed from: la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3001la extends AbstractC3111na {
    public final byte[] e;
    public int f;
    public int m;
    public int n;
    public final int o;
    public int p;
    public int q;

    public C3001la(byte[] bArr, int i, int i2, boolean z) {
        super(0);
        this.q = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.e = bArr;
        this.f = i2 + i;
        this.n = i;
        this.o = i;
    }

    @Override // defpackage.AbstractC3111na
    public final int A() throws C2744gq {
        if (i()) {
            this.p = 0;
            return 0;
        }
        int iJ = J();
        this.p = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new C2744gq("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.AbstractC3111na
    public final int B() {
        return J();
    }

    @Override // defpackage.AbstractC3111na
    public final long C() {
        return K();
    }

    @Override // defpackage.AbstractC3111na
    public final boolean F(int i) throws C2744gq {
        int iJ;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                iJ = 8;
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
                    N(4);
                    return true;
                }
                iJ = J();
            }
            N(iJ);
            return true;
        }
        int i4 = this.f - this.n;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.n;
                this.n = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw C2744gq.c();
        }
        while (i3 < 10) {
            int i6 = this.n;
            if (i6 == this.f) {
                throw C2744gq.e();
            }
            this.n = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw C2744gq.c();
        return true;
    }

    public final int H() throws C2744gq {
        int i = this.n;
        if (this.f - i < 4) {
            throw C2744gq.e();
        }
        this.n = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws C2744gq {
        int i = this.n;
        if (this.f - i < 8) {
            throw C2744gq.e();
        }
        this.n = i + 8;
        byte[] bArr = this.e;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int J() {
        int i;
        int i2 = this.n;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.n = i4;
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
                this.n = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.n;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.n = i3;
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
                this.n = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() throws C2744gq {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.n;
            if (i2 == this.f) {
                throw C2744gq.e();
            }
            this.n = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.e[i2] & 128) == 0) {
                return j;
            }
        }
        throw C2744gq.c();
    }

    public final void M() {
        int i = this.f + this.m;
        this.f = i;
        int i2 = i - this.o;
        int i3 = this.q;
        if (i2 <= i3) {
            this.m = 0;
            return;
        }
        int i4 = i2 - i3;
        this.m = i4;
        this.f = i - i4;
    }

    public final void N(int i) throws C2744gq {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.n;
            if (i <= i2 - i3) {
                this.n = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C2744gq.e();
        }
        throw C2744gq.d();
    }

    @Override // defpackage.AbstractC3111na
    public final void c(int i) throws C2744gq {
        if (this.p != i) {
            throw new C2744gq("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.AbstractC3111na
    public final int g() {
        return this.n - this.o;
    }

    @Override // defpackage.AbstractC3111na
    public final boolean i() {
        return this.n == this.f;
    }

    @Override // defpackage.AbstractC3111na
    public final void j(int i) {
        this.q = i;
        M();
    }

    @Override // defpackage.AbstractC3111na
    public final int k(int i) throws C2744gq {
        if (i < 0) {
            throw C2744gq.d();
        }
        int iG = g() + i;
        if (iG < 0) {
            throw new C2744gq("Failed to parse the message.");
        }
        int i2 = this.q;
        if (iG > i2) {
            throw C2744gq.e();
        }
        this.q = iG;
        M();
        return i2;
    }

    @Override // defpackage.AbstractC3111na
    public final boolean l() {
        return K() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // defpackage.AbstractC3111na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0519b8 m() throws defpackage.C2744gq {
        /*
            r4 = this;
            int r0 = r4.J()
            byte[] r1 = r4.e
            if (r0 <= 0) goto L19
            int r2 = r4.f
            int r3 = r4.n
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            b8 r1 = defpackage.C0519b8.c(r3, r1, r0)
            int r2 = r4.n
            int r2 = r2 + r0
            r4.n = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            b8 r0 = defpackage.C0519b8.c
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f
            int r3 = r4.n
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.n = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = defpackage.AbstractC0368Up.b
        L35:
            b8 r1 = defpackage.C0519b8.c
            b8 r1 = new b8
            r1.<init>(r0)
            return r1
        L3d:
            gq r0 = defpackage.C2744gq.d()
            throw r0
        L42:
            gq r0 = defpackage.C2744gq.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3001la.m():b8");
    }

    @Override // defpackage.AbstractC3111na
    public final double n() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.AbstractC3111na
    public final int o() {
        return J();
    }

    @Override // defpackage.AbstractC3111na
    public final int p() {
        return H();
    }

    @Override // defpackage.AbstractC3111na
    public final long q() {
        return I();
    }

    @Override // defpackage.AbstractC3111na
    public final float r() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.AbstractC3111na
    public final int s() {
        return J();
    }

    @Override // defpackage.AbstractC3111na
    public final long t() {
        return K();
    }

    @Override // defpackage.AbstractC3111na
    public final int u() {
        return H();
    }

    @Override // defpackage.AbstractC3111na
    public final long v() {
        return I();
    }

    @Override // defpackage.AbstractC3111na
    public final int w() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // defpackage.AbstractC3111na
    public final long x() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // defpackage.AbstractC3111na
    public final String y() throws C2744gq {
        int iJ = J();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.n;
            if (iJ <= i - i2) {
                String str = new String(this.e, i2, iJ, AbstractC0368Up.a);
                this.n += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw C2744gq.d();
        }
        throw C2744gq.e();
    }

    @Override // defpackage.AbstractC3111na
    public final String z() throws C2744gq {
        int iJ = J();
        if (iJ > 0) {
            int i = this.f;
            int i2 = this.n;
            if (iJ <= i - i2) {
                String strO = AbstractC2557dL.a.o(i2, this.e, iJ);
                this.n += iJ;
                return strO;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw C2744gq.d();
        }
        throw C2744gq.e();
    }
}

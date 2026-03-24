package com.facebook.ads.redexgen.core;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1057Jb {
    public static String[] A0D = {"XeH1UKKuz1EDpBeQKhAXaKjrjZgsodJU", "Qh9sfVWsiKdbMkoZ0Fly5mM08PFSskfX", "g5Vgu", "IbV76iHRvjKg6MHaSQGzPOhr6f1ApNQX", "p6vckuBwU2Q2AllMmzSrbAD", "CWShENYx4MqsFhdcA74Ut20lXSF9FxoW", "efy3JamC8vBQUYLSbDR2yGzuJR", "AxMKck"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public HA A06;
    public InterfaceC1008Hd A07;
    public JY A08;
    public boolean A0A;
    public boolean A0B;
    public final JW A0C = new JW();
    public C1056Ja A09 = new C1056Ja();

    public abstract long A09(C07084v c07084v);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean A0C(C07084v c07084v, long j, C1056Ja c1056Ja) throws IOException;

    @RequiresNonNull({"trackOutput"})
    private int A00(InterfaceC2252ms interfaceC2252ms) throws IOException {
        if (A03(interfaceC2252ms)) {
            this.A00 = this.A09.A00.A0G;
            if (!this.A0A) {
                this.A07.A6e(this.A09.A00);
                this.A0A = true;
            }
            JY jy = this.A09.A01;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                throw new RuntimeException();
            }
            A0D[7] = "ikA5IIIrIRBN8L1z";
            if (jy != null) {
                this.A08 = this.A09.A01;
            } else if (interfaceC2252ms.A8O() == -1) {
                this.A08 = new C2204lu();
            } else {
                JX jxA02 = this.A0C.A02();
                this.A08 = new C2210m0(this, this.A04, interfaceC2252ms.A8O(), jxA02.A01 + jxA02.A00, jxA02.A05, (jxA02.A04 & 4) != 0);
            }
            this.A01 = 2;
            this.A0C.A04();
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A01(com.facebook.ads.redexgen.core.InterfaceC2252ms r19, com.facebook.ads.redexgen.core.HV r20) throws java.io.IOException {
        /*
            r18 = this;
            r7 = r18
            com.facebook.ads.redexgen.X.JY r0 = r7.A08
            r12 = r19
            long r10 = r0.AHN(r12)
            r6 = 1
            r4 = 0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 < 0) goto L16
            r0 = r20
            r0.A00 = r10
            return r6
        L16:
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L44
            r8 = 2
            java.lang.String[] r3 = com.facebook.ads.redexgen.core.AbstractC1057Jb.A0D
            r2 = 1
            r3 = r3[r2]
            r2 = 30
            char r3 = r3.charAt(r2)
            r2 = 102(0x66, float:1.43E-43)
            if (r3 == r2) goto L33
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L33:
            java.lang.String[] r13 = com.facebook.ads.redexgen.core.AbstractC1057Jb.A0D
            java.lang.String r3 = "VTxPX"
            r2 = 2
            r13[r2] = r3
            java.lang.String r3 = "vg288hyM3d7P0eFgaD3UTrluSy"
            r2 = 6
            r13[r2] = r3
            long r8 = r8 + r10
            long r2 = -r8
            r7.A0A(r2)
        L44:
            boolean r2 = r7.A0B
            if (r2 != 0) goto L5b
            com.facebook.ads.redexgen.X.JY r2 = r7.A08
            com.facebook.ads.redexgen.X.HY r2 = r2.A5Z()
            java.lang.Object r3 = com.facebook.ads.redexgen.core.AbstractC06853y.A02(r2)
            com.facebook.ads.redexgen.X.HY r3 = (com.facebook.ads.redexgen.core.HY) r3
            com.facebook.ads.redexgen.X.HA r2 = r7.A06
            r2.AJ7(r3)
            r7.A0B = r6
        L5b:
            long r8 = r7.A03
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 > 0) goto L69
            com.facebook.ads.redexgen.X.JW r2 = r7.A0C
            boolean r2 = r2.A05(r12)
            if (r2 == 0) goto Lc8
        L69:
            r7.A03 = r4
            com.facebook.ads.redexgen.X.JW r2 = r7.A0C
            com.facebook.ads.redexgen.X.4v r8 = r2.A01()
            long r9 = r7.A09(r8)
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 < 0) goto Lba
            long r5 = r7.A02
            long r5 = r5 + r9
            java.lang.String[] r4 = com.facebook.ads.redexgen.core.AbstractC1057Jb.A0D
            r2 = 2
            r3 = r4[r2]
            r2 = 6
            r2 = r4[r2]
            int r3 = r3.length()
            int r2 = r2.length()
            if (r3 == r2) goto Lc1
            java.lang.String[] r4 = com.facebook.ads.redexgen.core.AbstractC1057Jb.A0D
            java.lang.String r3 = "EPgFULMjpXPDE9er32WaoAxqXEcFdYah"
            r2 = 0
            r4[r2] = r3
            long r3 = r7.A05
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto Lba
        L9b:
            long r2 = r7.A02
            long r12 = r7.A05(r2)
            com.facebook.ads.redexgen.X.Hd r3 = r7.A07
            int r2 = r8.A0A()
            r3.AIr(r8, r2)
            com.facebook.ads.redexgen.X.Hd r11 = r7.A07
            int r15 = r8.A0A()
            r16 = 0
            r17 = 0
            r14 = 1
            r11.AIu(r12, r14, r15, r16, r17)
            r7.A05 = r0
        Lba:
            long r0 = r7.A02
            long r0 = r0 + r9
            r7.A02 = r0
            r0 = 0
            return r0
        Lc1:
            long r3 = r7.A05
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto Lba
            goto L9b
        Lc8:
            r0 = 3
            r7.A01 = r0
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1057Jb.A01(com.facebook.ads.redexgen.X.ms, com.facebook.ads.redexgen.X.HV):int");
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void A02() {
        AbstractC06853y.A02(this.A07);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean A03(InterfaceC2252ms interfaceC2252ms) throws IOException {
        while (true) {
            JW jw = this.A0C;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                break;
            }
            A0D[7] = "RUb6h5R55PuDixsZqq";
            if (!jw.A05(interfaceC2252ms)) {
                this.A01 = 3;
                return false;
            }
            this.A03 = interfaceC2252ms.A8n() - this.A04;
            if (A0C(this.A0C.A01(), this.A04, this.A09)) {
                long jA8n = interfaceC2252ms.A8n();
                if (A0D[7].length() == 17) {
                    break;
                }
                A0D[0] = "MjaWWlFxdP245keDLyVkXHL1D0C1Hazn";
                this.A04 = jA8n;
            } else {
                return true;
            }
        }
        throw new RuntimeException();
    }

    public final int A04(InterfaceC2252ms interfaceC2252ms, HV hv) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                return A00(interfaceC2252ms);
            case 1:
                interfaceC2252ms.AK3((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC2252ms, hv);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A05(long j) {
        return (1000000 * j) / this.A00;
    }

    public final long A06(long j) {
        return (this.A00 * j) / 1000000;
    }

    public final void A07(long j, long j2) {
        this.A0C.A03();
        if (j == 0) {
            A0B(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = A06(j2);
            ((JY) C5C.A0f(this.A08)).AKC(this.A05);
            this.A01 = 2;
        }
    }

    public final void A08(HA ha, InterfaceC1008Hd interfaceC1008Hd) {
        this.A06 = ha;
        this.A07 = interfaceC1008Hd;
        A0B(true);
    }

    public void A0A(long j) {
        this.A02 = j;
    }

    public void A0B(boolean z) {
        if (z) {
            this.A09 = new C1056Ja();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}

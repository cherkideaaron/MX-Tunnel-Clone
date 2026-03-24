package com.facebook.ads.redexgen.core;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2172lO implements InterfaceC1103Kv {
    public static String[] A0B = {"dLkHlusgcNv2NHu1x", "kOXDYUAe8n5k0zIrGkajB2ICMzhCI1bW", "J2PER8S0U1OpHQWQYcrbTTlLRvEHJnnX", "68SowiJizkgZ7NsO9", "yBvkDSkIOuw9vvMDA", "yIdyl2Bhz3wOi3n7q0uPuN", "BOu02ldMHGg7m0a8qy56aJXpGwCl3gmF", "zi7PV4PgK11phQSkaHF2tMz4gZWLtpOH"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public C2461qI A06;
    public InterfaceC1008Hd A07;
    public String A08;
    public final String A0A;
    public final C07084v A09 = new C07084v(new byte[18]);
    public int A02 = 0;
    public long A05 = -9223372036854775807L;

    public C2172lO(String str) {
        this.A0A = str;
    }

    @RequiresNonNull({"output"})
    private void A00() {
        byte[] bArrA0l = this.A09.A0l();
        if (this.A06 == null) {
            this.A06 = H7.A03(bArrA0l, this.A08, this.A0A, null);
            this.A07.A6e(this.A06);
        }
        this.A01 = H7.A01(bArrA0l);
        this.A04 = (int) ((H7.A02(bArrA0l) * 1000000) / this.A06.A0G);
    }

    private boolean A01(C07084v c07084v) {
        while (c07084v.A07() > 0) {
            this.A03 <<= 8;
            this.A03 |= c07084v.A0I();
            if (H7.A07(this.A03)) {
                byte[] bArrA0l = this.A09.A0l();
                bArrA0l[0] = (byte) ((this.A03 >> 24) & 255);
                bArrA0l[1] = (byte) ((this.A03 >> 16) & 255);
                bArrA0l[2] = (byte) ((this.A03 >> 8) & 255);
                bArrA0l[3] = (byte) (this.A03 & 255);
                if (A0B[2].charAt(27) == '4') {
                    throw new RuntimeException();
                }
                A0B[2] = "EvoORA1qucNZxupBm89VmEjcctmXNkxV";
                this.A00 = 4;
                this.A03 = 0;
                return true;
            }
        }
        return false;
    }

    private boolean A02(C07084v c07084v, byte[] bArr, int i) {
        int iMin = Math.min(c07084v.A07(), i - this.A00);
        int bytesToRead = this.A00;
        c07084v.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1103Kv
    public final void A5A(C07084v c07084v) {
        AbstractC06853y.A02(this.A07);
        while (c07084v.A07() > 0) {
            switch (this.A02) {
                case 0:
                    boolean zA01 = A01(c07084v);
                    if (A0B[6].charAt(14) == 'a') {
                        String[] strArr = A0B;
                        strArr[1] = "LnG0CahPOhXel4OI27B1IhRoFtWtCxEm";
                        strArr[7] = "4f6V0CDv6EuXljjMlCYsbwPtjLzOLcdT";
                        if (!zA01) {
                            break;
                        } else {
                            this.A02 = 1;
                            break;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                case 1:
                    if (!A02(c07084v, this.A09.A0l(), 18)) {
                        break;
                    } else {
                        A00();
                        this.A09.A0f(0);
                        this.A07.AIr(this.A09, 18);
                        this.A02 = 2;
                        break;
                    }
                case 2:
                    int iMin = Math.min(c07084v.A07(), this.A01 - this.A00);
                    this.A07.AIr(c07084v, iMin);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + iMin;
                    int i = this.A00;
                    int bytesToRead2 = this.A01;
                    if (i == bytesToRead2) {
                        if (this.A05 != -9223372036854775807L) {
                            this.A07.AIu(this.A05, 1, this.A01, 0, null);
                            this.A05 += this.A04;
                        }
                        this.A02 = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1103Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A08 = lg.A04();
        this.A07 = ha.AKS(lg.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1103Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1103Kv
    public final void AGq(long j, int i) {
        if (j != -9223372036854775807L) {
            this.A05 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1103Kv
    public final void AJ5() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A05 = -9223372036854775807L;
    }
}

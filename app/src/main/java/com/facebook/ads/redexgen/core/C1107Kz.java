package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1107Kz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC1008Hd A07;

    public C1107Kz(InterfaceC1008Hd interfaceC1008Hd) {
        this.A07 = interfaceC1008Hd;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i, long j) {
        this.A00 = i;
        this.A06 = false;
        boolean z = true;
        this.A05 = i == 182 || i == 179;
        if (i != 182) {
            z = false;
        }
        this.A04 = z;
        this.A01 = 0;
        this.A03 = j;
    }

    public final void A02(long j, int i, boolean z) {
        if (this.A00 == 182 && z && this.A05 && this.A03 != -9223372036854775807L) {
            this.A07.AIu(this.A03, this.A06 ? 1 : 0, (int) (j - this.A02), i, null);
        }
        if (this.A00 != 179) {
            this.A02 = j;
        }
    }

    public final void A03(byte[] bArr, int i, int i2) {
        if (this.A04) {
            int i3 = (i + 1) - this.A01;
            if (i3 < i2) {
                int headerOffset = bArr[i3];
                this.A06 = ((headerOffset & 192) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i2 - i;
        }
    }
}

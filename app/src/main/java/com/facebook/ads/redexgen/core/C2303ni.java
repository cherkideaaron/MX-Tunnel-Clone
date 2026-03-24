package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2303ni implements InterfaceC0953Ez {
    public long A00;
    public long A01;
    public C2303ni A02;
    public C0952Ey A03;

    public C2303ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C2303ni A01() {
        this.A03 = null;
        C2303ni c2303ni = this.A02;
        this.A02 = null;
        return c2303ni;
    }

    public final void A02(long j, int i) {
        AbstractC06853y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(C0952Ey c0952Ey, C2303ni c2303ni) {
        this.A03 = c0952Ey;
        this.A02 = c2303ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0953Ez
    public final C0952Ey A6u() {
        return (C0952Ey) AbstractC06853y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0953Ez
    public final C2303ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}

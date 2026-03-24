package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC1426Xr {
    public final C1425Xq A00;
    public final InterfaceC1426Xr A01;

    public QF(InterfaceC1426Xr interfaceC1426Xr, int i, int i2) {
        this.A01 = interfaceC1426Xr;
        this.A00 = new C1425Xq(i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1426Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC1428Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1426Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC1428Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}

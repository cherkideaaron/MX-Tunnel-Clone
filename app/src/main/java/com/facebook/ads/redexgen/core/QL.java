package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QL implements InterfaceC1426Xr {
    public int A00;
    public final InterfaceC1426Xr A01;
    public final InterfaceC1426Xr A02;

    public QL(InterfaceC1426Xr interfaceC1426Xr, int i, InterfaceC1426Xr interfaceC1426Xr2) {
        this.A01 = interfaceC1426Xr;
        this.A00 = i;
        this.A02 = interfaceC1426Xr2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1426Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1426Xr
    public final void flush() {
        this.A02.flush();
    }
}

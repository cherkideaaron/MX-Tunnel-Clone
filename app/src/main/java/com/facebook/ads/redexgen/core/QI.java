package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC1426Xr {
    public int A00;
    public final InterfaceC1426Xr A01;

    public QI(InterfaceC1426Xr interfaceC1426Xr, int i) {
        this.A01 = interfaceC1426Xr;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1426Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1426Xr
    public final void flush() {
        this.A01.flush();
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC1871gE {
    public final /* synthetic */ C1769ea A00;

    public F8(C1769ea c1769ea) {
        this.A00 = c1769ea;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1871gE
    public final void AHA() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4j(this.A00.A03.A94());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1871gE
    public final void AHC(C1873gG c1873gG) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c1873gG == null || !c1873gG.A00()) {
            this.A00.A01.A0F().ABv();
            this.A00.A02.A4j(this.A00.A03.A94());
        } else {
            this.A00.A01.A0F().ABw();
            this.A00.A02.A4j(this.A00.A03.A95());
        }
    }
}

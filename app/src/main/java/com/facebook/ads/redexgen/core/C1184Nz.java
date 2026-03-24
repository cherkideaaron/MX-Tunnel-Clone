package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1184Nz implements InterfaceC1592bh {
    public final /* synthetic */ NO A00;

    public C1184Nz(NO no) {
        this.A00 = no;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1592bh
    public final void ACt() {
        if (this.A00.A0X()) {
            this.A00.A0N();
            this.A00.A0g.setToolbarActionMessage("");
            this.A00.A0g.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1592bh
    public final void AEm() {
        this.A00.A0K = false;
        this.A00.A0U.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1592bh
    public final void AEn() {
        this.A00.A0K = true;
        this.A00.A0U.A06();
    }
}

package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class LQ extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C1555b6 A00;

    public LQ(C1555b6 c1555b6) {
        this.A00 = c1555b6;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}

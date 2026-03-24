package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C0948Eu A00;

    public F1(C0948Eu c0948Eu) {
        this.A00 = c0948Eu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A00.A03.A07();
        this.A00.A04.getEventBus().A04(this.A00.A06, this.A00.A05);
    }
}

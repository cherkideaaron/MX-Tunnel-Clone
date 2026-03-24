package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1023Hs extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C5F A00;

    public C1023Hs(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        YB.A0F(1000, this.A00.A0H);
        this.A00.postDelayed(this, 2000L);
    }
}

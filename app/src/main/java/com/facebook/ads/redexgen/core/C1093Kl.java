package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1093Kl extends AbstractRunnableC1388Wc {
    public final /* synthetic */ AbstractC1586bb A00;

    public C1093Kl(AbstractC1586bb abstractC1586bb) {
        this.A00 = abstractC1586bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}

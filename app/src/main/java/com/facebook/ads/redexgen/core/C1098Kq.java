package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1098Kq extends AbstractRunnableC1388Wc {
    public final /* synthetic */ AbstractC1586bb A00;

    public C1098Kq(AbstractC1586bb abstractC1586bb) {
        this.A00 = abstractC1586bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A08);
        }
    }
}

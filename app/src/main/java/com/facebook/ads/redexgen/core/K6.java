package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C1064Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C1064Ji c1064Ji, boolean z) {
        this.A00 = c1064Ji;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        AbstractC1436Yb abstractC1436YbA0B = this.A00.A0b.A0B();
        if (abstractC1436YbA0B == null) {
            return;
        }
        abstractC1436YbA0B.setPageDetailsVisible((this.A01 || abstractC1436YbA0B.A0E()) ? false : true);
        abstractC1436YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}

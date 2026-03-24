package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1938hJ extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C1937hI A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C1938hJ(C1937hI c1937hI, AnonymousClass62 anonymousClass62) {
        this.A00 = c1937hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}

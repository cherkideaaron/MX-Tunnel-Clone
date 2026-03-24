package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2092k3 extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C2091k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2092k3(C2091k2 c2091k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c2091k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}

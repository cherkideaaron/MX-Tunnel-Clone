package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1942hN extends WP {
    public final /* synthetic */ C1941hM A00;

    public C1942hN(C1941hM c1941hM) {
        this.A00 = c1941hM;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}

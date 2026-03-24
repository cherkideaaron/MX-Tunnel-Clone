package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C07897y extends AbstractC2040j4 {
    public final /* synthetic */ C07877w A00;
    public final /* synthetic */ AbstractC2070jh A01;
    public final /* synthetic */ C07767l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07897y(C07877w c07877w, boolean z, boolean z2, C07767l c07767l, AbstractC2070jh abstractC2070jh) {
        super(z);
        this.A00 = c07877w;
        this.A03 = z2;
        this.A02 = c07767l;
        this.A01 = abstractC2070jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2040j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2040j4
    public final void A01(boolean z) {
        if (!C1351Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC1686dD.A01(this.A00.A04, this.A02, 0, new C2079jq(this));
    }
}

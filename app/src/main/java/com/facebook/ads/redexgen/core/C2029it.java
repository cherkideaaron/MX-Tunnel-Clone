package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2029it extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C07877w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C07657a A02;

    public C2029it(C07657a c07657a, O8 o8, C07877w c07877w) {
        this.A02 = c07657a;
        this.A01 = o8;
        this.A00 = c07877w;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C1373Vm(adErrorType, ""));
    }
}

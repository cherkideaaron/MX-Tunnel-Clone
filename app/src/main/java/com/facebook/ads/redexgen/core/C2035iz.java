package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2035iz extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C2088jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C07747j A02;

    public C2035iz(C07747j c07747j, O8 o8, C2088jz c2088jz) {
        this.A02 = c07747j;
        this.A01 = o8;
        this.A00 = c2088jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1373Vm c1373VmA00 = C1373Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c1373VmA00.A03().getErrorCode(), c1373VmA00.A04());
        this.A02.A07.A0G(c1373VmA00);
    }
}

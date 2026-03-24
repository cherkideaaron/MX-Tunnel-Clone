package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2037j1 extends AbstractRunnableC1388Wc {
    public final /* synthetic */ AbstractC2036j0 A00;
    public final /* synthetic */ C1373Vm A01;

    public C2037j1(AbstractC2036j0 abstractC2036j0, C1373Vm c1373Vm) {
        this.A00 = abstractC2036j0;
        this.A01 = c1373Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}

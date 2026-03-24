package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1904gl extends AbstractRunnableC1388Wc {
    public final /* synthetic */ CallableC1302Ss A00;
    public final /* synthetic */ C1303St A01;
    public final /* synthetic */ C1307Sx A02;

    public C1904gl(CallableC1302Ss callableC1302Ss, C1307Sx c1307Sx, C1303St c1303St) {
        this.A00 = callableC1302Ss;
        this.A02 = c1307Sx;
        this.A01 = c1303St;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() throws SecurityException {
        this.A00.A03(this.A01);
    }
}

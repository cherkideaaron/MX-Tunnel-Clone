package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1799f4 extends AbstractRunnableC1388Wc {
    public final /* synthetic */ C1897ge A00;

    public C1799f4(C1897ge c1897ge) {
        this.A00 = c1897ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}

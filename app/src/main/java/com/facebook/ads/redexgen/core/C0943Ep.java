package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0943Ep extends AbstractRunnableC1388Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0938Ek A02;

    public C0943Ep(C0938Ek c0938Ek, int i, int i2) {
        this.A02 = c0938Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A02.A0C.A02(new C0926Dy(this.A00, this.A01));
    }
}

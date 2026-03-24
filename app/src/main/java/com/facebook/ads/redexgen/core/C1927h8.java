package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1927h8 extends WP {
    public final /* synthetic */ C1924h5 A00;
    public final /* synthetic */ C1373Vm A01;

    public C1927h8(C1924h5 c1924h5, C1373Vm c1373Vm) {
        this.A00 = c1924h5;
        this.A01 = c1373Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(XE.A00(this.A01));
        }
    }
}

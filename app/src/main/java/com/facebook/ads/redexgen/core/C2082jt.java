package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2082jt implements InterfaceC1299Sp {
    public final /* synthetic */ C07877w A00;

    public C2082jt(C07877w c07877w) {
        this.A00 = c07877w;
    }

    private void A00(boolean z) {
        if (!z) {
            this.A00.A01.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1299Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1299Sp
    public final void ADT() {
        A00(true);
    }
}

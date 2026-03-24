package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2047jD implements InterfaceC1299Sp {
    public final /* synthetic */ AbstractC2066jd A00;
    public final /* synthetic */ InterfaceC1178Nt A01;
    public final /* synthetic */ C1179Nu A02;
    public final /* synthetic */ C1901gi A03;
    public final /* synthetic */ boolean A04;

    public C2047jD(C1179Nu c1179Nu, C1901gi c1901gi, boolean z, AbstractC2066jd abstractC2066jd, InterfaceC1178Nt interfaceC1178Nt) {
        this.A02 = c1179Nu;
        this.A03 = c1901gi;
        this.A04 = z;
        this.A00 = abstractC2066jd;
        this.A01 = interfaceC1178Nt;
    }

    private void A00(boolean z) {
        if (z) {
            if (C1351Up.A1q(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC1686dD.A01(this.A03, this.A00, 1, new C2048jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
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

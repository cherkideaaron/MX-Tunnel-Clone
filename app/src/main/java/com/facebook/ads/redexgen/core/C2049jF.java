package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2049jF implements SM {
    public final /* synthetic */ AbstractC2066jd A00;
    public final /* synthetic */ InterfaceC1178Nt A01;
    public final /* synthetic */ C1179Nu A02;
    public final /* synthetic */ C1901gi A03;
    public final /* synthetic */ boolean A04;

    public C2049jF(C1179Nu c1179Nu, C1901gi c1901gi, boolean z, AbstractC2066jd abstractC2066jd, InterfaceC1178Nt interfaceC1178Nt) {
        this.A02 = c1179Nu;
        this.A03 = c1901gi;
        this.A04 = z;
        this.A00 = abstractC2066jd;
        this.A01 = interfaceC1178Nt;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        if (C1351Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC1686dD.A01(this.A03, this.A00, 1, new C2050jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}

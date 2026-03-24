package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07747j extends AbstractC2036j0 {
    public C07747j(C1901gi c1901gi, O7 o7) {
        super(c1901gi, o7);
    }

    private C2034iy A00(Runnable runnable) {
        return new C2034iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2036j0
    public final NQ A0I() {
        C2088jz successfullyLoadedAdapter = (C2088jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2036j0
    public final void A0P() {
        C2088jz interstitialAdapter = (C2088jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2036j0
    public final void A0R(N1 n1, C1332Tw c1332Tw, C1330Tu c1330Tu, O8 o8) {
        C2088jz c2088jz = (C2088jz) n1;
        C2035iz c2035iz = new C2035iz(this, o8, c2088jz);
        A0H().postDelayed(c2035iz, c1332Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2088jz.A0A(this.A0B, A00(c2035iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}

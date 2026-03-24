package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC1786er {
    public final View A00;
    public final C1901gi A01;

    public EE(C1901gi c1901gi, View view) {
        this.A01 = c1901gi;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1786er
    public final double A9V() {
        C1847fq result = C1846fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}

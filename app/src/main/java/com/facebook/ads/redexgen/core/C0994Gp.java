package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0994Gp implements InterfaceC1440Yf {
    public final /* synthetic */ AbstractC0988Gj A00;

    public C0994Gp(AbstractC0988Gj abstractC0988Gj) {
        this.A00 = abstractC0988Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}

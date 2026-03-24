package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC1789eu {
    public C0938Ek A00;

    public ED(C1901gi c1901gi) {
        super(c1901gi);
    }

    public ED(C1901gi c1901gi, AttributeSet attributeSet, int i) {
        super(c1901gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1789eu
    public final void AAv(C0938Ek c0938Ek) {
        this.A00 = c0938Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1789eu
    public final void AKV(C0938Ek c0938Ek) {
        A08();
        this.A00 = null;
    }

    public C0938Ek getVideoView() {
        return this.A00;
    }
}

package com.facebook.ads.redexgen.core;

import android.R;

/* loaded from: assets/audience_network/classes2.dex */
public class PQ extends AbstractRunnableC1388Wc {
    public final /* synthetic */ AnimationAnimationListenerC1455Yu A00;

    public PQ(AnimationAnimationListenerC1455Yu animationAnimationListenerC1455Yu) {
        this.A00 = animationAnimationListenerC1455Yu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}

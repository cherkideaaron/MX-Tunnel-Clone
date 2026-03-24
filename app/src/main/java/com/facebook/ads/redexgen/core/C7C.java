package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1930hB {
    public InterfaceC1773ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1901gi c1901gi, NativeAd nativeAd, C1365Vd c1365Vd) {
        C1595bk c1595bk = new C1595bk(c1901gi);
        MediaView mediaView = new MediaView(c1901gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1901gi, nativeAd, nativeAdLayout);
        c1365Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1901gi, nativeAd, c1365Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1595bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1365Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1595bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1271Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}

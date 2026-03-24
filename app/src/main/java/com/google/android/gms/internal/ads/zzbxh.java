package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final class zzbxh extends zzbmf {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbxh(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zze(zzbmm zzbmmVar) {
        this.zza.onNativeAdLoaded(new zzbxc(zzbmmVar));
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* loaded from: classes.dex */
public final class zzcbs extends zzcbf {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcbt zzb;

    public zzcbs(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcbt zzcbtVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        zzcbt zzcbtVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcbtVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}

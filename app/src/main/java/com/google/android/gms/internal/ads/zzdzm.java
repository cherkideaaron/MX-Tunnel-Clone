package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzdzm {
    private final zzbph zza;

    public zzdzm(zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    private final void zzs(zzdzl zzdzlVar) throws JSONException {
        String strZza = zzdzlVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() {
        zzs(new zzdzl("initialize", null));
    }

    public final void zzb(long j) {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("nativeObjectCreated");
        zzs(zzdzlVar);
    }

    public final void zzc(long j) {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("nativeObjectNotCreated");
        zzs(zzdzlVar);
    }

    public final void zzd(long j) {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zze(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzf(long j, int i) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i));
        zzs(zzdzlVar);
    }

    public final void zzg(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzh(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdClicked");
        this.zza.zzb(zzdzlVar.zza());
    }

    public final void zzi(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzj(long j) {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zzk(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzl(long j, int i) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i));
        zzs(zzdzlVar);
    }

    public final void zzm(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzn(long j, int i) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdFailedToShow");
        zzdzlVar.zzd(Integer.valueOf(i));
        zzs(zzdzlVar);
    }

    public final void zzo(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzp(long j, zzcaw zzcawVar) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onUserEarnedReward");
        zzdzlVar.zze(zzcawVar.zze());
        zzdzlVar.zzf(Integer.valueOf(zzcawVar.zzf()));
        zzs(zzdzlVar);
    }

    public final void zzq(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdImpression");
        zzs(zzdzlVar);
    }

    public final void zzr(long j) throws JSONException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdClicked");
        zzs(zzdzlVar);
    }
}

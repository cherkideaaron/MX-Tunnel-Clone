package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzctr extends zzcwf {
    private final zzcjl zzc;
    private final int zzd;
    private final Context zze;
    private final zzctf zzf;
    private final zzdmc zzg;
    private final zzdiq zzh;
    private final zzdbs zzi;
    private final boolean zzj;
    private final zzcdz zzk;
    private final zzdxz zzl;
    private boolean zzm;

    public zzctr(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, int i, zzctf zzctfVar, zzdmc zzdmcVar, zzdiq zzdiqVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzm = false;
        this.zzc = zzcjlVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzctfVar;
        this.zzg = zzdmcVar;
        this.zzh = zzdiqVar;
        this.zzi = zzdbsVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgu)).booleanValue();
        this.zzk = zzcdzVar;
        this.zzl = zzdxzVar;
    }

    public final void zza(zzber zzberVar) {
        zzcjl zzcjlVar = this.zzc;
        if (zzcjlVar != null) {
            zzcjlVar.zzay(zzberVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.Context] */
    public final void zzb(Activity activity, zzbfe zzbfeVar, boolean z) {
        zzcjl zzcjlVar;
        zzfir zzfirVarZzC;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        boolean z2 = this.zzj;
        if (z2) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdmc zzdmcVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzT(zzdmcVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(activity2, this.zzb, this.zzl);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbi)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(activity2)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbj)).booleanValue()) {
                        new zzfvr(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() && (zzcjlVar = this.zzc) != null && (zzfirVarZzC = zzcjlVar.zzC()) != null && zzfirVarZzC.zzar && zzfirVarZzC.zzas != this.zzk.zzj()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(zzfkm.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfkm.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdmcVar.zza(z, activity2, this.zzi);
            if (z2) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdmb e) {
            this.zzi.zzd(e);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final void zzd() {
        super.zzd();
        zzcjl zzcjlVar = this.zzc;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}

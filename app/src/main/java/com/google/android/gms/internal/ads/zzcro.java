package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzcro implements zzgzl {
    final /* synthetic */ zzfqk zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcrv zzd;

    public zzcro(zzcrv zzcrvVar, zzfqk zzfqkVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfqkVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzcrvVar);
        this.zzd = zzcrvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(final Throwable th) {
        final zzfqk zzfqkVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbyr zzbyrVarZza;
                String str2;
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue();
                Throwable th2 = th;
                zzcro zzcroVar = this.zza;
                if (zBooleanValue) {
                    zzcrv zzcrvVar = zzcroVar.zzd;
                    zzbyrVarZza = zzbyp.zzc(zzcrvVar.zzi());
                    zzcrvVar.zzb = zzbyrVarZza;
                    str2 = "AttributionReporting.registerSourceAndPingClickUrl";
                } else {
                    zzcrv zzcrvVar2 = zzcroVar.zzd;
                    zzbyrVarZza = zzbyp.zza(zzcrvVar2.zzi());
                    zzcrvVar2.zza = zzbyrVarZza;
                    str2 = "AttributionReportingSampled.registerSourceAndPingClickUrl";
                }
                zzbyrVarZza.zzh(th2, str2);
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfqkVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfqk zzfqkVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfqkVar.zzb(str, zzvVar, null, null);
            }
        });
    }
}

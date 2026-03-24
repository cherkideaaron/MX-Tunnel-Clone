package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdvj {
    private final zzdxz zza;

    public zzdvj(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final boolean zza(zzfyu zzfyuVar) {
        zzdxy zzdxyVarZza;
        String strValueOf;
        String str = "aq_time_away";
        if (zzfyuVar.zzj()) {
            zzdxyVarZza = this.zza.zza();
            zzdxyVarZza.zzc("action", "aq_ad_closed");
            zzdxyVarZza.zzc("gqi", zzfyuVar.zza());
            zzdxyVarZza.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
            zzdxyVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
            strValueOf = String.valueOf(zzfyuVar.zzg());
        } else {
            zzdxyVarZza = this.zza.zza();
            zzdxyVarZza.zzc("action", "aq_ad_kill");
            zzdxyVarZza.zzc("gqi", zzfyuVar.zza());
            zzdxyVarZza.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
            zzdxyVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
            zzdxyVarZza.zzc("aq_time_away", String.valueOf(zzfyuVar.zzg()));
            strValueOf = String.valueOf(zzfyuVar.zze());
            str = "aq_is_os_kill";
        }
        zzdxyVarZza.zzc(str, strValueOf);
        return zzdxyVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}

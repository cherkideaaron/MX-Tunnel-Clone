package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzctf {
    private final zzdxz zza;
    private final zzfjc zzb;

    public zzctf(zzdxz zzdxzVar, zzfjc zzfjcVar) {
        this.zza = zzdxzVar;
        this.zzb = zzfjcVar;
    }

    public final void zza(long j, int i) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zza(this.zzb.zzb.zzb);
        zzdxyVarZza.zzc("action", "ad_closed");
        zzdxyVarZza.zzc("show_time", String.valueOf(j));
        zzdxyVarZza.zzc("ad_format", "app_open_ad");
        int i2 = i - 1;
        zzdxyVarZza.zzc("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zzdxyVarZza.zzd();
    }
}

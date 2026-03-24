package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcuz implements zzdbz {
    private final zzcjl zza;
    private final zzdxz zzb;
    private final zzfir zzc;

    public zzcuz(zzcjl zzcjlVar, zzdxz zzdxzVar, zzfir zzfirVar) {
        this.zza = zzcjlVar;
        this.zzb = zzdxzVar;
        this.zzc = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        zzcjl zzcjlVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzos)).booleanValue() || (zzcjlVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzcjlVar.zzE()) ? "0" : "1";
        zzdxy zzdxyVarZza = this.zzb.zza();
        zzdxyVarZza.zzc("action", "hcp");
        zzdxyVarZza.zzc("hcp", str);
        zzdxyVarZza.zzb(this.zzc);
        zzdxyVarZza.zzd();
    }
}

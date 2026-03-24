package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcvx {
    private final zzdeg zza;
    private final zzdgl zzb;

    public zzcvx(zzdeg zzdegVar, zzdgl zzdglVar) {
        this.zza = zzdegVar;
        this.zzb = zzdglVar;
    }

    public final zzdeg zza() {
        return this.zza;
    }

    public final zzdje zzb() {
        zzdgl zzdglVar = this.zzb;
        return zzdglVar != null ? new zzdje(zzdglVar, zzcei.zzg) : new zzdje(new zzcvw(this), zzcei.zzg);
    }

    public final zzdgl zzc() {
        return this.zzb;
    }
}

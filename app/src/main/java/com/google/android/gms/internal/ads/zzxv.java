package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzxv implements zzaam {
    public long zza;
    public long zzb;
    public zzaal zzc;
    public zzxv zzd;

    public zzxv(long j, int i) {
        zza(j, 65536);
    }

    public final void zza(long j, int i) {
        zzgrc.zzi(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzxv zzc() {
        this.zzc = null;
        zzxv zzxvVar = this.zzd;
        this.zzd = null;
        return zzxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zzd() {
        zzaal zzaalVar = this.zzc;
        zzaalVar.getClass();
        return zzaalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaam zze() {
        zzxv zzxvVar = this.zzd;
        if (zzxvVar == null || zzxvVar.zzc == null) {
            return null;
        }
        return zzxvVar;
    }
}

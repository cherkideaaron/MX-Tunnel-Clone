package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzibo implements zzibf {
    final int zza;
    final zzies zzb;
    final boolean zzc;
    final boolean zzd;

    public zzibo(zzibw zzibwVar, int i, zzies zziesVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zziesVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzibo) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zzies zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zziet zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zze() {
        return this.zzd;
    }
}

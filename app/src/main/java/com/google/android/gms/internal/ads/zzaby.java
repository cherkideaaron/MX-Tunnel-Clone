package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzaby implements zzadp {
    final /* synthetic */ zzuk zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzacc zzd;

    public zzaby(zzacc zzaccVar, zzuk zzukVar, int i, long j) {
        this.zza = zzukVar;
        this.zzb = i;
        this.zzc = j;
        Objects.requireNonNull(zzaccVar);
        this.zzd = zzaccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zza(long j) {
        this.zzd.zzay(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzb() {
        this.zzd.zzav(this.zza, this.zzb, this.zzc);
    }
}

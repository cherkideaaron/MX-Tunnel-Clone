package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzyj implements zzyc {
    private final zzyc zza;
    private final long zzb;

    public zzyj(zzyc zzycVar, long j) {
        this.zza = zzycVar;
        this.zzb = j;
    }

    public final zzyc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i) {
        int iZzd = this.zza.zzd(zzlhVar, zzihVar, i);
        if (iZzd != -4) {
            return iZzd;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}

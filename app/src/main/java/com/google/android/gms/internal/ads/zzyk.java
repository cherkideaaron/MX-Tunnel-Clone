package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzyk implements zzwi, zzwh {
    private final zzwi zza;
    private final long zzb;
    private zzwh zzc;

    public zzyk(zzwi zzwiVar, long j) {
        this.zza = zzwiVar;
        this.zzb = j;
    }

    public final zzwi zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j) {
        zzyc[] zzycVarArr2 = new zzyc[zzycVarArr.length];
        int i = 0;
        while (true) {
            zzyc zzycVarZza = null;
            if (i >= zzycVarArr.length) {
                break;
            }
            zzyj zzyjVar = (zzyj) zzycVarArr[i];
            if (zzyjVar != null) {
                zzycVarZza = zzyjVar.zza();
            }
            zzycVarArr2[i] = zzycVarZza;
            i++;
        }
        zzwi zzwiVar = this.zza;
        long j2 = this.zzb;
        long jZze = zzwiVar.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzycVarArr.length; i2++) {
            zzyc zzycVar = zzycVarArr2[i2];
            if (zzycVar == null) {
                zzycVarArr[i2] = null;
            } else {
                zzyc zzycVar2 = zzycVarArr[i2];
                if (zzycVar2 == null || ((zzyj) zzycVar2).zza() != zzycVar) {
                    zzycVarArr[i2] = new zzyj(zzycVar, j2);
                }
            }
        }
        return jZze + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j) {
        this.zza.zzg(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j) {
        long j2 = this.zzb;
        return this.zza.zzj(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j, zzmt zzmtVar) {
        long j2 = this.zzb;
        return this.zza.zzk(j - j2, zzmtVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        long j = zzllVar.zza;
        long j2 = this.zzb;
        zzlk zzlkVarZza = zzllVar.zza();
        zzlkVarZza.zza(j - j2);
        return this.zza.zzm(zzlkVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}

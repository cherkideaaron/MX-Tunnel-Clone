package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzvo implements zzwi, zzwh {
    public final zzwi zza;
    long zzb;
    private zzwh zzc;
    private zzvn[] zzd = new zzvn[0];
    private long zze = 0;

    public zzvo(zzwi zzwiVar, boolean z, long j, long j2) {
        this.zza = zzwiVar;
        this.zzb = j2;
    }

    private static long zzq(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j);
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
        int length = zzycVarArr.length;
        this.zzd = new zzvn[length];
        zzyc[] zzycVarArr2 = new zzyc[length];
        int i = 0;
        while (true) {
            zzyc zzycVar = null;
            if (i >= zzycVarArr.length) {
                break;
            }
            zzvn[] zzvnVarArr = this.zzd;
            zzvn zzvnVar = (zzvn) zzycVarArr[i];
            zzvnVarArr[i] = zzvnVar;
            if (zzvnVar != null) {
                zzycVar = zzvnVar.zza;
            }
            zzycVarArr2[i] = zzycVar;
            i++;
        }
        long jZze = this.zza.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j);
        long jZzq = zzq(jZze, j, this.zzb);
        long j2 = -9223372036854775807L;
        if (zzo()) {
            if (jZze < j) {
                j2 = jZzq;
                break;
            }
            if (jZze != 0) {
                for (zzaac zzaacVar : zzaacVarArr) {
                    if (zzaacVar != null) {
                        zzv zzvVarZzc = zzaacVar.zzc();
                        if (!zzas.zzd(zzvVarZzc.zzo, zzvVarZzc.zzk)) {
                            j2 = jZzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j2;
        for (int i2 = 0; i2 < zzycVarArr.length; i2++) {
            zzyc zzycVar2 = zzycVarArr2[i2];
            if (zzycVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzvn[] zzvnVarArr2 = this.zzd;
                zzvn zzvnVar2 = zzvnVarArr2[i2];
                if (zzvnVar2 == null || zzvnVar2.zza != zzycVar2) {
                    zzvnVarArr2[i2] = new zzvn(this, zzycVar2);
                }
            }
            zzycVarArr[i2] = this.zzd[i2];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzh = zzh();
            return jZzh != -9223372036854775807L ? jZzh : j;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(jZzh2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzi < j) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j) {
        this.zze = -9223372036854775807L;
        for (zzvn zzvnVar : this.zzd) {
            if (zzvnVar != null) {
                zzvnVar.zza();
            }
        }
        return zzq(this.zza.zzj(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j, zzmt zzmtVar) {
        if (j == 0) {
            return 0L;
        }
        long j2 = zzmtVar.zzd;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j2, j));
        long j3 = zzmtVar.zze;
        long j4 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (jMax != j2 || jMax2 != j3) {
            zzmtVar = new zzmt(jMax, jMax2);
        }
        return this.zza.zzk(j, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzl < j) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        return this.zza.zzm(zzllVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
    }

    public final boolean zzo() {
        return this.zze != -9223372036854775807L;
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

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaff implements zzafy {
    private final zzafh zza;
    private final long zzb;

    public zzaff(zzafh zzafhVar, long j) {
        this.zza = zzafhVar;
        this.zzb = j;
    }

    private final zzafz zzd(long j, long j2) {
        return new zzafz((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzafh zzafhVar = this.zza;
        zzafg zzafgVar = zzafhVar.zzk;
        zzafgVar.getClass();
        long jZzb = zzafhVar.zzb(j);
        long[] jArr = zzafgVar.zza;
        int iZzm = zzfj.zzm(jArr, jZzb, true, false);
        long j2 = iZzm == -1 ? 0L : jArr[iZzm];
        long[] jArr2 = zzafgVar.zzb;
        zzafz zzafzVarZzd = zzd(j2, iZzm != -1 ? jArr2[iZzm] : 0L);
        if (zzafzVarZzd.zzb == j || iZzm == jArr.length - 1) {
            return new zzafw(zzafzVarZzd, zzafzVarZzd);
        }
        int i = iZzm + 1;
        return new zzafw(zzafzVarZzd, zzd(jArr[i], jArr2[i]));
    }
}

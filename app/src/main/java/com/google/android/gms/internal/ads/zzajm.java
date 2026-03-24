package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class zzajm implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzajm(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfj.zzq(jArr2[jArr2.length - 1]) : j;
    }

    public static zzajm zzd(long j, zzaiq zzaiqVar, long j2) {
        int length = zzaiqVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzaiqVar.zzb + r0[i3];
            j3 += zzaiqVar.zzc + zzaiqVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzajm(jArr, jArr2, j2);
    }

    private static Pair zzh(long j, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int iZzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[iZzm];
        long j3 = jArr2[iZzm];
        int i = iZzm + 1;
        if (i == jArr.length) {
            lValueOf = Long.valueOf(j2);
            lValueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d = j4 == j2 ? 0.0d : (j - j2) / (j4 - j2);
            lValueOf = Long.valueOf(j);
            lValueOf2 = Long.valueOf(((long) (d * (j5 - j3))) + j3);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        String str = zzfj.zza;
        Pair pairZzh = zzh(zzfj.zzp(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzafz zzafzVar = new zzafz(zzfj.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzafw(zzafzVar, zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j) {
        return zzfj.zzq(((Long) zzh(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return -2147483647;
    }
}

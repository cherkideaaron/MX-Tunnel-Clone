package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaju implements zzajr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaju(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzaju zzd(zzajt zzajtVar, long j) {
        long jZzb = zzajtVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        zzafr zzafrVar = zzajtVar.zza;
        return new zzaju(j, zzafrVar.zzc, jZzb, zzafrVar.zzf, zzajtVar.zzc, zzajtVar.zzf);
    }

    private final long zzh(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        if (!zzb()) {
            zzafz zzafzVar = new zzafz(0L, this.zza + this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j2 = this.zzc;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j, j2));
        double d = (jMax * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = (((i == 99 ? 256.0d : jArr[i + 1]) - d3) * (d - i)) + d3;
            }
        }
        long j3 = this.zze;
        zzafz zzafzVar2 = new zzafz(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.zze;
        int iZzm = zzfj.zzm(jArr, (long) d, true, true);
        long jZzh = zzh(iZzm);
        long j3 = jArr[iZzm];
        int i = iZzm + 1;
        long jZzh2 = zzh(i);
        return Math.round((j3 == (iZzm == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (jZzh2 - jZzh)) + jZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzd;
    }
}

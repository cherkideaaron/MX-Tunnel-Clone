package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzagw {
    private final zzagv zza;
    private final zzagh zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzagw(int i, zzagv zzagvVar, zzagh zzaghVar) {
        this.zza = zzagvVar;
        int iZzc = zzagvVar.zzc();
        boolean z = true;
        if (iZzc != 1) {
            if (iZzc == 2) {
                iZzc = 2;
            } else {
                z = false;
            }
        }
        zzgrc.zza(z);
        this.zzc = zzj(i, iZzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzagvVar.zzd();
        this.zzb = zzaghVar;
        this.zzd = iZzc == 2 ? zzj(i, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzagvVar.zzd;
    }

    private final long zzh(int i) {
        return (this.zze * i) / this.zzf;
    }

    private final zzafz zzi(int i) {
        return new zzafz(this.zzn[i] * zzh(1), this.zzm[i]);
    }

    private static int zzj(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public final void zza(long j, boolean z) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i = this.zzk;
            jArr2[i] = j;
            this.zzn[i] = this.zzj;
            this.zzk = i + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i = this.zzk) <= 0) {
            return;
        }
        this.zzf = i;
    }

    public final boolean zzc(int i) {
        return this.zzc == i || this.zzd == i;
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
    }

    public final boolean zze(zzaev zzaevVar) {
        int i = this.zzh;
        zzagh zzaghVar = this.zzb;
        int iZza = i - zzaghVar.zza(zzaevVar, i, false);
        this.zzh = iZza;
        boolean z = iZza == 0;
        if (z) {
            if (this.zzg > 0) {
                zzaghVar.zze(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z;
    }

    public final void zzf(long j) {
        int i;
        if (this.zzk == 0) {
            i = 0;
        } else {
            i = this.zzn[zzfj.zzm(this.zzm, j, true, true)];
        }
        this.zzi = i;
    }

    public final zzafw zzg(long j) {
        if (this.zzk == 0) {
            zzafz zzafzVar = new zzafz(0L, this.zzl);
            return new zzafw(zzafzVar, zzafzVar);
        }
        int iZzh = (int) (j / zzh(1));
        int iZzl = zzfj.zzl(this.zzn, iZzh, true, true);
        if (this.zzn[iZzl] == iZzh) {
            zzafz zzafzVarZzi = zzi(iZzl);
            return new zzafw(zzafzVarZzi, zzafzVarZzi);
        }
        zzafz zzafzVarZzi2 = zzi(iZzl);
        int i = iZzl + 1;
        return i < this.zzm.length ? new zzafw(zzafzVarZzi2, zzi(i)) : new zzafw(zzafzVarZzi2, zzafzVarZzi2);
    }
}

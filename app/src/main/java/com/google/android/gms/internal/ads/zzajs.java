package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
final class zzajs implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajs(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzajs zzd(long j, long j2, zzafr zzafrVar, zzer zzerVar) {
        long jMax;
        int iZzs;
        zzerVar.zzk(6);
        int iZzB = zzerVar.zzB();
        long j3 = zzafrVar.zzc;
        long j4 = iZzB;
        if (zzerVar.zzB() <= 0) {
            return null;
        }
        long jZzr = zzfj.zzr((r4 * zzafrVar.zzg) - 1, zzafrVar.zzd);
        int iZzt = zzerVar.zzt();
        int iZzt2 = zzerVar.zzt();
        int iZzt3 = zzerVar.zzt();
        zzerVar.zzk(2);
        long j5 = j2 + zzafrVar.zzc;
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        for (int i = 0; i < iZzt; i++) {
            jArr[i] = (i * jZzr) / iZzt;
            jArr2[i] = j5;
            if (iZzt3 == 1) {
                iZzs = zzerVar.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzerVar.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzerVar.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzerVar.zzH();
            }
            j5 += iZzs * iZzt2;
        }
        long j6 = j2 + j3;
        long j7 = j4 + j6;
        if (j != -1 && j != j7) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(j7).length());
            Vs.y(sb, "VBRI data size mismatch: ", j, ", ");
            sb.append(j7);
            zzee.zzc("VbriSeeker", sb.toString());
        }
        if (j7 != j5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j5).length() + String.valueOf(j7).length() + 43 + 28);
            Vs.y(sb2, "VBRI bytes and ToC mismatch (using max): ", j7, ", ");
            sb2.append(j5);
            sb2.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb2.toString());
            jMax = Math.max(j7, j5);
        } else {
            jMax = j7;
        }
        return new zzajs(jArr, jArr2, jZzr, j6, jMax, zzafrVar.zzf);
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
        long[] jArr = this.zza;
        int iZzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzafz zzafzVar = new zzafz(j2, jArr2[iZzm]);
        if (zzafzVar.zzb >= j || iZzm == jArr.length - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i = iZzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j) {
        return this.zza[zzfj.zzm(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zze;
    }
}

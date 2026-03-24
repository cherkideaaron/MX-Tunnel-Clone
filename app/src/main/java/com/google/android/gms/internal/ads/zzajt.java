package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzajt {
    public final zzafr zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzajt(zzafr zzafrVar, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = new zzafr(zzafrVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzajt zza(zzafr zzafrVar, zzer zzerVar) {
        long[] jArr;
        int i;
        int i2;
        int iZzB = zzerVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzerVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzerVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzerVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzB & 8) != 0) {
            zzerVar.zzk(4);
        }
        if (zzerVar.zzd() >= 24) {
            zzerVar.zzk(21);
            int iZzx = zzerVar.zzx();
            i2 = iZzx & 4095;
            i = iZzx >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzajt(zzafrVar, iZzH, jZzz, jArr, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return zzfj.zzr((j * r4.zzg) - 1, this.zza.zzd);
    }
}

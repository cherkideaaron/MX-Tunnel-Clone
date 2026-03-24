package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzalc {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzald[] zzl;

    public zzalc(int i, int i2, long j, long j2, long j3, long j4, zzv zzvVar, int i3, zzald[] zzaldVarArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = zzvVar;
        this.zzh = i3;
        this.zzl = zzaldVarArr;
        this.zzk = i4;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzald zza(int i) {
        return this.zzl[i];
    }

    public final zzalc zzb(zzv zzvVar) {
        return new zzalc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}

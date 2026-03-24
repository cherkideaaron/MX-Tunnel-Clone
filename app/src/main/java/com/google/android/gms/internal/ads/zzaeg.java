package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzaeg {
    protected final zzaea zza;
    protected final zzaef zzb;
    protected zzaec zzc;
    private final int zzd;

    public zzaeg(zzaed zzaedVar, zzaef zzaefVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzaefVar;
        this.zzd = i;
        this.zza = new zzaea(zzaedVar, j, 0L, j3, j4, j5, j6);
    }

    public static final int zzf(zzaev zzaevVar, long j, zzafv zzafvVar) {
        if (j == zzaevVar.zzn()) {
            return 0;
        }
        zzafvVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzaev zzaevVar, long j) {
        long jZzn = j - zzaevVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzaevVar.zzf((int) jZzn);
        return true;
    }

    public final zzafy zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzaec zzaecVar = this.zzc;
        if (zzaecVar == null || zzaecVar.zze() != j) {
            zzaea zzaeaVar = this.zza;
            this.zzc = new zzaec(j, zzaeaVar.zzd(j), 0L, zzaeaVar.zze(), zzaeaVar.zzf(), zzaeaVar.zzg(), zzaeaVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        while (true) {
            zzaec zzaecVar = this.zzc;
            zzaecVar.getClass();
            long jZzb = zzaecVar.zzb();
            long jZzc = zzaecVar.zzc();
            long jZzh = zzaecVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzaevVar, jZzb, zzafvVar);
            }
            if (!zzg(zzaevVar, jZzh)) {
                return zzf(zzaevVar, jZzh, zzafvVar);
            }
            zzaevVar.zzl();
            zzaee zzaeeVarZza = this.zzb.zza(zzaevVar, zzaecVar.zzd());
            int iZzd = zzaeeVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzaevVar, jZzh, zzafvVar);
            }
            if (iZzd == -2) {
                zzaecVar.zzf(zzaeeVarZza.zze(), zzaeeVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzaevVar, zzaeeVarZza.zzf());
                    zze(true, zzaeeVarZza.zzf());
                    return zzf(zzaevVar, zzaeeVarZza.zzf(), zzafvVar);
                }
                zzaecVar.zzg(zzaeeVarZza.zze(), zzaeeVarZza.zzf());
            }
        }
    }

    public final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}

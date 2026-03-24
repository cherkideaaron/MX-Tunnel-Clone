package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
abstract class zzalt {
    private zzagh zzb;
    private zzaex zzc;
    private zzalp zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzaln zza = new zzaln();
    private zzalr zzj = new zzalr();

    public void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzalr();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract long zzb(zzer zzerVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzer zzerVar, long j, zzalr zzalrVar);

    public final void zze(zzaex zzaexVar, zzagh zzaghVar) {
        this.zzc = zzaexVar;
        this.zzb = zzaghVar;
        zza(true);
    }

    public final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzi = zzi(j2);
            this.zze = jZzi;
            zzalp zzalpVar = this.zzd;
            String str = zzfj.zza;
            zzalpVar.zzb(jZzi);
            this.zzh = 2;
        }
    }

    public final int zzg(zzaev zzaevVar, zzafv zzafvVar) {
        this.zzb.getClass();
        String str = zzfj.zza;
        int i = this.zzh;
        if (i == 0) {
            while (true) {
                zzaln zzalnVar = this.zza;
                if (!zzalnVar.zzb(zzaevVar)) {
                    break;
                }
                long jZzn = zzaevVar.zzn();
                long j = this.zzf;
                this.zzk = jZzn - j;
                if (zzc(zzalnVar.zzd(), j, this.zzj)) {
                    this.zzf = zzaevVar.zzn();
                } else {
                    zzv zzvVar = this.zzj.zza;
                    this.zzi = zzvVar.zzH;
                    if (!this.zzm) {
                        this.zzb.zzz(zzvVar);
                        this.zzm = true;
                    }
                    zzalp zzalpVar = this.zzj.zzb;
                    if (zzalpVar != null) {
                        this.zzd = zzalpVar;
                    } else if (zzaevVar.zzo() == -1) {
                        this.zzd = new zzals(null);
                    } else {
                        zzalo zzaloVarZzc = zzalnVar.zzc();
                        this.zzd = new zzali(this, this.zzf, zzaevVar.zzo(), zzaloVarZzc.zzd + zzaloVarZzc.zze, zzaloVarZzc.zzb, (zzaloVarZzc.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    zzalnVar.zze();
                }
            }
            return 0;
        }
        if (i == 1) {
            zzaevVar.zzf((int) this.zzf);
            this.zzh = 2;
            return 0;
        }
        if (i != 2) {
            return -1;
        }
        long jZza = this.zzd.zza(zzaevVar);
        if (jZza >= 0) {
            zzafvVar.zza = jZza;
            return 1;
        }
        if (jZza < -1) {
            zzj(-(jZza + 2));
        }
        if (!this.zzl) {
            zzafy zzafyVarZzc = this.zzd.zzc();
            zzafyVarZzc.getClass();
            this.zzc.zzw(zzafyVarZzc);
            this.zzb.zzN(zzafyVarZzc.zza());
            this.zzl = true;
        }
        if (this.zzk > 0 || this.zza.zzb(zzaevVar)) {
            this.zzk = 0L;
            zzer zzerVarZzd = this.zza.zzd();
            long jZzb = zzb(zzerVarZzd);
            if (jZzb >= 0) {
                long j2 = this.zzg;
                if (j2 + jZzb >= this.zze) {
                    long jZzh = zzh(j2);
                    this.zzb.zzc(zzerVarZzd, zzerVarZzd.zze());
                    this.zzb.zze(jZzh, 1, zzerVarZzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZzb;
            return 0;
        }
        this.zzh = 3;
        return -1;
    }

    public final long zzh(long j) {
        return (j * 1000000) / this.zzi;
    }

    public final long zzi(long j) {
        return (this.zzi * j) / 1000000;
    }

    public void zzj(long j) {
        this.zzg = j;
    }
}

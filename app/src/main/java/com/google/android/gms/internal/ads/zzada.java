package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzada {
    private final zzacs zza;
    private final zzact zzf;
    private long zzk;
    private final zzabs zzl;
    private final zzacq zzb = new zzacq();
    private final zzff zzc = new zzff(10);
    private final zzff zzd = new zzff(10);
    private final zzeg zze = new zzeg(16);
    private long zzg = -9223372036854775807L;
    private zzbv zzj = zzbv.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzada(zzabs zzabsVar, zzacs zzacsVar, zzact zzactVar) {
        this.zzl = zzabsVar;
        this.zza = zzacsVar;
        this.zzf = zzactVar;
    }

    private static Object zzh(zzff zzffVar) {
        zzgrc.zza(zzffVar.zzc() > 0);
        while (zzffVar.zzc() > 1) {
            zzffVar.zzd();
        }
        Object objZzd = zzffVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        zzff zzffVar = this.zzd;
        if (zzffVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzffVar)).longValue();
        }
        zzff zzffVar2 = this.zzc;
        if (zzffVar2.zzc() > 0) {
            zzffVar2.zza(0L, (zzbv) zzh(zzffVar2));
        }
    }

    public final void zzb(long j, long j2) {
        while (true) {
            zzeg zzegVar = this.zze;
            if (zzegVar.zzd()) {
                return;
            }
            zzff zzffVar = this.zzd;
            long jZzc = zzegVar.zzc();
            Long l = (Long) zzffVar.zze(jZzc);
            if (l != null && l.longValue() != this.zzk) {
                this.zzk = l.longValue();
                this.zza.zza(2);
            }
            zzacs zzacsVar = this.zza;
            long j3 = this.zzk;
            zzacq zzacqVar = this.zzb;
            int iZzk = zzacsVar.zzk(jZzc, j, j2, j3, false, false, zzacqVar);
            if (iZzk != 5 && iZzk != 4) {
                this.zzf.zza(jZzc, zzacqVar.zza());
            }
            if (iZzk == 0 || iZzk == 1) {
                this.zzh = jZzc;
                long jZzb = zzegVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(jZzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzj)) {
                    this.zzj = zzbvVar;
                    this.zzl.zza(zzbvVar);
                }
                this.zzl.zzb(iZzk == 0 ? System.nanoTime() : zzacqVar.zzb(), jZzb, zzacsVar.zzf());
            } else if (iZzk == 2 || iZzk == 3) {
                this.zzh = jZzc;
                zzegVar.zzb();
                final zzabs zzabsVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzabq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabsVar.zza.zzB().zzc();
                    }
                };
                zzabt zzabtVar = zzabsVar.zza;
                zzabtVar.zzC().execute(runnable);
                ((zzadp) zzabtVar.zzz().remove()).zzb();
            } else if (iZzk != 4) {
                return;
            } else {
                this.zzh = jZzc;
            }
        }
    }

    public final void zzc(int i, int i2) {
        long j = this.zzg;
        this.zzc.zza(j == -9223372036854775807L ? 0L : j + 1, new zzbv(i, i2, 1.0f));
    }

    public final void zzd(int i, long j) {
        if (this.zze.zzd()) {
            this.zza.zza(i);
            this.zzk = j;
        } else {
            zzff zzffVar = this.zzd;
            long j2 = this.zzg;
            zzffVar.zza(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public final void zze(long j) {
        this.zze.zza(j);
        this.zzg = j;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j = this.zzg;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j;
    }

    public final boolean zzg() {
        long j = this.zzi;
        return j != -9223372036854775807L && this.zzh == j;
    }
}

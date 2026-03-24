package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzapk {
    private final zzaon zza;
    private final zzfg zzb;
    private final zzeq zzc = new zzeq(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzapk(zzaon zzaonVar, zzfg zzfgVar) {
        this.zza = zzaonVar;
        this.zzb = zzfgVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzer zzerVar) {
        long jZze;
        long j;
        zzeq zzeqVar = this.zzc;
        zzerVar.zzm(zzeqVar.zza, 0, 3);
        zzeqVar.zzf(0);
        zzeqVar.zzh(8);
        this.zzd = zzeqVar.zzi();
        this.zze = zzeqVar.zzi();
        zzeqVar.zzh(6);
        zzerVar.zzm(zzeqVar.zza, 0, zzeqVar.zzj(8));
        zzeqVar.zzf(0);
        if (this.zzd) {
            zzeqVar.zzh(4);
            long jZzj = zzeqVar.zzj(3);
            zzeqVar.zzh(1);
            int iZzj = zzeqVar.zzj(15) << 15;
            zzeqVar.zzh(1);
            long jZzj2 = zzeqVar.zzj(15);
            zzeqVar.zzh(1);
            if (this.zzf || !this.zze) {
                j = jZzj;
            } else {
                zzeqVar.zzh(4);
                zzeqVar.zzh(1);
                int iZzj2 = zzeqVar.zzj(15) << 15;
                zzeqVar.zzh(1);
                j = jZzj;
                long jZzj3 = zzeqVar.zzj(15);
                zzeqVar.zzh(1);
                this.zzb.zze((zzeqVar.zzj(3) << 30) | iZzj2 | jZzj3);
                this.zzf = true;
            }
            jZze = this.zzb.zze((j << 30) | iZzj | jZzj2);
        } else {
            jZze = 0;
        }
        zzaon zzaonVar = this.zza;
        zzaonVar.zzc(jZze, 4);
        zzaonVar.zzd(zzerVar);
        zzaonVar.zze(false);
    }
}

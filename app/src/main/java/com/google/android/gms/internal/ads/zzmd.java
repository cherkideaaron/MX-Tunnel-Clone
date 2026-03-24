package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
final class zzmd {
    private static final zzwk zzu = new zzwk(new Object(), -1);
    public final zzbf zza;
    public final zzwk zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zziw zzf;
    public final boolean zzg;
    public final zzyn zzh;
    public final zzaak zzi;
    public final List zzj;
    public final zzwk zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmd(zzbf zzbfVar, zzwk zzwkVar, long j, long j2, int i, zziw zziwVar, boolean z, zzyn zzynVar, zzaak zzaakVar, List list, zzwk zzwkVar2, boolean z2, int i2, int i3, zzav zzavVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzbfVar;
        this.zzb = zzwkVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zziwVar;
        this.zzg = z;
        this.zzh = zzynVar;
        this.zzi = zzaakVar;
        this.zzj = list;
        this.zzk = zzwkVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = i3;
        this.zzo = zzavVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzt = j6;
    }

    public static zzmd zza(zzaak zzaakVar) {
        zzbf zzbfVar = zzbf.zza;
        zzwk zzwkVar = zzu;
        return new zzmd(zzbfVar, zzwkVar, -9223372036854775807L, 0L, 1, null, false, zzyn.zza, zzaakVar, zzguf.zzi(), zzwkVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzwk zzb() {
        return zzu;
    }

    public final zzmd zzc(zzwk zzwkVar, long j, long j2, long j3, long j4, zzyn zzynVar, zzaak zzaakVar, List list) {
        zzwk zzwkVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        int i2 = this.zzn;
        zzav zzavVar = this.zzo;
        long j5 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmd(this.zza, zzwkVar, j2, j3, this.zze, this.zzf, this.zzg, zzynVar, zzaakVar, list, zzwkVar2, z, i, i2, zzavVar, j5, j4, j, jElapsedRealtime, false);
    }

    public final zzmd zzd(zzbf zzbfVar) {
        return new zzmd(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zze(int i) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzf(zziw zziwVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zziwVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzg(boolean z) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzh(zzwk zzwkVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzwkVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzi(boolean z, int i, int i2) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, i2, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}

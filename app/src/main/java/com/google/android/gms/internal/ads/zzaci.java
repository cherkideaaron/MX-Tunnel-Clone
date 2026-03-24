package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzaci implements zzadr {
    final /* synthetic */ zzaco zza;
    private zzguf zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzaci(zzaco zzacoVar, Context context, int i) {
        Objects.requireNonNull(zzacoVar);
        this.zza = zzacoVar;
        zzfj.zzR(context);
        this.zzb = zzguf.zzi();
        this.zze = -9223372036854775807L;
        zzado zzadoVar = zzado.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzC(zzaco.zzC(zzvVar.zzE));
        zztVarZza.zzM();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zza() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzb() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzc(zzado zzadoVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzd(zzv zzvVar) {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzg(boolean z) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzh(boolean z) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzi() {
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(this.zze);
        if (zzacoVar.zzy() >= zzacoVar.zzz()) {
            zzacoVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final Surface zzk() {
        zzgrc.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzl(zzacp zzacpVar) {
        this.zza.zzp(zzacpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzm(float f) {
        this.zza.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzguf.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzo(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zza.zzc(surface, zzesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzr(int i) {
        this.zza.zzr(i);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzs(int i, zzv zzvVar, long j, int i2, List list) {
        zzgrc.zzi(false);
        this.zzb = zzguf.zzq(list);
        this.zzc = zzvVar;
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzacoVar.zzt()) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        zzacoVar.zzw().zza(j3, new zzacn(j + this.zzd, i2, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzt() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzw().zzc() == 0) {
            zzacoVar.zzo();
            return;
        }
        zzff zzffVar = new zzff(10);
        boolean z = true;
        while (zzacoVar.zzw().zzc() > 0) {
            zzacn zzacnVar = (zzacn) zzacoVar.zzw().zzd();
            zzacnVar.getClass();
            if (z) {
                int i = zzacnVar.zzb;
                if (i == 0 || i == 1) {
                    zzacnVar = new zzacn(zzacnVar.zza, 0, zzacnVar.zzc);
                } else {
                    zzacoVar.zzo();
                }
            }
            zzffVar.zza(zzacnVar.zzc, zzacnVar);
            z = false;
        }
        zzacoVar.zzx(zzffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzu(long j, zzadp zzadpVar) {
        int i;
        zzgrc.zzi(false);
        long j2 = j + this.zzd;
        zzaco zzacoVar = this.zza;
        long jZzb = zzacoVar.zzv().zzb(j2);
        if (jZzb == -9223372036854775807L || zzacoVar.zzu() == -9223372036854775807L || jZzb >= zzacoVar.zzu() || (i = this.zzf) >= 2) {
            if (zzacoVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i + 1;
        zzadpVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzv(long j, long j2) {
        this.zza.zzl(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzw(boolean z) {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzn(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzx() {
        this.zza.zzg();
    }
}

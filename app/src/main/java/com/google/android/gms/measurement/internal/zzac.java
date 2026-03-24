package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpu;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzac extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzfn zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzad zzadVar, String str, int i, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        super(str, i);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l, Long l2, com.google.android.gms.internal.measurement.zziu zziuVar, boolean z) {
        zzgs zzgsVarZze;
        String strZzc;
        String str;
        Boolean boolZzf;
        zzpu.zza();
        zzic zzicVar = this.zza.zzu;
        boolean zZzp = zzicVar.zzc().zzp(this.zzb, zzfy.zzaD);
        com.google.android.gms.internal.measurement.zzfn zzfnVar = this.zzh;
        boolean zZze = zzfnVar.zze();
        boolean zZzf = zzfnVar.zzf();
        boolean zZzh = zzfnVar.zzh();
        byte b = zZze || zZzf || zZzh;
        Boolean boolZze = null;
        boolZze = null;
        if (z && b != true) {
            zzicVar.zzaV().zzk().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfh zzfhVarZzd = zzfnVar.zzd();
        boolean zZzf2 = zzfhVarZzd.zzf();
        if (zziuVar.zzf()) {
            if (zzfhVarZzd.zzc()) {
                boolZzf = zzab.zzg(zziuVar.zzg(), zzfhVarZzd.zzd());
                boolZze = zzab.zze(boolZzf, zZzf2);
            } else {
                zzgsVarZze = zzicVar.zzaV().zze();
                strZzc = zzicVar.zzl().zzc(zziuVar.zzc());
                str = "No number filter for long property. property";
                zzgsVarZze.zzb(str, strZzc);
            }
        } else if (!zziuVar.zzj()) {
            if (zziuVar.zzd()) {
                if (zzfhVarZzd.zza()) {
                    boolZzf = zzab.zzf(zziuVar.zze(), zzfhVarZzd.zzb(), zzicVar.zzaV());
                } else if (!zzfhVarZzd.zzc()) {
                    zzgsVarZze = zzicVar.zzaV().zze();
                    strZzc = zzicVar.zzl().zzc(zziuVar.zzc());
                    str = "No string or number filter defined. property";
                } else if (zzpk.zzm(zziuVar.zze())) {
                    boolZzf = zzab.zzi(zziuVar.zze(), zzfhVarZzd.zzd());
                } else {
                    zzicVar.zzaV().zze().zzc("Invalid user property value for Numeric number filter. property, value", zzicVar.zzl().zzc(zziuVar.zzc()), zziuVar.zze());
                }
                boolZze = zzab.zze(boolZzf, zZzf2);
            } else {
                zzgsVarZze = zzicVar.zzaV().zze();
                strZzc = zzicVar.zzl().zzc(zziuVar.zzc());
                str = "User property has no value, property";
            }
            zzgsVarZze.zzb(str, strZzc);
        } else if (zzfhVarZzd.zzc()) {
            boolZzf = zzab.zzh(zziuVar.zzk(), zzfhVarZzd.zzd());
            boolZze = zzab.zze(boolZzf, zZzf2);
        } else {
            zzgsVarZze = zzicVar.zzaV().zze();
            strZzc = zzicVar.zzl().zzc(zziuVar.zzc());
            str = "No number filter for double property. property";
            zzgsVarZze.zzb(str, strZzc);
        }
        zzicVar.zzaV().zzk().zzb("Property filter result", boolZze == null ? "null" : boolZze);
        if (boolZze == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zZzh && !boolZze.booleanValue()) {
            return true;
        }
        if (!z || zzfnVar.zze()) {
            this.zze = boolZze;
        }
        if (boolZze.booleanValue() && b != false && zziuVar.zza()) {
            long jZzb = zziuVar.zzb();
            if (l != null) {
                jZzb = l.longValue();
            }
            if (zZzp && zzfnVar.zze() && !zzfnVar.zzf() && l2 != null) {
                jZzb = l2.longValue();
            }
            if (zzfnVar.zzf()) {
                this.zzg = Long.valueOf(jZzb);
            } else {
                this.zzf = Long.valueOf(jZzb);
            }
        }
        return true;
    }
}

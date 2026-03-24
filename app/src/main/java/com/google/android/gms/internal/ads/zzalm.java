package com.google.android.gms.internal.ads;

import defpackage.AP;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public final class zzalm implements zzaeu {
    private zzaex zza;
    private zzalt zzb;
    private boolean zzc;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zzh(zzaev zzaevVar) {
        zzalt zzalqVar;
        zzalo zzaloVar = new zzalo();
        if (zzaloVar.zzc(zzaevVar, true) && (zzaloVar.zza & 2) == 2) {
            int iMin = Math.min(zzaloVar.zze, 8);
            zzer zzerVar = new zzer(iMin);
            zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
            zzerVar.zzh(0);
            if (zzerVar.zzd() >= 5 && zzerVar.zzs() == 127 && zzerVar.zzz() == 1179402563) {
                zzalqVar = new zzalk();
            } else {
                zzerVar.zzh(0);
                if (zzagn.zzd(1, zzerVar, true)) {
                    zzalqVar = new zzalv();
                } else {
                    zzerVar.zzh(0);
                    if (zzalq.zzd(zzerVar)) {
                        zzalqVar = new zzalq();
                    }
                }
            }
            this.zzb = zzalqVar;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        try {
            return zzh(zzaevVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return AP.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws zzat {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzaevVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzaevVar.zzl();
        }
        if (!this.zzc) {
            zzagh zzaghVarZzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzaghVarZzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        zzalt zzaltVar = this.zzb;
        if (zzaltVar != null) {
            zzaltVar.zzf(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ zzaeu zzg() {
        return AP.b(this);
    }
}

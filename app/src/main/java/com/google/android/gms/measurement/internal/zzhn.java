package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzht zza;

    public zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzgs zzgsVarZzj;
        int i2 = i - 1;
        if (i2 == 0) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzj();
        } else if (i2 == 1) {
            zzgu zzguVarZzaV = this.zza.zzu.zzaV();
            zzgsVarZzj = z ? zzguVarZzaV.zzc() : !z2 ? zzguVarZzaV.zzd() : zzguVarZzaV.zzb();
        } else if (i2 == 3) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzk();
        } else if (i2 != 4) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzi();
        } else {
            zzgu zzguVarZzaV2 = this.zza.zzu.zzaV();
            zzgsVarZzj = z ? zzguVarZzaV2.zzf() : !z2 ? zzguVarZzaV2.zzh() : zzguVarZzaV2.zze();
        }
        int size = list.size();
        if (size == 1) {
            zzgsVarZzj.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzj.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzj.zza(str);
        } else {
            zzgsVarZzj.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}

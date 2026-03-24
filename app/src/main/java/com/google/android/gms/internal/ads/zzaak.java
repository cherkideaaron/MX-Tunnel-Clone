package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaak {
    public final int zza;
    public final zzmo[] zzb;
    public final zzaac[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzaak(zzmo[] zzmoVarArr, zzaac[] zzaacVarArr, zzbn zzbnVar, Object obj) {
        int length = zzmoVarArr.length;
        zzgrc.zza(length == zzaacVarArr.length);
        this.zzb = zzmoVarArr;
        this.zzc = (zzaac[]) zzaacVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(zzaak zzaakVar, int i) {
        return zzaakVar != null && Objects.equals(this.zzb[i], zzaakVar.zzb[i]) && Objects.equals(this.zzc[i], zzaakVar.zzc[i]);
    }
}

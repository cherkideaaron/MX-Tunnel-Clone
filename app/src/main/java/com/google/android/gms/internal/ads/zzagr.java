package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzagr implements zzafy {
    final /* synthetic */ zzagt zza;
    private final long zzb;

    public zzagr(zzagt zzagtVar, long j) {
        Objects.requireNonNull(zzagtVar);
        this.zza = zzagtVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzagt zzagtVar = this.zza;
        zzafw zzafwVarZzg = zzagtVar.zzh()[0].zzg(j);
        for (int i = 1; i < zzagtVar.zzh().length; i++) {
            zzafw zzafwVarZzg2 = zzagtVar.zzh()[i].zzg(j);
            if (zzafwVarZzg2.zza.zzc < zzafwVarZzg.zza.zzc) {
                zzafwVarZzg = zzafwVarZzg2;
            }
        }
        return zzafwVarZzg;
    }
}

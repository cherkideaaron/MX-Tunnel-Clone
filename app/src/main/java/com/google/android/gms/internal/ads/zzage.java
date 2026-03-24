package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzage extends zzafj {
    final /* synthetic */ zzafy zza;
    final /* synthetic */ zzagf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzage(zzagf zzagfVar, zzafy zzafyVar, zzafy zzafyVar2) {
        super(zzafyVar);
        this.zza = zzafyVar2;
        Objects.requireNonNull(zzagfVar);
        this.zzb = zzagfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj, com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzafw zzafwVarZzc = this.zza.zzc(j);
        zzafz zzafzVar = zzafwVarZzc.zza;
        long j2 = zzafzVar.zzb;
        zzagf zzagfVar = this.zzb;
        zzafz zzafzVar2 = new zzafz(j2, zzagfVar.zza() + zzafzVar.zzc);
        zzafz zzafzVar3 = zzafwVarZzc.zzb;
        return new zzafw(zzafzVar2, new zzafz(zzafzVar3.zzb, zzagfVar.zza() + zzafzVar3.zzc));
    }
}

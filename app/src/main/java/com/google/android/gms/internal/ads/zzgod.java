package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzgod implements zzgzl {
    final /* synthetic */ zzgoc zza;

    public zzgod(zzgoe zzgoeVar, zzgoc zzgocVar) {
        this.zza = zzgocVar;
        Objects.requireNonNull(zzgoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzgoc zzgocVar = this.zza;
        zzgocVar.zzb(th);
        zzgocVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}

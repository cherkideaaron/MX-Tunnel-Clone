package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzhal extends zzgzv {
    final /* synthetic */ zzhan zza;
    private final zzgyv zzb;

    public zzhal(zzhan zzhanVar, zzgyv zzgyvVar) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        this.zzb = zzgyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final /* bridge */ /* synthetic */ Object zza() {
        zzgyv zzgyvVar = this.zzb;
        As asZza = zzgyvVar.zza();
        zzgrc.zzl(asZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgyvVar);
        return asZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((As) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}

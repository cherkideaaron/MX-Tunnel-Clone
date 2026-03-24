package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzgza extends zzgzb {
    final /* synthetic */ zzgzc zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgza(zzgzc zzgzcVar, Callable callable, Executor executor) {
        super(zzgzcVar, executor);
        Objects.requireNonNull(zzgzcVar);
        this.zza = zzgzcVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final String zzc() {
        return this.zzc.toString();
    }
}

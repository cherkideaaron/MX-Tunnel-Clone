package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcbu implements zzgzl {
    final /* synthetic */ As zza;

    public zzcbu(zzcbz zzcbzVar, As as) {
        this.zza = as;
        Objects.requireNonNull(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzcbz.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbz.zzc.remove(this.zza);
    }
}

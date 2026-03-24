package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdqx implements zzgzl {
    final /* synthetic */ zzdxh zza;
    final /* synthetic */ zzdra zzb;

    public zzdqx(zzdra zzdraVar, zzdxh zzdxhVar) {
        this.zza = zzdxhVar;
        Objects.requireNonNull(zzdraVar);
        this.zzb = zzdraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        Vs.s(this.zzb.zzd().zze(), this.zza.zza());
    }
}

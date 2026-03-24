package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzfjw implements zzgzl {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ int zzb;

    public zzfjw(zzfjx zzfjxVar, int i) {
        this.zzb = i;
        Objects.requireNonNull(zzfjxVar);
        this.zza = zzfjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}

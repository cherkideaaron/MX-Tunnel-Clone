package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzduk implements com.google.android.gms.ads.internal.zzn {
    final /* synthetic */ zzduv zza;

    public zzduk(zzduv zzduvVar) {
        Objects.requireNonNull(zzduvVar);
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzb().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzb().zzb();
    }
}

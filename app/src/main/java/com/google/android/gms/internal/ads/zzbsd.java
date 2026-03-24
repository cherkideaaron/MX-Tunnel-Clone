package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbsd implements zzcer {
    final /* synthetic */ zzbsf zza;

    public zzbsd(zzbsf zzbsfVar) {
        Objects.requireNonNull(zzbsfVar);
        this.zza = zzbsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}

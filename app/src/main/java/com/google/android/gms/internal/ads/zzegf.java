package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzegf implements zzgzl {
    final /* synthetic */ zzbzd zza;
    final /* synthetic */ zzbzm zzb;

    public zzegf(zzegw zzegwVar, zzbzm zzbzmVar, zzbzd zzbzdVar) {
        this.zzb = zzbzmVar;
        this.zza = zzbzdVar;
        Objects.requireNonNull(zzegwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}

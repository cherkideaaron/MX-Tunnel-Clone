package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeue implements zzfax {
    private final Executor zza;
    private final zzcdu zzb;

    public zzeue(Executor executor, zzcdu zzcduVar) {
        this.zza = executor;
        this.zzb = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdJ)).booleanValue()) {
            return zzgzo.zza(new zzeuf(null));
        }
        zzcdu zzcduVar = this.zzb;
        return zzgzo.zzk(zzcduVar.zzq(), zzeud.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 10;
    }
}

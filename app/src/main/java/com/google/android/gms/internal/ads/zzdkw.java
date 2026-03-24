package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class zzdkw implements zzikg {
    private final zzdkr zza;

    private zzdkw(zzdkr zzdkrVar) {
        this.zza = zzdkrVar;
    }

    public static zzdkw zzc(zzdkr zzdkrVar) {
        return new zzdkw(zzdkrVar);
    }

    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}

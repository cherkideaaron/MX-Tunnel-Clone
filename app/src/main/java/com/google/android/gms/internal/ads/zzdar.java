package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzdar implements zzikg {
    private final zzdao zza;

    private zzdar(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdar zzc(zzdao zzdaoVar) {
        return new zzdar(zzdaoVar);
    }

    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}

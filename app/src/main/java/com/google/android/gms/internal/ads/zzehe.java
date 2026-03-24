package com.google.android.gms.internal.ads;

import defpackage.As;

/* loaded from: classes.dex */
public final class zzehe {
    private final zzbzn zza;

    public zzehe(zzbzn zzbznVar) {
        this.zza = zzbznVar;
    }

    public final void zza() {
        As asZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            zzcel.zzb(asZza, "persistFlags");
        } else {
            zzcel.zza(asZza, "persistFlags");
        }
    }
}

package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzikg;

/* loaded from: classes.dex */
public final class zzbd implements zzikg {
    private final zzay zza;

    private zzbd(zzay zzayVar) {
        this.zza = zzayVar;
    }

    public static zzbd zza(zzay zzayVar) {
        return new zzbd(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return this.zza.zze();
    }
}

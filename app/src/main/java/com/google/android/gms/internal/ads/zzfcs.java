package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfcs implements zzfax {
    public zzfcs(zzcdj zzcdjVar, zzgzy zzgzyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        final As asZza = zzgzo.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgN)).booleanValue()) {
            asZza = zzgzo.zza(null);
        }
        final As asZza2 = zzgzo.zza(null);
        return zzgzo.zzo(asZza, asZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfct((String) asZza.get(), (String) asZza2.get());
            }
        }, zzcei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 47;
    }
}

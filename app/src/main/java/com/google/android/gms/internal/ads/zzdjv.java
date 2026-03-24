package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzdjv extends zzdhd implements zzboz {
    public zzdjv(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final synchronized void zza() {
        zzs(zzdju.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(final zzcas zzcasVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzboz) obj).zzb(zzcasVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzc() {
        zzs(zzdjt.zza);
    }
}

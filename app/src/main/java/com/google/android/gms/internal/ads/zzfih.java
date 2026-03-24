package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzfih implements zzese {
    final /* synthetic */ zzfii zza;

    public zzfih(zzfii zzfiiVar) {
        Objects.requireNonNull(zzfiiVar);
        this.zza = zzfiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzfii zzfiiVar = this.zza;
        synchronized (zzfiiVar) {
            zzfiiVar.zzw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfii zzfiiVar = this.zza;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfiiVar) {
            try {
                zzfiiVar.zzw(zzdtzVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzet)).booleanValue()) {
                    zzdtzVar.zzh().zza = zzfiiVar.zzu();
                }
                zzfiiVar.zzv().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzeen implements zzgzl {
    final /* synthetic */ Context zza;

    public zzeen(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        if (((Boolean) zzbiw.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbgp.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbiw.zzj.zze()).booleanValue()) {
            zzbgp.zze(this.zza);
        }
    }
}

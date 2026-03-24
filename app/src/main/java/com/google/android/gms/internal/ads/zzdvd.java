package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdvd implements zzdca {
    private final zzcjl zza;

    public zzdvd(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(Context context) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }
}

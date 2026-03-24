package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcrl implements zzdca {
    private final zzfki zza;

    public zzcrl(zzfki zzfkiVar) {
        this.zza = zzfkiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfjr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(Context context) {
        try {
            zzfki zzfkiVar = this.zza;
            zzfkiVar.zzj();
            if (context != null) {
                zzfkiVar.zzp(context);
            }
        } catch (zzfjr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfjr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzboj implements zzboh {
    private final zzbok zza;

    public zzboj(zzbok zzbokVar) {
        this.zza = zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcjl zzcjlVar = (zzcjl) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e);
        }
        zzbok zzbokVar = this.zza;
        zzbokVar.zza(zEquals);
        zzbokVar.zzb(zEquals2, f);
        zzcjlVar.zzaE(zEquals);
    }
}

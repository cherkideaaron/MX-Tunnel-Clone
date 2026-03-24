package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcrb implements zzcql {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzcrb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z = Boolean.parseBoolean(str);
        zzgVar.zzw(z);
        if (z) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}

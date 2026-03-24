package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class zzbhr {
    private final Map zza = new HashMap();
    private final zzbht zzb;

    public zzbhr(zzbht zzbhtVar) {
        this.zzb = zzbhtVar;
    }

    public final void zza(String str, zzbhq zzbhqVar) {
        this.zza.put(str, zzbhqVar);
    }

    public final void zzb(String str, String str2, long j) {
        Map map = this.zza;
        zzbhq zzbhqVar = (zzbhq) map.get(str2);
        String[] strArr = {str};
        if (zzbhqVar != null) {
            this.zzb.zzb(zzbhqVar, j, strArr);
        }
        map.put(str, new zzbhq(j, null, null));
    }

    public final zzbht zzc() {
        return this.zzb;
    }
}

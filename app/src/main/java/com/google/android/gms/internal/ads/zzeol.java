package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeol implements zzeki {
    private final Map zza = new HashMap();
    private final zzdvp zzb;

    public zzeol(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    public final zzekj zza(String str, JSONObject jSONObject) {
        zzekj zzekjVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzekjVar = (zzekj) map.get(str);
                if (zzekjVar == null) {
                    zzekjVar = new zzekj(this.zzb.zza(str, jSONObject), new zzelw(), str);
                    map.put(str, zzekjVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzekjVar;
    }
}

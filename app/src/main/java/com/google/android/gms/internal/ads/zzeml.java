package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeml implements zzeki {
    private final zzdvp zza;

    public zzeml(zzdvp zzdvpVar) {
        this.zza = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    public final zzekj zza(String str, JSONObject jSONObject) {
        return new zzekj(this.zza.zza(str, jSONObject), new zzelv(), str);
    }
}

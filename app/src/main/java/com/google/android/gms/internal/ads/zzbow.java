package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbow implements zzbox {
    final /* synthetic */ zzcen zza;

    public zzbow(zzboy zzboyVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzboyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(String str) {
        this.zza.zzd(new zzbso(str));
    }
}

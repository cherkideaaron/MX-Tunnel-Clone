package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbtj implements zzbox {
    private final zzcen zza;

    public zzbtj(zzbtl zzbtlVar, zzcen zzcenVar) {
        Objects.requireNonNull(zzbtlVar);
        this.zza = zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbso());
            } else {
                this.zza.zzd(new zzbso(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}

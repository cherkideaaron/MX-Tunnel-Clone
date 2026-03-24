package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbtc implements zzbox {
    final /* synthetic */ zzbtd zza;
    private final zzbsf zzb;
    private final zzcen zzc;

    public zzbtc(zzbtd zzbtdVar, zzbsf zzbsfVar, zzcen zzcenVar) {
        Objects.requireNonNull(zzbtdVar);
        this.zza = zzbtdVar;
        this.zzb = zzbsfVar;
        this.zzc = zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbso());
            } else {
                this.zzc.zzd(new zzbso(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zza();
            throw th;
        }
        this.zzb.zza();
    }
}

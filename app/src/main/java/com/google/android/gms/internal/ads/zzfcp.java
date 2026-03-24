package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.AbstractC3490uQ;
import defpackage.As;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzfcp implements zzfax {
    private final JSONObject zza;

    public zzfcp(Context context) {
        this.zza = zzbzq.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        return zzgzo.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznt)).booleanValue() ? zzfcn.zza : new zzfav() { // from class: com.google.android.gms.internal.ads.zzfco
            @Override // com.google.android.gms.internal.ads.zzfav
            public final /* synthetic */ void zza(Object obj) throws JSONException {
                this.zza.zzc((JSONObject) obj);
            }

            @Override // com.google.android.gms.internal.ads.zzfav
            public final /* synthetic */ void zzb(Object obj) {
                AbstractC3490uQ.a(this, obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 46;
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}

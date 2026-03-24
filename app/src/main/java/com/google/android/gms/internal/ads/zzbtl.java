package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.As;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbtl implements zzgyw {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final As zzb;

    public zzbtl(As as, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzb = as;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final As zza(Object obj) {
        return zzb(obj);
    }

    public final As zzb(final Object obj) {
        return zzgzo.zzj(this.zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzbtk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj2) {
                return this.zza.zzc(obj, (zzbsm) obj2);
            }
        }, zzcei.zzg);
    }

    public final /* synthetic */ As zzc(Object obj, zzbsm zzbsmVar) throws JSONException {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbog.zzo.zzb(string, new zzbtj(this, zzcenVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookMediationAdapter.KEY_ID, string);
        jSONObject.put("args", (JSONObject) obj);
        zzbsmVar.zzb(this.zza, jSONObject);
        return zzcenVar;
    }
}

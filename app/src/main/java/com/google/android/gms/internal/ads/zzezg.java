package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.AbstractC3490uQ;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzezg implements zzfav {
    private final Map zza;

    public zzezg(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        Map map = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (map.isEmpty()) {
            return;
        }
        Bundle bundle = zzdahVar.zza;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            if (!arrayDeque.isEmpty()) {
                zzdzf zzdzfVar = (zzdzf) entry.getKey();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(FacebookMediationAdapter.KEY_ID, zzdzfVar.zza());
                    jSONObject.put("event_type", zzdzfVar.zzb());
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((Long) it.next());
                    }
                    jSONObject.put("timestamps", jSONArray2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e);
                }
            }
        }
        if (jSONArray.length() > 0) {
            bundle.putString("on_device_storage_records", jSONArray.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zzb(Object obj) {
        AbstractC3490uQ.a(this, obj);
    }
}

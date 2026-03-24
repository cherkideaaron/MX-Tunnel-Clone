package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbnm implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        float fFloatValue;
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("args"));
            Iterator<String> itKeys = jSONObject.keys();
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(zzcjlVar.getContext()).edit();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof Integer) {
                    editorEdit.putInt(next, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    editorEdit.putLong(next, ((Long) obj2).longValue());
                } else {
                    if (obj2 instanceof Double) {
                        fFloatValue = ((Double) obj2).floatValue();
                    } else if (obj2 instanceof Float) {
                        fFloatValue = ((Float) obj2).floatValue();
                    } else if (obj2 instanceof Boolean) {
                        editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof String) {
                        editorEdit.putString(next, (String) obj2);
                    }
                    editorEdit.putFloat(next, fFloatValue);
                }
            }
            editorEdit.apply();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "GMSG write local storage KV pairs handler");
        }
    }
}

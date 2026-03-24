package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzajk {
    public static zzacn zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder sbP = AbstractC3264qG.p("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbP.append(message);
        Log.e(str, sbP.toString());
        return new zzacn(Vs.m("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List<String> zza(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) throws JSONException {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}

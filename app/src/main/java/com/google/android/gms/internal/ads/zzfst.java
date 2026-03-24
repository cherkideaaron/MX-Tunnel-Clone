package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import defpackage.AbstractC3669xq;
import defpackage.OM;
import defpackage.RM;
import defpackage.Vs;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzfst implements RM {
    final /* synthetic */ zzfsv zza;

    public zzfst(zzfsv zzfsvVar) {
        Objects.requireNonNull(zzfsvVar);
        this.zza = zzfsvVar;
    }

    @Override // defpackage.RM
    public final void onPostMessage(WebView webView, OM om, Uri uri, boolean z, AbstractC3669xq abstractC3669xq) throws JSONException {
        int i = om.b;
        if (i != 0) {
            throw new IllegalStateException(Vs.o(new StringBuilder("Wrong data accessor type detected. "), i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", "String"));
        }
        try {
            JSONObject jSONObject = new JSONObject(om.a);
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfsg.zza.getClass();
            }
        } catch (JSONException e) {
            zzfue.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}

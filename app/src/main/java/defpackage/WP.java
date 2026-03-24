package defpackage;

import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbre;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract /* synthetic */ class WP {
    public static void a(zzbre zzbreVar, String str, JSONObject jSONObject) {
        zzbreVar.zzc(str, jSONObject.toString());
    }

    public static void b(zzbre zzbreVar, String str, String str2) {
        zzbreVar.zza(AbstractC3264qG.m(new StringBuilder(Vs.f(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    public static void c(zzbre zzbreVar, String str, JSONObject jSONObject) {
        StringBuilder sbP = AbstractC3264qG.p("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbP.toString();
        int i = zze.zza;
        zzo.zzd("Dispatching AFMA event: ".concat(string));
        zzbreVar.zza(sbP.toString());
    }

    public static void d(zzbre zzbreVar, String str, Map map) {
        try {
            zzbreVar.zzd(str, zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i = zze.zza;
            zzo.zzi("Could not convert parameters to JSON.");
        }
    }
}

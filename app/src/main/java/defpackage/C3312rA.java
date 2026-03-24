package defpackage;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3312rA {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;

    public static JSONObject a(C3312rA c3312rA) throws JSONException {
        c3312rA.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            String str = c3312rA.b;
            if (str != null) {
                jSONObject.put("server_name", str);
            }
            jSONObject.put("host", c3312rA.c);
            jSONObject.put("port", c3312rA.e);
            jSONObject.put("remember_creds", c3312rA.f);
            jSONObject.put("allow_cleartext_auth", c3312rA.a);
            if (!c3312rA.f) {
                return jSONObject;
            }
            jSONObject.put("username", c3312rA.g);
            jSONObject.put("password", c3312rA.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.e("ProxyList", "ProxyList.Item.persist", e);
            return null;
        }
    }

    public static C3312rA b(JSONObject jSONObject) {
        try {
            C3312rA c3312rA = new C3312rA();
            c3312rA.a = false;
            c3312rA.b = null;
            c3312rA.c = "";
            c3312rA.d = "";
            c3312rA.e = "";
            c3312rA.f = false;
            c3312rA.g = "";
            if (jSONObject.isNull("server_name")) {
                c3312rA.b = null;
            } else {
                c3312rA.b = jSONObject.getString("server_name");
            }
            c3312rA.c = jSONObject.getString("host");
            c3312rA.e = jSONObject.getString("port");
            c3312rA.f = jSONObject.getBoolean("remember_creds");
            c3312rA.a = jSONObject.getBoolean("allow_cleartext_auth");
            if (!jSONObject.isNull("username")) {
                c3312rA.g = jSONObject.getString("username");
            }
            if (!jSONObject.isNull("password")) {
                c3312rA.d = jSONObject.getString("password");
            }
            return c3312rA;
        } catch (JSONException e) {
            Log.e("ProxyList", "ProxyList.Item.unpersist", e);
            return null;
        }
    }

    public final String c() {
        String str = this.b;
        return str != null ? str : AbstractC3264qG.h(this.c, ":", this.e);
    }
}

package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2562dQ {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = a;
                if (map.containsKey(string)) {
                    return JP.b(((String) map.get(string)) + ":" + string2);
                }
            }
            return JP.b("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            return JP.b("WEB_INTERNAL_ERROR:" + str + "[ " + e.getLocalizedMessage() + " ]");
        }
    }
}

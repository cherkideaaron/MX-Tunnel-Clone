package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class RC {
    public static final C0607co a;

    static {
        C0386Vq c0386Vq = new C0386Vq();
        C2595e5 c2595e5 = C2595e5.a;
        c0386Vq.a(RC.class, c2595e5);
        c0386Vq.a(A6.class, c2595e5);
        a = new C0607co(c0386Vq);
    }

    public static A6 a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, UserVerificationMethods.USER_VERIFY_HANDPRINT);
        }
        return new A6(string, string2, string3, string4, j);
    }
}

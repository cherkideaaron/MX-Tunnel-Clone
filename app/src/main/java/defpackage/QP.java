package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class QP {
    public static final Logger a = new Logger("JSONParser", new String[0]);

    public static Z3 a(JSONObject jSONObject) throws JSONException {
        Z3 z3 = new Z3(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = jSONObject.get(next);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            z3.put(next, objA);
        }
        return z3;
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objA = jSONArray.get(i);
            if (objA instanceof JSONArray) {
                objA = b((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    public static Map c(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        int size = listZza.size();
        Logger logger = a;
        if (size < 2) {
            logger.e(AbstractC3264qG.w("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            Z3 z3D = d(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), "UTF-8"));
            return z3D == null ? new HashMap() : z3D;
        } catch (UnsupportedEncodingException e) {
            logger.e("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    public static Z3 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaao(e);
        }
    }
}

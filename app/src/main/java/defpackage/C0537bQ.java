package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.internal.p002firebaseauthapi.zzba;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0537bQ {
    public Context a;
    public String b;
    public SharedPreferences c;
    public Logger d;

    public final String a(String str) {
        String str2;
        String string = this.c.getString(str, null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        YP ypA = YP.a(this.a, this.b);
        String strSubstring = string.substring(10);
        ypA.getClass();
        Preconditions.checkNotNull(strSubstring);
        zzmy zzmyVar = ypA.b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzba) ypA.b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(strSubstring, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e.getMessage());
            return null;
        }
    }

    public final BP b(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        EP epA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(C3489uP.b(jSONArray3.getString(i)));
            }
            BP bp = new BP(C3663xk.e(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                bp.a = (zzahv) Preconditions.checkNotNull(zzahv.zzb(string));
            }
            if (!z) {
                bp.n = Boolean.FALSE;
            }
            bp.m = str;
            if (jSONObject.has("userMetadata") && (epA = EP.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                bp.o = epA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? Ty.c(jSONObject2) : Objects.equals(strOptString, "totp") ? HJ.c(jSONObject2) : null);
                }
                bp.f(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(HP.c(new JSONObject(jSONArray.getString(i3))));
                }
                bp.s = arrayList3;
            }
            return bp;
        } catch (zzaao e) {
            e = e;
            this.d.wtf(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            this.d.wtf(e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            this.d.wtf(e);
            return null;
        } catch (JSONException e4) {
            e = e4;
            this.d.wtf(e);
            return null;
        }
    }

    public final void c(String str, String str2) {
        String strEncodeToString;
        YP ypA = YP.a(this.a, this.b);
        ypA.getClass();
        Preconditions.checkNotNull(str2);
        zzmy zzmyVar = ypA.b;
        String str3 = null;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (zzmyVar) {
                    strEncodeToString = Base64.encodeToString(((zzba) ypA.b.zza().zza(zzco.zza(), zzba.class)).zzb(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                }
                str3 = strEncodeToString;
            } catch (GeneralSecurityException e) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e.getMessage());
            }
        }
        if (str3 != null) {
            this.c.edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }
}

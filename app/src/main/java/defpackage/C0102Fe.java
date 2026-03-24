package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0102Fe {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public C0102Fe(C3663xk c3663xk) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.c = new Object();
        this.d = new TaskCompletionSource();
        this.a = false;
        this.e = new TaskCompletionSource();
        c3663xk.a();
        Context context = c3663xk.a;
        this.b = c3663xk;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.a = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.a = false;
                boolValueOf = null;
            } else {
                this.a = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f = boolValueOf;
        synchronized (this.c) {
            try {
                if (a()) {
                    ((TaskCompletionSource) this.d).trySetResult(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0102Fe g(String str, JSONObject jSONObject) {
        try {
            C0102Fe c0102Fe = new C0102Fe(str);
            if (!jSONObject.isNull("enabled_name")) {
                c0102Fe.d = jSONObject.getString("enabled_name");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                C3312rA c3312rAB = C3312rA.b(jSONArray.getJSONObject(i));
                if (c3312rAB != null) {
                    String strC = c3312rAB.c();
                    if (!c0102Fe.b(strC)) {
                        ((TreeMap) c0102Fe.e).put(strC, c3312rAB);
                        c0102Fe.a = true;
                    }
                }
            }
            c0102Fe.f(null);
            return c0102Fe;
        } catch (JSONException e) {
            Log.e("ProxyList", "ProxyList.unpersist", e);
            return null;
        }
    }

    public synchronized boolean a() {
        boolean zJ;
        Boolean bool = (Boolean) this.f;
        if (bool != null) {
            zJ = bool.booleanValue();
        } else {
            try {
                zJ = ((C3663xk) this.b).j();
            } catch (IllegalStateException unused) {
                zJ = false;
            }
        }
        c(zJ);
        return zJ;
    }

    public boolean b(String str) {
        return str == null || str.equals((String) this.f);
    }

    public void c(boolean z) {
        String strM = Vs.m("Crashlytics automatic data collection ", z ? "ENABLED" : "DISABLED", " by ", ((Boolean) this.f) == null ? "global Firebase setting" : this.a ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM, null);
        }
    }

    public JSONObject d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = !b((String) this.d) ? (String) this.d : null;
            if (str != null) {
                jSONObject.put("enabled_name", str);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((TreeMap) this.e).values().iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = C3312rA.a((C3312rA) it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
            jSONObject.put("list", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            Log.e("ProxyList", "ProxyList.persist", e);
            return null;
        }
    }

    public void e() {
        String str;
        try {
            if (!this.a || (str = (String) this.b) == null) {
                return;
            }
            AbstractC3279qd.o0((Context) this.c, str, d().toString(4));
            this.a = false;
        } catch (Exception e) {
            Log.e("ProxyList", "ProxyList.save", e);
        }
    }

    public void f(String str) {
        String str2 = (String) this.d;
        if (str == null) {
            str = str2;
        }
        boolean zB = b(str);
        String str3 = (String) this.f;
        if (zB) {
            this.d = str3;
        } else {
            if ((b(str) ? null : (C3312rA) ((TreeMap) this.e).get(str)) != null) {
                this.d = str;
            } else {
                this.d = str3;
            }
        }
        if (str2 == null || !str2.equals((String) this.d)) {
            this.a = true;
        }
    }

    public C0102Fe(String str) {
        this.b = null;
        this.c = null;
        this.a = false;
        this.d = null;
        this.e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.f = null;
        if (str == null) {
            throw new C0234Na();
        }
        this.f = str;
        f(null);
    }
}

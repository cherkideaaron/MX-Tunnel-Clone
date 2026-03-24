package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import defpackage.C0428Yh;
import defpackage.C3356s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final C0428Yh zzd;
    private final String zze;
    private final String zzf;

    static {
        new Logger(zza, new String[0]);
    }

    public zzagx(C0428Yh c0428Yh, String str, String str2) {
        this.zzd = (C0428Yh) Preconditions.checkNotNull(c0428Yh);
        this.zzb = Preconditions.checkNotEmpty(c0428Yh.a);
        this.zzc = Preconditions.checkNotEmpty(c0428Yh.c);
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafa
    public final String zza() throws JSONException {
        C3356s0 c3356s0;
        String str = this.zzc;
        int i = C3356s0.c;
        Preconditions.checkNotEmpty(str);
        try {
            c3356s0 = new C3356s0(str);
        } catch (IllegalArgumentException unused) {
            c3356s0 = null;
        }
        String str2 = c3356s0 != null ? c3356s0.a : null;
        String str3 = c3356s0 != null ? c3356s0.b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Scopes.EMAIL, this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzajk.zza(jSONObject, "captchaResp", str5);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0428Yh zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}

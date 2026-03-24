package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzao implements zzd {
    private final Application zza;
    private final zzaq zzb;
    private final zzl zzc;
    private final Executor zzd;

    public zzao(Application application, zzaq zzaqVar, zzl zzlVar, Executor executor) {
        this.zza = application;
        this.zzb = zzaqVar;
        this.zzd = executor;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(java.lang.String r9, org.json.JSONObject r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            int r0 = r9.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L11
            goto L25
        L11:
            java.lang.String r0 = "write"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L25
            r9 = r2
            goto L26
        L1b:
            java.lang.String r0 = "clear"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L25
            r9 = r3
            goto L26
        L25:
            r9 = -1
        L26:
            java.lang.String r0 = "UserMessagingPlatform"
            if (r9 == 0) goto L81
            if (r9 == r3) goto L2d
            return r2
        L2d:
            java.lang.String r9 = "keys"
            org.json.JSONArray r9 = r10.optJSONArray(r9)
            if (r9 == 0) goto L6f
            int r1 = r9.length()
            if (r1 != 0) goto L3c
            goto L6f
        L3c:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            int r1 = r9.length()
        L45:
            if (r2 >= r1) goto L69
            java.lang.String r4 = r9.optString(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Action[clear]: empty key at index: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r0, r4)
            goto L66
        L63:
            r10.add(r4)
        L66:
            int r2 = r2 + 1
            goto L45
        L69:
            android.app.Application r9 = r8.zza
            com.google.android.gms.internal.consent_sdk.zzcp.zzb(r9, r10)
            goto L80
        L6f:
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Action[clear]: wrong args."
            java.lang.String r9 = r10.concat(r9)
            android.util.Log.d(r0, r9)
        L80:
            return r3
        L81:
            android.app.Application r9 = r8.zza
            com.google.android.gms.internal.consent_sdk.zzco r1 = new com.google.android.gms.internal.consent_sdk.zzco
            r1.<init>(r9)
            java.util.Iterator r9 = r10.keys()
        L8c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Ld7
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r10.opt(r2)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Writing to storage: ["
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = "] "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r0, r5)
            boolean r4 = r1.zze(r2, r4)
            if (r4 == 0) goto Lc9
            com.google.android.gms.internal.consent_sdk.zzaq r4 = r8.zzb
            java.util.Set r4 = r4.zzd()
            r4.add(r2)
            goto L8c
        Lc9:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Failed writing key: "
            java.lang.String r2 = r4.concat(r2)
            android.util.Log.d(r0, r2)
            goto L8c
        Ld7:
            com.google.android.gms.internal.consent_sdk.zzaq r9 = r8.zzb
            r9.zzf()
            r1.zzc()
            java.util.Map r9 = r1.zzb()
            int r10 = r9.size()
            if (r10 <= r3) goto Lf1
            com.google.android.gms.internal.consent_sdk.zzl r10 = r8.zzc
            r10.zza(r9)
            r1.zzd()
        Lf1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzao.zzb(java.lang.String, org.json.JSONObject):boolean");
    }
}

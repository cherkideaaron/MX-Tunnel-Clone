package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcdp;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzgzo;
import defpackage.As;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final /* synthetic */ As zzd(Long l, zzdxz zzdxzVar, zzfoe zzfoeVar, zzfor zzforVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdxzVar, "cld_s", zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfoeVar.zzk(strOptString);
        }
        zzfoeVar.zzd(zOptBoolean);
        zzforVar.zzb(zzfoeVar.zzm());
        return zzgzo.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdxz zzdxzVar, String str, long j) {
        if (zzdxzVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzoe)).booleanValue()) {
                zzdxy zzdxyVarZza = zzdxzVar.zza();
                zzdxyVarZza.zzc("action", "lat_init");
                zzdxyVarZza.zzc(str, Long.toString(j));
                zzdxyVarZza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfor zzforVar, zzdxz zzdxzVar, Long l, boolean z) throws JSONException {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzforVar, zzdxzVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcdp zzcdpVar, zzfor zzforVar, boolean z) throws JSONException {
        zzc(context, versionInfoParcel, false, zzcdpVar, zzcdpVar != null ? zzcdpVar.zze() : null, str, null, zzforVar, null, null, z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:65|30|(1:32)(13:36|(1:38)|39|(1:41)|63|42|(1:46)|49|(1:51)|(1:53)|54|55|(2:57|58)(2:59|60))|33|39|(0)|63|42|(2:44|46)|49|(0)|(0)|54|55|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0126, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103 A[Catch: Exception -> 0x00b7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b7, blocks: (B:30:0x00a4, B:33:0x00b3, B:39:0x00c5, B:41:0x0103, B:42:0x010a, B:44:0x0112, B:46:0x011e, B:49:0x012b, B:51:0x0146, B:53:0x014b, B:54:0x0155, B:57:0x0169, B:59:0x016d, B:48:0x0126, B:36:0x00ba), top: B:65:0x00a4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146 A[Catch: Exception -> 0x00b7, TryCatch #1 {Exception -> 0x00b7, blocks: (B:30:0x00a4, B:33:0x00b3, B:39:0x00c5, B:41:0x0103, B:42:0x010a, B:44:0x0112, B:46:0x011e, B:49:0x012b, B:51:0x0146, B:53:0x014b, B:54:0x0155, B:57:0x0169, B:59:0x016d, B:48:0x0126, B:36:0x00ba), top: B:65:0x00a4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b A[Catch: Exception -> 0x00b7, TryCatch #1 {Exception -> 0x00b7, blocks: (B:30:0x00a4, B:33:0x00b3, B:39:0x00c5, B:41:0x0103, B:42:0x010a, B:44:0x0112, B:46:0x011e, B:49:0x012b, B:51:0x0146, B:53:0x014b, B:54:0x0155, B:57:0x0169, B:59:0x016d, B:48:0x0126, B:36:0x00ba), top: B:65:0x00a4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0169 A[Catch: Exception -> 0x00b7, TRY_ENTER, TryCatch #1 {Exception -> 0x00b7, blocks: (B:30:0x00a4, B:33:0x00b3, B:39:0x00c5, B:41:0x0103, B:42:0x010a, B:44:0x0112, B:46:0x011e, B:49:0x012b, B:51:0x0146, B:53:0x014b, B:54:0x0155, B:57:0x0169, B:59:0x016d, B:48:0x0126, B:36:0x00ba), top: B:65:0x00a4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d A[Catch: Exception -> 0x00b7, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b7, blocks: (B:30:0x00a4, B:33:0x00b3, B:39:0x00c5, B:41:0x0103, B:42:0x010a, B:44:0x0112, B:46:0x011e, B:49:0x012b, B:51:0x0146, B:53:0x014b, B:54:0x0155, B:57:0x0169, B:59:0x016d, B:48:0x0126, B:36:0x00ba), top: B:65:0x00a4, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(android.content.Context r14, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r15, boolean r16, com.google.android.gms.internal.ads.zzcdp r17, java.lang.String r18, java.lang.String r19, java.lang.Runnable r20, final com.google.android.gms.internal.ads.zzfor r21, final com.google.android.gms.internal.ads.zzdxz r22, final java.lang.Long r23, boolean r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzf.zzc(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel, boolean, com.google.android.gms.internal.ads.zzcdp, java.lang.String, java.lang.String, java.lang.Runnable, com.google.android.gms.internal.ads.zzfor, com.google.android.gms.internal.ads.zzdxz, java.lang.Long, boolean):void");
    }
}

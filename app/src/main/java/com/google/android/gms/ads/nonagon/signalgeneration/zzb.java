package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzgah;
import com.google.android.gms.internal.ads.zzgal;
import com.google.android.gms.internal.ads.zzgam;
import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    private final PackageInfo zze;

    public zzb(Context context, long j, PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j;
        this.zze = packageInfo;
        this.zzb = zzdVar;
        this.zzd = scheduledExecutorService;
    }

    public static String zzc(String str) {
        return str == null ? "" : com.google.android.gms.ads.internal.util.zzs.zzl(str, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
    }

    private final boolean zze() {
        return this.zzb.zzj().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziD)).intValue();
    }

    private static final void zzf(Bundle bundle, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziE)).booleanValue()) {
            Vs.s(bundle, zzdxhVar.zza());
        }
    }

    private static final void zzg(Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.String r6, com.google.android.gms.ads.nonagon.signalgeneration.zzbj r7) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L7a
            boolean r0 = r5.zze()
            if (r0 == 0) goto Ld
            goto L7a
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r1.<init>()     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.zza     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "signal_dictionary"
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbb.zza()     // Catch: org.json.JSONException -> L3d
            android.os.Bundle r4 = r7.zzf     // Catch: org.json.JSONException -> L3d
            org.json.JSONObject r3 = r3.zzm(r4)     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = r7.zzc     // Catch: org.json.JSONException -> L3d
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L3d
            if (r1 == 0) goto L3f
            java.lang.String r7 = ""
            goto L6f
        L3d:
            r7 = move-exception
            goto L62
        L3f:
            java.lang.String r7 = zzc(r7)     // Catch: org.json.JSONException -> L3d
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L3d
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L3d
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.zzk()     // Catch: org.json.JSONException -> L3d
            long r1 = r1.currentTimeMillis()     // Catch: org.json.JSONException -> L3d
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L3d
            goto L6b
        L62:
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.zzcdu r2 = com.google.android.gms.ads.internal.zzt.zzh()
            r2.zzg(r7, r1)
        L6b:
            java.lang.String r7 = r0.toString()
        L6f:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L7a
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r5.zzb
            r0.zza(r6, r7)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zza(java.lang.String, com.google.android.gms.ads.nonagon.signalgeneration.zzbj):void");
    }

    public final zzbj zzb(zzcdh zzcdhVar, final zzau zzauVar, Bundle bundle) throws JSONException {
        int i;
        int i2;
        long j;
        zzf(bundle, zzdxh.SIGNAL_ON_DISK_VALIDATION_START);
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx()) {
            this.zzb.zzi();
            zzg(bundle, 7);
        } else {
            PackageInfo packageInfo = this.zze;
            if (packageInfo != null) {
                zzd zzdVar = this.zzb;
                Context context = this.zza;
                String strZze = zzdVar.zze();
                int iZzf = zzdVar.zzf();
                String strZzg = zzdVar.zzg();
                int iZzh = zzdVar.zzh();
                if (TextUtils.equals(context.getApplicationInfo().packageName, strZze) && iZzf == packageInfo.versionCode && TextUtils.equals(Build.MODEL, strZzg) && iZzh == Build.VERSION.SDK_INT) {
                    for (Map.Entry entry : zzdVar.zzj().entrySet()) {
                        try {
                            j = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                        } catch (IOException | JSONException unused) {
                        }
                        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j <= ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziC)).longValue()) {
                            zzgah zzgahVarZzi = zzgal.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            zzgah zzgahVarZzi2 = zzgam.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzed)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            if ((zzgahVarZzi.zzb() == -1 || zzgahVarZzi.zzb() <= j) && (zzgahVarZzi2.zzb() == -1 || zzgahVarZzi2.zzb() <= j)) {
                            }
                        }
                        zzdVar.zzb((String) entry.getKey());
                    }
                } else {
                    zzdVar.zzi();
                    zzdVar.zzd(context.getApplicationInfo().packageName, packageInfo.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                }
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_VALIDATION_END);
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzc > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziz)).longValue()) {
                    zzg(bundle, 2);
                    return null;
                }
                zzf(bundle, zzdxh.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = zzcdhVar.zza;
                String str2 = zzcdhVar.zzb;
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzcdhVar.zzd;
                String string = zzmVar.zzn.toString();
                String string2 = zzmVar.zzc.toString();
                String str3 = zzmVar.zzi;
                String str4 = zzmVar.zzp;
                String strValueOf = String.valueOf(zzmVar.zzo);
                int length = String.valueOf(str).length();
                int length2 = String.valueOf(str2).length();
                int length3 = String.valueOf(string).length();
                int length4 = String.valueOf(string2).length();
                int length5 = String.valueOf(str3).length();
                StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + String.valueOf(str4).length() + strValueOf.length());
                AbstractC3264qG.v(sb, str, str2, string, string2);
                sb.append(str3);
                sb.append(str4);
                sb.append(strValueOf);
                final String strZzg2 = com.google.android.gms.ads.internal.util.client.zzf.zzg(sb.toString());
                if (TextUtils.isEmpty(strZzg2)) {
                    i2 = 3;
                } else {
                    zzf(bundle, zzdxh.SIGNAL_ON_DISK_CACHE_KEY_END);
                    zzf(bundle, zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                    String strZzb = this.zzb.zzb(strZzg2);
                    zzf(bundle, zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                    if (!zze()) {
                        final zzcdh zzcdhVar2 = new zzcdh(str, str2, zzcdhVar.zzc, zzmVar, 2, strZzg2);
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzd(strZzg2, zzauVar, zzcdhVar2);
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziB)).longValue(), TimeUnit.MILLISECONDS);
                    }
                    if (TextUtils.isEmpty(strZzb)) {
                        i2 = 4;
                    } else {
                        zzf(bundle, zzdxh.SIGNAL_ON_DISK_DECODE_START);
                        try {
                            JSONObject jSONObject = new JSONObject(strZzb);
                            String string3 = jSONObject.getString("sr");
                            if (TextUtils.isEmpty(string3)) {
                                zzg(bundle, 8);
                                return null;
                            }
                            String string4 = jSONObject.getString("rs");
                            if (TextUtils.isEmpty(string4)) {
                                zzg(bundle, 9);
                                return null;
                            }
                            String strZzc = zzc(new String(Base64.decode(string4, 10), StandardCharsets.UTF_8));
                            zzf(bundle, zzdxh.SIGNAL_ON_DISK_DECODE_END);
                            try {
                                zzbj zzbjVar = new zzbj(new JsonReader(new StringReader(string3)), null);
                                zzbjVar.zzc = strZzc;
                                zzbjVar.zze = bundle;
                                bundle.putBoolean("sod_h", true);
                                return zzbjVar;
                            } catch (IOException e) {
                                e = e;
                                i = 6;
                                zzg(bundle, i);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DiskCachingManager.getSignalResponse");
                                return null;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            i = 5;
                        }
                    }
                }
                zzg(bundle, i2);
                return null;
            }
            this.zzb.zzi();
            zzg(bundle, 10);
        }
        return null;
    }

    public final /* synthetic */ void zzd(String str, zzau zzauVar, zzcdh zzcdhVar) {
        if (this.zzb.zzc(str) || zze()) {
            return;
        }
        zzauVar.zze(ObjectWrapper.wrap(this.zza), zzcdhVar, null);
    }
}

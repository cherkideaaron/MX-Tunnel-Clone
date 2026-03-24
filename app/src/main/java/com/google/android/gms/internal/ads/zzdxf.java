package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.AbstractC3650xO;
import defpackage.Vs;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes.dex */
public final class zzdxf implements zzdel, zzdct, zzdbi, zzdjy {
    private final zzdxt zza;
    private final zzdye zzb;
    private final int zzc;

    public zzdxf(zzdxt zzdxtVar, zzdye zzdyeVar, int i) {
        this.zza = zzdxtVar;
        this.zzb = zzdyeVar;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle, zzguf zzgufVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() || bundle == null) {
            return;
        }
        Vs.s(bundle, zzdxh.PUBLIC_API_CALLBACK.zza());
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdxtVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgufVar.size();
        for (int i = 0; i < size; i++) {
            zzdxi zzdxiVar = (zzdxi) zzgufVar.get(i);
            long j = bundle.getLong(zzdxiVar.zzb().zza(), -1L);
            long j2 = bundle.getLong(zzdxiVar.zzc().zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdxtVar.zzd(zzdxiVar.zza(), String.valueOf(j2 - j));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdxtVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdxtVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    @Override // com.google.android.gms.internal.ads.zzdjy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzhR
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zziy
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            com.google.android.gms.internal.ads.zzdxt r0 = r5.zza
            int r1 = r5.zzc
            java.util.Map r0 = r0.zzc()
            java.lang.String r2 = "sgw"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
        L36:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r6 != 0) goto L5a
            com.google.android.gms.internal.ads.zzdxt r6 = r5.zza
            java.util.Map r2 = r6.zzc()
            r2.put(r1, r0)
            java.util.Map r0 = r6.zzc()
            java.lang.String r1 = "request_id"
            java.lang.String r2 = "-1"
        L4d:
            r0.put(r1, r2)
        L50:
            com.google.android.gms.internal.ads.zzdye r0 = r5.zzb
            java.util.Map r6 = r6.zzc()
            r0.zzb(r6)
            return
        L5a:
            com.google.android.gms.internal.ads.zzbzu r2 = r6.zzd
            android.os.Bundle r3 = r6.zze
            if (r2 == 0) goto L68
            android.os.Bundle r2 = r2.zzm
            com.google.android.gms.internal.ads.zzguf r3 = com.google.android.gms.internal.ads.zzdxi.zza
            r5.zzc(r2, r3)
            goto L75
        L68:
            if (r3 == 0) goto L75
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L75
            com.google.android.gms.internal.ads.zzguf r2 = com.google.android.gms.internal.ads.zzdxi.zza
            r5.zzc(r3, r2)
        L75:
            java.lang.String r2 = r6.zzc     // Catch: org.json.JSONException -> Ldc
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> Ldc
            if (r2 == 0) goto L80
            java.lang.String r2 = r6.zzb     // Catch: org.json.JSONException -> Ldc
            goto L82
        L80:
            java.lang.String r2 = r6.zzc     // Catch: org.json.JSONException -> Ldc
        L82:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ldc
            r3.<init>(r2)     // Catch: org.json.JSONException -> Ldc
            com.google.android.gms.internal.ads.zzdxt r2 = r5.zza
            java.util.Map r4 = r2.zzc()
            r4.put(r1, r0)
            java.util.Map r0 = r2.zzc()
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzle
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc3
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r3.getJSONObject(r1)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> Lb7
            if (r1 == 0) goto Lb9
            java.lang.String r1 = "1"
            goto Lc5
        Lb7:
            r1 = move-exception
            goto Lbc
        Lb9:
            java.lang.String r1 = "0"
            goto Lc5
        Lbc:
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r2, r1)
        Lc3:
            java.lang.String r1 = "na"
        Lc5:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbzu r6 = r6.zzd
            if (r6 == 0) goto Ld5
            com.google.android.gms.internal.ads.zzdxt r0 = r5.zza
            android.os.Bundle r6 = r6.zza
            r0.zzb(r6)
        Ld5:
            com.google.android.gms.internal.ads.zzdxt r6 = r5.zza
            r6.zzg()
            goto L50
        Ldc:
            com.google.android.gms.internal.ads.zzdxt r6 = r5.zza
            java.util.Map r0 = r6.zzc()
            java.lang.String r2 = "sgf"
            r0.put(r1, r2)
            java.util.Map r0 = r6.zzc()
            java.lang.String r1 = "sgf_reason"
            java.lang.String r2 = "request_invalid"
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxf.zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", "ftl");
        zzdxtVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdxtVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzig)).booleanValue()) {
            zzdxtVar.zzd("emsg", zzeVar.zzb);
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        this.zza.zzb(zzbzuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        this.zza.zza(zzfjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdxt zzdxtVar = this.zza;
            zzdxtVar.zzc().put("action", "sgf");
            zzdxtVar.zzd("sgf_reason", str);
            zzdxtVar.zzg();
            this.zzb.zzb(zzdxtVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", "loaded");
        zzc(zzdxtVar.zze(), zzdxi.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoc)).booleanValue()) {
            zzdxtVar.zzc().put("mafe", true != AbstractC3650xO.b(Features.MUTE_AUDIO) ? "0" : "1");
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }
}

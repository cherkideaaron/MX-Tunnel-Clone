package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.AbstractC3264qG;
import defpackage.As;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdrp {
    private final Context zza;
    private final zzdqv zzb;
    private final zzazh zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbgd zzf;
    private final Executor zzg;
    private final zzbkh zzh;
    private final zzdsh zzi;
    private final zzduv zzj;
    private final ScheduledExecutorService zzk;
    private final zzdtq zzl;
    private final zzdxz zzm;
    private final zzfqk zzn;
    private final zzeiu zzo;
    private final zzejf zzp;
    private final zzfjo zzq;
    private final zzdxt zzr;
    private final zzdzc zzs;

    public zzdrp(Context context, zzdqv zzdqvVar, zzazh zzazhVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, Executor executor, zzfjk zzfjkVar, zzdsh zzdshVar, zzduv zzduvVar, ScheduledExecutorService scheduledExecutorService, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzdtq zzdtqVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxt zzdxtVar, zzdzc zzdzcVar) {
        this.zza = context;
        this.zzb = zzdqvVar;
        this.zzc = zzazhVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbgdVar;
        this.zzg = executor;
        this.zzh = zzfjkVar.zzj;
        this.zzi = zzdshVar;
        this.zzj = zzduvVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdxzVar;
        this.zzn = zzfqkVar;
        this.zzo = zzeiuVar;
        this.zzl = zzdtqVar;
        this.zzp = zzejfVar;
        this.zzq = zzfjoVar;
        this.zzr = zzdxtVar;
        this.zzs = zzdzcVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzez zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzguf.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzguf.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzez zzezVarZzt = zzt(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzezVarZzt != null) {
                arrayList.add(zzezVarZzt);
            }
        }
        return zzguf.zzq(arrayList);
    }

    private final As zzm(JSONArray jSONArray, boolean z, boolean z2, zzdxh zzdxhVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgzo.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            Vs.s(this.zzr.zze(), zzdxhVar.zza());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), zzdro.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.As zzn(org.json.JSONObject r16, boolean r17, com.google.android.gms.internal.ads.zzdxh r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 0
            if (r1 != 0) goto Lb
            As r1 = com.google.android.gms.internal.ads.zzgzo.zza(r2)
            return r1
        Lb:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzeO
            com.google.android.gms.internal.ads.zzbhc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L58
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzeP
            com.google.android.gms.internal.ads.zzbhc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r1.has(r3)
            if (r3 == 0) goto L58
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zzeQ
            com.google.android.gms.internal.ads.zzbhc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ","
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 0
        L48:
            if (r6 >= r5) goto L56
            r7 = r4[r6]
            java.lang.String r8 = r1.getString(r7)     // Catch: org.json.JSONException -> L53
            r3.put(r7, r8)     // Catch: org.json.JSONException -> L53
        L53:
            int r6 = r6 + 1
            goto L48
        L56:
            r14 = r3
            goto L59
        L58:
            r14 = r2
        L59:
            java.lang.String r3 = "url"
            java.lang.String r5 = r1.optString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L6d
            if (r14 == 0) goto L68
            goto L6d
        L68:
            As r1 = com.google.android.gms.internal.ads.zzgzo.zza(r2)
            return r1
        L6d:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzcR
            com.google.android.gms.internal.ads.zzbhc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L8e
            if (r18 == 0) goto L8e
            com.google.android.gms.internal.ads.zzdxt r3 = r0.zzr
            android.os.Bundle r3 = r3.zze()
            java.lang.String r4 = r18.zza()
            defpackage.Vs.s(r3, r4)
        L8e:
            java.lang.String r3 = "scale"
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r1.optDouble(r3, r6)
            java.lang.String r3 = "is_transparent"
            r4 = 1
            boolean r3 = r1.optBoolean(r3, r4)
            java.lang.String r4 = "width"
            r6 = -1
            int r12 = r1.optInt(r4, r6)
            java.lang.String r4 = "height"
            int r13 = r1.optInt(r4, r6)
            if (r17 != 0) goto Lcf
            if (r14 == 0) goto Laf
            goto Lcf
        Laf:
            com.google.android.gms.internal.ads.zzdqv r4 = r0.zzb
            As r3 = r4.zza(r5, r10, r3)
            com.google.android.gms.internal.ads.zzdre r14 = new com.google.android.gms.internal.ads.zzdre
            r4 = r14
            r6 = r10
            r8 = r12
            r9 = r13
            r4.<init>()
            java.util.concurrent.Executor r4 = r0.zzg
            As r3 = com.google.android.gms.internal.ads.zzgzo.zzk(r3, r14, r4)
            java.lang.String r4 = "require"
            boolean r1 = r1.optBoolean(r4)
            As r1 = zzr(r1, r3, r2)
            return r1
        Lcf:
            com.google.android.gms.internal.ads.zzbkd r1 = new com.google.android.gms.internal.ads.zzbkd
            r8 = 0
            android.net.Uri r9 = android.net.Uri.parse(r5)
            r7 = r1
            r7.<init>(r8, r9, r10, r12, r13, r14)
            As r1 = com.google.android.gms.internal.ads.zzgzo.zza(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrp.zzn(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.zzdxh):As");
    }

    private static Integer zzo(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final As zzp(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        final As asZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfirVar, zzfiuVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcceVar);
        return zzgzo.zzj(asZzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) throws zzenv {
                zzcjl zzcjlVar = (zzcjl) obj;
                if (zzcjlVar == null || zzcjlVar.zzh() == null) {
                    throw new zzenv(1, "Retrieve video view in html5 ad response failed.");
                }
                return asZzb;
            }
        }, zzcei.zzg);
    }

    private static As zzq(As as, Object obj) {
        final Object obj2 = null;
        return zzgzo.zzh(as, Exception.class, new zzgyw(obj2) { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgzo.zza(null);
            }
        }, zzcei.zzg);
    }

    private static As zzr(boolean z, final As as, Object obj) {
        return z ? zzgzo.zzj(as, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj2) {
                return obj2 != null ? as : zzgzo.zzc(new zzenv(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcei.zzg) : zzq(as, null);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzs(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }

    private static final com.google.android.gms.ads.internal.client.zzez zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(strOptString, strOptString2);
    }

    public final As zza(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdxhVar);
    }

    public final As zzb(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        zzbkh zzbkhVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbkhVar.zzb, zzbkhVar.zzd, zzdxhVar);
    }

    public final As zzc(JSONObject jSONObject, String str, final zzfir zzfirVar, final zzfiu zzfiuVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcce zzcceVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlx)).booleanValue()) {
            return zzgzo.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgzo.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeO)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeP))) {
                return zzgzo.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzs = zzs(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            Vs.s(this.zzr.zze(), zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza());
        }
        final As asZzj = zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzh(zzrVarZzs, zzfirVar, zzfiuVar, zzbVar, zzcceVar, strOptString, strOptString2, obj);
            }
        }, zzcei.zzf);
        return zzgzo.zzj(asZzj, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) throws zzenv {
                if (((zzcjl) obj) != null) {
                    return asZzj;
                }
                throw new zzenv(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcei.zzg);
    }

    public final As zzd(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgzo.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzr(jSONObjectOptJSONObject.optBoolean("require"), zzgzo.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdxhVar), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdrh
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final As zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcce zzcceVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgzo.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzgzo.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            Vs.s(this.zzr.zze(), zzdxh.NATIVE_ASSETS_LOADING_OMID_START.zza());
        }
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzj(strOptString, zzcceVar, zzbVar, obj);
            }
        }, zzcei.zzf);
    }

    public final As zzf(As as) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            Vs.s(this.zzr.zze(), zzdxh.NATIVE_ASSETS_LOADING_MEDIA_START.zza());
        }
        zzcen zzcenVar = new zzcen();
        zzgzo.zzr(as, new zzdrd(this, zzcenVar), zzcei.zzf);
        return zzcenVar;
    }

    public final As zzg(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        As asZza;
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (jSONObjectZzi != null) {
            return zzp(jSONObjectZzi, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlw)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
                z = true;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                if (!z) {
                    asZza = this.zzi.zza(jSONObjectOptJSONObject, zzbVar, zzcceVar);
                }
                return zzq(zzgzo.zzi(asZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            if (!z) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            }
            asZza = zzp(jSONObjectOptJSONObject, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
            return zzq(zzgzo.zzi(asZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzgzo.zza(null);
    }

    public final /* synthetic */ As zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, String str, String str2, Object obj) throws zzcka {
        zzdzc zzdzcVar;
        zzcjl zzcjlVarZza = this.zzj.zza(zzrVar, zzfirVar, zzfiuVar);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        zzdtn zzdtnVarZza = this.zzl.zza();
        zzclj zzcljVarZzP = zzcjlVarZza.zzP();
        zzbgv zzbgvVar = zzbhe.zzpf;
        zzcljVarZzP.zzab(zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? null : zzcceVar, this.zzo, this.zzn, this.zzm, null, zzdtnVarZza, null, null, null, null, null, null, null);
        zzcjlVarZza.zzab("/getNativeAdViewSignals", zzbog.zzs);
        zzcjlVarZza.zzab("/getNativeClickMeta", zzbog.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziR)).booleanValue() && (zzdzcVar = this.zzs) != null) {
                zzcjlVarZza.zzab("/onDeviceStorageEvent", new zzbop(zzdzcVar));
            }
        }
        zzcjlVarZza.zzP().zzS(true);
        zzcjlVarZza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcem zzcemVar = zzcemVarZza;
                if (z) {
                    zzcemVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                zzcemVar.zzd(new zzenv(1, AbstractC3264qG.l(sb, ", Failing URL: ", str4)));
            }
        });
        zzcjlVarZza.zzau(str, str2, null);
        return zzcemVarZza;
    }

    public final /* synthetic */ zzbka zzi(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbka(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final /* synthetic */ As zzj(String str, zzcce zzcceVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzcka {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzejf zzejfVar = this.zzp;
        zzcjl zzcjlVarZza = zzckb.zza(context, zzclv.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzejfVar, this.zzq, this.zzm);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        zzcjlVarZza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdrm
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzcemVarZza.zzb();
            }
        });
        zzcjlVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            if (zzcceVar != null) {
                zzcjlVarZza.zzP().zzj(zzcceVar);
            }
            zzcjlVarZza.zzP().zzi(zzbVar);
        }
        return zzcemVarZza;
    }
}

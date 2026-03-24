package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.AbstractC3264qG;
import defpackage.As;
import defpackage.Vs;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    public zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    private final As zze(As as, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(as, new zzdqx(this, zzdxhVar), this.zza);
        }
        return as;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.As zza(final com.google.android.gms.internal.ads.zzfjc r18, final com.google.android.gms.internal.ads.zzfir r19, final org.json.JSONObject r20, com.google.android.gms.ads.internal.zzb r21, com.google.android.gms.internal.ads.zzcce r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdra.zza(com.google.android.gms.internal.ads.zzfjc, com.google.android.gms.internal.ads.zzfir, org.json.JSONObject, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzcce):As");
    }

    public final /* synthetic */ zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) throws zzenv {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            Vs.s(this.zzd.zze(), zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int iZzx = zzdohVar.zzx();
            throw new zzenv(1, AbstractC3264qG.k(new StringBuilder(String.valueOf(iZzx).length() + 21), "Invalid template ID: ", iZzx));
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfirVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            strOptString = Vs.o(new StringBuilder(String.valueOf(strZzD).length() + 3 + String.valueOf(strOptString).length()), strZzD, " : ", strOptString);
        }
        zzdohVar.zzs("headline", strOptString);
        zzdohVar.zzs("body", jSONObject.optString("body", null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdohVar.zzs("store", jSONObject.optString("store", null));
        zzdohVar.zzs("price", jSONObject.optString("price", null));
        zzdohVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdohVar;
    }

    public final /* synthetic */ zzdoh zzc(As as, As as2, As as3, As as4, As as5, JSONObject jSONObject, As as6, As as7, As as8, As as9, As as10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            Vs.s(this.zzd.zze(), zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdoh zzdohVar = (zzdoh) as.get();
        zzdohVar.zzd((List) as2.get());
        zzdohVar.zzj((zzbks) as3.get());
        zzdohVar.zzk((zzbks) as4.get());
        zzdohVar.zzc((zzbkl) as5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) as6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) as7.get());
        zzcjl zzcjlVar2 = (zzcjl) as8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) as9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(as9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) as10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }

    public final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }
}

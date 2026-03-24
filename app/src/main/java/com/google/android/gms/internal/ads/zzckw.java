package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzckw {
    private final zzckv zza;
    private final zzckx zzb;

    public zzckw(zzckx zzckxVar, zzckv zzckvVar) {
        this.zza = zzckvVar;
        this.zzb = zzckxVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            zzckx zzckxVar = this.zzb;
            zzazh zzazhVarZzS = ((zzcle) zzckxVar).zzS();
            if (zzazhVarZzS == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                zzazc zzazcVarZzb = zzazhVarZzS.zzb();
                if (zzazcVarZzb == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else {
                    if (zzckxVar.getContext() != null) {
                        return zzazcVarZzb.zzf(zzckxVar.getContext(), str, ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
                    }
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str2);
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        String str;
        zzckx zzckxVar = this.zzb;
        zzazh zzazhVarZzS = ((zzcle) zzckxVar).zzS();
        if (zzazhVarZzS == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            zzazc zzazcVarZzb = zzazhVarZzS.zzb();
            if (zzazcVarZzb == null) {
                str = "Signals object is empty, ignoring.";
            } else {
                if (zzckxVar.getContext() != null) {
                    return zzazcVarZzb.zzj(zzckxVar.getContext(), ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
                }
                str = "Context is null, ignoring.";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() throws JSONException {
        zzckx zzckxVar = this.zzb;
        zzbhe.zza(zzckxVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpi)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzclj zzcljVarZzP = ((zzcjl) zzckxVar).zzP();
            zzczz zzczzVarZzK = zzcljVarZzP != null ? zzcljVarZzP.zzK() : null;
            if (zzczzVarZzK != null) {
                long jZza = zzczzVarZzK.zza();
                if (jZza > 0) {
                    jSONObject.put("plcmtid", jZza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(str);
                }
            });
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    public final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}

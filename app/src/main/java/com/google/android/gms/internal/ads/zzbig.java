package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import defpackage.AbstractC2568de;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbig extends AbstractC2568de {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlq)).split(","));
    private final zzbij zzc;
    private final AbstractC2568de zzd;
    private final zzdye zze;

    public zzbig(zzbij zzbijVar, AbstractC2568de abstractC2568de, zzdye zzdyeVar) {
        this.zzd = abstractC2568de;
        this.zzc = zzbijVar;
        this.zze = zzdyeVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // defpackage.AbstractC2568de
    public final void extraCallback(String str, Bundle bundle) {
        AbstractC2568de abstractC2568de = this.zzd;
        if (abstractC2568de != null) {
            abstractC2568de.extraCallback(str, bundle);
        }
    }

    @Override // defpackage.AbstractC2568de
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        AbstractC2568de abstractC2568de = this.zzd;
        if (abstractC2568de != null) {
            return abstractC2568de.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // defpackage.AbstractC2568de
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        AbstractC2568de abstractC2568de = this.zzd;
        if (abstractC2568de != null) {
            abstractC2568de.onActivityResized(i, i2, bundle);
        }
    }

    @Override // defpackage.AbstractC2568de
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        AbstractC2568de abstractC2568de = this.zzd;
        if (abstractC2568de != null) {
            abstractC2568de.onMessageChannelReady(bundle);
        }
    }

    @Override // defpackage.AbstractC2568de
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.set(false);
        AbstractC2568de abstractC2568de = this.zzd;
        if (abstractC2568de != null) {
            abstractC2568de.onNavigationEvent(i, bundle);
        }
        zzbij zzbijVar = this.zzc;
        zzbijVar.zzg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        zzbijVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // defpackage.AbstractC2568de
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e);
        }
        AbstractC2568de abstractC2568de = this.zzd;
        if (abstractC2568de != null) {
            abstractC2568de.onPostMessage(str, bundle);
        }
    }

    @Override // defpackage.AbstractC2568de
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        AbstractC2568de abstractC2568de = this.zzd;
        if (abstractC2568de != null) {
            abstractC2568de.onRelationshipValidationResult(i, uri, z, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdvp {
    private final zzfkg zza;
    private final zzdvm zzb;

    public zzdvp(zzfkg zzfkgVar, zzdvm zzdvmVar) {
        this.zza = zzfkgVar;
        this.zzb = zzdvmVar;
    }

    public final zzfki zza(String str, JSONObject jSONObject) {
        zzbtw zzbtwVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbtwVarZzb = new zzbuu(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbtwVarZzb = new zzbuu(new zzbwl());
            } else {
                zzbtt zzbttVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbtwVarZzb = zzbttVarZzd.zzc(string) ? zzbttVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbttVarZzd.zzd(string) ? zzbttVarZzd.zzb(string) : zzbttVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                    }
                } else {
                    zzbtwVarZzb = zzbttVarZzd.zzb(str);
                }
            }
            zzfki zzfkiVar = new zzfki(zzbtwVarZzb);
            this.zzb.zza(str, zzfkiVar);
            return zzfkiVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfjr(th);
        }
    }

    public final zzbvs zzb(String str) {
        zzbvs zzbvsVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbvsVarZze);
        return zzbvsVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    public final zzbtt zzd() throws RemoteException {
        zzbtt zzbttVarZzd = this.zza.zzd();
        if (zzbttVarZzd != null) {
            return zzbttVarZzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}

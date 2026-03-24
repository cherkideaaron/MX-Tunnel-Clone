package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzepb implements zzeki {
    private final zzeqf zza;
    private final zzdvp zzb;

    public zzepb(zzeqf zzeqfVar, zzdvp zzdvpVar) {
        this.zza = zzeqfVar;
        this.zzb = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    public final zzekj zza(String str, JSONObject jSONObject) {
        zzbvs zzbvsVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzck)).booleanValue()) {
            try {
                zzbvsVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbvsVarZzb = null;
            }
        } else {
            zzbvsVarZzb = this.zza.zzb(str);
        }
        if (zzbvsVarZzb == null) {
            return null;
        }
        return new zzekj(zzbvsVarZzb, new zzelv(), str);
    }
}

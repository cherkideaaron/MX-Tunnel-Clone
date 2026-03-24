package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbjy {
    private final Context zza;

    public zzbjy(Context context) {
        this.zza = context;
    }

    public final void zza(zzbyv zzbyvVar) {
        String strValueOf;
        String str;
        try {
            ((zzbjz) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbjx.zza)).zze(zzbyvVar);
        } catch (RemoteException e) {
            strValueOf = String.valueOf(e.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            com.google.android.gms.ads.internal.util.client.zzo.zzi(str.concat(strValueOf));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            strValueOf = String.valueOf(e2.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            com.google.android.gms.ads.internal.util.client.zzo.zzi(str.concat(strValueOf));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* loaded from: classes.dex */
public final class zzdtu extends VideoController.VideoLifecycleCallbacks {
    private final zzdoh zza;

    public zzdtu(zzdoh zzdohVar) {
        this.zza = zzdohVar;
    }

    private static com.google.android.gms.ads.internal.client.zzeg zza(zzdoh zzdohVar) {
        com.google.android.gms.ads.internal.client.zzed zzedVarZzy = zzdohVar.zzy();
        if (zzedVarZzy == null) {
            return null;
        }
        try {
            return zzedVarZzy.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzeg zzegVarZza = zza(this.zza);
        if (zzegVarZza == null) {
            return;
        }
        try {
            zzegVarZza.zzh();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzeg zzegVarZza = zza(this.zza);
        if (zzegVarZza == null) {
            return;
        }
        try {
            zzegVarZza.zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzeg zzegVarZza = zza(this.zza);
        if (zzegVarZza == null) {
            return;
        }
        try {
            zzegVarZza.zze();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }
}

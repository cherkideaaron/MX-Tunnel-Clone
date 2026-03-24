package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdmz implements zzboh {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdmz(zzdnb zzdnbVar, View view, byte[] bArr) {
        this.zza = new WeakReference(zzdnbVar);
        this.zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzos)).booleanValue() ? new WeakReference(view) : new WeakReference(null);
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        zzdnb zzdnbVar = (zzdnb) this.zza.get();
        if (zzdnbVar == null) {
            return;
        }
        zzdnbVar.zzC().zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzos)).booleanValue()) {
            zzdnbVar.zzB((View) this.zzb.get());
        }
    }
}

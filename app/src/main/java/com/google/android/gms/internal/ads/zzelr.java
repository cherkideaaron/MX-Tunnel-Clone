package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzelr implements zzdmc {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzfir zzb;
    final /* synthetic */ zzelt zzc;

    public zzelr(zzelt zzeltVar, zzcen zzcenVar, zzfir zzfirVar) {
        this.zza = zzcenVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzeltVar);
        this.zzc = zzeltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z, Context context, zzdbs zzdbsVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzb;
    }
}

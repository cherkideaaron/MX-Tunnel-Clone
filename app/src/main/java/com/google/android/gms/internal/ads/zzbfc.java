package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbfc extends zzbcs implements zzbfe {
    public zzbfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zzc() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zzd() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zzf() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zzg() {
        zzda(5, zza());
    }
}

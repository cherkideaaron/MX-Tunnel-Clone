package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbme extends zzbcs implements zzbmg {
    public zzbme(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zze(zzbmm zzbmmVar) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbmmVar);
        zzda(1, parcelZza);
    }
}

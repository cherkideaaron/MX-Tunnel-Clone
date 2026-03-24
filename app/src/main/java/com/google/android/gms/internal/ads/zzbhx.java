package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbhx extends zzbcs implements zzbhz {
    public zzbhx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhz
    public final void zze(zzbhw zzbhwVar) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbhwVar);
        zzda(1, parcelZza);
    }
}

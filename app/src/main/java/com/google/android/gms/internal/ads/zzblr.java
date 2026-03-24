package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzblr extends zzbcs implements zzblt {
    public zzblr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zze(zzblj zzbljVar) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbljVar);
        zzda(1, parcelZza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbmb extends zzbcs implements zzbmd {
    public zzbmb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zze(com.google.android.gms.ads.internal.client.zzbx zzbxVar, IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbxVar);
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }
}

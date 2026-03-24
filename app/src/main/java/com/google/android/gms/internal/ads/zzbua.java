package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzbua extends zzbcs implements zzbuc {
    public zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final IObjectWrapper zze() {
        return Vs.h(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final boolean zzf() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZza = zzbcu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}

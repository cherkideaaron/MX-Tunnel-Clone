package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbjz extends zzbcs implements IInterface {
    public zzbjz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbyv zzbyvVar) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzbyvVar);
        zzda(1, parcelZza);
    }
}

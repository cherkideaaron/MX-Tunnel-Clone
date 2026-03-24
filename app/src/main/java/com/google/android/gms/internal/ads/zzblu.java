package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzblu extends zzbcs implements zzblw {
    public zzblu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzblmVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}

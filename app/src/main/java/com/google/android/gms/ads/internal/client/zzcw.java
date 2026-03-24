package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: classes.dex */
public final class zzcw extends zzbcs implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzbtt getAdapterCreator() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbtt zzbttVarZzf = zzbts.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbttVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzfc getLiteSdkVersion() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        zzfc zzfcVar = (zzfc) zzbcu.zzb(parcelZzcZ, zzfc.CREATOR);
        parcelZzcZ.recycle();
        return zzfcVar;
    }
}

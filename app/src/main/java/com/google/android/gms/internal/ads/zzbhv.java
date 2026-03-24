package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbhv extends zzbct implements zzbhw {
    public zzbhv() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strZzb;
        if (i == 1) {
            strZzb = zzb();
        } else {
            if (i != 2) {
                if (i == 3) {
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzd(iObjectWrapperAsInterface);
                } else if (i == 4) {
                    zze();
                } else {
                    if (i != 5) {
                        return false;
                    }
                    zzf();
                }
                parcel2.writeNoException();
                return true;
            }
            strZzb = zzc();
        }
        parcel2.writeNoException();
        parcel2.writeString(strZzb);
        return true;
    }
}

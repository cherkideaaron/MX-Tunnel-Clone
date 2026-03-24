package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbqu extends zzbct implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceZzb;
        zzbqy zzbqwVar;
        if (i != 3) {
            if (i == 4) {
                zzc();
            } else if (i == 5) {
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbqwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzbqwVar = iInterfaceQueryLocalInterface instanceof zzbqy ? (zzbqy) iInterfaceQueryLocalInterface : new zzbqw(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzd(iObjectWrapperAsInterface, zzbqwVar);
            } else if (i == 6) {
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zze(iObjectWrapperAsInterface2);
            } else {
                if (i != 7) {
                    return false;
                }
                iInterfaceZzb = zzf();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterfaceZzb = zzb();
        parcel2.writeNoException();
        zzbcu.zze(parcel2, iInterfaceZzb);
        return true;
    }
}

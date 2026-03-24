package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbts extends zzbct implements zzbtt {
    public zzbts() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbtt zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbtt ? (zzbtt) iInterfaceQueryLocalInterface : new zzbtr(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceZzb;
        int iZzc;
        if (i != 1) {
            if (i == 2) {
                String string = parcel.readString();
                zzbcu.zzh(parcel);
                iZzc = zzc(string);
            } else if (i == 3) {
                String string2 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zze(string2);
            } else {
                if (i != 4) {
                    return false;
                }
                String string3 = parcel.readString();
                zzbcu.zzh(parcel);
                iZzc = zzd(string3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
            return true;
        }
        String string4 = parcel.readString();
        zzbcu.zzh(parcel);
        iInterfaceZzb = zzb(string4);
        parcel2.writeNoException();
        zzbcu.zze(parcel2, iInterfaceZzb);
        return true;
    }
}

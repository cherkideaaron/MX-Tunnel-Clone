package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;

/* loaded from: classes.dex */
public abstract class zzdi extends zzbct implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzdj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strZze;
        if (i == 1) {
            strZze = zze();
        } else {
            if (i != 2) {
                return false;
            }
            strZze = zzf();
        }
        parcel2.writeNoException();
        parcel2.writeString(strZze);
        return true;
    }
}

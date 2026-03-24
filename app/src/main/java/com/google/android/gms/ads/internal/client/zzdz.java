package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzdz extends zzbct implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzea zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strZze;
        Parcelable parcelableZzh;
        switch (i) {
            case 1:
                strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                strZze = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 4:
                parcelableZzh = zzh();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, parcelableZzh);
                return true;
            case 5:
                parcelableZzh = zzi();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, parcelableZzh);
                return true;
            case 6:
                strZze = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            default:
                return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbxr extends zzbct implements zzbxs {
    public zzbxr() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbxs zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzbxs ? (zzbxs) iInterfaceQueryLocalInterface : new zzbxq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzh(bundle);
                break;
            case 2:
                zzi();
                break;
            case 3:
                zzj();
                break;
            case 4:
                zzk();
                break;
            case 5:
                zzl();
                break;
            case 6:
                Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundle2);
                return true;
            case 7:
                zzp();
                break;
            case 8:
                zzq();
                break;
            case 9:
                zzs();
                break;
            case 10:
                zze();
                break;
            case 11:
                boolean zZzg = zzg();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zZzg ? 1 : 0);
                return true;
            case 12:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                Intent intent = (Intent) zzbcu.zzb(parcel, Intent.CREATOR);
                zzbcu.zzh(parcel);
                zzm(i4, i5, intent);
                break;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzn(iObjectWrapperAsInterface);
                break;
            case 14:
                zzf();
                break;
            case 15:
                int i6 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzbcu.zzh(parcel);
                zzH(i6, strArrCreateStringArray, iArrCreateIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

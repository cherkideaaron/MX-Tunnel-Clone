package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbuh extends zzbct implements zzbui {
    public zzbuh() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbui zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbui ? (zzbui) iInterfaceQueryLocalInterface : new zzbug(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strZze;
        IInterface iInterfaceZzh;
        int iZzt;
        float fZzz;
        switch (i) {
            case 2:
                strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                strZze = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                iInterfaceZzh = zzh();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 6:
                strZze = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 7:
                strZze = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                strZze = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 10:
                strZze = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 11:
                iInterfaceZzh = zzn();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 12:
                parcel2.writeNoException();
                iInterfaceZzh = null;
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 13:
                iInterfaceZzh = zzp();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 14:
                iInterfaceZzh = zzq();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 15:
                iInterfaceZzh = zzr();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 16:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundleZzs);
                return true;
            case 17:
                iZzt = zzt();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(iZzt);
                return true;
            case 18:
                iZzt = zzu();
                parcel2.writeNoException();
                int i32 = zzbcu.zza;
                parcel2.writeInt(iZzt);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzw(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzx(iObjectWrapperAsInterface2, iObjectWrapperAsInterface3, iObjectWrapperAsInterface4);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzy(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.API_DISABLED /* 23 */:
                fZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzz);
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                fZzz = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzz);
                return true;
            case 25:
                fZzz = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzz);
                return true;
            case 26:
                zzC();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

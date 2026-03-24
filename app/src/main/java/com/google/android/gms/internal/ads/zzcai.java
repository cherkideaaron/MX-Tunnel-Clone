package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzcai extends zzbct implements zzcaj {
    public zzcai() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        int iZze;
        if (i == 1) {
            zzcan zzcanVar = (zzcan) zzbcu.zzb(parcel, zzcan.CREATOR);
            zzbcu.zzh(parcel);
            zzb(zzcanVar);
        } else if (i != 2) {
            zzcam zzcakVar = null;
            zzcah zzcahVar = null;
            if (i == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcakVar = iInterfaceQueryLocalInterface instanceof zzcam ? (zzcam) iInterfaceQueryLocalInterface : new zzcak(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzd(zzcakVar);
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        iZze = zze();
                        parcel2.writeNoException();
                        int i3 = zzbcu.zza;
                        parcel2.writeInt(iZze);
                        return true;
                    case 6:
                        zzf();
                        break;
                    case 7:
                        zzg();
                        break;
                    case 8:
                        zzh();
                        break;
                    case 9:
                        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzi(iObjectWrapperAsInterface);
                        break;
                    case 10:
                        IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzj(iObjectWrapperAsInterface2);
                        break;
                    case 11:
                        IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzk(iObjectWrapperAsInterface3);
                        break;
                    case 12:
                        String strZzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzl);
                        return true;
                    case 13:
                        String string = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzm(string);
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzcb zzcbVarZzb = com.google.android.gms.ads.internal.client.zzca.zzb(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzn(zzcbVarZzb);
                        break;
                    case 15:
                        Bundle bundleZzo = zzo();
                        parcel2.writeNoException();
                        zzbcu.zzd(parcel2, bundleZzo);
                        return true;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcahVar = iInterfaceQueryLocalInterface2 instanceof zzcah ? (zzcah) iInterfaceQueryLocalInterface2 : new zzcah(strongBinder2);
                        }
                        zzbcu.zzh(parcel);
                        zzu(zzcahVar);
                        break;
                    case 17:
                        parcel.readString();
                        zzbcu.zzh(parcel);
                        break;
                    case 18:
                        IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcu.zzh(parcel);
                        zzp(iObjectWrapperAsInterface4);
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        zzbcu.zzh(parcel);
                        zzq(string2);
                        break;
                    case 20:
                        iZze = zzs();
                        parcel2.writeNoException();
                        int i32 = zzbcu.zza;
                        parcel2.writeInt(iZze);
                        return true;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzea zzeaVarZzt = zzt();
                        parcel2.writeNoException();
                        zzbcu.zze(parcel2, zzeaVarZzt);
                        return true;
                    default:
                        return false;
                }
            } else {
                boolean zZza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzr(zZza);
            }
        } else {
            zzc();
        }
        parcel2.writeNoException();
        return true;
    }
}

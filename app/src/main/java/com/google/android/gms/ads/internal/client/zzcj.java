package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbts;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzcj extends zzbct implements zzck {
    public zzcj() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceZzg;
        Parcelable parcelableZzr;
        int iZzf;
        zzce zzccVar = null;
        zzch zzcfVar = null;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(strongBinder);
                }
                zzbcu.zzh(parcel);
                zze(arrayListCreateTypedArrayList, zzccVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzbcu.zzh(parcel);
                iZzf = zzf(string);
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzg = zzg(string2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzbcu.zzh(parcel);
                iZzf = zzh(string3);
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzg = zzi(string4);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzbcu.zzh(parcel);
                iZzf = zzj(string5);
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzg = zzk(string6);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 8:
                zzbts.zzf(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                zzft zzftVar = (zzft) zzbcu.zzb(parcel, zzft.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzch ? (zzch) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzbcu.zzh(parcel);
                iZzf = zzm(string7, zzftVar, zzcfVar);
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 10:
                int i3 = parcel.readInt();
                String string8 = parcel.readString();
                zzbcu.zzh(parcel);
                iZzf = zzn(i3, string8);
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzg = zzo(string9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzg = zzp(string10);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzg = zzq(string11);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 14:
                int i4 = parcel.readInt();
                String string12 = parcel.readString();
                zzbcu.zzh(parcel);
                parcelableZzr = zzr(i4, string12);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, parcelableZzr);
                return true;
            case 15:
                int i5 = parcel.readInt();
                zzbcu.zzh(parcel);
                parcelableZzr = zzs(i5);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, parcelableZzr);
                return true;
            case 16:
                int i6 = parcel.readInt();
                String string13 = parcel.readString();
                zzbcu.zzh(parcel);
                iZzf = zzt(i6, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 17:
                int i7 = parcel.readInt();
                String string14 = parcel.readString();
                zzbcu.zzh(parcel);
                iZzf = zzu(i7, string14);
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 18:
                int i8 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzv(i8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

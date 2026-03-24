package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public abstract class zzbty extends zzbct implements zzbtz {
    public zzbty() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbtz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbtz ? (zzbtz) iInterfaceQueryLocalInterface : new zzbtx(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                int i3 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzg(i3);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzbud;
                }
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                zzk();
                parcel2.writeNoException();
                return true;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzl(string, string2);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbll.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
                zzn();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readString();
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                zzo();
                parcel2.writeNoException();
                return true;
            case 14:
                zzcas zzcasVar = (zzcas) zzbcu.zzb(parcel, zzcas.CREATOR);
                zzbcu.zzh(parcel);
                zzp(zzcasVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzq();
                parcel2.writeNoException();
                return true;
            case 16:
                zzcaw zzcawVarZzb = zzcav.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzr(zzcawVarZzb);
                parcel2.writeNoException();
                return true;
            case 17:
                int i4 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzs(i4);
                parcel2.writeNoException();
                return true;
            case 18:
                zzt();
                parcel2.writeNoException();
                return true;
            case 19:
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                zzu();
                parcel2.writeNoException();
                return true;
            case 21:
                String string3 = parcel.readString();
                zzbcu.zzh(parcel);
                zzv(string3);
                parcel2.writeNoException();
                return true;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                zzbcu.zzh(parcel);
                zzw(i5, string4);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.API_DISABLED /* 23 */:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbcu.zzh(parcel);
                zzx(zzeVar);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbcu.zzh(parcel);
                zzy(zzeVar2);
                parcel2.writeNoException();
                return true;
            case 25:
                zzz();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

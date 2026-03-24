package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbml extends zzbct implements zzbmm {
    public zzbml() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strZze;
        List listZzf;
        IInterface iInterfaceZzh;
        zzbmj zzbmhVar;
        int i3;
        boolean zZzA;
        switch (i) {
            case 2:
                strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                listZzf = zzf();
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
                strZze = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterfaceZzh = zzq();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                i3 = zZzs;
                parcel2.writeInt(i3);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzt(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                iInterfaceZzh = zzu();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 19:
                iInterfaceZzh = zzv();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 20:
                Bundle bundleZzw = zzw();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundleZzw);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbmhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbmhVar = iInterfaceQueryLocalInterface instanceof zzbmj ? (zzbmj) iInterfaceQueryLocalInterface : new zzbmh(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzx(zzbmhVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case ConnectionResult.API_DISABLED /* 23 */:
                listZzf = zzz();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                zZzA = zzA();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                i3 = zZzA;
                parcel2.writeInt(i3);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdj zzdjVarZzb = com.google.android.gms.ads.internal.client.zzdi.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzB(zzdjVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdf zzdfVarZzb = com.google.android.gms.ads.internal.client.zzde.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzC(zzdfVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterfaceZzh = zzF();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case 30:
                zZzA = zzG();
                parcel2.writeNoException();
                int i42 = zzbcu.zza;
                i3 = zZzA;
                parcel2.writeInt(i3);
                return true;
            case 31:
                iInterfaceZzh = zzH();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzh);
                return true;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzI(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzJ(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long jZzK = zzK();
                parcel2.writeNoException();
                parcel2.writeLong(jZzK);
                return true;
            case 35:
                long j = parcel.readLong();
                zzbcu.zzh(parcel);
                zzL(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

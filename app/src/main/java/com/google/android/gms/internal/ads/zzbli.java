package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbli extends zzbct implements zzblj {
    public zzbli() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceZzb;
        String strZzc;
        switch (i) {
            case 2:
                iInterfaceZzb = zzb();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 3:
                strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 4:
                List listZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(listZzd);
                return true;
            case 5:
                strZzc = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 6:
                iInterfaceZzb = zzf();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 7:
                strZzc = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 8:
                strZzc = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 9:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundleZzi);
                return true;
            case 10:
                zzj();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterfaceZzb = zzk();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                boolean zZzm = zzm(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzn(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                iInterfaceZzb = zzo();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 16:
                iInterfaceZzb = zzp();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 17:
                strZzc = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            default:
                return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzblg extends zzbct implements zzblh {
    public zzblg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
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
                double dZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzh);
                return true;
            case 9:
                strZzc = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 10:
                strZzc = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 11:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundleZzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                iInterfaceZzb = zzm();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzn(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                boolean zZzo = zzo(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                iInterfaceZzb = zzq();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 18:
                iInterfaceZzb = zzr();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzb);
                return true;
            case 19:
                strZzc = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            default:
                return false;
        }
    }
}

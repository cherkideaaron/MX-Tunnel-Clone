package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbll extends zzbct implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzblm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzblm ? (zzblm) iInterfaceQueryLocalInterface : new zzblk(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strZze;
        IInterface iInterfaceZzf;
        boolean zZzo;
        int i3;
        boolean zZzn;
        switch (i) {
            case 1:
                String string = parcel.readString();
                zzbcu.zzh(parcel);
                strZze = zze(string);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzbcu.zzh(parcel);
                iInterfaceZzf = zzf(string2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzf);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                strZze = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzbcu.zzh(parcel);
                zzi(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterfaceZzf = zzk();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzf);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterfaceZzf = zzm();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzf);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zZzn = zzn(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                i3 = zZzn;
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel2.writeNoException();
                iInterfaceZzf = null;
                zzbcu.zze(parcel2, iInterfaceZzf);
                return true;
            case 12:
                zZzo = zzo();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                i3 = zZzo;
                parcel2.writeInt(i3);
                return true;
            case 13:
                zZzo = zzp();
                parcel2.writeNoException();
                int i42 = zzbcu.zza;
                i3 = zZzo;
                parcel2.writeInt(i3);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzq(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                iInterfaceZzf = zzs();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzf);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zZzn = zzt(iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                i3 = zZzn;
                parcel2.writeInt(i3);
                return true;
            default:
                return false;
        }
    }
}

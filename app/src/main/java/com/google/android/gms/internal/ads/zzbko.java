package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbko extends zzbct implements zzbkp {
    public zzbko() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        float fZze;
        IInterface iInterfaceZzg;
        zzbma zzbmaVar;
        int iZzk;
        switch (i) {
            case 2:
                fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzf(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                iInterfaceZzg = zzg();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 5:
                fZze = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 6:
                fZze = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 7:
                iInterfaceZzg = zzj();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, iInterfaceZzg);
                return true;
            case 8:
                iZzk = zzk();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(iZzk);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbmaVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbmaVar = iInterfaceQueryLocalInterface instanceof zzbma ? (zzbma) iInterfaceQueryLocalInterface : new zzbma(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzm(zzbmaVar);
                parcel2.writeNoException();
                return true;
            case 10:
                iZzk = zzl();
                parcel2.writeNoException();
                int i32 = zzbcu.zza;
                parcel2.writeInt(iZzk);
                return true;
            default:
                return false;
        }
    }
}

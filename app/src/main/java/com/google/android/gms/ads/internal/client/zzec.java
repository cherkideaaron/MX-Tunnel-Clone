package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzec extends zzbct implements zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzed zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        float fZzj;
        zzeg zzeeVar;
        int i3;
        boolean zZzh;
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
                boolean zZza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzg(zZza);
                parcel2.writeNoException();
                return true;
            case 4:
                zZzh = zzh();
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                i3 = zZzh;
                parcel2.writeInt(i3);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                i3 = iZzi;
                parcel2.writeInt(i3);
                return true;
            case 6:
                fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                fZzj = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzeeVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzeeVar = iInterfaceQueryLocalInterface instanceof zzeg ? (zzeg) iInterfaceQueryLocalInterface : new zzee(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzl(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 9:
                fZzj = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 10:
                zZzh = zzn();
                parcel2.writeNoException();
                int i42 = zzbcu.zza;
                i3 = zZzh;
                parcel2.writeInt(i3);
                return true;
            case 11:
                zzeg zzegVarZzo = zzo();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzegVarZzo);
                return true;
            case 12:
                zZzh = zzp();
                parcel2.writeNoException();
                int i422 = zzbcu.zza;
                i3 = zZzh;
                parcel2.writeInt(i3);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

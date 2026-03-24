package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) iInterfaceQueryLocalInterface : new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
            IInterface iInterfaceZzb;
            int iZzd;
            int i3;
            int iZzg;
            switch (i) {
                case 2:
                    iInterfaceZzb = zzb();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iInterfaceZzb);
                    return true;
                case 3:
                    Bundle bundleZzc = zzc();
                    parcel2.writeNoException();
                    zzc.zzd(parcel2, bundleZzc);
                    return true;
                case 4:
                    iZzd = zzd();
                    parcel2.writeNoException();
                    i3 = iZzd;
                    parcel2.writeInt(i3);
                    return true;
                case 5:
                    iInterfaceZzb = zze();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iInterfaceZzb);
                    return true;
                case 6:
                    iInterfaceZzb = zzf();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iInterfaceZzb);
                    return true;
                case 7:
                    iZzg = zzg();
                    parcel2.writeNoException();
                    int i4 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 8:
                    String strZzh = zzh();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzh);
                    return true;
                case 9:
                    iInterfaceZzb = zzi();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iInterfaceZzb);
                    return true;
                case 10:
                    iZzd = zzj();
                    parcel2.writeNoException();
                    i3 = iZzd;
                    parcel2.writeInt(i3);
                    return true;
                case 11:
                    iZzg = zzk();
                    parcel2.writeNoException();
                    int i42 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 12:
                    iInterfaceZzb = zzl();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iInterfaceZzb);
                    return true;
                case 13:
                    iZzg = zzm();
                    parcel2.writeNoException();
                    int i422 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 14:
                    iZzg = zzn();
                    parcel2.writeNoException();
                    int i4222 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 15:
                    iZzg = zzo();
                    parcel2.writeNoException();
                    int i42222 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 16:
                    iZzg = zzp();
                    parcel2.writeNoException();
                    int i422222 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 17:
                    iZzg = zzq();
                    parcel2.writeNoException();
                    int i4222222 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 18:
                    iZzg = zzr();
                    parcel2.writeNoException();
                    int i42222222 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 19:
                    iZzg = zzs();
                    parcel2.writeNoException();
                    int i422222222 = zzc.zza;
                    i3 = iZzg;
                    parcel2.writeInt(i3);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzf(parcel);
                    zzt(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zZza = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzu(zZza);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zZza2 = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzv(zZza2);
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.API_DISABLED /* 23 */:
                    boolean zZza3 = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzw(zZza3);
                    parcel2.writeNoException();
                    return true;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    boolean zZza4 = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzx(zZza4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.zzb(parcel, Intent.CREATOR);
                    zzc.zzf(parcel);
                    zzy(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.zzb(parcel, Intent.CREATOR);
                    int i5 = parcel.readInt();
                    zzc.zzf(parcel);
                    zzz(intent2, i5);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzf(parcel);
                    zzA(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void zzA(IObjectWrapper iObjectWrapper);

    IObjectWrapper zzb();

    Bundle zzc();

    int zzd();

    IFragmentWrapper zze();

    IObjectWrapper zzf();

    boolean zzg();

    String zzh();

    IFragmentWrapper zzi();

    int zzj();

    boolean zzk();

    IObjectWrapper zzl();

    boolean zzm();

    boolean zzn();

    boolean zzo();

    boolean zzp();

    boolean zzq();

    boolean zzr();

    boolean zzs();

    void zzt(IObjectWrapper iObjectWrapper);

    void zzu(boolean z);

    void zzv(boolean z);

    void zzw(boolean z);

    void zzx(boolean z);

    void zzy(Intent intent);

    void zzz(Intent intent, int i);
}

package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: classes.dex */
public abstract class zzcq extends zzbct implements zzcr {
    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceZzb;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbtt zzbttVarZzf = zzbts.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzb(iObjectWrapperAsInterface, zzrVar, string, zzbttVarZzf, i3);
                break;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbtt zzbttVarZzf2 = zzbts.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzc(iObjectWrapperAsInterface2, zzrVar2, string2, zzbttVarZzf2, i4);
                break;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbtt zzbttVarZzf3 = zzbts.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzd(iObjectWrapperAsInterface3, string3, zzbttVarZzf3, i5);
                break;
            case 4:
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                iInterfaceZzb = zze(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                break;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf4 = zzbts.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzf(iObjectWrapperAsInterface6, zzbttVarZzf4, i6);
                break;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzg(iObjectWrapperAsInterface7);
                break;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzi(iObjectWrapperAsInterface8, i7);
                break;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzj(iObjectWrapperAsInterface9, zzrVar3, string4, i8);
                break;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                break;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbtt zzbttVarZzf5 = zzbts.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzl(iObjectWrapperAsInterface13, string5, zzbttVarZzf5, i9);
                break;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbtt zzbttVarZzf6 = zzbts.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzm(iObjectWrapperAsInterface14, zzrVar4, string6, zzbttVarZzf6, i10);
                break;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf7 = zzbts.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzn(iObjectWrapperAsInterface15, zzbttVarZzf7, i11);
                break;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf8 = zzbts.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzo(iObjectWrapperAsInterface16, zzbttVarZzf8, i12);
                break;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf9 = zzbts.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbph zzbphVarZzc = zzbpg.zzc(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzp(iObjectWrapperAsInterface17, zzbttVarZzf9, i13, zzbphVarZzc);
                break;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf10 = zzbts.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzq(iObjectWrapperAsInterface18, zzbttVarZzf10, i14);
                break;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf11 = zzbts.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzbcu.zzh(parcel);
                iInterfaceZzb = zzh(iObjectWrapperAsInterface19, zzbttVarZzf11, i15);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzbcu.zze(parcel2, iInterfaceZzb);
        return true;
    }
}

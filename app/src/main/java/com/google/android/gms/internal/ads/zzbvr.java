package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbvr extends zzbct implements zzbvs {
    public zzbvr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbvs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvq(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbwh zzbwhVarZzf;
        int iZzk;
        zzbvv zzbvtVar = null;
        zzbvd zzbvbVar = null;
        zzbvm zzbvkVar = null;
        zzbvg zzbveVar = null;
        zzbvp zzbvnVar = null;
        zzbvm zzbvkVar2 = null;
        zzbvp zzbvnVar2 = null;
        zzbvj zzbvhVar = null;
        zzbvg zzbveVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzbwhVarZzf = zzf();
            } else {
                if (i != 3) {
                    if (i != 5) {
                        if (i == 10) {
                            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        } else if (i != 11) {
                            switch (i) {
                                case 13:
                                    String string = parcel.readString();
                                    String string2 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder = parcel.readStrongBinder();
                                    if (strongBinder != null) {
                                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        zzbveVar2 = iInterfaceQueryLocalInterface instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface : new zzbve(strongBinder);
                                    }
                                    zzbvg zzbvgVar = zzbveVar2;
                                    zzbtz zzbtzVarZzb = zzbty.zzb(parcel.readStrongBinder());
                                    com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                                    zzbcu.zzh(parcel);
                                    zzi(string, string2, zzmVar, iObjectWrapperAsInterface, zzbvgVar, zzbtzVarZzb, zzrVar);
                                    break;
                                case 14:
                                    String string3 = parcel.readString();
                                    String string4 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder2 = parcel.readStrongBinder();
                                    if (strongBinder2 != null) {
                                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                        zzbvhVar = iInterfaceQueryLocalInterface2 instanceof zzbvj ? (zzbvj) iInterfaceQueryLocalInterface2 : new zzbvh(strongBinder2);
                                    }
                                    zzbvj zzbvjVar = zzbvhVar;
                                    zzbtz zzbtzVarZzb2 = zzbty.zzb(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    zzj(string3, string4, zzmVar2, iObjectWrapperAsInterface2, zzbvjVar, zzbtzVarZzb2);
                                    break;
                                case 15:
                                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    iZzk = zzk(iObjectWrapperAsInterface3);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iZzk);
                                    break;
                                case 16:
                                    String string5 = parcel.readString();
                                    String string6 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder3 = parcel.readStrongBinder();
                                    if (strongBinder3 != null) {
                                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        zzbvnVar2 = iInterfaceQueryLocalInterface3 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface3 : new zzbvn(strongBinder3);
                                    }
                                    zzbvp zzbvpVar = zzbvnVar2;
                                    zzbtz zzbtzVarZzb3 = zzbty.zzb(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    zzl(string5, string6, zzmVar3, iObjectWrapperAsInterface4, zzbvpVar, zzbtzVarZzb3);
                                    break;
                                case 17:
                                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    iZzk = zzm(iObjectWrapperAsInterface5);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iZzk);
                                    break;
                                case 18:
                                    String string7 = parcel.readString();
                                    String string8 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder4 = parcel.readStrongBinder();
                                    if (strongBinder4 != null) {
                                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        zzbvkVar2 = iInterfaceQueryLocalInterface4 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface4 : new zzbvk(strongBinder4);
                                    }
                                    zzbvm zzbvmVar = zzbvkVar2;
                                    zzbtz zzbtzVarZzb4 = zzbty.zzb(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    zzn(string7, string8, zzmVar4, iObjectWrapperAsInterface6, zzbvmVar, zzbtzVarZzb4);
                                    break;
                                case 19:
                                    String string9 = parcel.readString();
                                    zzbcu.zzh(parcel);
                                    zzo(string9);
                                    break;
                                case 20:
                                    String string10 = parcel.readString();
                                    String string11 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder5 = parcel.readStrongBinder();
                                    if (strongBinder5 != null) {
                                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        zzbvnVar = iInterfaceQueryLocalInterface5 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface5 : new zzbvn(strongBinder5);
                                    }
                                    zzbvp zzbvpVar2 = zzbvnVar;
                                    zzbtz zzbtzVarZzb5 = zzbty.zzb(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    zzp(string10, string11, zzmVar5, iObjectWrapperAsInterface7, zzbvpVar2, zzbtzVarZzb5);
                                    break;
                                case 21:
                                    String string12 = parcel.readString();
                                    String string13 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder6 = parcel.readStrongBinder();
                                    if (strongBinder6 != null) {
                                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        zzbveVar = iInterfaceQueryLocalInterface6 instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface6 : new zzbve(strongBinder6);
                                    }
                                    zzbvg zzbvgVar2 = zzbveVar;
                                    zzbtz zzbtzVarZzb6 = zzbty.zzb(parcel.readStrongBinder());
                                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                                    zzbcu.zzh(parcel);
                                    zzq(string12, string13, zzmVar6, iObjectWrapperAsInterface8, zzbvgVar2, zzbtzVarZzb6, zzrVar2);
                                    break;
                                case 22:
                                    String string14 = parcel.readString();
                                    String string15 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder7 = parcel.readStrongBinder();
                                    if (strongBinder7 != null) {
                                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        zzbvkVar = iInterfaceQueryLocalInterface7 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface7 : new zzbvk(strongBinder7);
                                    }
                                    zzbvm zzbvmVar2 = zzbvkVar;
                                    zzbtz zzbtzVarZzb7 = zzbty.zzb(parcel.readStrongBinder());
                                    zzbkh zzbkhVar = (zzbkh) zzbcu.zzb(parcel, zzbkh.CREATOR);
                                    zzbcu.zzh(parcel);
                                    zzr(string14, string15, zzmVar7, iObjectWrapperAsInterface9, zzbvmVar2, zzbtzVarZzb7, zzbkhVar);
                                    break;
                                case ConnectionResult.API_DISABLED /* 23 */:
                                    String string16 = parcel.readString();
                                    String string17 = parcel.readString();
                                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    IBinder strongBinder8 = parcel.readStrongBinder();
                                    if (strongBinder8 != null) {
                                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                        zzbvbVar = iInterfaceQueryLocalInterface8 instanceof zzbvd ? (zzbvd) iInterfaceQueryLocalInterface8 : new zzbvb(strongBinder8);
                                    }
                                    zzbvd zzbvdVar = zzbvbVar;
                                    zzbtz zzbtzVarZzb8 = zzbty.zzb(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    zzs(string16, string17, zzmVar8, iObjectWrapperAsInterface10, zzbvdVar, zzbtzVarZzb8);
                                    break;
                                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                    zzbcu.zzh(parcel);
                                    iZzk = zzt(iObjectWrapperAsInterface11);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iZzk);
                                    break;
                                default:
                                    return false;
                            }
                        } else {
                            parcel.createStringArray();
                        }
                        zzbcu.zzh(parcel);
                    } else {
                        com.google.android.gms.ads.internal.client.zzed zzedVarZzh = zzh();
                        parcel2.writeNoException();
                        zzbcu.zze(parcel2, zzedVarZzh);
                    }
                    return true;
                }
                zzbwhVarZzf = zzg();
            }
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, zzbwhVarZzf);
            return true;
        }
        IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        String string18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzbcu.zzb(parcel, creator);
        Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, creator);
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
        IBinder strongBinder9 = parcel.readStrongBinder();
        if (strongBinder9 != null) {
            IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            zzbvtVar = iInterfaceQueryLocalInterface9 instanceof zzbvv ? (zzbvv) iInterfaceQueryLocalInterface9 : new zzbvt(strongBinder9);
        }
        zzbvv zzbvvVar = zzbvtVar;
        zzbcu.zzh(parcel);
        zze(iObjectWrapperAsInterface12, string18, bundle, bundle2, zzrVar3, zzbvvVar);
        parcel2.writeNoException();
        return true;
    }
}

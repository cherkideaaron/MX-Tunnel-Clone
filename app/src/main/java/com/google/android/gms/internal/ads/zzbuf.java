package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbuf extends zzbcs implements IInterface {
    public zzbuf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final List zzf() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzbcu.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    public final String zzg() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final zzbks zzh() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbks zzbksVarZzh = zzbkr.zzh(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbksVarZzh;
    }

    public final String zzi() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzj() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final void zzk() {
        zzda(8, zza());
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzda(10, parcelZza);
    }

    public final boolean zzn() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZza = zzbcu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final boolean zzo() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZza = zzbcu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final Bundle zzp() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    public final IObjectWrapper zzr() {
        return Vs.h(zzcZ(15, zza()));
    }

    public final com.google.android.gms.ads.internal.client.zzed zzs() {
        Parcel parcelZzcZ = zzcZ(16, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    public final zzbkl zzt() {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbkl zzbklVarZzj = zzbkk.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbklVarZzj;
    }

    public final IObjectWrapper zzu() {
        return Vs.h(zzcZ(20, zza()));
    }

    public final IObjectWrapper zzv() {
        return Vs.h(zzcZ(21, zza()));
    }

    public final void zzw(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, iObjectWrapper2);
        zzbcu.zze(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }
}

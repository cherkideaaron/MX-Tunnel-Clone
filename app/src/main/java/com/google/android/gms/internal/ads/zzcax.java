package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzcax extends zzbcs implements zzcaz {
    public zzcax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzb(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzmVar);
        zzbcu.zze(parcelZza, zzcbgVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzmVar);
        zzbcu.zze(parcelZza, zzcbgVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzcbcVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzdqVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzbcu.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzh(zzcbn zzcbnVar) {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzcbnVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzcaw zzl() {
        zzcaw zzcauVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcauVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcauVar = iInterfaceQueryLocalInterface instanceof zzcaw ? (zzcaw) iInterfaceQueryLocalInterface : new zzcau(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final com.google.android.gms.ads.internal.client.zzea zzm() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzn() {
        Parcel parcelZzcZ = zzcZ(16, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, zzdtVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzp(boolean z) {
        Parcel parcelZza = zza();
        int i = zzbcu.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final long zzq() {
        Parcel parcelZzcZ = zzcZ(17, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzr(long j) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(zzcbh zzcbhVar) {
        throw null;
    }
}

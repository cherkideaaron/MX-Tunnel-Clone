package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbzf extends zzbcs implements zzbzh {
    public zzbzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzbzuVar);
        zzbcu.zze(parcelZza, zzbzlVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzbzuVar);
        zzbcu.zze(parcelZza, zzbzlVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Parcel parcelZza = zza();
        zzbcu.zzc(parcelZza, zzbzuVar);
        zzbcu.zze(parcelZza, zzbzlVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(String str, zzbzl zzbzlVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbcu.zze(parcelZza, zzbzlVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) {
        throw null;
    }
}

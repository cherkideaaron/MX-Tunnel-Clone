package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.Vs;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbkq extends zzbcs implements zzbks {
    public zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final IObjectWrapper zzb() {
        return Vs.h(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Uri zzc() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzbcu.zzb(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final double zzd() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zze() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zzf() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Map zzg() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        HashMap mapZzg = zzbcu.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return mapZzg;
    }
}

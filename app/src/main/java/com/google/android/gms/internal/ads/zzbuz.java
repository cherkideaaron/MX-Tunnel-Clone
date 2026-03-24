package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzbuz implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbkh zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbuz(Date date, int i, Set set, Location location, boolean z, int i2, zzbkh zzbkhVar, List list, boolean z2, int i3, String str) {
        Map map;
        String str2;
        Boolean bool;
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = zzbkhVar;
        this.zzi = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.startsWith("custom:")) {
                    String[] strArrSplit = str3.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str4 = strArrSplit[2];
                        if ("true".equals(str4)) {
                            map = this.zzj;
                            str2 = strArrSplit[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(str4)) {
                            map = this.zzj;
                            str2 = strArrSplit[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.zzh.add(str3);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzex.zzb().zzg();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        Parcelable.Creator<zzbkh> creator = zzbkh.CREATOR;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbkh zzbkhVar = this.zzg;
        if (zzbkhVar != null) {
            int i = zzbkhVar.zza;
            if (i == 2) {
                builder.setAdChoicesPlacement(zzbkhVar.zze);
                builder.setReturnUrlsForImageAssets(zzbkhVar.zzb);
                builder.setImageOrientation(zzbkhVar.zzc);
                builder.setRequestMultipleImages(zzbkhVar.zzd);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        builder.setRequestCustomMuteThisAd(zzbkhVar.zzg);
                        builder.setMediaAspectRatio(zzbkhVar.zzh);
                    }
                    builder.setReturnUrlsForImageAssets(zzbkhVar.zzb);
                    builder.setImageOrientation(zzbkhVar.zzc);
                    builder.setRequestMultipleImages(zzbkhVar.zzd);
                }
                com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbkhVar.zzf;
                if (zzgaVar != null) {
                    builder.setVideoOptions(new VideoOptions(zzgaVar));
                }
                builder.setAdChoicesPlacement(zzbkhVar.zze);
                builder.setReturnUrlsForImageAssets(zzbkhVar.zzb);
                builder.setImageOrientation(zzbkhVar.zzc);
                builder.setRequestMultipleImages(zzbkhVar.zzd);
            }
        }
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbkh.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzex.zzb().zzi();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.zzh.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zzb() {
        return this.zzj;
    }
}

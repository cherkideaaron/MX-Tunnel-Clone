package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.AbstractC3264qG;
import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzfkh {
    public static void zza(int i, Throwable th, String str) {
        String strK = AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 20), "Ad failed to load : ", i);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strK);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, str);
    }

    public static void zzb(Context context, boolean z) {
        if (z) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        String strZzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        String strO = Vs.o(new StringBuilder(String.valueOf(strZzD).length() + FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strZzD, "\")) to get test ads on this device.");
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strO);
    }
}

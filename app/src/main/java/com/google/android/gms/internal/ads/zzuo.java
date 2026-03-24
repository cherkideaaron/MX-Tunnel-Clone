package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import defpackage.AbstractC2945kR;
import defpackage.AbstractC3378sM;
import java.util.List;

/* loaded from: classes.dex */
final class zzuo {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, AbstractC2945kR.b(i, i2, (int) d));
        boolean z = true;
        if (iZzc == 1 && zzup.zza == null) {
            int iZzb = Build.VERSION.SDK_INT >= 35 ? 2 : zzb(false);
            int iZzb2 = zzb(true);
            if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                z = false;
            }
            zzup.zza = Boolean.valueOf(z);
            if (zzup.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzvVarZzM = zztVar.zzM();
            if (zzvVarZzM.zzo != null) {
                List listZzc = zzvg.zzc(zzuw.zzb, zzvVarZzM, z, false);
                for (int i = 0; i < listZzc.size(); i++) {
                    if (((zzun) listZzc.get(i)).zzd != null && (videoCapabilities = ((zzun) listZzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        AbstractC2945kR.c();
                        return zzc(supportedPerformancePoints, AbstractC2945kR.a());
                    }
                }
            }
        } catch (zzuy unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (AbstractC3378sM.d(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}

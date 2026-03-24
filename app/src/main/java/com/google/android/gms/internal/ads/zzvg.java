package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzvg {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzun zza() {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzun) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) {
        try {
            zzux zzuxVar = new zzux(str, z, z2);
            HashMap map = zzb;
            List list = (List) map.get(zzuxVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzh = zzh(zzuxVar, new zzvb(z, z2, str.equals("video/mv-hevc")));
            if (z && arrayListZzh.isEmpty() && Build.VERSION.SDK_INT == 23) {
                arrayListZzh = zzh(zzuxVar, new zzva(null));
                if (!arrayListZzh.isEmpty()) {
                    String str2 = ((zzun) arrayListZzh.get(0)).zza;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + str2.length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    zzee.zzc("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzun) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzh.add(zzun.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzj(arrayListZzh, zzvc.zza);
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzun) arrayListZzh.get(0)).zza)) {
                arrayListZzh.add((zzun) arrayListZzh.remove(0));
            }
            zzguf zzgufVarZzq = zzguf.zzq(arrayListZzh);
            map.put(zzuxVar, zzgufVarZzq);
            return zzgufVarZzq;
        } catch (Throwable th) {
            throw th;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzc(zzuw zzuwVar, zzv zzvVar, boolean z, boolean z2) {
        List listZza = zzuwVar.zza(zzvVar.zzo, z, z2);
        List listZzd = zzd(zzuwVar, zzvVar, z, z2);
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgucVar.zzh(listZza);
        zzgucVar.zzh(listZzd);
        return zzgucVar.zzi();
    }

    public static List zzd(zzuw zzuwVar, zzv zzvVar, boolean z, boolean z2) {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzguf.zzi() : zzuwVar.zza(strZzg, z, z2);
    }

    public static List zze(List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvf() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzvf
            public final /* synthetic */ int zza(Object obj) {
                int i = zzvg.zza;
                return ((zzun) obj).zzd(zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        Pair pairZzd;
        String str = zzvVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZzd = zzdo.zzd(zzvVar)) != null) {
            int iIntValue = ((Integer) pairZzd.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8 A[Catch: Exception -> 0x01cd, TryCatch #0 {Exception -> 0x01cd, blocks: (B:101:0x01a0, B:108:0x01ae, B:114:0x01c2, B:116:0x01c8, B:124:0x01e3, B:120:0x01d8), top: B:166:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d8 A[Catch: Exception -> 0x01cd, TryCatch #0 {Exception -> 0x01cd, blocks: (B:101:0x01a0, B:108:0x01ae, B:114:0x01c2, B:116:0x01c8, B:124:0x01e3, B:120:0x01d8), top: B:166:0x01a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4 A[Catch: Exception -> 0x01f2, TryCatch #4 {Exception -> 0x01f2, blocks: (B:127:0x01ed, B:130:0x01f4, B:132:0x0204, B:134:0x020c), top: B:174:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f A[PHI: r4
      0x021f: PHI (r4v6 boolean) = (r4v5 boolean), (r4v8 boolean) binds: [B:138:0x0219, B:140:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[PHI: r18
      0x00d3: PHI (r18v5 int) = 
      (r18v1 int)
      (r18v1 int)
      (r18v6 int)
      (r18v6 int)
      (r18v6 int)
      (r18v6 int)
      (r18v6 int)
      (r18v6 int)
      (r18v6 int)
      (r18v6 int)
     binds: [B:97:0x018e, B:55:0x00f3, B:31:0x0098, B:33:0x00a0, B:35:0x00a8, B:37:0x00b0, B:39:0x00b8, B:41:0x00c0, B:43:0x00c8, B:45:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzux r29, com.google.android.gms.internal.ads.zzuz r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvg.zzh(com.google.android.gms.internal.ads.zzux, com.google.android.gms.internal.ads.zzuz):java.util.ArrayList");
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgql.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvf zzvfVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i = zzvg.zza;
                zzvf zzvfVar2 = zzvfVar;
                return zzvfVar2.zza(obj2) - zzvfVar2.zza(obj);
            }
        });
    }
}

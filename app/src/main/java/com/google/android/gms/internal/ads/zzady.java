package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0275 A[PHI: r0 r1 r8
      0x0275: PHI (r0v8 int) = (r0v7 int), (r0v53 int) binds: [B:173:0x0277, B:166:0x024d] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r1v3 int) = (r1v2 int), (r1v67 int) binds: [B:173:0x0277, B:166:0x024d] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r8v2 int) = (r8v1 int), (r8v8 int) binds: [B:173:0x0277, B:166:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[PHI: r1
      0x00c6: PHI (r1v75 int) = (r1v48 int), (r1v44 int) binds: [B:137:0x01db, B:43:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzv zza(com.google.android.gms.internal.ads.zzer r18, java.lang.String r19, java.lang.String r20, com.google.android.gms.internal.ads.zzq r21) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzady.zza(com.google.android.gms.internal.ads.zzer, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzq):com.google.android.gms.internal.ads.zzv");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzadx zzb(com.google.android.gms.internal.ads.zzeq r12) {
        /*
            r0 = 16
            int r1 = r12.zzj(r0)
            int r0 = r12.zzj(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r12.zzj(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r12.zzj(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L3e
            r1 = r2
        L2c:
            int r5 = r12.zzj(r0)
            int r5 = r5 + r1
            boolean r1 = r12.zzi()
            if (r1 != 0) goto L39
            int r5 = r5 + r4
            goto L3f
        L39:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L3e:
            r5 = r1
        L3f:
            r1 = 10
            int r1 = r12.zzj(r1)
            boolean r6 = r12.zzi()
            if (r6 == 0) goto L54
            int r6 = r12.zzj(r4)
            if (r6 <= 0) goto L54
            r12.zzh(r0)
        L54:
            boolean r6 = r12.zzi()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L63
            r11 = r9
            goto L64
        L63:
            r11 = r7
        L64:
            int r12 = r12.zzj(r3)
            if (r11 != r9) goto L74
            r6 = 13
            if (r12 != r6) goto L74
            int[] r12 = com.google.android.gms.internal.ads.zzady.zzb
            r12 = r12[r6]
            r9 = r12
            goto La1
        L74:
            if (r11 != r7) goto L95
            r6 = 14
            if (r12 >= r6) goto L95
            int[] r2 = com.google.android.gms.internal.ads.zzady.zzb
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9c
            r7 = 11
            if (r1 == r0) goto L97
            if (r1 == r4) goto L9c
            if (r1 == r3) goto L8d
            goto L95
        L8d:
            if (r12 == r4) goto L93
            if (r12 == r6) goto L93
            if (r12 != r7) goto L95
        L93:
            int r2 = r2 + 1
        L95:
            r9 = r2
            goto La1
        L97:
            if (r12 == r6) goto L93
            if (r12 != r7) goto L95
            goto L93
        L9c:
            if (r12 == r4) goto L93
            if (r12 != r6) goto L95
            goto L93
        La1:
            com.google.android.gms.internal.ads.zzadx r12 = new com.google.android.gms.internal.ads.zzadx
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzady.zzb(com.google.android.gms.internal.ads.zzeq):com.google.android.gms.internal.ads.zzadx");
    }

    public static void zzc(int i, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i >> 16) & 255);
        bArrZzi[5] = (byte) ((i >> 8) & 255);
        bArrZzi[6] = (byte) (i & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int iZzj2 = zzeqVar.zzj(3);
            if (zzadwVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzadwVar.zzb = iZzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        zzeqVar.zzh(2);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(8);
        for (int i = 0; i < iZzj; i++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zZzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadwVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) throws zzat {
        int iZzj = zzeqVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzeqVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}

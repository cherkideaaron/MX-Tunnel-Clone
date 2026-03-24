package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC3219pQ;

/* loaded from: classes.dex */
final class zzapd {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzeq r18, com.google.android.gms.internal.ads.zzapb r19) throws com.google.android.gms.internal.ads.zzat {
        /*
            r0 = r18
            r1 = r19
            r18.zze()
            r2 = 3
            r3 = 8
            int r2 = zzf(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc1
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzgrc.zza(r6)
            int r6 = r18.zzc()
            r10 = -1
            if (r6 >= r2) goto L34
        L32:
            r12 = r10
            goto L5f
        L34:
            long r12 = r0.zzk(r2)
            r14 = 3
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L5f
            int r6 = r18.zzc()
            if (r6 >= r3) goto L45
            goto L32
        L45:
            long r12 = r0.zzk(r3)
            long r14 = r14 + r12
            r16 = 255(0xff, double:1.26E-321)
            int r3 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r3 != 0) goto L5e
            int r3 = r18.zzc()
            if (r3 >= r7) goto L57
            goto L32
        L57:
            long r6 = r0.zzk(r7)
            long r12 = r6 + r14
            goto L5f
        L5e:
            r12 = r14
        L5f:
            r1.zzb = r12
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 != 0) goto L66
            return r4
        L66:
            r6 = 16
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 > 0) goto La1
            r6 = 0
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 != 0) goto L93
            int r3 = r1.zza
            r6 = 0
            if (r3 == r9) goto L8c
            if (r3 == r2) goto L85
            r2 = 17
            if (r3 == r2) goto L7e
            goto L93
        L7e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L85:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L8c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L93:
            r2 = 11
            r3 = 24
            int r0 = zzf(r0, r2, r3, r3)
            r1.zzc = r0
            if (r0 == r5) goto La0
            return r9
        La0:
            return r4
        La1:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 49
            r1.<init>(r0)
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzc(r0)
            throw r0
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapd.zza(com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzapb):boolean");
    }

    public static zzapc zzb(zzeq zzeqVar) throws zzat {
        int iZzj;
        int i;
        char c;
        int i2;
        int iZzj2;
        char c2;
        int iZzj3 = zzeqVar.zzj(8);
        int i3 = 5;
        int iZzj4 = zzeqVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(iZzj4);
                    throw zzat.zzc(sb.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iZzj = 19200;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzeqVar.zzj(24);
        }
        int iZzj5 = zzeqVar.zzj(3);
        int i4 = 1;
        if (iZzj5 == 0) {
            i = 768;
        } else if (iZzj5 == 1) {
            i = UserVerificationMethods.USER_VERIFY_ALL;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb2 = new StringBuilder(AbstractC3219pQ.a(iZzj5, 36));
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(iZzj5);
                throw zzat.zzc(sb2.toString());
            }
            i = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c = 0;
        } else if (iZzj5 == 2) {
            c = 2;
        } else if (iZzj5 == 3) {
            c = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(AbstractC3219pQ.a(iZzj5, 36));
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzat.zzc(sb3.toString());
            }
            c = 1;
        }
        zzeqVar.zzh(2);
        zzc(zzeqVar);
        int iZzj6 = zzeqVar.zzj(5);
        int i5 = 0;
        int iZzf = 0;
        while (true) {
            int i6 = 16;
            if (i5 < iZzj6 + 1) {
                int iZzj7 = zzeqVar.zzj(3);
                iZzf += zzf(zzeqVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzeqVar.zzi()) {
                    zzc(zzeqVar);
                }
                i5++;
            } else {
                int iZzf2 = zzf(zzeqVar, 4, 8, 16) + 1;
                zzeqVar.zzg();
                int i7 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i7 >= iZzf2) {
                        int i8 = iZzj3;
                        byte[] bArr = null;
                        if (zzeqVar.zzi()) {
                            int iZzf3 = zzf(zzeqVar, 2, 4, 8) + 1;
                            for (int i9 = 0; i9 < iZzf3; i9++) {
                                int iZzf4 = zzf(zzeqVar, 4, 8, 16);
                                int iZzf5 = zzf(zzeqVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzeqVar.zzj(4) + 1;
                                    zzeqVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i10 = 0; i10 < iZzj8; i10++) {
                                        bArr2[i10] = (byte) zzeqVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeqVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(iZzj);
                                throw zzat.zzc(sb4.toString());
                        }
                        return new zzapc(i8, (int) (iZzj * d), (int) (i * d), bArr3, null);
                    }
                    int iZzj9 = zzeqVar.zzj(2);
                    if (iZzj9 == 0) {
                        i2 = iZzj3;
                        zzd(zzeqVar);
                        if (c > 0) {
                            zze(zzeqVar);
                        }
                    } else if (iZzj9 != i4) {
                        if (iZzj9 == 3) {
                            zzf(zzeqVar, 4, 8, i6);
                            int iZzf6 = zzf(zzeqVar, 4, 8, i6);
                            if (zzeqVar.zzi()) {
                                zzf(zzeqVar, 8, i6, 0);
                            }
                            zzeqVar.zzg();
                            if (iZzf6 > 0) {
                                zzeqVar.zzh(iZzf6 * 8);
                            }
                        }
                        i2 = iZzj3;
                    } else {
                        if (zzd(zzeqVar)) {
                            zzeqVar.zzg();
                        }
                        if (c > 0) {
                            zze(zzeqVar);
                            iZzj2 = zzeqVar.zzj(2);
                            c2 = c;
                        } else {
                            iZzj2 = 0;
                            c2 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzeqVar.zzh(6);
                            int iZzj10 = zzeqVar.zzj(2);
                            zzeqVar.zzh(4);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(i3);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzeqVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzeqVar.zzg();
                            }
                        }
                        i2 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzeqVar.zzj(2);
                        if (iZzj11 > 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(iFloor);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(iFloor);
                        }
                        if (c2 == 0 && iZzj11 == 0) {
                            zzeqVar.zzg();
                        }
                    }
                    i7++;
                    iZzj3 = i2;
                    i3 = 5;
                    i4 = 1;
                    i6 = 16;
                }
            }
        }
    }

    private static void zzc(zzeq zzeqVar) {
        int iZzj;
        int iZzj2 = zzeqVar.zzj(2);
        if (iZzj2 == 0) {
            zzeqVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzeqVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzeqVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzeqVar.zzi();
            int i = true != zZzi ? 5 : 1;
            int i2 = true == zZzi ? 7 : 5;
            int i3 = true == zZzi ? 8 : 6;
            int i4 = 0;
            while (i4 < iZzf) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzeqVar.zzj(2) == 3 && zzeqVar.zzj(i2) * i != 0) {
                        zzeqVar.zzg();
                    }
                    iZzj = zzeqVar.zzj(i3) * i;
                    if (iZzj != 0 && iZzj != 180) {
                        zzeqVar.zzg();
                    }
                    zzeqVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzeqVar.zzi()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzd(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        boolean zZzi = zzeqVar.zzi();
        if (zZzi) {
            zzeqVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        zzeqVar.zzh(8);
        boolean zZzi = zzeqVar.zzi();
        boolean zZzi2 = zzeqVar.zzi();
        if (zZzi) {
            zzeqVar.zzh(5);
        }
        if (zZzi2) {
            zzeqVar.zzh(6);
        }
    }

    private static int zzf(zzeq zzeqVar, int i, int i2, int i3) {
        zzgrc.zza(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        long j = i4 + i5;
        long j2 = (int) j;
        if (j != j2) {
            throw new ArithmeticException();
        }
        if (j2 + (1 << i3) != ((int) r6)) {
            throw new ArithmeticException();
        }
        if (zzeqVar.zzc() < i) {
            return -1;
        }
        int iZzj = zzeqVar.zzj(i);
        if (iZzj != i4) {
            return iZzj;
        }
        if (zzeqVar.zzc() < i2) {
            return -1;
        }
        int iZzj2 = zzeqVar.zzj(i2);
        int i6 = iZzj + iZzj2;
        if (iZzj2 != i5) {
            return i6;
        }
        if (zzeqVar.zzc() < i3) {
            return -1;
        }
        return i6 + zzeqVar.zzj(i3);
    }
}

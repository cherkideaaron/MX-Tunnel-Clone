package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* loaded from: classes2.dex */
final class zzajr {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    public static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    public static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i, zzaju zzajuVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzajuVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzajuVar.zzb = j2;
        return i3;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzaju zzajuVar) {
        if ((i >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzd(bArr, i2, zzajuVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzc(bArr, i2, zzajuVar) + zzajuVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzall.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzc(bArr, i2, zzajuVar);
            i6 = zzajuVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzajuVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzall.zzg();
        }
        return i2;
    }

    public static int zzb(zzanb<?> zzanbVar, int i, byte[] bArr, int i2, int i3, zzalm<?> zzalmVar, zzaju zzajuVar) {
        int iZza = zza(zzanbVar, bArr, i2, i3, zzajuVar);
        while (true) {
            zzalmVar.add(zzajuVar.zzc);
            if (iZza >= i3) {
                break;
            }
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i3, zzajuVar);
        }
        return iZza;
    }

    public static int zzc(byte[] bArr, int i, zzaju zzajuVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza(b, bArr, i2, zzajuVar);
        }
        zzajuVar.zza = b;
        return i2;
    }

    public static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i2, zzajuVar);
        while (true) {
            zzaliVar.zzc(zzajuVar.zza);
            if (iZzc >= i3) {
                break;
            }
            int iZzc2 = zzc(bArr, iZzc, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzajuVar);
        }
        return iZzc;
    }

    public static int zzb(byte[] bArr, int i, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i, zzajuVar);
        int i2 = zzajuVar.zza;
        if (i2 < 0) {
            throw zzall.zzf();
        }
        if (i2 == 0) {
            zzajuVar.zzc = "";
            return iZzc;
        }
        zzajuVar.zzc = zzaoa.zzb(bArr, iZzc, i2);
        return iZzc + i2;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzanx zzanxVar, zzaju zzajuVar) {
        if ((i >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzd = zzd(bArr, i2, zzajuVar);
            zzanxVar.zza(i, Long.valueOf(zzajuVar.zzb));
            return iZzd;
        }
        if (i4 == 1) {
            zzanxVar.zza(i, Long.valueOf(zzd(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzc = zzc(bArr, i2, zzajuVar);
            int i5 = zzajuVar.zza;
            if (i5 < 0) {
                throw zzall.zzf();
            }
            if (i5 > bArr.length - iZzc) {
                throw zzall.zzj();
            }
            zzanxVar.zza(i, i5 == 0 ? zzajv.zza : zzajv.zza(bArr, iZzc, i5));
            return iZzc + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzall.zzc();
            }
            zzanxVar.zza(i, Integer.valueOf(zzc(bArr, i2)));
            return i2 + 4;
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        int i6 = (i & (-8)) | 4;
        int i7 = zzajuVar.zze + 1;
        zzajuVar.zze = i7;
        zza(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZzc2 = zzc(bArr, i2, zzajuVar);
            int i9 = zzajuVar.zza;
            i8 = i9;
            if (i9 == i6) {
                i2 = iZzc2;
                break;
            }
            int iZza = zza(i8, bArr, iZzc2, i3, zzanxVarZzd, zzajuVar);
            i8 = i9;
            i2 = iZza;
        }
        zzajuVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw zzall.zzg();
        }
        zzanxVar.zza(i, zzanxVarZzd);
        return i2;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzamm zzammVar, zzanu<zzanx, zzanx> zzanuVar, zzaju zzajuVar) {
        if (zzajuVar.zzd.zza(zzammVar, i >>> 3) == null) {
            return zza(i, bArr, i2, i3, zzamq.zzc(obj), zzajuVar);
        }
        zzalf.zzd zzdVar = (zzalf.zzd) obj;
        zzdVar.zza();
        zzakx<zzalf.zzc> zzakxVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    public static int zza(int i, byte[] bArr, int i2, zzaju zzajuVar) {
        int i3;
        int i4 = i & 127;
        int i5 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i6 = i4 | ((b & 127) << 7);
            int i7 = i2 + 2;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                zzajuVar.zza = i6 | (b2 << 14);
                return i7;
            }
            i4 = i6 | ((b2 & 127) << 14);
            i5 = i2 + 3;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i3 = b3 << 21;
            } else {
                int i8 = i4 | ((b3 & 127) << 21);
                int i9 = i2 + 4;
                byte b4 = bArr[i5];
                if (b4 >= 0) {
                    zzajuVar.zza = i8 | (b4 << 28);
                    return i9;
                }
                int i10 = i8 | ((b4 & 127) << 28);
                while (true) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        zzajuVar.zza = i10;
                        return i11;
                    }
                    i9 = i11;
                }
            }
        }
        zzajuVar.zza = i4 | i3;
        return i5;
    }

    public static int zza(zzanb<?> zzanbVar, int i, byte[] bArr, int i2, int i3, zzalm<Object> zzalmVar, zzaju zzajuVar) {
        int i4 = (i & (-8)) | 4;
        int iZza = zza(zzanbVar, bArr, i2, i3, i4, zzajuVar);
        while (true) {
            zzalmVar.add(zzajuVar.zzc);
            if (iZza >= i3) {
                break;
            }
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i3, i4, zzajuVar);
        }
        return iZza;
    }

    private static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i, int i2, int i3, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i, i2, i3, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    public static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i, int i2, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i, i2, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    public static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i, int i2, int i3, zzaju zzajuVar) {
        zzamq zzamqVar = (zzamq) zzanbVar;
        int i4 = zzajuVar.zze + 1;
        zzajuVar.zze = i4;
        zza(i4);
        int iZza = zzamqVar.zza((zzamq) obj, bArr, i, i2, i3, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return iZza;
    }

    public static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i, int i2, zzaju zzajuVar) {
        int iZza = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZza = zza(i3, bArr, iZza, zzajuVar);
            i3 = zzajuVar.zza;
        }
        int i4 = iZza;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzall.zzj();
        }
        int i5 = zzajuVar.zze + 1;
        zzajuVar.zze = i5;
        zza(i5);
        int i6 = i3 + i4;
        zzanbVar.zza(obj, bArr, i4, i6, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return i6;
    }

    public static int zza(byte[] bArr, int i, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i, zzajuVar);
        int i2 = zzajuVar.zza;
        if (i2 < 0) {
            throw zzall.zzf();
        }
        if (i2 > bArr.length - iZzc) {
            throw zzall.zzj();
        }
        if (i2 == 0) {
            zzajuVar.zzc = zzajv.zza;
            return iZzc;
        }
        zzajuVar.zzc = zzajv.zza(bArr, iZzc, i2);
        return iZzc + i2;
    }

    public static int zza(byte[] bArr, int i, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i, zzajuVar);
        int i2 = zzajuVar.zza + iZzc;
        while (iZzc < i2) {
            iZzc = zzc(bArr, iZzc, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        if (iZzc == i2) {
            return iZzc;
        }
        throw zzall.zzj();
    }

    private static void zza(int i) throws zzall {
        if (i >= zza) {
            throw zzall.zzh();
        }
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zziac {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zziab zziabVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zziabVar);
        }
        zziabVar.zza = b;
        return i2;
    }

    public static int zzb(int i, byte[] bArr, int i2, zziab zziabVar) {
        int i3;
        byte b = bArr[i2];
        int i4 = i2 + 1;
        int i5 = i & 127;
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i6 = i5 | ((b & 127) << 7);
            int i7 = i2 + 2;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                zziabVar.zza = i6 | (b2 << 14);
                return i7;
            }
            i5 = i6 | ((b2 & 127) << 14);
            i4 = i2 + 3;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i3 = b3 << 21;
            } else {
                int i8 = i5 | ((b3 & 127) << 21);
                int i9 = i2 + 4;
                byte b4 = bArr[i4];
                if (b4 >= 0) {
                    zziabVar.zza = i8 | (b4 << 28);
                    return i9;
                }
                int i10 = i8 | ((b4 & 127) << 28);
                while (true) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        zziabVar.zza = i10;
                        return i11;
                    }
                    i9 = i11;
                }
            }
        }
        zziabVar.zza = i5 | i3;
        return i4;
    }

    public static int zzc(byte[] bArr, int i, zziab zziabVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zziabVar.zzb = j;
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
        zziabVar.zzb = j2;
        return i3;
    }

    public static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long zze(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i, zziab zziabVar) {
        int iZza = zza(bArr, i, zziabVar);
        int i2 = zziabVar.zza;
        if (i2 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zziabVar.zzc = "";
            return iZza;
        }
        zziabVar.zzc = zzier.zze(bArr, iZza, i2);
        return iZza + i2;
    }

    public static int zzg(byte[] bArr, int i, zziab zziabVar) {
        int iZza = zza(bArr, i, zziabVar);
        int i2 = zziabVar.zza;
        if (i2 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZza) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zziabVar.zzc = zzian.zza;
            return iZza;
        }
        zziabVar.zzc = zzian.zzs(bArr, iZza, i2);
        return iZza + i2;
    }

    public static int zzh(zzidu zziduVar, byte[] bArr, int i, int i2, zziab zziabVar) {
        Object objZza = zziduVar.zza();
        int iZzj = zzj(objZza, zziduVar, bArr, i, i2, zziabVar);
        zziduVar.zzk(objZza);
        zziabVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zzidu zziduVar, byte[] bArr, int i, int i2, int i3, zziab zziabVar) {
        Object objZza = zziduVar.zza();
        int iZzk = zzk(objZza, zziduVar, bArr, i, i2, i3, zziabVar);
        zziduVar.zzk(objZza);
        zziabVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zzidu zziduVar, byte[] bArr, int i, int i2, zziab zziabVar) {
        int iZzb = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzb = zzb(i3, bArr, iZzb, zziabVar);
            i3 = zziabVar.zza;
        }
        int i4 = iZzb;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zziabVar.zze + 1;
        zziabVar.zze = i5;
        zzq(i5);
        int i6 = i3 + i4;
        zziduVar.zzj(obj, bArr, i4, i6, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return i6;
    }

    public static int zzk(Object obj, zzidu zziduVar, byte[] bArr, int i, int i2, int i3, zziab zziabVar) {
        zzidf zzidfVar = (zzidf) zziduVar;
        int i4 = zziabVar.zze + 1;
        zziabVar.zze = i4;
        zzq(i4);
        int iZzi = zzidfVar.zzi(obj, bArr, i, i2, i3, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return iZzi;
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzicd zzicdVar, zziab zziabVar) {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int iZza = zza(bArr, i2, zziabVar);
        while (true) {
            zzibsVar.zzi(zziabVar.zza);
            if (iZza >= i3) {
                break;
            }
            int iZza2 = zza(bArr, iZza, zziabVar);
            if (i != zziabVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zziabVar);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i, zzicd zzicdVar, zziab zziabVar) {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int iZza = zza(bArr, i, zziabVar);
        int i2 = zziabVar.zza + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzidu zziduVar, int i, byte[] bArr, int i2, int i3, zzicd zzicdVar, zziab zziabVar) {
        int iZzh = zzh(zziduVar, bArr, i2, i3, zziabVar);
        while (true) {
            zzicdVar.add(zziabVar.zzc);
            if (iZzh >= i3) {
                break;
            }
            int iZza = zza(bArr, iZzh, zziabVar);
            if (i != zziabVar.zza) {
                break;
            }
            iZzh = zzh(zziduVar, bArr, iZza, i3, zziabVar);
        }
        return iZzh;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzieg zziegVar, zziab zziabVar) {
        if ((i >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzc = zzc(bArr, i2, zziabVar);
            zziegVar.zzk(i, Long.valueOf(zziabVar.zzb));
            return iZzc;
        }
        if (i4 == 1) {
            zziegVar.zzk(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZza = zza(bArr, i2, zziabVar);
            int i5 = zziabVar.zza;
            if (i5 < 0) {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iZza) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            zziegVar.zzk(i, i5 == 0 ? zzian.zza : zzian.zzs(bArr, iZza, i5));
            return iZza + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzicg("Protocol message contained an invalid tag (zero).");
            }
            zziegVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzieg zziegVarZzb = zzieg.zzb();
        int i7 = zziabVar.zze + 1;
        zziabVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iZza2 = zza(bArr, i2, zziabVar);
            i8 = zziabVar.zza;
            if (i8 == i6) {
                i2 = iZza2;
                break;
            }
            i2 = zzo(i8, bArr, iZza2, i3, zziegVarZzb, zziabVar);
        }
        zziabVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzicg("Failed to parse the message.");
        }
        zziegVar.zzk(i, zziegVarZzb);
        return i2;
    }

    public static int zzp(int i, byte[] bArr, int i2, int i3, zziab zziabVar) {
        if ((i >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zziabVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zziabVar) + zziabVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zziabVar);
            i6 = zziabVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zziabVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zzicg("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws zzicg {
        if (i >= zzb) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.Vs;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaqn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzaev zzaevVar) {
        zzer zzerVar = new zzer(8);
        int i = zzaqm.zza(zzaevVar, zzerVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzaevVar.zzi(zzerVar.zzi(), 0, 4);
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iZzB);
        zzee.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaql zzb(zzaev zzaevVar) {
        byte[] bArr;
        int i;
        zzer zzerVar = new zzer(16);
        long j = zzd(1718449184, zzaevVar, zzerVar).zzb;
        zzgrc.zzi(j >= 16);
        zzaevVar.zzi(zzerVar.zzi(), 0, 16);
        zzerVar.zzh(0);
        int iZzu = zzerVar.zzu();
        int iZzu2 = zzerVar.zzu();
        int iZzI = zzerVar.zzI();
        int iZzI2 = zzerVar.zzI();
        int iZzu3 = zzerVar.zzu();
        int iZzu4 = zzerVar.zzu();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            zzaevVar.zzi(bArr2, 0, i2);
            if (iZzu != 65534) {
                i = iZzu;
                bArr = bArr2;
            } else if (i2 == 24) {
                zzer zzerVar2 = new zzer(bArr2);
                zzerVar2.zzu();
                int iZzu5 = zzerVar2.zzu();
                if (iZzu5 != 0 && iZzu5 != iZzu4) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzu4).length() + String.valueOf(iZzu5).length() + 33 + 19);
                    Vs.x(sb, "validBits ( ", iZzu5, ")  != bitsPerSample( ", iZzu4);
                    sb.append(") are not supported");
                    throw zzat.zzc(sb.toString());
                }
                int iZzI3 = zzerVar2.zzI();
                if ((iZzI3 >> 18) != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                    sb2.append("invalid channel mask ");
                    sb2.append(iZzI3);
                    throw zzat.zzc(sb2.toString());
                }
                if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                    int iBitCount = Integer.bitCount(iZzI3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                    sb3.append("invalid number of channels (");
                    sb3.append(iBitCount);
                    sb3.append(") in channel mask ");
                    sb3.append(iZzI3);
                    throw zzat.zzc(sb3.toString());
                }
                iZzu = zzerVar2.zzu();
                byte[] bArr3 = new byte[14];
                zzerVar2.zzm(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                    throw zzat.zzc("invalid wav format extension guid");
                }
                i = iZzu;
                bArr = bArr2;
            } else {
                bArr = bArr2;
                i = 65534;
            }
        } else {
            bArr = zzfj.zzb;
            i = iZzu;
        }
        zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
        return new zzaql(i, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr);
    }

    public static Pair zzc(zzaev zzaevVar) {
        zzaevVar.zzl();
        zzaqm zzaqmVarZzd = zzd(1684108385, zzaevVar, new zzer(8));
        zzaevVar.zzf(8);
        return Pair.create(Long.valueOf(zzaevVar.zzn()), Long.valueOf(zzaqmVarZzd.zzb));
    }

    private static zzaqm zzd(int i, zzaev zzaevVar, zzer zzerVar) throws zzat {
        zzaqm zzaqmVarZza = zzaqm.zza(zzaevVar, zzerVar);
        while (true) {
            int i2 = zzaqmVarZza.zza;
            if (i2 == i) {
                return zzaqmVarZza;
            }
            Vs.w(new StringBuilder(String.valueOf(i2).length() + 28), "Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = zzaqmVarZza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i2);
                throw zzat.zzc(sb.toString());
            }
            zzaevVar.zzf((int) j2);
            zzaqmVarZza = zzaqm.zza(zzaevVar, zzerVar);
        }
    }
}

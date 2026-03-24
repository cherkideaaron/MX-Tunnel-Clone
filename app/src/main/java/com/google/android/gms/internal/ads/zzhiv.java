package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhiv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzc = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzd = {67108863, 33554431};
    private static final int[] zze = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j2 + j2 + j3;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j6 + j6 + j7;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j10 + j10 + j11;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j14 + j14 + j15;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j18 + j18 + j19;
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j22 + j22 + j23;
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j26 + j26 + j27;
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j30 + j30 + j31;
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j34 + j34 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + j34;
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j6 + j6 + j7;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void zze(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[0];
        long j2 = jArr3[0];
        long j3 = j * j2;
        long j4 = jArr3[1];
        long j5 = jArr2[1];
        long j6 = (j5 * j2) + (j * j4);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        long j9 = ((j5 + j5) * j4) + (j * j7) + (j8 * j2);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        long j12 = (j5 * j7) + (j8 * j4) + (j * j10) + (j11 * j2);
        long j13 = jArr3[4];
        long j14 = jArr2[4];
        long j15 = (j5 * j10) + (j11 * j4);
        long j16 = j15 + j15 + (j8 * j7) + (j * j13) + (j14 * j2);
        long j17 = jArr3[5];
        long j18 = jArr2[5];
        long j19 = (j8 * j10) + (j11 * j7) + (j5 * j13) + (j14 * j4) + (j * j17) + (j18 * j2);
        long j20 = jArr3[6];
        long j21 = jArr2[6];
        long j22 = (j11 * j10) + (j5 * j17) + (j18 * j4);
        long j23 = j22 + j22 + (j8 * j13) + (j14 * j7) + (j * j20) + (j21 * j2);
        long j24 = jArr3[7];
        long j25 = jArr2[7];
        long j26 = (j11 * j13) + (j14 * j10) + (j8 * j17) + (j18 * j7) + (j5 * j20) + (j21 * j4) + (j * j24) + (j25 * j2);
        long j27 = jArr3[8];
        long j28 = jArr2[8];
        long j29 = (j11 * j17) + (j18 * j10) + (j5 * j24) + (j25 * j4);
        long j30 = j29 + j29 + (j14 * j13) + (j8 * j20) + (j21 * j7) + (j * j27) + (j28 * j2);
        long j31 = jArr3[9];
        long j32 = jArr2[9];
        long j33 = (j14 * j17) + (j18 * j13) + (j11 * j20) + (j21 * j10) + (j8 * j24) + (j25 * j7) + (j5 * j27) + (j28 * j4) + (j * j31) + (j2 * j32);
        long j34 = (j18 * j17) + (j11 * j24) + (j25 * j10) + (j5 * j31) + (j4 * j32);
        long j35 = (j18 * j24) + (j25 * j17) + (j11 * j31) + (j10 * j32);
        long j36 = (j25 * j24) + (j18 * j31) + (j17 * j32);
        long j37 = (j25 * j27) + (j28 * j24) + (j21 * j31) + (j20 * j32);
        long j38 = (j24 * j32) + (j25 * j31);
        zzc(new long[]{j3, j6, j9, j12, j16, j19, j23, j26, j30, j33, j34 + j34 + (j14 * j20) + (j21 * j13) + (j8 * j27) + (j28 * j7), (j18 * j20) + (j21 * j17) + (j14 * j24) + (j25 * j13) + (j11 * j27) + (j28 * j10) + (j8 * j31) + (j7 * j32), j35 + j35 + (j21 * j20) + (j14 * j27) + (j28 * j13), (j21 * j24) + (j25 * j20) + (j18 * j27) + (j28 * j17) + (j14 * j31) + (j13 * j32), j36 + j36 + (j21 * j27) + (j28 * j20), j37, j38 + j38 + (j28 * j27), (j27 * j32) + (j28 * j31), (j32 + j32) * j31}, jArr);
    }

    public static void zzf(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * j;
        long j3 = jArr2[1];
        long j4 = (j + j) * j3;
        long j5 = jArr2[2];
        long j6 = (j * j5) + (j3 * j3);
        long j7 = jArr2[3];
        long j8 = (j * j7) + (j3 * j5);
        long j9 = jArr2[4];
        long j10 = (j5 * j5) + (j3 * 4 * j7) + ((j + j) * j9);
        long j11 = jArr2[5];
        long j12 = (j5 * j7) + (j3 * j9) + (j * j11);
        long j13 = jArr2[6];
        long j14 = (j7 * j7) + (j5 * j9) + (j * j13) + ((j3 + j3) * j11);
        long j15 = jArr2[7];
        long j16 = (j7 * j9) + (j5 * j11) + (j3 * j13) + (j * j15);
        long j17 = jArr2[8];
        long j18 = (j7 * j11) + (j3 * j15);
        long j19 = j18 + j18 + (j5 * j13) + (j * j17);
        long j20 = j19 + j19 + (j9 * j9);
        long j21 = jArr2[9];
        long j22 = (j9 * j11) + (j7 * j13) + (j5 * j15) + (j3 * j17) + (j * j21);
        long j23 = (j3 * j21) + (j7 * j15);
        long j24 = j23 + j23 + (j11 * j11) + (j9 * j13) + (j5 * j17);
        long j25 = (j11 * j13) + (j9 * j15) + (j7 * j17) + (j5 * j21);
        long j26 = (j7 * j21) + (j11 * j15);
        long j27 = j26 + j26 + (j9 * j17);
        long j28 = j27 + j27 + (j13 * j13);
        long j29 = (j13 * j15) + (j11 * j17) + (j9 * j21);
        long j30 = (j15 * j15) + (j13 * j17) + ((j11 + j11) * j21);
        long j31 = (j13 * j21) + (j15 * j17);
        zzc(new long[]{j2, j4, j6 + j6, j8 + j8, j10, j12 + j12, j14 + j14, j16 + j16, j20, j22 + j22, j24 + j24, j25 + j25, j28, j29 + j29, j30 + j30, j31 + j31, (j15 * 4 * j21) + (j17 * j17), (j17 + j17) * j21, (j21 + j21) * j21}, jArr);
    }

    public static long[] zzg(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = zzb[i];
            jArr[i] = (((((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8)) | ((bArr[i2 + 2] & 255) << 16)) | ((bArr[i2 + 3] & 255) << 24)) >> zzc[i]) & zzd[i & 1];
        }
        return jArr;
    }

    public static byte[] zzh(long[] jArr) {
        int i;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            int i3 = 0;
            while (i3 < 9) {
                long j = jArrCopyOf[i3];
                int i4 = -((int) (((j >> 31) & j) >> zze[i3 & 1]));
                jArrCopyOf[i3] = j + (i4 << r14);
                i3++;
                jArrCopyOf[i3] = jArrCopyOf[i3] - i4;
            }
            long j2 = jArrCopyOf[9];
            jArrCopyOf[9] = j2 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j2 >> 31) & j2) >> 25))) * 19);
            i2++;
        }
        long j3 = jArrCopyOf[0];
        jArrCopyOf[0] = j3 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j3 >> 31) & j3) >> 26)));
        int i5 = 0;
        for (i = 2; i5 < i; i = 2) {
            int i6 = 0;
            while (i6 < 9) {
                long j4 = jArrCopyOf[i6];
                long j5 = j4 >> zze[i6 & 1];
                jArrCopyOf[i6] = j4 & zzd[r14];
                i6++;
                jArrCopyOf[i6] = jArrCopyOf[i6] + ((int) j5);
            }
            i5++;
        }
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[0] = (((int) (r9 >> 25)) * 19) + jArrCopyOf[0];
        int i7 = ~((((int) r9) - 67108845) >> 31);
        for (int i8 = 1; i8 < 10; i8++) {
            int i9 = ~(((int) jArrCopyOf[i8]) ^ zzd[i8 & 1]);
            int i10 = i9 & (i9 << 16);
            int i11 = i10 & (i10 << 8);
            int i12 = i11 & (i11 << 4);
            int i13 = i12 & (i12 << 2);
            i7 &= (i13 & (i13 + i13)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - (67108845 & i7);
        long j6 = 33554431 & i7;
        jArrCopyOf[1] = jArrCopyOf[1] - j6;
        for (int i14 = 2; i14 < 10; i14 += 2) {
            jArrCopyOf[i14] = jArrCopyOf[i14] - (67108863 & i7);
            int i15 = i14 + 1;
            jArrCopyOf[i15] = jArrCopyOf[i15] - j6;
        }
        for (int i16 = 0; i16 < 10; i16++) {
            jArrCopyOf[i16] = jArrCopyOf[i16] << zzc[i16];
        }
        byte[] bArr = new byte[32];
        for (int i17 = 0; i17 < 10; i17++) {
            int i18 = zzb[i17];
            long j7 = bArr[i18];
            long j8 = jArrCopyOf[i17];
            bArr[i18] = (byte) (j7 | (j8 & 255));
            bArr[i18 + 1] = (byte) (bArr[r5] | ((j8 >> 8) & 255));
            bArr[i18 + 2] = (byte) (bArr[r5] | ((j8 >> 16) & 255));
            bArr[i18 + 3] = (byte) (bArr[r4] | ((j8 >> 24) & 255));
        }
        return bArr;
    }
}

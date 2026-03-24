package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhio {
    private static final zzhij zzb = new zzhij(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhil zzc = new zzhil(new zzhim(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] zza(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        zzhil zzhilVar = new zzhil(zzc);
        zzhin zzhinVar = new zzhin();
        for (i = 1; i < 64; i += 2) {
            zzhij zzhijVar = new zzhij(zzb);
            zzk(zzhijVar, i / 2, bArr2[i]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar);
        }
        zzhim zzhimVar = new zzhim();
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            zzhij zzhijVar2 = new zzhij(zzb);
            zzk(zzhijVar2, i7 / 2, bArr2[i7]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar2);
        }
        zzhim zzhimVar2 = new zzhim(zzhilVar);
        long[] jArr = new long[10];
        zzhiv.zzf(jArr, zzhimVar2.zza);
        long[] jArr2 = new long[10];
        zzhiv.zzf(jArr2, zzhimVar2.zzb);
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr3, zzhimVar2.zzc);
        long[] jArr4 = new long[10];
        zzhiv.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhiv.zzb(jArr5, jArr2, jArr);
        zzhiv.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhiv.zze(jArr6, jArr, jArr2);
        zzhiv.zze(jArr6, jArr6, zzhiq.zza);
        zzhiv.zza(jArr6, jArr6, jArr4);
        zzhiv.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhiv.zzh(jArr5), zzhiv.zzh(jArr6))) {
            return zzhimVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i;
        bArrDigest[31] = (byte) (i | 64);
        return bArrDigest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        char c;
        byte b;
        int i;
        byte b2;
        byte[] bArr4 = bArr2;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i2 = 31;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int i3 = bArrCopyOfRange[i2] & 255;
            int i4 = zza[i2] & 255;
            if (i3 == i4) {
                i2--;
                bArrCopyOfRange = bArrCopyOfRange;
                bArr4 = bArr2;
            } else if (i3 < i4) {
                MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzn = zzn(bArrDigest, 0) & 2097151;
                long jZzo = zzo(bArrDigest, 2) >> 5;
                long jZzn2 = zzn(bArrDigest, 5) >> 2;
                long jZzo2 = zzo(bArrDigest, 7) >> 7;
                long jZzo3 = zzo(bArrDigest, 10) >> 4;
                long jZzn3 = zzn(bArrDigest, 13) >> 1;
                long jZzo4 = zzo(bArrDigest, 15) >> 6;
                long jZzn4 = zzn(bArrDigest, 18) >> 3;
                long jZzn5 = zzn(bArrDigest, 21) & 2097151;
                long jZzo5 = zzo(bArrDigest, 23) >> 5;
                long jZzn6 = zzn(bArrDigest, 26) >> 2;
                long jZzo6 = zzo(bArrDigest, 28) >> 7;
                long jZzo7 = zzo(bArrDigest, 31) >> 4;
                long jZzn7 = zzn(bArrDigest, 34) >> 1;
                long jZzo8 = zzo(bArrDigest, 36) >> 6;
                long jZzn8 = zzn(bArrDigest, 39) >> 3;
                long jZzn9 = zzn(bArrDigest, 42) & 2097151;
                long jZzo9 = zzo(bArrDigest, 44) >> 5;
                long jZzn10 = (zzn(bArrDigest, 47) >> 2) & 2097151;
                long jZzo10 = (zzo(bArrDigest, 49) >> 7) & 2097151;
                long jZzo11 = (zzo(bArrDigest, 52) >> 4) & 2097151;
                long jZzn11 = (zzn(bArrDigest, 55) >> 1) & 2097151;
                long jZzo12 = (zzo(bArrDigest, 57) >> 6) & 2097151;
                long jZzo13 = zzo(bArrDigest, 60) >> 3;
                long j = (jZzo11 * 666643) + jZzn5;
                long j2 = (jZzo10 * 666643) + jZzn4;
                long j3 = (jZzn10 * 666643) + (jZzo4 & 2097151);
                long j4 = (j3 + 1048576) >> 21;
                long j5 = j4 << 21;
                long j6 = (jZzn10 * 654183) + (jZzo10 * 470296) + j;
                long j7 = (j6 + 1048576) >> 21;
                long j8 = j7 << 21;
                long j9 = (jZzn10 * 136657) + (((jZzo11 * 654183) + ((jZzn11 * 470296) + ((jZzo12 * 666643) + (jZzn6 & 2097151)))) - (jZzo10 * 997805));
                long j10 = (j9 + 1048576) >> 21;
                long j11 = j10 << 21;
                long j12 = ((jZzo11 * 136657) + (((jZzo12 * 654183) + ((jZzo13 * 470296) + (jZzo7 & 2097151))) - (jZzn11 * 997805))) - (jZzo10 * 683901);
                long j13 = (j12 + 1048576) >> 21;
                long j14 = ((jZzo12 * 136657) + ((jZzo8 & 2097151) - (jZzo13 * 997805))) - (jZzn11 * 683901);
                long j15 = (j14 + 1048576) >> 21;
                long j16 = j15 << 21;
                long j17 = jZzn9 - (jZzo13 * 683901);
                long j18 = (j17 + 1048576) >> 21;
                long j19 = (jZzn10 * 470296) + j2 + j4;
                long j20 = (j19 + 1048576) >> 21;
                long j21 = j20 << 21;
                long j22 = (((jZzo10 * 654183) + ((jZzo11 * 470296) + ((jZzn11 * 666643) + (jZzo5 & 2097151)))) - (jZzn10 * 997805)) + j7;
                long j23 = (j22 + 1048576) >> 21;
                long j24 = j23 << 21;
                long j25 = (((jZzo10 * 136657) + (((jZzn11 * 654183) + ((jZzo12 * 470296) + ((jZzo13 * 666643) + (jZzo6 & 2097151)))) - (jZzo11 * 997805))) - (jZzn10 * 683901)) + j10;
                long j26 = (j25 + 1048576) >> 21;
                long j27 = j26 << 21;
                long j28 = (((jZzn11 * 136657) + (((jZzo13 * 654183) + (jZzn7 & 2097151)) - (jZzo12 * 997805))) - (jZzo11 * 683901)) + j13;
                long j29 = (j28 + 1048576) >> 21;
                long j30 = (((jZzo13 * 136657) + jZzn8) - (jZzo12 * 683901)) + j15;
                long j31 = (j30 + 1048576) >> 21;
                long j32 = (j12 - (j13 << 21)) + j26;
                long j33 = (j32 * 666643) + jZzn;
                long j34 = (j33 + 1048576) >> 21;
                long j35 = j34 << 21;
                long j36 = (j14 - j16) + j29;
                long j37 = j28 - (j29 << 21);
                long j38 = (j32 * 654183) + (j37 * 470296) + (j36 * 666643) + (jZzn2 & 2097151);
                long j39 = (j38 + 1048576) >> 21;
                long j40 = j39 << 21;
                long j41 = (j17 - (j18 << 21)) + j31;
                long j42 = j30 - (j31 << 21);
                long j43 = (j32 * 136657) + (((j36 * 654183) + ((j42 * 470296) + ((j41 * 666643) + (jZzo3 & 2097151)))) - (j37 * 997805));
                long j44 = (j43 + 1048576) >> 21;
                long j45 = j44 << 21;
                long j46 = (jZzo9 & 2097151) + j18;
                long j47 = ((j36 * 136657) + (((j41 * 654183) + ((j46 * 470296) + (j3 - j5))) - (j42 * 997805))) - (j37 * 683901);
                long j48 = (j47 + 1048576) >> 21;
                long j49 = j48 << 21;
                long j50 = ((j41 * 136657) + (((j6 - j8) + j20) - (j46 * 997805))) - (j42 * 683901);
                long j51 = (j50 + 1048576) >> 21;
                long j52 = j51 << 21;
                long j53 = ((j9 - j11) + j23) - (j46 * 683901);
                long j54 = (j53 + 1048576) >> 21;
                long j55 = (j32 * 470296) + (j37 * 666643) + (jZzo & 2097151) + j34;
                long j56 = (j55 + 1048576) >> 21;
                long j57 = (((j37 * 654183) + ((j36 * 470296) + ((j42 * 666643) + (jZzo2 & 2097151)))) - (j32 * 997805)) + j39;
                long j58 = (j57 + 1048576) >> 21;
                long j59 = (((j37 * 136657) + (((j42 * 654183) + ((j41 * 470296) + ((j46 * 666643) + (jZzn3 & 2097151)))) - (j36 * 997805))) - (j32 * 683901)) + j44;
                long j60 = (j59 + 1048576) >> 21;
                long j61 = (((j42 * 136657) + (((j46 * 654183) + (j19 - j21)) - (j41 * 997805))) - (j36 * 683901)) + j48;
                long j62 = (j61 + 1048576) >> 21;
                long j63 = (((j46 * 136657) + (j22 - j24)) - (j41 * 683901)) + j51;
                long j64 = (j63 + 1048576) >> 21;
                long j65 = (j25 - j27) + j54;
                long j66 = (j65 + 1048576) >> 21;
                long j67 = j66 << 21;
                long j68 = (j66 * 666643) + (j33 - j35);
                long j69 = j68 >> 21;
                long j70 = j69 << 21;
                long j71 = (j66 * 470296) + (j55 - (j56 << 21)) + j69;
                long j72 = j71 >> 21;
                long j73 = j72 << 21;
                long j74 = (j66 * 654183) + (j38 - j40) + j56 + j72;
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = ((j57 - (j58 << 21)) - (j66 * 997805)) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = (j66 * 136657) + (j43 - j45) + j58 + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = ((j59 - (j60 << 21)) - (j66 * 683901)) + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = (j47 - j49) + j60 + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = (j61 - (j62 << 21)) + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = (j50 - j52) + j62 + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j63 - (j64 << 21)) + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j53 - (j54 << 21)) + j64 + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j65 - j67) + j99;
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (666643 * j102) + (j68 - j70);
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (470296 * j102) + (j71 - j73) + j105;
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = (654183 * j102) + (j74 - j76) + j108;
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = ((j77 - j79) - (997805 * j102)) + j111;
                long j114 = j113 >> 21;
                long j115 = j114 << 21;
                long j116 = (136657 * j102) + (j80 - j82) + j114;
                long j117 = j116 >> 21;
                long j118 = j117 << 21;
                long j119 = ((j83 - j85) - (j102 * 683901)) + j117;
                long j120 = j119 >> 21;
                long j121 = j120 << 21;
                long j122 = (j86 - j88) + j120;
                long j123 = j122 >> 21;
                long j124 = j123 << 21;
                long j125 = (j89 - j91) + j123;
                long j126 = j125 >> 21;
                long j127 = j126 << 21;
                long j128 = (j92 - j94) + j126;
                long j129 = j128 >> 21;
                long j130 = j129 << 21;
                long j131 = (j95 - j97) + j129;
                long j132 = j131 >> 21;
                long j133 = j132 << 21;
                long j134 = (j98 - j100) + j132;
                long j135 = j134 >> 21;
                bArrDigest[0] = (byte) (j104 - j106);
                long j136 = j125 - j127;
                long j137 = j122 - j124;
                long j138 = j119 - j121;
                long j139 = j116 - j118;
                long j140 = j113 - j115;
                long j141 = j110 - j112;
                long j142 = j107 - j109;
                bArrDigest[1] = (byte) (r3 >> 8);
                bArrDigest[2] = (byte) ((r3 >> 16) | (j142 << 5));
                bArrDigest[3] = (byte) (j142 >> 3);
                bArrDigest[4] = (byte) (j142 >> 11);
                bArrDigest[5] = (byte) ((j142 >> 19) | (j141 << 2));
                bArrDigest[6] = (byte) (j141 >> 6);
                bArrDigest[7] = (byte) ((j141 >> 14) | (j140 << 7));
                bArrDigest[8] = (byte) (j140 >> 1);
                bArrDigest[9] = (byte) (j140 >> 9);
                bArrDigest[10] = (byte) ((j140 >> 17) | (j139 << 4));
                bArrDigest[11] = (byte) (j139 >> 4);
                bArrDigest[12] = (byte) (j139 >> 12);
                bArrDigest[13] = (byte) ((j139 >> 20) | (j138 + j138));
                bArrDigest[14] = (byte) (j138 >> 7);
                bArrDigest[15] = (byte) ((j138 >> 15) | (j137 << 6));
                bArrDigest[16] = (byte) (j137 >> 2);
                bArrDigest[17] = (byte) (j137 >> 10);
                bArrDigest[18] = (byte) ((j137 >> 18) | (j136 << 3));
                long j143 = j134 - (j135 << 21);
                long j144 = (j101 - j103) + j135;
                long j145 = j131 - j133;
                bArrDigest[19] = (byte) (j136 >> 5);
                bArrDigest[20] = (byte) (j136 >> 13);
                bArrDigest[21] = (byte) (j128 - j130);
                bArrDigest[22] = (byte) (r3 >> 8);
                bArrDigest[23] = (byte) ((r3 >> 16) | (j145 << 5));
                bArrDigest[24] = (byte) (j145 >> 3);
                bArrDigest[25] = (byte) (j145 >> 11);
                bArrDigest[26] = (byte) ((j145 >> 19) | (j143 << 2));
                bArrDigest[27] = (byte) (j143 >> 6);
                bArrDigest[28] = (byte) ((j143 >> 14) | (j144 << 7));
                bArrDigest[29] = (byte) (j144 >> 1);
                bArrDigest[30] = (byte) (j144 >> 9);
                bArrDigest[31] = (byte) (j144 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzg = zzhiv.zzg(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhiv.zzf(jArr4, jArrZzg);
                zzhiv.zze(jArr5, jArr4, zzhiq.zza);
                zzhiv.zzb(jArr4, jArr4, jArr2);
                zzhiv.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhiv.zzf(jArr8, jArr5);
                zzhiv.zze(jArr8, jArr8, jArr5);
                zzhiv.zzf(jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr5);
                zzhiv.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhiv.zzf(jArr9, jArr);
                zzhiv.zzf(jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr10);
                zzhiv.zze(jArr10, jArr, jArr10);
                zzhiv.zze(jArr9, jArr9, jArr10);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                byte[] bArr5 = bArrCopyOfRange;
                for (int i5 = 1; i5 < 5; i5++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i6 = 1; i6 < 10; i6++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i7 = 1; i7 < 20; i7++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i8 = 1; i8 < 10; i8++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i9 = 1; i9 < 50; i9++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i10 = 1; i10 < 100; i10++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i11 = 1; i11 < 50; i11++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr, jArr9, jArr);
                zzhiv.zze(jArr, jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr4);
                zzhiv.zzf(jArr6, jArr);
                zzhiv.zze(jArr6, jArr6, jArr5);
                zzhiv.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhiv.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhiv.zze(jArr, jArr, zzhiq.zzc);
                }
                if (zze(jArr)) {
                    c = 31;
                    b = 255;
                    i = 7;
                } else {
                    c = 31;
                    b = 255;
                    i = 7;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[c] & b) >> i)) {
                    zzm(jArr, jArr);
                }
                zzhiv.zze(jArr3, jArr, jArrZzg);
                zzhin zzhinVar = new zzhin(new zzhim(jArr, jArrZzg, jArr2), jArr3);
                zzhik[] zzhikVarArr = new zzhik[8];
                zzhikVarArr[0] = new zzhik(zzhinVar);
                zzhil zzhilVar = new zzhil(new zzhim(), new long[10]);
                zzi(zzhilVar, zzhinVar.zza);
                zzhin zzhinVar2 = new zzhin(zzhilVar);
                for (int i12 = 1; i12 < 8; i12++) {
                    zzg(zzhilVar, zzhinVar2, zzhikVarArr[i12 - 1]);
                    zzhikVarArr[i12] = new zzhik(new zzhin(zzhilVar));
                }
                byte[] bArrZzl = zzl(bArrDigest);
                byte[] bArrZzl2 = zzl(bArr5);
                zzhil zzhilVar2 = new zzhil(zzc);
                zzhin zzhinVar3 = new zzhin();
                int i13 = b;
                while (i13 >= 0 && bArrZzl[i13] == 0 && bArrZzl2[i13] == 0) {
                    i13--;
                }
                while (i13 >= 0) {
                    zzi(zzhilVar2, new zzhim(zzhilVar2));
                    byte b3 = bArrZzl[i13];
                    if (b3 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        b2 = 2;
                        zzg(zzhilVar2, zzhinVar3, zzhikVarArr[bArrZzl[i13] / 2]);
                    } else {
                        b2 = 2;
                        if (b3 < 0) {
                            zzhin.zza(zzhinVar3, zzhilVar2);
                            zzh(zzhilVar2, zzhinVar3, zzhikVarArr[(-bArrZzl[i13]) / 2]);
                        }
                    }
                    byte b4 = bArrZzl2[i13];
                    if (b4 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhiq.zze[bArrZzl2[i13] / b2]);
                    } else if (b4 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhiq.zze[(-bArrZzl2[i13]) / b2]);
                    }
                    i13--;
                }
                byte[] bArrZzb = new zzhim(zzhilVar2).zzb();
                for (int i14 = 0; i14 < 32; i14++) {
                    if (bArrZzb[i14] != bArr2[i14]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void zzd() {
        if (zzhiq.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhiv.zzd(jArr2);
        byte[] bArrZzh = zzhiv.zzh(jArr2);
        for (int i = 0; i < 32; i++) {
            if (bArrZzh[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int zzf(long[] jArr) {
        return zzhiv.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zzb);
        long[] jArr6 = zzhijVar.zza;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zza(jArr7, jArr, jArr8);
        zzhiv.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zza);
        long[] jArr6 = zzhijVar.zzb;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zzb(jArr7, jArr, jArr8);
        zzhiv.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhil zzhilVar, zzhim zzhimVar) {
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = zzhimVar2.zza;
        long[] jArr2 = zzhimVar.zza;
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr, jArr2);
        long[] jArr4 = zzhimVar2.zzc;
        long[] jArr5 = zzhimVar.zzb;
        zzhiv.zzf(jArr4, jArr5);
        long[] jArr6 = zzhilVar.zzb;
        zzhiv.zzf(jArr6, zzhimVar.zzc);
        zzhiv.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhimVar2.zzb;
        zzhiv.zza(jArr7, jArr2, jArr5);
        zzhiv.zzf(jArr3, jArr7);
        zzhiv.zza(jArr7, jArr4, jArr);
        zzhiv.zzb(jArr4, jArr4, jArr);
        zzhiv.zzb(jArr, jArr3, jArr7);
        zzhiv.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static void zzk(zzhij zzhijVar, int i, byte b) {
        zzhij[][] zzhijVarArr = zzhiq.zzd;
        int i2 = (b & 255) >> 7;
        int i3 = (-i2) & b;
        int i4 = b - (i3 + i3);
        zzhijVar.zzb(zzhijVarArr[i][0], zzj(i4, 1));
        zzhijVar.zzb(zzhijVarArr[i][1], zzj(i4, 2));
        zzhijVar.zzb(zzhijVarArr[i][2], zzj(i4, 3));
        zzhijVar.zzb(zzhijVarArr[i][3], zzj(i4, 4));
        zzhijVar.zzb(zzhijVarArr[i][4], zzj(i4, 5));
        zzhijVar.zzb(zzhijVarArr[i][5], zzj(i4, 6));
        zzhijVar.zzb(zzhijVarArr[i][6], zzj(i4, 7));
        zzhijVar.zzb(zzhijVarArr[i][7], zzj(i4, 8));
        long[] jArr = zzhijVar.zzc;
        long[] jArr2 = zzhijVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzhijVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzm(jArrCopyOf3, jArrCopyOf3);
        zzhijVar.zzb(new zzhij(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i2);
    }

    private static byte[] zzl(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        int i5 = b << i4;
                        int i6 = b2 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b2 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    private static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static long zzo(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | zzn(bArr, i);
    }
}

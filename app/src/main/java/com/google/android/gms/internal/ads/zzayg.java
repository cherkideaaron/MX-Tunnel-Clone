package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzayg {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static void zza() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzayf(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String zzb(byte[] bArr, String str) {
        zzaxw zzaxwVarZzc = zzc(bArr, str);
        return zzaya.zza(zzaxwVarZzc == null ? zzh(zzg(4096).zzaN(), str, true) : ((zzaxx) zzaxwVarZzc.zzbu()).zzaN(), true);
    }

    public static zzaxw zzc(byte[] bArr, String str) {
        Vector vectorZzd = zzd(bArr, 255);
        if (vectorZzd == null || vectorZzd.isEmpty()) {
            return null;
        }
        zzaxw zzaxwVarZza = zzaxx.zza();
        int size = vectorZzd.size();
        for (int i = 0; i < size; i++) {
            zzaxwVarZza.zza(zzian.zzs(zzh((byte[]) vectorZzd.get(i), str, false), 0, UserVerificationMethods.USER_VERIFY_HANDPRINT));
        }
        byte[] bArrZze = zze(bArr);
        zzian zzianVar = zzian.zza;
        zzaxwVarZza.zzb(zzian.zzs(bArrZze, 0, bArrZze.length));
        return zzaxwVarZza;
    }

    public static Vector zzd(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zza();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static zzaxg zzg(int i) {
        zzawg zzawgVarZzj = zzaxg.zzj();
        zzawgVarZzj.zzl(4096L);
        return (zzaxg) zzawgVarZzj.zzbu();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBufferPut;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzg(4096).zzaN();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            byteBufferPut = ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2);
        } else {
            byteBufferPut = ByteBuffer.allocate(i2).put(b).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z) {
            bArrArray = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_HANDPRINT).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        zzayh[] zzayhVarArr = new zzayu().zzcK;
        int length3 = zzayhVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzayhVarArr[i3].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzaxy(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzieo {
    public static final int zzc(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(zzice.zza);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    public final boolean zza(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }

    public abstract int zzb(int i, byte[] bArr, int i2, int i3);
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.achartengine.renderer.DefaultRenderer;

/* loaded from: classes.dex */
public final class zzati {
    public static long zza(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static int zzc(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static long zzd(ByteBuffer byteBuffer) {
        long jZza = zza(byteBuffer) << 32;
        if (jZza >= 0) {
            return zza(byteBuffer) + jZza;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double zze(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << 16;
        int i3 = bArr[2] << 8;
        return ((((i & DefaultRenderer.BACKGROUND_COLOR) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static double zzf(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << 16;
        int i3 = bArr[2] << 8;
        return ((((i & DefaultRenderer.BACKGROUND_COLOR) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255)) / 1.073741824E9d;
    }
}

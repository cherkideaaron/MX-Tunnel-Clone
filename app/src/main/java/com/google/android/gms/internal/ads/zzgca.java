package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgca {
    public static String zza(byte[] bArr, boolean z) {
        return zzc(z).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z) {
        byte[] bArrZzk = zzc(z).zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgxa zzc(boolean z) {
        return z ? zzgxa.zzm().zzh() : zzgxa.zzl();
    }
}

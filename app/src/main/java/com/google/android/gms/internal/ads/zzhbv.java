package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhbv {
    public static byte[] zza(zzhbp zzhbpVar) {
        return ((zzhlc) zzhkg.zza().zzk(zzhbpVar, zzhlc.class)).zzc().zzaN();
    }

    public static zzhbp zzb(byte[] bArr) {
        try {
            zzhqf zzhqfVarZzd = zzhqf.zzd(bArr, zzibb.zza());
            zzhkg zzhkgVarZza = zzhkg.zza();
            zzhlc zzhlcVarZzb = zzhlc.zzb(zzhqfVarZzd);
            return !zzhkgVarZza.zzi(zzhlcVarZzb) ? new zzhjp(zzhlcVarZzb) : zzhkgVarZza.zzj(zzhlcVarZzb);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhnm implements zzhbo {
    private zzhnm(zzhbo zzhboVar, zzhqy zzhqyVar, byte[] bArr) {
    }

    public static zzhbo zza(zzhjo zzhjoVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhlb zzhlbVarZzc = zzhjoVar.zzc(zzhax.zza());
        zzhbo zzhboVar = (zzhbo) zzhjc.zza().zzc(zzhlbVarZzc.zzg(), zzhbo.class).zza(zzhlbVarZzc.zzb());
        zzhqy zzhqyVarZzd = zzhlbVarZzc.zzd();
        int iOrdinal = zzhqyVarZzd.ordinal();
        if (iOrdinal == 1) {
            zzhyeVarZzb = zzhkh.zzb(zzhjoVar.zzb().intValue());
        } else if (iOrdinal == 2) {
            zzhyeVarZzb = zzhkh.zza(zzhjoVar.zzb().intValue());
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzhyeVarZzb = zzhkh.zza(zzhjoVar.zzb().intValue());
        } else {
            zzhyeVarZzb = zzhkh.zza;
        }
        return new zzhnm(zzhboVar, zzhqyVarZzd, zzhyeVarZzb.zzc());
    }
}

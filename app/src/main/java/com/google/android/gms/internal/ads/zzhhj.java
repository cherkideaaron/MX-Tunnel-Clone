package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhhj implements zzhas {
    private final zzhas zza;
    private final byte[] zzb;

    private zzhhj(zzhas zzhasVar, byte[] bArr) {
        this.zza = zzhasVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzhas zzb(zzhjo zzhjoVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        zzhlb zzhlbVarZzc = zzhjoVar.zzc(zzhax.zza());
        zzhas zzhasVar = (zzhas) zzhjc.zza().zzc(zzhlbVarZzc.zzg(), zzhas.class).zza(zzhlbVarZzc.zzb());
        zzhqy zzhqyVarZzd = zzhlbVarZzc.zzd();
        int iOrdinal = zzhqyVarZzd.ordinal();
        if (iOrdinal == 1) {
            zzhyeVarZzb = zzhkh.zzb(zzhjoVar.zzb().intValue());
        } else if (iOrdinal == 2) {
            zzhyeVarZzb = zzhkh.zza(zzhjoVar.zzb().intValue());
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhqyVarZzd)));
            }
            zzhyeVarZzb = zzhkh.zza(zzhjoVar.zzb().intValue());
        } else {
            zzhyeVarZzb = zzhkh.zza;
        }
        return new zzhhj(zzhasVar, zzhyeVarZzb.zzc());
    }

    public static zzhas zzc(zzhas zzhasVar, zzhye zzhyeVar) {
        return new zzhhj(zzhasVar, zzhyeVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhln.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}

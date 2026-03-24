package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhvq implements zzhbs {
    private final zzhbs zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhvq(zzhbs zzhbsVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzhbsVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzhbs zzb(zzhjo zzhjoVar) {
        zzhlb zzhlbVarZzc = zzhjoVar.zzc(zzhax.zza());
        return new zzhvq((zzhbs) zzhjc.zza().zzc(zzhlbVarZzc.zzg(), zzhbs.class).zza(zzhlbVarZzc.zzb()), zzc(zzhlbVarZzc), zzd(zzhlbVarZzc));
    }

    public static byte[] zzc(zzhlb zzhlbVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzb;
        int iOrdinal = zzhlbVar.zzd().ordinal();
        if (iOrdinal == 1) {
            zzhyeVarZzb = zzhkh.zzb(zzhlbVar.zze().intValue());
        } else if (iOrdinal == 2) {
            zzhyeVarZzb = zzhkh.zza(zzhlbVar.zze().intValue());
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzhyeVarZzb = zzhkh.zza(zzhlbVar.zze().intValue());
        } else {
            zzhyeVarZzb = zzhkh.zza;
        }
        return zzhyeVarZzb.zzc();
    }

    public static byte[] zzd(zzhlb zzhlbVar) {
        return zzhlbVar.zzd().equals(zzhqy.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = zzhwr.zza(bArr2, bArr4);
            }
            this.zza.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}

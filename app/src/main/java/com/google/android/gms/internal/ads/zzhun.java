package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhun {
    private zzhuk zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzhun() {
    }

    public final zzhun zza(zzhuk zzhukVar) {
        this.zza = zzhukVar;
        return this;
    }

    public final zzhun zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhun zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhuo zzd() throws GeneralSecurityException {
        zzhye zzhyeVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            throw new GeneralSecurityException(Vs.n(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length()), "Got modulus size ", iBitLength, ", but parameters requires modulus size ", iZzc));
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhuj.zzd) {
            zzhyeVarZza = zzhkh.zza;
        } else if (this.zza.zze() == zzhuj.zzc || this.zza.zze() == zzhuj.zzb) {
            zzhyeVarZza = zzhkh.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhuj.zza) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhyeVarZza = zzhkh.zzb(this.zzc.intValue());
        }
        return new zzhuo(this.zza, this.zzb, zzhyeVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhun(byte[] bArr) {
    }
}

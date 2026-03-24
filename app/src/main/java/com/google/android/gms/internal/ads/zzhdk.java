package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzhdk {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzhdl zzd = zzhdl.zzc;

    private zzhdk() {
    }

    public final zzhdk zza(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhdk zzb(int i) {
        this.zzb = 12;
        return this;
    }

    public final zzhdk zzc(int i) {
        this.zzc = 16;
        return this;
    }

    public final zzhdk zzd(zzhdl zzhdlVar) {
        this.zzd = zzhdlVar;
        return this;
    }

    public final zzhdm zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzhdm(iIntValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzhdk(byte[] bArr) {
    }
}

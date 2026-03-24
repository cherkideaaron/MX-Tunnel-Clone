package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhno extends zzhnr {
    private final int zza;

    private zzhno(int i) {
        this.zza = i;
    }

    public static zzhno zzb(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new zzhno(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhno) && ((zzhno) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhno.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i = this.zza;
        return AbstractC3219pQ.e(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}

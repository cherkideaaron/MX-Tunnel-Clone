package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhlw extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhlv zzc;

    public /* synthetic */ zzhlw(int i, int i2, zzhlv zzhlvVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhlvVar;
    }

    public static zzhlu zzb() {
        return new zzhlu(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhlw)) {
            return false;
        }
        zzhlw zzhlwVar = (zzhlw) obj;
        return zzhlwVar.zza == this.zza && zzhlwVar.zze() == zze() && zzhlwVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhlw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return AbstractC3219pQ.e(sb, "-byte tags, and ", i2, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzc != zzhlv.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhlv zzhlvVar = this.zzc;
        if (zzhlvVar == zzhlv.zzd) {
            return this.zzb;
        }
        if (zzhlvVar == zzhlv.zza || zzhlvVar == zzhlv.zzb || zzhlvVar == zzhlv.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhlv zzf() {
        return this.zzc;
    }
}

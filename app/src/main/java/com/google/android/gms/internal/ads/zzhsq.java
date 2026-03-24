package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhsq extends zzhuu {
    private final zzhsp zza;

    private zzhsq(zzhsp zzhspVar) {
        this.zza = zzhspVar;
    }

    public static zzhsq zzb(zzhsp zzhspVar) {
        return new zzhsq(zzhspVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhsq) && ((zzhsq) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhsq.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return Vs.o(new StringBuilder(string.length() + 30), "Ed25519 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhsp.zzd;
    }

    public final zzhsp zzc() {
        return this.zza;
    }
}

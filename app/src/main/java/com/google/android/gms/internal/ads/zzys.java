package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzys {
    public final long zza;
    public final long zzb;

    public zzys(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzys)) {
            return false;
        }
        zzys zzysVar = (zzys) obj;
        return this.zza == zzysVar.zza && this.zzb == zzysVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}

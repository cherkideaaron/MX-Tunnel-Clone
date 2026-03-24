package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzwk {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzwk(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwk)) {
            return false;
        }
        zzwk zzwkVar = (zzwk) obj;
        return this.zza.equals(zzwkVar.zza) && this.zzb == zzwkVar.zzb && this.zzc == zzwkVar.zzc && this.zzd == zzwkVar.zzd && this.zze == zzwkVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzwk zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzwk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    private zzwk(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public zzwk(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzwk(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzmt {
    public static final zzmt zza;
    public static final zzmt zzb;
    public static final zzmt zzc;
    public final long zzd;
    public final long zze;

    static {
        zzmt zzmtVar = new zzmt(0L, 0L);
        zza = zzmtVar;
        new zzmt(Long.MAX_VALUE, Long.MAX_VALUE);
        zzb = new zzmt(Long.MAX_VALUE, 0L);
        new zzmt(0L, Long.MAX_VALUE);
        zzc = zzmtVar;
    }

    public zzmt(long j, long j2) {
        zzgrc.zza(j >= 0);
        zzgrc.zza(j2 >= 0);
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmt.class == obj.getClass()) {
            zzmt zzmtVar = (zzmt) obj;
            if (this.zzd == zzmtVar.zzd && this.zze == zzmtVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzd) * 31) + ((int) this.zze);
    }
}

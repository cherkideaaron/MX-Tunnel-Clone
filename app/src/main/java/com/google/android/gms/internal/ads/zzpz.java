package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzpz {
    public static final zzpz zza = new zzpy().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzpz(zzpy zzpyVar, byte[] bArr) {
        this.zzb = zzpyVar.zze();
        this.zzc = zzpyVar.zzf();
        this.zzd = zzpyVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpz.class == obj.getClass()) {
            zzpz zzpzVar = (zzpz) obj;
            if (this.zzb == zzpzVar.zzb && this.zzc == zzpzVar.zzc && this.zzd == zzpzVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return (z2 ? 1 : 0) + (z2 ? 1 : 0) + ((z ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzxo {
    public final int zza;
    public final boolean zzb;

    public zzxo(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxo.class == obj.getClass()) {
            zzxo zzxoVar = (zzxo) obj;
            if (this.zza == zzxoVar.zza && this.zzb == zzxoVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}

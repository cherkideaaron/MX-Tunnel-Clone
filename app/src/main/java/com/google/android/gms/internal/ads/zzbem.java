package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbem {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbem(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbem)) {
            return false;
        }
        zzbem zzbemVar = (zzbem) obj;
        return zzbemVar.zza == this.zza && zzbemVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaif extends zzain {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzain[] zzg;

    public zzaif(String str, int i, int i2, long j, long j2, zzain[] zzainVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzainVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaif.class == obj.getClass()) {
            zzaif zzaifVar = (zzaif) obj;
            if (this.zzb == zzaifVar.zzb && this.zzc == zzaifVar.zzc && this.zzd == zzaifVar.zzd && this.zze == zzaifVar.zze && Objects.equals(this.zza, zzaifVar.zza) && Arrays.equals(this.zzg, zzaifVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + 527;
        String str = this.zza;
        long j = this.zze;
        return str.hashCode() + (((((((i * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31);
    }
}

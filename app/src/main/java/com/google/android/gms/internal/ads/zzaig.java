package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaig extends zzain {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzain[] zze;

    public zzaig(String str, boolean z, boolean z2, String[] strArr, zzain[] zzainVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzainVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaig.class == obj.getClass()) {
            zzaig zzaigVar = (zzaig) obj;
            if (this.zzb == zzaigVar.zzb && this.zzc == zzaigVar.zzc && Objects.equals(this.zza, zzaigVar.zza) && Arrays.equals(this.zzd, zzaigVar.zzd) && Arrays.equals(this.zze, zzaigVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzb ? 1 : 0) + 527;
        String str = this.zza;
        return str.hashCode() + (((i * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}

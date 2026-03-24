package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaie extends zzain {
    public final byte[] zza;

    public zzaie(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaie.class == obj.getClass()) {
            zzaie zzaieVar = (zzaie) obj;
            if (this.zzf.equals(zzaieVar.zzf) && Arrays.equals(this.zza, zzaieVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }
}

package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzait extends zzain {
    public final String zza;
    public final String zzb;

    public zzait(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzait.class == obj.getClass()) {
            zzait zzaitVar = (zzait) obj;
            if (this.zzf.equals(zzaitVar.zzf) && Objects.equals(this.zza, zzaitVar.zza) && Objects.equals(this.zzb, zzaitVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return Vs.o(new StringBuilder(str2.length() + length + 6), str, ": url=", str2);
    }
}

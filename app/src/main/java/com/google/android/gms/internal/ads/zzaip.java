package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaip extends zzain {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaip(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaip.class == obj.getClass()) {
            zzaip zzaipVar = (zzaip) obj;
            if (Objects.equals(this.zzb, zzaipVar.zzb) && Objects.equals(this.zza, zzaipVar.zza) && Objects.equals(this.zzc, zzaipVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = str2.length() + length + 9;
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(str3.length() + length2 + 14);
        AbstractC3264qG.v(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}

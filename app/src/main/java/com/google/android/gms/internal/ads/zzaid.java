package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaid extends zzain {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaid(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaid.class == obj.getClass()) {
            zzaid zzaidVar = (zzaid) obj;
            if (this.zzc == zzaidVar.zzc && Objects.equals(this.zza, zzaidVar.zza) && Objects.equals(this.zzb, zzaidVar.zzb) && Arrays.equals(this.zzd, zzaidVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        AbstractC3264qG.v(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzd, this.zzc);
    }
}

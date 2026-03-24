package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaii extends zzain {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzaii(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaii.class == obj.getClass()) {
            zzaii zzaiiVar = (zzaii) obj;
            if (Objects.equals(this.zza, zzaiiVar.zza) && Objects.equals(this.zzb, zzaiiVar.zzb) && Objects.equals(this.zzc, zzaiiVar.zzc) && Arrays.equals(this.zzd, zzaiiVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzd) + ((this.zzc.hashCode() + ((this.zzb.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length3 = str3.length() + AbstractC3264qG.d(length, 11, length2, 11);
        String str4 = this.zzc;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 14);
        AbstractC3264qG.v(sb, str, ": mimeType=", str2, ", filename=");
        return Vs.o(sb, str3, ", description=", str4);
    }
}

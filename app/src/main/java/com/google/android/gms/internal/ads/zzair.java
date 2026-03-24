package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzair extends zzain {
    public final String zza;
    public final byte[] zzb;

    public zzair(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzair.class == obj.getClass()) {
            zzair zzairVar = (zzair) obj;
            if (Objects.equals(this.zza, zzairVar.zza) && Arrays.equals(this.zzb, zzairVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return Arrays.hashCode(this.zzb) + (iHashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        return Vs.o(new StringBuilder(str2.length() + length + 8), str, ": owner=", str2);
    }
}

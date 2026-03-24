package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
final class zzgot extends zzgpv {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzgot(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgpv) {
            zzgpv zzgpvVar = (zzgpv) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzgpvVar.zza()) : zzgpvVar.zza() == null) {
                String str2 = this.zzb;
                String strZzb = zzgpvVar.zzb();
                if (str2 != null ? str2.equals(strZzb) : strZzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        AbstractC3264qG.v(sb, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgpv
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgpv
    public final String zzb() {
        return this.zzb;
    }
}

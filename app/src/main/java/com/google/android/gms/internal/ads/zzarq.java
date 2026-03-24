package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zzarq {
    private final String zza;
    private final String zzb;

    public zzarq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzarq.class == obj.getClass()) {
            zzarq zzarqVar = (zzarq) obj;
            if (TextUtils.equals(this.zza, zzarqVar.zza) && TextUtils.equals(this.zzb, zzarqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        AbstractC3264qG.v(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

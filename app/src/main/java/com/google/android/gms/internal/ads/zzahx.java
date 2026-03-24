package com.google.android.gms.internal.ads;

import defpackage.IP;

/* loaded from: classes.dex */
public final class zzahx implements zzao {
    public final long zza;

    public zzahx(long j) {
        this.zza = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzahx.class == obj.getClass() && this.zza == ((zzahx) obj).zza;
    }

    public final int hashCode() {
        long j = this.zza;
        return ((int) (j ^ (j >>> 32))) + 527;
    }

    public final String toString() {
        long j = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        IP.a(this, zzamVar);
    }
}

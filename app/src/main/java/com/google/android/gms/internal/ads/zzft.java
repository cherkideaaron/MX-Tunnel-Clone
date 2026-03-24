package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import defpackage.IP;

/* loaded from: classes.dex */
public final class zzft implements zzao {
    public final int zza;

    public zzft(int i) {
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzft) && this.zza == ((zzft) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i = this.zza;
        return AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 19), "Mp4AlternateGroup: ", i);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        IP.a(this, zzamVar);
    }
}

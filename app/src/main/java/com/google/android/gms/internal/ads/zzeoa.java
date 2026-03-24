package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzeoa {
    private zzenr zza;

    public zzeoa() {
    }

    public static zzeoa zza(zzenr zzenrVar) {
        return new zzeoa(zzenrVar);
    }

    public final zzenr zzb(Clock clock, zzent zzentVar, zzekl zzeklVar, zzfqk zzfqkVar) {
        zzenr zzenrVar = this.zza;
        return zzenrVar != null ? zzenrVar : new zzenr(clock, zzentVar, zzeklVar, zzfqkVar);
    }

    private zzeoa(zzenr zzenrVar) {
        this.zza = zzenrVar;
    }
}

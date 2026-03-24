package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.As;

/* loaded from: classes.dex */
final class zzevi {
    public final As zza;
    private final long zzb;
    private final Clock zzc;

    public zzevi(As as, long j, Clock clock) {
        this.zza = as;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}

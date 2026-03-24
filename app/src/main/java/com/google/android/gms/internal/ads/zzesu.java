package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.As;

/* loaded from: classes.dex */
public final class zzesu implements zzfax {
    private final Clock zza;
    private final zzfjk zzb;
    private final long zzc;

    public zzesu(Clock clock, zzfjk zzfjkVar, long j) {
        this.zza = clock;
        this.zzb = zzfjkVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        return zzgzo.zza(new zzesv(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 4;
    }
}

package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzhac extends zzgzj implements zzgzx {
    private final ScheduledFuture zza;

    public zzhac(As as, ScheduledFuture scheduledFuture) {
        super(as);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = zza().cancel(z);
        if (zCancel) {
            this.zza.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}

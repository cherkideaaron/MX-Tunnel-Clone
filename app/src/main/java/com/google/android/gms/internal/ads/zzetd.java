package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzetd implements zzfax {
    private final As zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzetd(As as, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = as;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        As as = this.zza;
        zzetc zzetcVar = zzetc.zza;
        Executor executor = this.zzb;
        As asZzj = zzgzo.zzj(as, zzetcVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznV)).intValue() > 0) {
            asZzj = zzgzo.zzi(asZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgzo.zzh(asZzj, Throwable.class, zzetb.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 6;
    }
}

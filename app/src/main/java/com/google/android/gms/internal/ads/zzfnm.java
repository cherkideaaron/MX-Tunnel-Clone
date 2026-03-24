package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class zzfnm {
    private static final As zza = zzgzo.zza(null);
    private final zzgzy zzb;
    private final ScheduledExecutorService zzc;
    private final zzfnn zzd;

    public zzfnm(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzfnn zzfnnVar) {
        this.zzb = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfnnVar;
    }

    public final zzfnl zza(Object obj, As as) {
        return new zzfnl(this, obj, null, as, Collections.singletonList(as), as, null);
    }

    public final zzfnd zzb(Object obj, As... asArr) {
        return new zzfnd(this, obj, Arrays.asList(asArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgzy zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfnn zzg() {
        return this.zzd;
    }
}

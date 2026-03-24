package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
final class zzfss extends TimerTask {
    final /* synthetic */ zzfsu zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfsv zzc;

    public zzfss(zzfsv zzfsvVar, zzfsu zzfsuVar, Timer timer) {
        this.zza = zzfsuVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfsvVar);
        this.zzc = zzfsvVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}

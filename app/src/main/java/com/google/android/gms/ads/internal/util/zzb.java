package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcei;
import defpackage.As;

/* loaded from: classes.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public As zzb() {
        return zzcei.zza.zza(this.zza);
    }

    public final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}

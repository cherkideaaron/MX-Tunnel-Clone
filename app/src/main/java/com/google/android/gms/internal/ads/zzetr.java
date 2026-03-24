package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzetr {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzetq zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzetq zzetqVar) {
        this.zzb = zzetqVar;
    }

    public final zzetq zzd() {
        return this.zzb;
    }
}

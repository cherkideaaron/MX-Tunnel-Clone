package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zzftc implements Runnable {
    final /* synthetic */ zzftd zza;

    public zzftc(zzftd zzftdVar) {
        Objects.requireNonNull(zzftdVar);
        this.zza = zzftdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzftd zzftdVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzftdVar.zzf();
        float fZzc = zzftdVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzftdVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzftdVar.zzd().post(new zzftb(this, fZzc));
        }
    }
}

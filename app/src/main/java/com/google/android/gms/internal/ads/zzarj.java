package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzarj implements Runnable {
    final /* synthetic */ zzary zza;
    final /* synthetic */ zzark zzb;

    public zzarj(zzark zzarkVar, zzary zzaryVar) {
        this.zza = zzaryVar;
        Objects.requireNonNull(zzarkVar);
        this.zzb = zzarkVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

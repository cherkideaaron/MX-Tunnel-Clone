package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzarw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzary zzc;

    public zzarw(zzary zzaryVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzaryVar);
        this.zzc = zzaryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzary zzaryVar = this.zzc;
        zzaryVar.zzx().zza(this.zza, this.zzb);
        zzaryVar.zzx().zzb(zzaryVar.toString());
    }
}

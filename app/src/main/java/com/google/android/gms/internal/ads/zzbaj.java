package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbaj implements Runnable {
    final /* synthetic */ zzbak zza;

    public zzbaj(zzbak zzbakVar) {
        Objects.requireNonNull(zzbakVar);
        this.zza = zzbakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbhe.zza(this.zza.zza);
    }
}

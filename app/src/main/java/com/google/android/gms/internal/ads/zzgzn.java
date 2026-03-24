package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzgzn {
    private final boolean zza;
    private final zzguf zzb;

    public /* synthetic */ zzgzn(boolean z, zzguf zzgufVar, byte[] bArr) {
        this.zza = z;
        this.zzb = zzgufVar;
    }

    public final As zza(Callable callable, Executor executor) {
        return new zzgzc(this.zzb, this.zza, executor, callable);
    }
}

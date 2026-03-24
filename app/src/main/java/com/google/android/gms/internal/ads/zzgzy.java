package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface zzgzy extends ExecutorService {
    /* bridge */ /* synthetic */ Future submit(Runnable runnable);

    /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj);

    /* bridge */ /* synthetic */ Future submit(Callable callable);

    As zza(Runnable runnable);

    As zzb(Runnable runnable, Object obj);

    As zzc(Callable callable);
}

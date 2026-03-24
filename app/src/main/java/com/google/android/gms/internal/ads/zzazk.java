package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.As;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzazk {
    private final As zza;

    public zzazk(final Context context, Executor executor) {
        this.zza = zzgzo.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzazj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfvo.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final As zza() {
        return this.zza;
    }
}

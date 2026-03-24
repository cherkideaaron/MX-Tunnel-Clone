package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final /* synthetic */ class zzecv implements zzgyw {
    static final /* synthetic */ zzecv zza = new zzecv();

    private /* synthetic */ zzecv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ As zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzgzo.zzc(cause);
    }
}

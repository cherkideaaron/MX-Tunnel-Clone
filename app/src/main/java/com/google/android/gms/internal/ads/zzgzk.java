package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class zzgzk extends zzgzi implements As {
    @Override // defpackage.As
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    public abstract As zzc();
}

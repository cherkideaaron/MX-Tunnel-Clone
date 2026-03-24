package com.google.android.gms.internal.ads;

import defpackage.As;

/* loaded from: classes.dex */
final class zzgye extends zzgyg {
    public zzgye(As as, Class cls, zzgyw zzgywVar) {
        super(as, cls, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* synthetic */ void zze(Object obj) {
        zzk((As) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) {
        zzgyw zzgywVar = (zzgyw) obj;
        As asZza = zzgywVar.zza(th);
        zzgrc.zzl(asZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return asZza;
    }
}

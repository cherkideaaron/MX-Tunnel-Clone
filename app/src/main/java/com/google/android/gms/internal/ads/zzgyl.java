package com.google.android.gms.internal.ads;

import defpackage.As;

/* loaded from: classes.dex */
final class zzgyl extends zzgyn {
    public zzgyl(As as, zzgyw zzgywVar) {
        super(as, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* synthetic */ void zze(Object obj) {
        zzk((As) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) {
        zzgyw zzgywVar = (zzgyw) obj;
        As asZza = zzgywVar.zza(obj2);
        zzgrc.zzl(asZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return asZza;
    }
}

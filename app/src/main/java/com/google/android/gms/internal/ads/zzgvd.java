package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgvd extends zzgws {
    final /* synthetic */ zzgve zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvd(zzgve zzgveVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgveVar);
        this.zza = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}

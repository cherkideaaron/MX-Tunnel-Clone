package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgvb extends zzgws {
    final /* synthetic */ zzgvc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvb(zzgvc zzgvcVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgvcVar);
        this.zza = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}

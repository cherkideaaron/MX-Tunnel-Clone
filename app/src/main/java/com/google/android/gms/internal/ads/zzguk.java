package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzguk extends zzgwt {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgun zzc;

    public zzguk(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzc = zzgunVar;
        this.zza = ((zzguf) zzgunVar.map.values()).listIterator(0);
        this.zzb = zzguv.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgub) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}

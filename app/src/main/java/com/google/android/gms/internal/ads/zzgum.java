package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgum extends zzgub {
    private final transient zzgun zza;

    public zzgum(zzgun zzgunVar) {
        this.zza = zzgunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzguk(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    /* renamed from: zza */
    public final zzgwt iterator() {
        return new zzguk(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzg(Object[] objArr, int i) {
        zzgwu zzgwuVarListIterator = ((zzguf) this.zza.map.values()).listIterator(0);
        while (zzgwuVarListIterator.hasNext()) {
            i = ((zzgub) zzgwuVarListIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}

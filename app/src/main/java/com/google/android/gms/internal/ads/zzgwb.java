package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgwb extends zzguf {
    final /* synthetic */ zzgwc zza;

    public zzgwb(zzgwc zzgwcVar) {
        Objects.requireNonNull(zzgwcVar);
        this.zza = zzgwcVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzgwc zzgwcVar = this.zza;
        zzgrc.zzm(i, zzgwcVar.zzw(), "index");
        int i2 = i + i;
        Object obj = zzgwcVar.zzv()[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzgwcVar.zzv()[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }
}

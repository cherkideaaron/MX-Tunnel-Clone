package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* loaded from: classes.dex */
public final class zzicb extends AbstractList {
    private final zzibz zza;
    private final zzica zzb;

    public zzicb(zzibz zzibzVar, zzica zzicaVar) {
        this.zza = zzibzVar;
        this.zzb = zzicaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzf(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzgtq extends zzgts {
    public zzgtq() {
        super(null);
    }

    public static final zzgts zzf(int i) {
        return i < 0 ? zzgts.zzb : i > 0 ? zzgts.zzc : zzgts.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final int zze() {
        return 0;
    }
}

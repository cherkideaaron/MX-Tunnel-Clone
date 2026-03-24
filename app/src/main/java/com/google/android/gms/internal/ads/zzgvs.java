package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzgvs extends zzgvr {
    final /* synthetic */ zzgvt zza;

    public zzgvs(zzgvt zzgvtVar, int i) {
        Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public final zzgva zza() {
        return new zzgvv(this.zza.zza(), new zzgvq(2));
    }
}

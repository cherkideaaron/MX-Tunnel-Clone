package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzxe extends zzafj {
    final /* synthetic */ zzxq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxe(zzxq zzxqVar, zzafy zzafyVar) {
        super(zzafyVar);
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj, com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zzQ();
    }
}

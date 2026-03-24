package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzgtf extends zzgti {
    final /* synthetic */ zzgtm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtf(zzgtm zzgtmVar) {
        super(zzgtmVar, null);
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzgtk(this.zza, i);
    }
}

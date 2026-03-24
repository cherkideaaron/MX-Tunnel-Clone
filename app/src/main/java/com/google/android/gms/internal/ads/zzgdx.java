package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgdx implements zzgyw {
    final /* synthetic */ zzgec zza;

    public zzgdx(zzgec zzgecVar) {
        Objects.requireNonNull(zzgecVar);
        this.zza = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ As zza(Object obj) {
        zzgdv zzgdvVar = (zzgdv) obj;
        if (zzgdvVar != null) {
            return zzgzo.zza(zzgdvVar);
        }
        zzgec zzgecVar = this.zza;
        zzgecVar.zza().zzb(51);
        return zzgecVar.zzd(2);
    }
}

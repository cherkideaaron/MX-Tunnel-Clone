package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class zzfgc implements zzgqt {
    final /* synthetic */ zzfgf zza;

    public zzfgc(zzfgf zzfgfVar) {
        Objects.requireNonNull(zzfgfVar);
        this.zza = zzfgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbzu zzbzuVar = (zzbzu) obj;
        zzfgd zzfgdVar = new zzfgd(zzbzuVar, new zzfll(zzbzuVar.zzj), null);
        zzfgf zzfgfVar = this.zza;
        zzfgfVar.zzd(zzfgdVar);
        return zzfgfVar.zzc();
    }
}

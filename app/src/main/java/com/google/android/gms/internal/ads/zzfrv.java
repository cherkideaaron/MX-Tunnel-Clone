package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzfrv implements Runnable {
    final /* synthetic */ zzfsa zza;

    public zzfrv(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsa zzfsaVar = this.zza;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzfrfVarZzI = zzfsaVar.zzI();
            Clock clockZzJ = zzfsaVar.zzJ();
            zzfrfVarZzI.zzj(clockZzJ.currentTimeMillis(), zzfsaVar.zzK(), zzfsaVar.zze.zzd, zzfsaVar.zzH());
        }
    }
}

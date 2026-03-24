package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import defpackage.As;

/* loaded from: classes.dex */
public final class zzevg implements zzfax {
    private final zzffr zza;

    public zzevg(zzffr zzffrVar) {
        this.zza = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        zzffr zzffrVar = this.zza;
        if (zzffrVar == null) {
            return zzgzo.zza(new zzevf(null));
        }
        String strZza = zzffrVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgzo.zza(new zzevf(null)) : zzgzo.zza(new zzevf(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 15;
    }
}

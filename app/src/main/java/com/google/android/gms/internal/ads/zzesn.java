package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.AbstractC0115Ga;
import defpackage.As;

/* loaded from: classes.dex */
public final class zzesn implements zzfax {
    private final Context zza;

    public zzesn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        return zzgzo.zza(new zzeso(AbstractC0115Ga.l(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 2;
    }
}

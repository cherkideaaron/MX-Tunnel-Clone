package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzikr {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzikr(int i, int i2, zzikq zzikqVar) {
        this.zza = zzikd.zza(i);
        this.zzb = zzikd.zza(i2);
    }

    public final zzikr zza(zzikp zzikpVar) {
        this.zza.add(zzikpVar);
        return this;
    }

    public final zzikr zzb(zzikp zzikpVar) {
        this.zzb.add(zzikpVar);
        return this;
    }

    public final zziks zzc() {
        return new zziks(this.zza, this.zzb, null);
    }
}

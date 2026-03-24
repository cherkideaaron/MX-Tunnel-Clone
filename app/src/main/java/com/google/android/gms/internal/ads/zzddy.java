package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzddy extends zzdhd {
    private boolean zzb;

    public zzddy(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzddx.zza);
        this.zzb = true;
    }
}

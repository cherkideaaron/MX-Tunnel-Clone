package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdoe {
    private zzbkp zza;

    public zzdoe(zzdnp zzdnpVar) {
        this.zza = zzdnpVar;
    }

    public final synchronized zzbkp zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbkp zzbkpVar) {
        this.zza = zzbkpVar;
    }
}

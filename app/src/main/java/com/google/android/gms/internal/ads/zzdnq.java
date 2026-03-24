package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdnq implements zzikg {
    private final zzikp zza;

    private zzdnq(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdnq zzc(zzikp zzikpVar) {
        return new zzdnq(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdnp zzb() {
        return new zzdnp(((zzdoz) this.zza).zza());
    }
}

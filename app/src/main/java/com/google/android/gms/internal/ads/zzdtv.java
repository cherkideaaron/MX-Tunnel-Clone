package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdtv implements zzikg {
    private final zzikp zza;

    private zzdtv(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdtv zzc(zzikp zzikpVar) {
        return new zzdtv(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdtu zzb() {
        return new zzdtu(((zzdoz) this.zza).zza());
    }
}

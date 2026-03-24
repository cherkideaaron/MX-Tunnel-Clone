package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdnh implements zzikg {
    private final zzikp zza;

    private zzdnh(zzdnd zzdndVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdnh zzc(zzdnd zzdndVar, zzikp zzikpVar) {
        return new zzdnh(zzdndVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdop zzb() {
        zzdnb zzdnbVar = (zzdnb) this.zza.zzb();
        zziko.zzb(zzdnbVar);
        return zzdnbVar;
    }
}

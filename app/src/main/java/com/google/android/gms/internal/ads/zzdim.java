package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdim implements zzikg {
    private final zzikp zza;

    private zzdim(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdim zzc(zzikp zzikpVar) {
        return new zzdim(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdil zzb() {
        return new zzdil(((zziks) this.zza).zzb());
    }
}

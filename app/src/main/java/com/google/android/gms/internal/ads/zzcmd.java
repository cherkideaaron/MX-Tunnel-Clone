package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcmd implements zzikg {
    private final zzikp zza;

    private zzcmd(zzcmc zzcmcVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcmd zzc(zzcmc zzcmcVar, zzikp zzikpVar) {
        return new zzcmd(zzcmcVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.zzg zzb() {
        return ((zzcdu) this.zza.zzb()).zzo();
    }
}

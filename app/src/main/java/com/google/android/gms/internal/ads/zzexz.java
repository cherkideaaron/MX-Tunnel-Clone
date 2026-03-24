package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzexz implements zzikg {
    private final zzikp zza;

    private zzexz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzexz zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzexz(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexx zzb() {
        return new zzexx(zzfmk.zzc(), ((zzcmj) this.zza).zza());
    }
}

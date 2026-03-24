package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzety implements zzikg {
    private final zzikp zza;

    private zzety(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzety zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzety(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzetw zzb() {
        return new zzetw(zzfmk.zzc(), ((zzcmj) this.zza).zza());
    }
}

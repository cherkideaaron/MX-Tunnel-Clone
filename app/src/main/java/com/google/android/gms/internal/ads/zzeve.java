package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzeve implements zzikg {
    private final zzikp zza;

    private zzeve(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzeve zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeve(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevc zzb() {
        return new zzevc(zzfmk.zzc(), ((zzcmj) this.zza).zza());
    }
}

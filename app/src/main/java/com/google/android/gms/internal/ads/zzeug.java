package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzeug implements zzikg {
    private final zzikp zza;

    private zzeug(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzeug zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeug(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeue zzb() {
        return new zzeue(zzfmk.zzc(), (zzcdu) this.zza.zzb());
    }
}

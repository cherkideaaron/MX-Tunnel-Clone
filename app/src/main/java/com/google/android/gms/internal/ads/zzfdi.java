package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfdi implements zzikg {
    private final zzfdc zza;

    private zzfdi(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdi zzc(zzfdc zzfdcVar) {
        return new zzfdi(zzfdcVar);
    }

    public static int zzd(zzfdc zzfdcVar) {
        return zzfdcVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }
}

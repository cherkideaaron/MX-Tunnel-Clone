package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfre implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfre(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzfre zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfre(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfrd((zzfrj) this.zza.zzb(), (zzfqw) this.zzb.zzb());
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbms {
    private final com.google.android.gms.ads.formats.zze zza;
    private final com.google.android.gms.ads.formats.zzd zzb;
    private zzbln zzc;

    public zzbms(com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbln zze(zzblm zzblmVar) {
        zzbln zzblnVar = this.zzc;
        if (zzblnVar != null) {
            return zzblnVar;
        }
        zzbln zzblnVar2 = new zzbln(zzblmVar);
        this.zzc = zzblnVar2;
        return zzblnVar2;
    }

    public final zzblz zza() {
        return new zzbmr(this, null);
    }

    public final zzblw zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbmq(this, null);
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    public final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}

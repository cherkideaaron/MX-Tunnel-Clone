package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzepu implements zzekg {
    private final zzbhz zza;
    private final zzgzy zzb;
    private final zzfnu zzc;
    private final zzeqd zzd;

    public zzepu(zzfnu zzfnuVar, zzgzy zzgzyVar, zzbhz zzbhzVar, zzeqd zzeqdVar) {
        this.zzc = zzfnuVar;
        this.zzb = zzgzyVar;
        this.zza = zzbhzVar;
        this.zzd = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar;
        return (this.zza == null || (zzfiwVar = zzfirVar.zzs) == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final As zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzcen zzcenVar = new zzcen();
        zzepz zzepzVar = new zzepz();
        zzepzVar.zzd(new zzeps(this, zzcenVar, zzfjcVar, zzfirVar, zzepzVar));
        zzfiw zzfiwVar = zzfirVar.zzs;
        final zzbhu zzbhuVar = new zzbhu(zzepzVar, zzfiwVar.zzb, zzfiwVar.zza);
        zzfno zzfnoVar = zzfno.CUSTOM_RENDER_SYN;
        zzfnu zzfnuVar = this.zzc;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzd(new zzfna() { // from class: com.google.android.gms.internal.ads.zzept
            @Override // com.google.android.gms.internal.ads.zzfna
            public final /* synthetic */ void zza() {
                this.zza.zzc(zzbhuVar);
            }
        }, this.zzb, zzfnoVar, zzfnuVar).zzj(zzfno.CUSTOM_RENDER_ACK).zze(zzcenVar).zzi();
    }

    public final /* synthetic */ void zzc(zzbhu zzbhuVar) {
        this.zza.zze(zzbhuVar);
    }

    public final /* synthetic */ zzeqd zzd() {
        return this.zzd;
    }
}

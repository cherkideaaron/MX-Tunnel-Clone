package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.As;
import defpackage.Vs;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzekr implements zzekg {
    private final zzctl zza;
    private final zzduv zzb;
    private final zzfjk zzc;
    private final Executor zzd;
    private final VersionInfoParcel zze;
    private final zzbok zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzh;
    private final zzdxt zzi;
    private final zzdxz zzj;

    public zzekr(zzctl zzctlVar, Context context, Executor executor, zzduv zzduvVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = zzctlVar;
        this.zzd = executor;
        this.zzb = zzduvVar;
        this.zzc = zzfjkVar;
        this.zze = versionInfoParcel;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxtVar;
        this.zzj = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final As zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        final zzduz zzduzVar = new zzduz();
        As asZza = zzgzo.zza(null);
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc(zzfirVar, zzfjcVar, zzduzVar, obj);
            }
        };
        Executor executor = this.zzd;
        As asZzj = zzgzo.zzj(asZza, zzgywVar, executor);
        asZzj.addListener(new Runnable(zzduzVar) { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return asZzj;
    }

    public final /* synthetic */ As zzc(final zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) throws zzcka {
        final zzekr zzekrVar;
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            Vs.s(this.zzi.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzduv zzduvVar = this.zzb;
        zzfjk zzfjkVar = this.zzc;
        final zzcjl zzcjlVarZza = zzduvVar.zza(zzfjkVar.zzf, zzfirVar, zzfjcVar.zzb.zzb);
        zzcjlVarZza.zzaw(zzfirVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            Vs.s(this.zzi.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcen zzcenVar = new zzcen();
        zzctl zzctlVar = this.zza;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        VersionInfoParcel versionInfoParcel = this.zze;
        boolean z = this.zzg;
        zzbok zzbokVar = this.zzf;
        final zzcti zzctiVarZzf = zzctlVar.zzf(zzcwvVar, new zzdkr(new zzekt(versionInfoParcel, zzcenVar, zzfirVar, zzcjlVarZza, zzfjkVar, z, zzbokVar, this.zzh, this.zzj), zzcjlVarZza), new zzctj(zzfirVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            zzekrVar = this;
            Vs.s(zzekrVar.zzi.zze(), zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzekrVar = this;
        }
        zzduu zzduuVarZzi = zzctiVarZzf.zzi();
        zzbok zzbokVar2 = true != z ? null : zzbokVar;
        zzdxt zzdxtVar = zzekrVar.zzi;
        zzduuVarZzi.zzi(zzcjlVarZza, false, zzbokVar2, zzdxtVar.zze());
        zzcenVar.zzc(zzctiVarZzf);
        zzctiVarZzf.zzd().zzq(new zzdbz() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjlVarZza;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        }, zzcei.zzg);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String strZza = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzctiVarZzf.zzk().zza(true)) {
            strZza = zzclc.zza(strZza, zzclc.zzb(zzfirVar));
        }
        zzctiVarZzf.zzi();
        return zzgzo.zzk(zzduu.zzj(zzcjlVarZza, zzfiwVar.zzb, strZza, zzdxtVar.zze(), zzctlVar.zzd()), new zzgqt(zzekrVar) { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                zzcjl zzcjlVar = zzcjlVarZza;
                if (zzfirVar.zzM) {
                    zzcjlVar.zzav();
                }
                zzcti zzctiVar = zzctiVarZzf;
                zzcjlVar.zzJ();
                zzcjlVar.onPause();
                return zzctiVar.zzh();
            }
        }, zzekrVar.zzd);
    }
}

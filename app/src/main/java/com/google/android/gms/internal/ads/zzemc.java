package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.As;
import defpackage.Vs;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzemc implements zzekg {
    private final Context zza;
    private final zzduv zzb;
    private final zzdlu zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbok zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzi;
    private final zzdxt zzj;
    private final zzdxz zzk;

    public zzemc(Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, zzdlu zzdluVar, zzduv zzduvVar, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzd = zzfjkVar;
        this.zzc = zzdluVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzduvVar;
        this.zzg = zzbokVar;
        this.zzi = zzejfVar;
        this.zzj = zzdxtVar;
        this.zzk = zzdxzVar;
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
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc(zzfirVar, zzfjcVar, zzduzVar, obj);
            }
        };
        Executor executor = this.zze;
        As asZzj = zzgzo.zzj(asZza, zzgywVar, executor);
        asZzj.addListener(new Runnable(zzduzVar) { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return asZzj;
    }

    public final /* synthetic */ As zzc(final zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) throws zzcka {
        final zzemc zzemcVar;
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            Vs.s(this.zzj.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzduv zzduvVar = this.zzb;
        zzfjk zzfjkVar = this.zzd;
        final zzcjl zzcjlVarZza = zzduvVar.zza(zzfjkVar.zzf, zzfirVar, zzfjcVar.zzb.zzb);
        zzcjlVarZza.zzaw(zzfirVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            Vs.s(this.zzj.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcen zzcenVar = new zzcen();
        zzdlu zzdluVar = this.zzc;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z = this.zzh;
        zzbok zzbokVar = this.zzg;
        final zzdko zzdkoVarZzd = zzdluVar.zzd(zzcwvVar, new zzdkr(new zzema(context, versionInfoParcel, zzcenVar, zzfirVar, zzcjlVarZza, zzfjkVar, z, zzbokVar, this.zzi, this.zzk), zzcjlVarZza));
        zzcenVar.zzc(zzdkoVarZzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            zzemcVar = this;
            Vs.s(zzemcVar.zzj.zze(), zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzemcVar = this;
        }
        zzdkoVarZzd.zzd().zzq(new zzdbz() { // from class: com.google.android.gms.internal.ads.zzelx
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzdkoVarZzd.zzl().zza(true)) {
            strZza = zzclc.zza(strZza, zzclc.zzb(zzfirVar));
        }
        zzduu zzduuVarZzk = zzdkoVarZzd.zzk();
        zzbok zzbokVar2 = true != z ? null : zzbokVar;
        zzdxt zzdxtVar = zzemcVar.zzj;
        zzduuVarZzk.zzi(zzcjlVarZza, true, zzbokVar2, zzdxtVar.zze());
        zzdkoVarZzd.zzk();
        return zzgzo.zzk(zzduu.zzj(zzcjlVarZza, zzfiwVar.zzb, strZza, zzdxtVar.zze(), zzdluVar.zzc()), new zzgqt(zzemcVar) { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                zzcjl zzcjlVar = zzcjlVarZza;
                if (zzfirVar.zzM) {
                    zzcjlVar.zzav();
                }
                zzdko zzdkoVar = zzdkoVarZzd;
                zzcjlVar.zzJ();
                zzcjlVar.onPause();
                return zzdkoVar.zzh();
            }
        }, zzemcVar.zze);
    }
}

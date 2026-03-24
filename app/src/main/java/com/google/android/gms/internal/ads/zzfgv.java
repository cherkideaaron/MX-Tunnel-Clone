package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import defpackage.AbstractC3598wQ;
import defpackage.As;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzfgv implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzerp zzd;
    private final zzfhv zze;
    private zzbhz zzf;
    private final zzfor zzg;
    private final zzfjj zzh;
    private As zzi;

    public zzfgv(Context context, Executor executor, zzcma zzcmaVar, zzerp zzerpVar, zzfhv zzfhvVar, zzfjj zzfjjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zzd = zzerpVar;
        this.zzh = zzfjjVar;
        this.zze = zzfhvVar;
        this.zzg = zzcmaVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) throws JSONException {
        zzdlu zzdluVarZza;
        zzfoo zzfooVar;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfgo) zzesdVar).zza;
        Bundle bundleZza = zzdxj.zza(new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdxh.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfjj zzfjjVar = this.zzh;
        zzfjjVar.zzg(str);
        zzfjjVar.zzc(zzrVar);
        zzfjjVar.zza(zzmVar);
        zzfjjVar.zzv(bundleZza);
        Context context = this.zza;
        zzfjk zzfjkVarZzA = zzfjjVar.zzA();
        zzfoe zzfoeVarB = AbstractC3598wQ.b(context, zzfon.zzg(zzfjkVarZzA), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjy)).booleanValue()) {
            zzdlt zzdltVarZzm = this.zzc.zzm();
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(context);
            zzdanVar.zzb(zzfjkVarZzA);
            zzdltVarZzm.zze(zzdanVar.zze());
            zzdhe zzdheVar = new zzdhe();
            zzerp zzerpVar = this.zzd;
            Executor executor = this.zzb;
            zzdheVar.zzm(zzerpVar, executor);
            zzdheVar.zze(zzerpVar, executor);
            zzdltVarZzm.zzf(zzdheVar.zzn());
            zzdltVarZzm.zzd(new zzepw(this.zzf));
            zzdluVarZza = zzdltVarZzm.zza();
        } else {
            zzdhe zzdheVar2 = new zzdhe();
            zzfhv zzfhvVar = this.zze;
            if (zzfhvVar != null) {
                Executor executor2 = this.zzb;
                zzdheVar2.zza(zzfhvVar, executor2);
                zzdheVar2.zzb(zzfhvVar, executor2);
                zzdheVar2.zzc(zzfhvVar, executor2);
            }
            zzdlt zzdltVarZzm2 = this.zzc.zzm();
            zzdan zzdanVar2 = new zzdan();
            zzdanVar2.zza(context);
            zzdanVar2.zzb(zzfjkVarZzA);
            zzdltVarZzm2.zze(zzdanVar2.zze());
            zzerp zzerpVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdheVar2.zzm(zzerpVar2, executor3);
            zzdheVar2.zza(zzerpVar2, executor3);
            zzdheVar2.zzb(zzerpVar2, executor3);
            zzdheVar2.zzc(zzerpVar2, executor3);
            zzdheVar2.zzf(zzerpVar2, executor3);
            zzdheVar2.zzg(zzerpVar2, executor3);
            zzdheVar2.zze(zzerpVar2, executor3);
            zzdheVar2.zzk(zzerpVar2, executor3);
            zzdheVar2.zzd(zzerpVar2, executor3);
            zzdltVarZzm2.zzf(zzdheVar2.zzn());
            zzdltVarZzm2.zzd(new zzepw(this.zzf));
            zzdluVarZza = zzdltVarZzm2.zza();
        }
        zzdlu zzdluVar = zzdluVarZza;
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfoo zzfooVarZzc = zzdluVar.zzc();
            zzfooVarZzc.zzi(4);
            zzfooVarZzc.zzc(zzmVar.zzp);
            zzfooVarZzc.zzd(zzmVar.zzm);
            zzfooVar = zzfooVarZzc;
        } else {
            zzfooVar = null;
        }
        zzcxj zzcxjVarZzb = zzdluVar.zzb();
        As asZzc = zzcxjVarZzb.zzc(zzcxjVarZzb.zzb());
        this.zzi = asZzc;
        zzgzo.zzr(asZzc, new zzfgt(this, zzeseVar, zzfooVar, zzfoeVarB, zzdluVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        As as = this.zzi;
        return (as == null || as.isDone()) ? false : true;
    }

    public final void zzc(zzbhz zzbhzVar) {
        this.zzf = zzbhzVar;
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzerp zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfhv zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzfor zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(As as) {
        this.zzi = null;
    }
}

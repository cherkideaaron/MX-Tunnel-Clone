package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.AbstractC3598wQ;
import defpackage.As;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzfff implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzerp zzd;
    private final zzert zze;
    private final ViewGroup zzf;
    private zzbhz zzg;
    private final zzdeg zzh;
    private final zzfor zzi;
    private final zzdgl zzj;
    private final zzfjj zzk;
    private As zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzese zzo;

    public zzfff(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcma zzcmaVar, zzerp zzerpVar, zzert zzertVar, zzfjj zzfjjVar, zzdgl zzdglVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zzd = zzerpVar;
        this.zze = zzertVar;
        this.zzk = zzfjjVar;
        this.zzh = zzcmaVar.zzd();
        this.zzi = zzcmaVar.zzx();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdglVar;
        zzfjjVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjw)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzeVar);
                }
            });
        }
        zzese zzeseVar = this.zzo;
        if (zzeseVar != null) {
            zzeseVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) throws JSONException {
        zzcvb zzcvbVarZzi;
        zzctu zzctuVar;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzbb.zzc();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzw().zzc(true);
            }
            Bundle bundleZza = zzdxj.zza(new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdxh.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzfjj zzfjjVar = this.zzk;
            zzfjjVar.zzg(str);
            zzfjjVar.zza(zzmVar);
            zzfjjVar.zzv(bundleZza);
            Context context = this.zza;
            zzfjk zzfjkVarZzA = zzfjjVar.zzA();
            zzfoe zzfoeVarB = AbstractC3598wQ.b(context, zzfon.zzg(zzfjkVarZzA), 3, zzmVar);
            zzfoo zzfooVarZze = null;
            if (!((Boolean) zzbjk.zze.zze()).booleanValue() || !zzfjjVar.zzf().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjw)).booleanValue()) {
                    zzcvbVarZzi = this.zzc.zzi();
                    zzdan zzdanVar = new zzdan();
                    zzdanVar.zza(context);
                    zzdanVar.zzb(zzfjkVarZzA);
                    zzcvbVarZzi.zzl(zzdanVar.zze());
                    zzdhe zzdheVar = new zzdhe();
                    zzerp zzerpVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdheVar.zzm(zzerpVar, executor);
                    zzdheVar.zze(zzerpVar, executor);
                    zzcvbVarZzi.zzm(zzdheVar.zzn());
                    zzcvbVarZzi.zzk(new zzepw(this.zzg));
                    zzcvbVarZzi.zzd(new zzdml(zzdor.zza, null));
                    zzcvbVarZzi.zzg(new zzcvx(this.zzh, this.zzj));
                    zzctuVar = new zzctu(this.zzf);
                } else {
                    zzcvbVarZzi = this.zzc.zzi();
                    zzdan zzdanVar2 = new zzdan();
                    zzdanVar2.zza(context);
                    zzdanVar2.zzb(zzfjkVarZzA);
                    zzcvbVarZzi.zzl(zzdanVar2.zze());
                    zzdhe zzdheVar2 = new zzdhe();
                    zzerp zzerpVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdheVar2.zzm(zzerpVar2, executor2);
                    zzdheVar2.zzf(zzerpVar2, executor2);
                    zzdheVar2.zzf(this.zze, executor2);
                    zzdheVar2.zzg(zzerpVar2, executor2);
                    zzdheVar2.zzh(zzerpVar2, executor2);
                    zzdheVar2.zza(zzerpVar2, executor2);
                    zzdheVar2.zzb(zzerpVar2, executor2);
                    zzdheVar2.zzc(zzerpVar2, executor2);
                    zzdheVar2.zze(zzerpVar2, executor2);
                    zzdheVar2.zzk(zzerpVar2, executor2);
                    zzcvbVarZzi.zzm(zzdheVar2.zzn());
                    zzcvbVarZzi.zzk(new zzepw(this.zzg));
                    zzcvbVarZzi.zzd(new zzdml(zzdor.zza, null));
                    zzcvbVarZzi.zzg(new zzcvx(this.zzh, this.zzj));
                    zzctuVar = new zzctu(this.zzf);
                }
                zzcvbVarZzi.zze(zzctuVar);
                zzcvc zzcvcVarZza = zzcvbVarZzi.zzh();
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfooVarZze = zzcvcVarZza.zze();
                    zzfooVarZze.zzi(3);
                    zzfooVarZze.zzc(zzmVar.zzp);
                    zzfooVarZze.zzd(zzmVar.zzm);
                }
                this.zzo = zzeseVar;
                zzcxj zzcxjVarZzc = zzcvcVarZza.zzc();
                As asZzc = zzcxjVarZzc.zzc(zzcxjVarZzc.zzb());
                this.zzl = asZzc;
                zzgzo.zzr(asZzc, new zzffb(this, zzfooVarZze, zzfoeVarB, zzcvcVarZza), this.zzb);
                return true;
            }
            zzerp zzerpVar3 = this.zzd;
            if (zzerpVar3 != null) {
                zzerpVar3.zzdI(zzfkm.zzd(7, null, null));
            }
        } else if (!this.zzk.zzB()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        As as = this.zzl;
        return (as == null || as.isDone()) ? false : true;
    }

    public final void zzc() {
        zzdeg zzdegVar;
        synchronized (this) {
            try {
                As as = this.zzl;
                if (as != null && as.isDone()) {
                    try {
                        zzctx zzctxVar = (zzctx) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzctxVar.zza();
                        ViewParent parent = zzctxVar.zza().getParent();
                        if (parent instanceof ViewGroup) {
                            String strZze = zzctxVar.zzn() != null ? zzctxVar.zzn().zze() : "";
                            StringBuilder sb = new StringBuilder(String.valueOf(strZze).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(strZze);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String string = sb.toString();
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                            ((ViewGroup) parent).removeView(zzctxVar.zza());
                        }
                        zzbgv zzbgvVar = zzbhe.zzjw;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                            zzdev zzdevVarZzq = zzctxVar.zzq();
                            zzdevVarZzq.zza(this.zzd);
                            zzdevVarZzq.zzb(this.zze);
                        }
                        viewGroup.addView(zzctxVar.zza());
                        zzese zzeseVar = this.zzo;
                        if (zzeseVar != null) {
                            zzeseVar.zzb(zzctxVar);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzerp zzerpVar = this.zzd;
                            Objects.requireNonNull(zzerpVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffe
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzerpVar.zzg();
                                }
                            });
                        }
                        if (zzctxVar.zzh() >= 0) {
                            this.zzm = false;
                            zzdeg zzdegVar2 = this.zzh;
                            zzdegVar2.zzd(zzctxVar.zzh());
                            zzdegVar2.zze(zzctxVar.zzg());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzctxVar.zzg());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        zzdegVar = this.zzh;
                        zzdegVar.zzc();
                    } catch (ExecutionException e2) {
                        e = e2;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        zzdegVar = this.zzh;
                        zzdegVar.zzc();
                    }
                } else if (this.zzl != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    zzdegVar = this.zzh;
                    zzdegVar.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbhz zzbhzVar) {
        this.zzg = zzbhzVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze.zza(zzbhVar);
    }

    public final zzfjj zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzad(view, view.getContext());
    }

    public final void zzi(zzdeb zzdebVar) {
        this.zzh.zzq(zzdebVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdI(zzeVar);
    }

    public final /* synthetic */ zzdeg zzo() {
        return this.zzh;
    }

    public final /* synthetic */ zzfor zzp() {
        return this.zzi;
    }

    public final /* synthetic */ zzdgl zzq() {
        return this.zzj;
    }

    public final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    public final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}

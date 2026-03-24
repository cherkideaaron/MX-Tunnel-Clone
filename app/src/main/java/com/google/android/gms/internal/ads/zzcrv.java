package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.Api;
import defpackage.As;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcrv {
    zzbyr zza;
    zzbyr zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzekc zze;
    private final zzdva zzf;
    private final zzgzy zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcrv(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzekc zzekcVar, zzdva zzdvaVar, zzgzy zzgzyVar, zzgzy zzgzyVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzekcVar;
        this.zzf = zzdvaVar;
        this.zzg = zzgzyVar;
        this.zzh = zzgzyVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlF));
    }

    private final As zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlF)) || this.zzd.zzx()) {
                return zzgzo.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlG), String.valueOf(random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrp
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ As zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrq
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ As zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "11");
            return zzgzo.zza(builderBuildUpon.toString());
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }

    public final void zza(String str, zzfqk zzfqkVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgzo.zzr(zzgzo.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlL)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcro(this, zzfqkVar, str, zzvVar), this.zzg);
    }

    public final As zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgzo.zza(str) : zzgzo.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ As zzd(String str, final Throwable th) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th);
            }
        });
        return zzgzo.zza(str);
    }

    public final /* synthetic */ As zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "10");
            return zzgzo.zza(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlI), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlJ))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlK));
        }
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgzo.zza(builder2.toString());
            }
        }, this.zzh);
    }

    public final /* synthetic */ As zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "9");
        return zzgzo.zza(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th) {
        zzbyr zzbyrVarZza;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyrVarZza = zzbyp.zzc(this.zzc);
            this.zzb = zzbyrVarZza;
            str = "AttributionReporting";
        } else {
            zzbyrVarZza = zzbyp.zza(this.zzc);
            this.zza = zzbyrVarZza;
            str = "AttributionReportingSampled";
        }
        zzbyrVarZza.zzh(th, str);
    }

    public final /* synthetic */ void zzh(Throwable th) {
        zzbyr zzbyrVarZza;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyrVarZza = zzbyp.zzc(this.zzc);
            this.zzb = zzbyrVarZza;
            str = "AttributionReporting.getUpdatedUrlAndRegisterSource";
        } else {
            zzbyrVarZza = zzbyp.zza(this.zzc);
            this.zza = zzbyrVarZza;
            str = "AttributionReportingSampled.getUpdatedUrlAndRegisterSource";
        }
        zzbyrVarZza.zzh(th, str);
    }

    public final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzgzy zzj() {
        return this.zzg;
    }
}

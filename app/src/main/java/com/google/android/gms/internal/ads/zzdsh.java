package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.AbstractC3264qG;
import defpackage.As;
import defpackage.Vs;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdsh {
    private final zzfjk zza;
    private final Executor zzb;
    private final zzduv zzc;
    private final zzdtq zzd;
    private final Context zze;
    private final zzdxz zzf;
    private final zzfqk zzg;
    private final zzeiu zzh;
    private final zzdxt zzi;
    private final zzdzc zzj;

    public zzdsh(zzfjk zzfjkVar, Executor executor, zzduv zzduvVar, Context context, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzdtq zzdtqVar, zzdxt zzdxtVar, zzdzc zzdzcVar) {
        this.zza = zzfjkVar;
        this.zzb = executor;
        this.zzc = zzduvVar;
        this.zze = context;
        this.zzf = zzdxzVar;
        this.zzg = zzfqkVar;
        this.zzh = zzeiuVar;
        this.zzd = zzdtqVar;
        this.zzi = zzdxtVar;
        this.zzj = zzdzcVar;
    }

    private final void zzh(zzcjl zzcjlVar, zzcem zzcemVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
        if (zzgaVar != null && zzcjlVar.zzh() != null) {
            zzcjlVar.zzh().zzc(zzgaVar);
        }
        zzcemVar.zzb();
    }

    private final void zzi(zzcjl zzcjlVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        zzdzc zzdzcVar;
        zzj(zzcjlVar);
        zzcjlVar.zzab("/video", zzbog.zzl);
        zzcjlVar.zzab("/videoMeta", zzbog.zzm);
        zzcjlVar.zzab("/precache", new zzchs());
        zzcjlVar.zzab("/delayPageLoaded", zzbog.zzp);
        zzcjlVar.zzab("/instrument", zzbog.zzn);
        zzcjlVar.zzab("/log", zzbog.zzg);
        zzcjlVar.zzab("/click", zzbog.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcjlVar.zzP().zzT(true);
            zzcjlVar.zzab("/open", new zzbou(true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzcjlVar.zzP().zzT(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            Map map = new HashMap();
            if (zzcjlVar.zzC() != null) {
                map = zzcjlVar.zzC().zzaw;
            }
            zzcjlVar.zzab("/logScionEvent", new zzbon(zzcjlVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            zzcjlVar.zzP().zzi(zzbVar);
            zzcjlVar.zzP().zzj(zzcceVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue() || (zzdzcVar = this.zzj) == null) {
            return;
        }
        zzcjlVar.zzab("/onDeviceStorageEvent", new zzbop(zzdzcVar));
    }

    private static final void zzj(zzcjl zzcjlVar) {
        zzcjlVar.zzab("/videoClicked", zzbog.zzh);
        zzcjlVar.zzP().zzR(true);
        zzcjlVar.zzab("/getNativeAdViewSignals", zzbog.zzs);
        zzcjlVar.zzab("/getNativeClickMeta", zzbog.zzt);
    }

    public final As zza(final JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcce zzcceVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            Vs.s(this.zzi.zze(), zzdxh.NATIVE_ASSETS_LOADING_VIDEO_START.zza());
        }
        As asZza = zzgzo.zza(null);
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zze(zzbVar, zzcceVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgzo.zzj(zzgzo.zzj(asZza, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcjl) obj);
            }
        }, executor);
    }

    public final As zzb(final String str, final String str2, final zzfir zzfirVar, final zzfiu zzfiuVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcce zzcceVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            Vs.s(this.zzi.zze(), zzdxh.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza());
        }
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzd(zzrVar, zzfirVar, zzfiuVar, zzbVar, zzcceVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ As zzc(JSONObject jSONObject, final zzcjl zzcjlVar) {
        zzbqs zzbqsVar = this.zza.zzb;
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVar);
        zzcjlVar.zzaf(zzbqsVar != null ? zzclv.zze() : zzclv.zzd());
        zzcjlVar.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdsf
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                this.zza.zzg(zzcjlVar, zzcemVarZza, z, i, str, str2);
            }
        });
        zzcjlVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcemVarZza;
    }

    public final /* synthetic */ As zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, String str, String str2, Object obj) throws zzcka {
        final zzcjl zzcjlVarZza = this.zzc.zza(zzrVar, zzfirVar, zzfiuVar);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        if (this.zza.zzb != null) {
            zzi(zzcjlVarZza, zzbVar, zzcceVar);
            zzcjlVarZza.zzaf(zzclv.zze());
        } else {
            zzdtn zzdtnVarZza = this.zzd.zza();
            zzclj zzcljVarZzP = zzcjlVarZza.zzP();
            zzbgv zzbgvVar = zzbhe.zzpf;
            zzcljVarZzP.zzab(zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? null : zzcceVar, this.zzh, this.zzg, this.zzf, null, zzdtnVarZza, null, null, null, null, this.zzj, null, null);
            zzj(zzcjlVarZza);
        }
        zzcjlVarZza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdse
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                this.zza.zzf(zzcjlVarZza, zzcemVarZza, z, i, str3, str4);
            }
        });
        zzcjlVarZza.zzau(str, str2, null);
        return zzcemVarZza;
    }

    public final /* synthetic */ As zze(com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, Object obj) throws zzcka {
        zzcjl zzcjlVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        zzi(zzcjlVarZza, zzbVar, zzcceVar);
        zzcjlVarZza.zzP().zzH(new zzcli() { // from class: com.google.android.gms.internal.ads.zzdsd
            @Override // com.google.android.gms.internal.ads.zzcli
            public final /* synthetic */ void zza() {
                zzcemVarZza.zzb();
            }
        });
        zzcjlVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeF));
        return zzcemVarZza;
    }

    public final /* synthetic */ void zzf(zzcjl zzcjlVar, zzcem zzcemVar, boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
            if (zzgaVar != null && zzcjlVar.zzh() != null) {
                zzcjlVar.zzh().zzc(zzgaVar);
            }
            zzcemVar.zzb();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        zzcemVar.zzd(new zzenv(1, AbstractC3264qG.l(sb, ", Failing URL: ", str2)));
    }

    public final /* synthetic */ void zzg(zzcjl zzcjlVar, zzcem zzcemVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeN)).booleanValue()) {
            zzh(zzcjlVar, zzcemVar);
            return;
        }
        if (z) {
            zzh(zzcjlVar, zzcemVar);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        zzcemVar.zzd(new zzenv(1, AbstractC3264qG.l(sb, ", Failing URL: ", str2)));
    }
}

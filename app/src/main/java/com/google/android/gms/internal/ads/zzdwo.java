package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzdwo implements zzdel, zzdct, zzdbi, zzdbz, com.google.android.gms.ads.internal.client.zza, zzdgw {
    private final zzbgd zza;
    private boolean zzb = false;

    public zzdwo(zzbgd zzbgdVar, zzfgn zzfgnVar) {
        this.zza = zzbgdVar;
        zzbgdVar.zzc(2);
        if (zzfgnVar != null) {
            zzbgdVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzbgd zzbgdVar;
        int i;
        switch (zzeVar.zza) {
            case 1:
                zzbgdVar = this.zza;
                i = FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
                break;
            case 2:
                zzbgdVar = this.zza;
                i = FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
                break;
            case 3:
                zzbgdVar = this.zza;
                i = 5;
                break;
            case 4:
                zzbgdVar = this.zza;
                i = FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT;
                break;
            case 5:
                zzbgdVar = this.zza;
                i = FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
                break;
            case 6:
                zzbgdVar = this.zza;
                i = FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS;
                break;
            case 7:
                zzbgdVar = this.zza;
                i = FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE;
                break;
            default:
                zzbgdVar = this.zza;
                i = 4;
                break;
        }
        zzbgdVar.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(final zzfjc zzfjcVar) {
        this.zza.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzdwn
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                zzbgj.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbgj.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzfjcVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzj(final zzbgj.zzb zzbVar) {
        zzbgc zzbgcVar = new zzbgc() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbgd zzbgdVar = this.zza;
        zzbgdVar.zzb(zzbgcVar);
        zzbgdVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzk(final zzbgj.zzb zzbVar) {
        zzbgc zzbgcVar = new zzbgc() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbgd zzbgdVar = this.zza;
        zzbgdVar.zzb(zzbgcVar);
        zzbgdVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzl(final zzbgj.zzb zzbVar) {
        zzbgc zzbgcVar = new zzbgc() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbgd zzbgdVar = this.zza;
        zzbgdVar.zzb(zzbgcVar);
        zzbgdVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzm(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdgw
    public final void zzo() {
        this.zza.zzc(1109);
    }
}

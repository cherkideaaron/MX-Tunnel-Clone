package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzecl implements zzaqu {
    final /* synthetic */ zzecm zza;

    public zzecl(zzecm zzecmVar) {
        Objects.requireNonNull(zzecmVar);
        this.zza = zzecmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zza(int i) {
        zzbyr zzbyrVar;
        String str;
        zzaqv zzaqvVarZzd;
        try {
            zzfpb zzfpbVarZza = zzfpc.zza();
            zzfpbVarZza.zzh(i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3);
            if (i == 0 && (zzaqvVarZzd = this.zza.zzc().zzd()) != null) {
                zzfpbVarZza.zzb(zzaqvVarZzd.zzb());
                zzfpbVarZza.zzc(zzaqvVarZzd.zzc());
                zzfpbVarZza.zzd(zzaqvVarZzd.zzd());
                zzfpbVarZza.zze(zzaqvVarZzd.zze());
                zzfpbVarZza.zzf(zzaqvVarZzd.zzf());
                if (!TextUtils.isEmpty(zzaqvVarZzd.zza())) {
                    zzfpbVarZza.zza(zzaqvVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzaqvVarZzd.zzg())) {
                    zzfpbVarZza.zzg(zzaqvVarZzd.zzg());
                }
            }
            zzecm zzecmVar = this.zza;
            zzecmVar.zzc().zzc();
            zzdxz zzdxzVarZzd = zzecmVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfpc) zzfpbVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfO)).booleanValue()) {
                zzdxy zzdxyVarZza = zzdxzVarZzd.zza();
                zzdxyVarZza.zzc("action", "irda");
                zzdxyVarZza.zzc("irdd", strEncodeToString);
                zzdxyVarZza.zzf();
            }
            zzecmVar.zze().zzQ(true);
        } catch (Exception e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfP)).booleanValue()) {
                zzecm zzecmVar2 = this.zza;
                if (zzecmVar2.zzb == null) {
                    zzecmVar2.zzb = zzbyp.zzc(zzecmVar2.zzb());
                }
                zzbyrVar = zzecmVar2.zzb;
                str = "InstallReferrerUnsampled.onInstallReferrerSetupFinished";
            } else {
                zzecm zzecmVar3 = this.zza;
                if (zzecmVar3.zza == null) {
                    zzecmVar3.zza = zzbyp.zza(zzecmVar3.zzb());
                }
                zzbyrVar = zzecmVar3.zza;
                str = "InstallReferrer.onInstallReferrerSetupFinished";
            }
            zzbyrVar.zzh(e, str);
        }
    }
}

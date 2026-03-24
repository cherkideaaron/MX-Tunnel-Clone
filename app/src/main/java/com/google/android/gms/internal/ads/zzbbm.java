package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbm extends zzbby {
    public zzbbm(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "Vt16THtmezzLb1zgD4XzuhSMrHLGIQcDJNqtzF8G+1UgPRnrYaZemyLPsebqTPQi", "+oRdA7B1eJk1uXzj6xFlex4QQoiHLhoEiFmCoqVQP54=", zzawgVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdI);
        bool.getClass();
        zzazq zzazqVar = new zzazq((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzc(zzazqVar.zza);
            zzawgVar.zzP(zzazqVar.zzb);
        }
    }
}

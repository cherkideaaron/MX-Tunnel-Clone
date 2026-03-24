package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzdns implements zzgzl {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdoc zzb;

    public zzdns(zzdoc zzdocVar, String str, boolean z) {
        Objects.requireNonNull(zzdocVar);
        this.zzb = zzdocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgr)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdoc zzdocVar = this.zzb;
        zzdocVar.zzZ().zzo((zzcjl) obj);
        String str = this.zza;
        zzcen zzcenVarZzY = zzdocVar.zzZ().zzY();
        zzekb zzekbVarZzL = zzdocVar.zzL(str, true);
        if (zzekbVarZzL != null && zzcenVarZzY != null) {
            zzcenVarZzY.zzc(zzekbVarZzL);
        } else if (zzcenVarZzY != null) {
            zzcenVarZzY.cancel(false);
        }
    }
}

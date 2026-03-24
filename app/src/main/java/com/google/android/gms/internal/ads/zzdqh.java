package com.google.android.gms.internal.ads;

import defpackage.As;
import defpackage.Z3;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdqh implements zzdbz {
    private final zzdoh zza;
    private final zzdom zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdqh(zzdoh zzdohVar, zzdom zzdomVar, Executor executor, Executor executor2) {
        this.zza = zzdohVar;
        this.zzb = zzdomVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcjl zzcjlVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // java.lang.Runnable
            public final void run() {
                zzcjlVar.zze("onSdkImpression", new Z3());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdoh zzdohVar = this.zza;
            zzekb zzekbVarZzZ = zzdohVar.zzZ();
            if (zzekbVarZzZ == null && zzdohVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue()) {
                As asZzX = zzdohVar.zzX();
                zzcen zzcenVarZzY = zzdohVar.zzY();
                if (asZzX == null || zzcenVarZzY == null) {
                    return;
                }
                zzgzo.zzr(zzgzo.zzq(asZzX, zzcenVarZzY), new zzdqf(this), this.zzd);
                return;
            }
            if (zzekbVarZzZ != null) {
                zzcjl zzcjlVarZzW = zzdohVar.zzW();
                zzcjl zzcjlVarZzT = zzdohVar.zzT();
                if (zzcjlVarZzW == null) {
                    zzcjlVarZzW = zzcjlVarZzT == null ? null : zzcjlVarZzT;
                }
                if (zzcjlVarZzW != null) {
                    zza(zzcjlVarZzW);
                }
            }
        }
    }
}

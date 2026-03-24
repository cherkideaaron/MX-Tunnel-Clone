package com.google.android.gms.internal.ads;

import defpackage.As;

/* loaded from: classes.dex */
public final class zzfmb {
    private final zzflt zza;
    private final As zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfmb(final zzfkz zzfkzVar, final zzfls zzflsVar, final zzflt zzfltVar) {
        this.zza = zzfltVar;
        this.zzb = zzgzo.zzh(zzgzo.zzj(zzflsVar.zza(zzfltVar), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfma
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc(zzflsVar, zzfkzVar, zzfltVar, (zzfli) obj);
            }
        }, zzfltVar.zza()), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfly
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzd(zzflsVar, (Exception) obj);
            }
        }, zzfltVar.zza());
    }

    public final synchronized void zza(zzgzl zzgzlVar) {
        zzflt zzfltVar = this.zza;
        zzgzo.zzr(zzgzo.zzj(this.zzb, zzflz.zza, zzfltVar.zza()), zzgzlVar, zzfltVar.zza());
    }

    public final synchronized As zzb(zzflt zzfltVar) {
        if (!this.zzd && !this.zzc) {
            zzflt zzfltVar2 = this.zza;
            if (zzfltVar2.zzb() != null && zzfltVar.zzb() != null && zzfltVar2.zzb().equals(zzfltVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ As zzc(zzfls zzflsVar, zzfkz zzfkzVar, zzflt zzfltVar, zzfli zzfliVar) {
        As asZza;
        synchronized (this) {
            try {
                this.zzd = true;
                zzflsVar.zzb(zzfliVar);
                if (this.zzc) {
                    asZza = zzgzo.zza(new zzflr(zzfliVar, zzfltVar));
                } else {
                    zzfkzVar.zzb(zzfltVar.zzb(), zzfliVar);
                    asZza = zzgzo.zza(null);
                }
            } finally {
            }
        }
        return asZza;
    }

    public final /* synthetic */ As zzd(zzfls zzflsVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}

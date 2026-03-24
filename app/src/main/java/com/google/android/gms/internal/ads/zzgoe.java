package com.google.android.gms.internal.ads;

import defpackage.As;

/* loaded from: classes.dex */
public final class zzgoe {
    private final zzgdh zza;
    private final zzgao zzb;

    public zzgoe(zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zza = zzgdhVar;
        this.zzb = zzgaoVar;
    }

    public final zzgoc zza(int i) {
        return new zzgoc(i, this.zzb, this.zza);
    }

    public final void zzb(int i) {
        this.zza.zzb(i - 1, -1L, null, null);
    }

    public final void zzc(int i, String str) {
        this.zza.zzb(i - 1, -1L, null, str);
    }

    public final void zzd(int i, Throwable th) {
        this.zza.zzb(i - 1, -1L, th, null);
    }

    public final As zze(int i, As as) {
        zzgoc zzgocVarZza = zza(i);
        zzgocVarZza.zza();
        zzgzo.zzr(as, new zzgod(this, zzgocVarZza), zzhaf.zza());
        return as;
    }

    public final void zzf(int i, Runnable runnable) {
        try {
            zza(i).zza();
            runnable.run();
        } finally {
        }
    }
}

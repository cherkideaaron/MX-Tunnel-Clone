package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgec {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;

    public zzgec(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }

    private final As zze(final int i) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i);
            }
        }, this.zzd)), zzgdz.zza, zzhaf.zza());
    }

    public final /* synthetic */ zzgoe zza() {
        return this.zze;
    }

    public final As zzb(int i, boolean z) {
        As asZze = zze(i);
        return (!z || i == 2) ? asZze : (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(asZze), Throwable.class, zzgeb.zza, zzhaf.zza()), new zzgdx(this), zzhaf.zza());
    }

    public final /* synthetic */ zzgdv zzc(int i) {
        zzika zzikaVar;
        int i2 = i - 1;
        if (i2 == 1) {
            zzikaVar = this.zza;
        } else if (i2 == 2) {
            zzikaVar = this.zzb;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException();
            }
            zzikaVar = this.zzc;
        }
        return (zzgdv) zzikaVar.zzb();
    }

    public final /* synthetic */ As zzd(int i) {
        return zze(2);
    }
}

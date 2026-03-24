package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgmv implements zzgmu {
    private final zzika zza;
    private final zzgoe zzb;
    private final long zzc;

    public zzgmv(zzika zzikaVar, zzgoe zzgoeVar, zzgao zzgaoVar, long j) {
        this.zza = zzikaVar;
        this.zzb = zzgoeVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(zzgdu zzgduVar) {
        zzgoe zzgoeVar;
        int i;
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            zzgoeVar = this.zzb;
            i = 15104;
        } else {
            if (zzgduVar.zzc() == this.zza.zzb()) {
                boolean z = (zzgduVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
                if (z) {
                    this.zzb.zzb(15106);
                }
                return z;
            }
            zzgoeVar = this.zzb;
            i = 15105;
        }
        zzgoeVar.zzb(i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(zzgdu zzgduVar) {
        zzgoe zzgoeVar;
        int i;
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            zzgoeVar = this.zzb;
            i = 15102;
        } else {
            if (zzgduVar.zzc() == this.zza.zzb()) {
                return true;
            }
            zzgoeVar = this.zzb;
            i = 15103;
        }
        zzgoeVar.zzb(i);
        return false;
    }
}

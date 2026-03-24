package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzagf implements zzaex {
    private final long zzb;
    private final zzaex zzc;

    public zzagf(long j, zzaex zzaexVar) {
        this.zzb = j;
        this.zzc = zzaexVar;
    }

    public final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i, int i2) {
        return this.zzc.zzu(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(zzafy zzafyVar) {
        this.zzc.zzw(new zzage(this, zzafyVar, zzafyVar));
    }
}

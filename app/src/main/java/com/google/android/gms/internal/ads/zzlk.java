package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzlk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlk() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzlk zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzlk zzb(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzgrc.zza(z);
        this.zzb = f;
        return this;
    }

    public final zzlk zzc(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzgrc.zza(z);
        this.zzc = j;
        return this;
    }

    public final zzll zzd() {
        return new zzll(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzlk(zzll zzllVar, byte[] bArr) {
        this.zza = zzllVar.zza;
        this.zzb = zzllVar.zzb;
        this.zzc = zzllVar.zzc;
    }
}

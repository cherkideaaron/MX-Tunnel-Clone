package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzpy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpy zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzpy zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzpy zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzpz zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpz(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}

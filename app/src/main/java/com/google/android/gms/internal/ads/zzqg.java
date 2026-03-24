package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzqg {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqg zza(boolean z) {
        this.zza = z;
        return this;
    }

    public final zzqg zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzqg zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzqg zzd(int i) {
        this.zzd = i;
        return this;
    }

    public final zzqh zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqh(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaee {
    public static final zzaee zza = new zzaee(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaee(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaee zza(long j, long j2) {
        return new zzaee(-1, j, j2);
    }

    public static zzaee zzb(long j, long j2) {
        return new zzaee(-2, j, j2);
    }

    public static zzaee zzc(long j) {
        return new zzaee(0, -9223372036854775807L, j);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}

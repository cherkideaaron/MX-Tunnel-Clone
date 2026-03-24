package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzahm {
    protected final zzagh zza;

    public zzahm(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public abstract boolean zza(zzer zzerVar);

    public abstract boolean zzb(zzer zzerVar, long j);

    public final boolean zzf(zzer zzerVar, long j) {
        return zza(zzerVar) && zzb(zzerVar, j);
    }
}

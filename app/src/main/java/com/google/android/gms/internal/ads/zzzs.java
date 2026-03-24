package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzzs {
    public final int zza;
    public final zzbg zzb;
    public final int zzc;
    public final zzv zzd;

    public zzzs(int i, zzbg zzbgVar, int i2) {
        this.zza = i;
        this.zzb = zzbgVar;
        this.zzc = i2;
        this.zzd = zzbgVar.zza(i2);
    }

    public abstract int zza();

    public abstract boolean zzc(zzzs zzzsVar);
}

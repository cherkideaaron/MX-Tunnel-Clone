package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzhjf {
    private final zzhye zza;
    private final Class zzb;

    public /* synthetic */ zzhjf(zzhye zzhyeVar, Class cls, byte[] bArr) {
        this.zza = zzhyeVar;
        this.zzb = cls;
    }

    public static zzhjf zzd(zzhje zzhjeVar, zzhye zzhyeVar, Class cls) {
        return new zzhjd(zzhyeVar, cls, zzhjeVar);
    }

    public abstract zzhaz zza(zzhlg zzhlgVar, zzhbt zzhbtVar);

    public final zzhye zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}

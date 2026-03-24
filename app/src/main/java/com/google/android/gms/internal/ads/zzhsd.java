package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhsd {
    public static final zzhsd zza = new zzhsd("SHA256");
    public static final zzhsd zzb = new zzhsd("SHA384");
    public static final zzhsd zzc = new zzhsd("SHA512");
    private final String zzd;

    private zzhsd(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}

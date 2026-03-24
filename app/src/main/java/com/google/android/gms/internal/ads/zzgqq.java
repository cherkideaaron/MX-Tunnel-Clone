package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzgqq implements zzgrd {
    public static zzgqq zzc(char c) {
        return new zzgqn(c);
    }

    @Override // com.google.android.gms.internal.ads.zzgrd
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgcj implements zzgcd {
    private final int zza;
    private final byte[] zzb;

    public zzgcj(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final String zzb() {
        return new String(this.zzb);
    }
}

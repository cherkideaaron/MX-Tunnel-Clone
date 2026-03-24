package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzemi extends zzbvi {
    private final zzekj zza;

    public /* synthetic */ zzemi(zzemj zzemjVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzemjVar);
        this.zza = zzekjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze() {
        ((zzelv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(String str) {
        ((zzelv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzelv) this.zza.zzc).zzx(zzeVar);
    }
}

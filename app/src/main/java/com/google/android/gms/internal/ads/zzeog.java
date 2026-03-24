package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzeog extends zzbvo {
    private final zzekj zza;

    public /* synthetic */ zzeog(zzeoh zzeohVar, zzekj zzekjVar, byte[] bArr) {
        Objects.requireNonNull(zzeohVar);
        this.zza = zzekjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze() {
        ((zzelv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(String str) {
        ((zzelv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzelv) this.zza.zzc).zzx(zzeVar);
    }
}

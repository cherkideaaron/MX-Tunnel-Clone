package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcyf implements com.google.android.gms.ads.internal.client.zza {
    private final zzcyj zza;
    private final zzfjk zzb;

    public zzcyf(zzcyj zzcyjVar, zzfjk zzfjkVar) {
        this.zza = zzcyjVar;
        this.zzb = zzfjkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzsz implements zzrg {
    final /* synthetic */ zzta zza;

    public /* synthetic */ zzsz(zzta zztaVar, byte[] bArr) {
        Objects.requireNonNull(zztaVar);
        this.zza = zztaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrg
    public final void zza(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaw().zzi(exc);
    }
}

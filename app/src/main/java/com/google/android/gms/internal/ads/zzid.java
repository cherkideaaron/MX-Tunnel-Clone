package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.AbstractC3760zQ;

/* loaded from: classes.dex */
final class zzid {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = AbstractC3760zQ.e();

    public final /* synthetic */ void zza(int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i, i2);
        this.zza.setPattern(pattern);
    }
}

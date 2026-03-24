package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzud implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    public zzud(zzug zzugVar) {
        Objects.requireNonNull(zzugVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class zzin {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        int i5 = this.zze;
        int i6 = this.zzf;
        int i7 = this.zzg;
        int i8 = this.zzh;
        int i9 = this.zzi;
        int i10 = this.zzj;
        long j = this.zzk;
        int i11 = this.zzl;
        String str = zzfj.zza;
        Locale locale = Locale.US;
        return "DecoderCounters {\n decoderInits=" + i + ",\n decoderReleases=" + i2 + "\n queuedInputBuffers=" + i3 + "\n skippedInputBuffers=" + i4 + "\n renderedOutputBuffers=" + i5 + "\n skippedOutputBuffers=" + i6 + "\n droppedBuffers=" + i7 + "\n droppedInputBuffers=" + i8 + "\n maxConsecutiveDroppedBuffers=" + i9 + "\n droppedToKeyframeEvents=" + i10 + "\n totalVideoFrameProcessingOffsetUs=" + j + "\n videoFrameProcessingOffsetCount=" + i11 + "\n}";
    }

    public final synchronized void zza() {
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public interface zzuk {
    void zza(int i, int i2, int i3, long j, int i4);

    void zzb(int i, int i2, zzie zzieVar, long j, int i3);

    void zzc(int i, boolean z);

    void zzd(int i, long j);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i);

    void zzi(Runnable runnable);

    ByteBuffer zzj(int i);

    void zzk();

    void zzl();

    boolean zzm(zzuj zzujVar);

    void zzn(Surface surface);

    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i);

    void zzr(List list);
}

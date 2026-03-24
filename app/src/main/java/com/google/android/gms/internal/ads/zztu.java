package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zztu implements zzui {
    private final zzgru zza;
    private final zzgru zzb;

    public zztu(final int i) {
        zzgru zzgruVar = new zzgru() { // from class: com.google.android.gms.internal.ads.zztt
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztv.zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzgru zzgruVar2 = new zzgru() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // com.google.android.gms.internal.ads.zzgru
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztv.zzw(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgruVar;
        this.zzb = zzgruVar2;
    }

    public final zztv zza(zzuh zzuhVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        zztv zztvVar;
        zzun zzunVar = zzuhVar.zza;
        String str = zzunVar.zza;
        zztv zztvVar2 = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zztvVar = new zztv(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), new zzty(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza()), zzuhVar.zzf, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        }
        try {
            Trace.endSection();
            Surface surface = zzuhVar.zzd;
            int i = 0;
            if (surface == null && zzunVar.zzh && Build.VERSION.SDK_INT >= 35) {
                i = 8;
            }
            zztvVar.zzt(zzuhVar.zzb, surface, null, i);
            return zztvVar;
        } catch (Exception e3) {
            e = e3;
            zztvVar2 = zztvVar;
            if (zztvVar2 != null) {
                zztvVar2.zzl();
            } else if (mediaCodecCreateByCodecName != null) {
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final /* bridge */ /* synthetic */ zzuk zzb(zzuh zzuhVar) {
        throw null;
    }
}

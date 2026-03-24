package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import defpackage.AbstractC3760zQ;

/* loaded from: classes.dex */
final class zzru {
    private final AudioTrack zza;
    private final Handler zzb;
    private AudioRouting$OnRoutingChangedListener zzc;
    private final zzsh zzd;

    public /* synthetic */ zzru(AudioTrack audioTrack, zzsh zzshVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzd = zzshVar;
        Handler handlerZzc = zzfj.zzc(null);
        this.zzb = handlerZzc;
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzrt
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                this.zza.zza(audioRouting);
            }
        };
        this.zzc = audioRouting$OnRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(audioRouting$OnRoutingChangedListener, handlerZzc);
    }

    public final /* synthetic */ void zza(final AudioRouting audioRouting) {
        if (this.zzc == null) {
            return;
        }
        zzdh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(audioRouting);
            }
        });
    }

    public final /* synthetic */ void zzb(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(routedDevice);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzc == null) {
            return;
        }
        zzsi zzsiVar = this.zzd.zza;
        if (zzsiVar.zzi() != null) {
            zzsiVar.zzi().zzc(audioDeviceInfo);
        }
    }

    public final /* synthetic */ void zzd() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.zzc;
        audioRouting$OnRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(AbstractC3760zQ.d(audioRouting$OnRoutingChangedListener));
        this.zzc = null;
    }
}

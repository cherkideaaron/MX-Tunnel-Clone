package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzsm {
    private final Context zza;
    private Boolean zzb;

    public zzsm() {
        this(null);
    }

    public final zzpz zza(zzv zzvVar, zzd zzdVar) {
        int i;
        Boolean boolValueOf;
        boolean zBooleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || (i = zzvVar.zzH) == -1) {
            return zzpz.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                boolValueOf = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                boolValueOf = Boolean.FALSE;
            }
            this.zzb = boolValueOf;
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzo;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (iZzg == 0 || i2 < zzfj.zzC(iZzg)) {
            return zzpz.zza;
        }
        int iZzB = zzfj.zzB(zzvVar.zzG);
        if (iZzB == 0) {
            return zzpz.zza;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iZzB).setEncoding(iZzg).build();
            AudioAttributes audioAttributesZza = zzdVar.zza();
            if (i2 >= 31) {
                int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributesZza);
                if (playbackOffloadSupport != 0) {
                    zzpy zzpyVar = new zzpy();
                    if (i2 > 32 && playbackOffloadSupport == 2) {
                        z = true;
                    }
                    zzpyVar.zza(true);
                    zzpyVar.zzb(z);
                    zzpyVar.zzc(zBooleanValue);
                    return zzpyVar.zzd();
                }
            } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributesZza)) {
                zzpy zzpyVar2 = new zzpy();
                zzpyVar2.zza(true);
                zzpyVar2.zzc(zBooleanValue);
                return zzpyVar2.zzd();
            }
            return zzpz.zza;
        } catch (IllegalArgumentException unused) {
            return zzpz.zza;
        }
    }

    public zzsm(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}

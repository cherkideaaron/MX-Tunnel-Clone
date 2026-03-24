package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzuh {
    public final zzun zza;
    public final MediaFormat zzb;
    public final zzv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzug zzf;

    private zzuh(zzun zzunVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto, zzug zzugVar) {
        this.zza = zzunVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzugVar;
    }

    public static zzuh zza(zzun zzunVar, MediaFormat mediaFormat, zzv zzvVar, MediaCrypto mediaCrypto, zzug zzugVar) {
        return new zzuh(zzunVar, mediaFormat, zzvVar, null, null, zzugVar);
    }

    public static zzuh zzb(zzun zzunVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzuh(zzunVar, mediaFormat, zzvVar, surface, null, null);
    }
}

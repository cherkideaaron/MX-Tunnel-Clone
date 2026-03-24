package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zzuq extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzun zzc;
    public final String zzd;

    public zzuq(zzv zzvVar, Throwable th, boolean z, int i) {
        String string = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = zzvVar.zzo;
        int iAbs = Math.abs(i);
        this(string2, th, str, false, null, AbstractC3264qG.k(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs), null);
    }

    public final /* synthetic */ zzuq zza(zzuq zzuqVar) {
        return new zzuq(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzuqVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzuq(zzv zzvVar, Throwable th, boolean z, zzun zzunVar) {
        String str = zzunVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        this(AbstractC3264qG.m(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, ", ", string), th, zzvVar.zzo, false, zzunVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzuq(String str, Throwable th, String str2, boolean z, zzun zzunVar, String str3, zzuq zzuqVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzunVar;
        this.zzd = str3;
    }
}

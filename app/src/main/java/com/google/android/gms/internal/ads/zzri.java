package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zzri extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzri(int i, zzv zzvVar, boolean z) {
        super(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 25), "AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzvVar;
    }
}

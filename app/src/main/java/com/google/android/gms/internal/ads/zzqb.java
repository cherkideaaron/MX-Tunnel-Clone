package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqb(int i, boolean z) {
        super(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 26), "AudioOutput write failed: ", i));
        this.zzb = z;
        this.zza = i;
    }
}

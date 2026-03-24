package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzrf extends Exception {
    public final boolean zza;

    public zzrf(int i, int i2, int i3, int i4, int i5, zzv zzvVar, boolean z, Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i3).length();
        int length3 = String.valueOf(i4).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i5).length() + 2 + strValueOf.length());
        Vs.x(sb, "AudioTrack init failed 0 Config(", i2, ", ", i3);
        Vs.x(sb, ", ", i4, ", ", i5);
        super(Vs.o(sb, ") ", strValueOf, ""), exc);
        this.zza = false;
    }
}

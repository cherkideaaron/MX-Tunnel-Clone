package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
final class zzieq extends Exception {
    public zzieq(int i, int i2) {
        super(Vs.n(new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(i2).length()), "Unpaired surrogate at index ", i, " of ", i2));
    }
}

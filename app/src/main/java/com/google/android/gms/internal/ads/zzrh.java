package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzrh extends Exception {
    public zzrh(long j, long j2) {
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 63 + String.valueOf(j).length());
        Vs.y(sb, "Unexpected audio track timestamp discontinuity: expected ", j2, ", got ");
        sb.append(j);
        super(sb.toString());
    }
}

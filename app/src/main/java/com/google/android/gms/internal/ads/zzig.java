package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21 + String.valueOf(i2).length() + 1);
        Vs.x(sb, "Buffer too small (", i, " < ", i2);
        sb.append(")");
        super(sb.toString());
    }
}

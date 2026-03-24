package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzcn extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzcn(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        super(Vs.o(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}

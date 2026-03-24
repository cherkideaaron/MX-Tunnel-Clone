package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.AbstractC3264qG;

/* loaded from: classes2.dex */
final class zzae {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC3264qG.x("null value in entry: ", String.valueOf(obj), "=null"));
        }
    }
}

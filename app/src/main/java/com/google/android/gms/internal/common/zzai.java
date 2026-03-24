package com.google.android.gms.internal.common;

import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC3264qG.k(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
            }
        }
        return objArr;
    }
}

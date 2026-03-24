package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgqz {
    public static Object zza(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static zzgqy zzb(Object obj) {
        return new zzgqy(obj.getClass().getSimpleName(), null);
    }
}

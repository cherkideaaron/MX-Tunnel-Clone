package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzql extends RuntimeException {
    public zzql(String str) {
        super(str);
    }

    public static <T> T zza(zzqo<T> zzqoVar) {
        try {
            return zzqoVar.zza();
        } catch (Exception e) {
            throw new zzql(e);
        }
    }

    public zzql(String str, Throwable th) {
        super(str, th);
    }

    public zzql(Throwable th) {
        super(th);
    }
}

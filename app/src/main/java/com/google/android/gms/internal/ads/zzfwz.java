package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfwz extends Exception {
    private final int zza;

    public zzfwz(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfwz(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}

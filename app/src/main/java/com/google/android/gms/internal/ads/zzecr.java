package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzecr extends Exception {
    private final int zza;

    public zzecr(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzecr(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzecr(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}

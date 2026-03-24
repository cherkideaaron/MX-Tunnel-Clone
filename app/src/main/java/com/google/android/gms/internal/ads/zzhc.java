package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzhc extends IOException {
    public final int zza;

    public zzhc(int i) {
        this.zza = i;
    }

    public zzhc(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzhc(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzhc(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}

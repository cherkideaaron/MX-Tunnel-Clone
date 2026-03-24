package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzicg extends IOException {
    private boolean zza;

    public zzicg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzicg(String str) {
        super(str);
    }

    public zzicg(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;
import defpackage.Vs;

/* loaded from: classes.dex */
final class zzhad extends zzgyh.zzf implements Runnable {
    private final Runnable zza;

    public zzhad(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String string = this.zza.toString();
        return Vs.o(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }
}

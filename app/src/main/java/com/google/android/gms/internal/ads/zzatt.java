package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* loaded from: classes.dex */
public final class zzatt extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatt(zzats zzatsVar, zzatq zzatqVar, long j) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j);
        super(String.format(locale, zzaui.zza("bk3t6gFTc30="), Long.valueOf(zzatsVar.zza()), Long.valueOf(zzatqVar.zza()), lValueOf));
        Optional.of(zzatqVar);
        Optional.of(lValueOf);
    }

    public zzatt(zzats zzatsVar, Throwable th) {
        super(String.format(Locale.US, zzaui.zza("bk0="), Long.valueOf(zzatsVar.zza())), th);
        Optional.empty();
        Optional.empty();
    }
}

package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzasq implements zzast {
    final /* synthetic */ File zza;

    public zzasq(zzasu zzasuVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzasuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final File zza() {
        return this.zza;
    }
}

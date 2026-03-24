package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class zzgxl extends zzgxc {
    private final File zza;

    public final String toString() {
        String string = this.zza.toString();
        return Vs.o(new StringBuilder(string.length() + 20), "Files.asByteSource(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final /* bridge */ /* synthetic */ InputStream zza() {
        return new FileInputStream(this.zza);
    }
}

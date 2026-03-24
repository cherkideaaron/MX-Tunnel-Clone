package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbfu extends PushbackInputStream {
    final /* synthetic */ zzbfx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbfu(zzbfx zzbfxVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbfxVar);
        this.zza = zzbfxVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.zza.zzc.zzb();
        super.close();
    }
}

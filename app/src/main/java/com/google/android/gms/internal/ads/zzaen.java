package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
final /* synthetic */ class zzaen implements zzaeo {
    static final /* synthetic */ zzaen zza = new zzaen();

    private /* synthetic */ zzaen() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final /* synthetic */ Constructor zza() {
        int i = zzaeq.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaeu.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzacm implements zzbs {
    private final zzbq zza = new zzacl(false);

    public zzacm(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbs
    public final zzbu zza(Context context, zzi zziVar, zzl zzlVar, zzbt zzbtVar, Executor executor, long j, boolean z) {
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            return ((zzbs) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbq.class).newInstance(this.zza)).zza(context, zziVar, zzlVar, zzbtVar, executor, 0L, false);
        } catch (Exception e2) {
            e = e2;
            throw new IllegalStateException(e);
        }
    }
}

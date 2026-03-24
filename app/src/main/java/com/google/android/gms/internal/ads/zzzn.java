package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzzn implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzaaa zza;

    public zzzn(zzzp zzzpVar, zzaaa zzaaaVar) {
        this.zza = zzaaaVar;
        Objects.requireNonNull(zzzpVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzl();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzl();
    }
}

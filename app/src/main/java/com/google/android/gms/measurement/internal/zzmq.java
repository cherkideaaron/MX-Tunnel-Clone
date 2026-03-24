package com.google.android.gms.measurement.internal;

import defpackage.AbstractC3264qG;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzmq extends zzay {
    final /* synthetic */ zznl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmq(zznl zznlVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        AbstractC3264qG.y(this.zza.zzu, "Tasks have been queued for a long time");
    }
}

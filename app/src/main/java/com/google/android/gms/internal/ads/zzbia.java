package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.AbstractC2568de;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbia extends AbstractC2568de {
    final /* synthetic */ zzbid zza;

    public zzbia(zzbid zzbidVar) {
        Objects.requireNonNull(zzbidVar);
        this.zza = zzbidVar;
    }

    @Override // defpackage.AbstractC2568de
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.zzc(i);
    }
}

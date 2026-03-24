package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.AbstractC3490uQ;

/* loaded from: classes.dex */
public final class zzeyj implements zzfav {
    private final Boolean zza;

    public zzeyj(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        Boolean bool = this.zza;
        bundle.putInt("lft", bool == null ? -1 : bool.booleanValue() ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zzb(Object obj) {
        AbstractC3490uQ.a(this, obj);
    }
}

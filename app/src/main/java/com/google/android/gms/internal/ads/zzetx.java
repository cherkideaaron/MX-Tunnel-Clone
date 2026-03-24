package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.AbstractC3490uQ;

/* loaded from: classes.dex */
public final class zzetx implements zzfav {
    private final String zza;
    private final boolean zzb;

    public zzetx(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (str != null) {
            Bundle bundleZza = zzfjz.zza(zzdahVar.zza, "pii");
            bundleZza.putString("afai", str);
            bundleZza.putBoolean("is_afai_lat", this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zzb(Object obj) {
        AbstractC3490uQ.a(this, obj);
    }
}

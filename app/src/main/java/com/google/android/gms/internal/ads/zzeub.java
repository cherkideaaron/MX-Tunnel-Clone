package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.AbstractC3490uQ;

/* loaded from: classes.dex */
public final class zzeub implements zzfav {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzeub(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z) {
        this.zza = zzxVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str;
        Bundle bundle = ((zzdah) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgt)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i = zzxVar.zza;
            if (i == 1) {
                str = "p";
            } else if (i != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zzb(Object obj) {
        AbstractC3490uQ.a(this, obj);
    }
}

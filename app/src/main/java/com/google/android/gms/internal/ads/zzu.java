package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
final /* synthetic */ class zzu implements zzgqt {
    static final /* synthetic */ zzu zza = new zzu();

    private /* synthetic */ zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        zzx zzxVar = (zzx) obj;
        int i = zzv.zzO;
        String str = zzxVar.zza;
        String str2 = zzxVar.zzb;
        return Vs.o(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.AbstractC3264qG;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzgcf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgcf(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgcf zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgcf(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgbf zzgbfVar = (zzgbf) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        AbstractC3264qG.v(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb.append(")");
        return new zzgck(executorService, sb.toString(), zzgbfVar.zzl());
    }
}

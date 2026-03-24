package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.As;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfck implements zzfax {
    final zzgzy zza;

    public zzfck(zzbfs zzbfsVar, zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        return this.zza.zzc(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfcl(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 45;
    }
}

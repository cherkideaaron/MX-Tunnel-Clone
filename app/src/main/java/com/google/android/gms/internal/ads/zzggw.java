package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import defpackage.As;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class zzggw extends zzghb {
    private final Context zza;
    private final Map zzb;

    public zzggw(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgoe zzgoeVar) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", zzawgVar, zzgfxVar, zzgoeVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l = (Long) method.invoke("", this.zza);
                l.getClass();
                lValueOf = l;
            } else {
                As as = (As) this.zzb.get("gs");
                if (as != null && as.isDone()) {
                    lValueOf = Long.valueOf(((zzaxg) as.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzawgVar) {
            zzawgVar.zzR(lValueOf.longValue());
        }
    }
}

package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfnf {
    public static final zzfnl zza(As as, Object obj, zzfnm zzfnmVar) {
        return new zzfnl(zzfnmVar, obj, null, zzfnm.zza, Collections.emptyList(), as, null);
    }

    public static final zzfnl zzb(Callable callable, Object obj, zzfnm zzfnmVar) {
        return zzc(callable, zzfnmVar.zze(), obj, zzfnmVar);
    }

    public static final zzfnl zzc(Callable callable, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return new zzfnl(zzfnmVar, obj, null, zzfnm.zza, Collections.emptyList(), zzgzyVar.zzc(callable), null);
    }

    public static final zzfnl zzd(final zzfna zzfnaVar, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfne
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfnaVar.zza();
                return null;
            }
        }, zzgzyVar, obj, zzfnmVar);
    }
}

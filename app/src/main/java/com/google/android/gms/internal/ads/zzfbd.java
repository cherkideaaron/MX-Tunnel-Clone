package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.As;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfbd implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzfbd(Context context, zzgzy zzgzyVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        return ((Boolean) zzbiw.zzb.zze()).booleanValue() ? this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzgzo.zza(new zzfbe(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzfbe zzc() {
        Context context = this.zza;
        return new zzfbe(zzbgp.zzc(context), zzbgp.zzd(context));
    }
}

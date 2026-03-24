package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import defpackage.As;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzecz {
    private final zzgzy zza;
    private final zzgzy zzb;
    private final zzeej zzc;
    private final zzika zzd;

    public zzecz(zzgzy zzgzyVar, zzgzy zzgzyVar2, zzeej zzeejVar, zzika zzikaVar) {
        this.zza = zzgzyVar;
        this.zzb = zzgzyVar2;
        this.zzc = zzeejVar;
        this.zzd = zzikaVar;
    }

    public final As zza(final zzbzu zzbzuVar) {
        As asZzh;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            asZzh = zzgzo.zzc(new zzeff(1));
        } else {
            asZzh = zzgzo.zzh(this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzecy
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(zzbzuVar);
                }
            }), ExecutionException.class, zzecv.zza, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgzo.zzh(asZzh, zzeff.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc(zzbzuVar, callingUid, (zzeff) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzefg zzb(zzbzu zzbzuVar) {
        return (zzefg) this.zzc.zza(zzbzuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ As zzc(final zzbzu zzbzuVar, int i, zzeff zzeffVar) {
        Bundle bundle;
        if (zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgzo.zzj(((zzegw) this.zzd.zzb()).zzb(zzbzuVar, i), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return zzgzo.zza(new zzefg((InputStream) obj, zzbzuVar));
            }
        }, this.zzb);
    }
}

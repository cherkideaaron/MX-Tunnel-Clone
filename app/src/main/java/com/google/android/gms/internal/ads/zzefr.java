package com.google.android.gms.internal.ads;

import android.os.Binder;
import defpackage.As;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzefr {
    private final zzgzy zza;
    private final zzeew zzb;
    private final zzika zzc;

    public zzefr(zzgzy zzgzyVar, zzeew zzeewVar, zzika zzikaVar) {
        this.zza = zzgzyVar;
        this.zzb = zzeewVar;
        this.zzc = zzikaVar;
    }

    private final As zzg(final zzbzu zzbzuVar, zzefh zzefhVar, final zzefh zzefhVar2, final zzgyw zzgywVar) {
        As asZzh;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            asZzh = zzgzo.zzc(new zzeff(1));
        } else {
            asZzh = zzgzo.zzh(zzefhVar.zza(zzbzuVar), ExecutionException.class, zzefq.zza, this.zza);
        }
        zzgzy zzgzyVar = this.zza;
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzj(zzgzg.zzw(asZzh), zzefj.zza, zzgzyVar), zzgywVar, zzgzyVar), zzeff.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc(zzefhVar2, zzbzuVar, zzgywVar, (zzeff) obj);
            }
        }, zzgzyVar);
    }

    public final As zza(final zzbzu zzbzuVar) {
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                String str = new String(zzgxf.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzbzu zzbzuVar2 = zzbzuVar;
                zzbzuVar2.zzj = str;
                return zzgzo.zza(zzbzuVar2);
            }
        };
        final zzeew zzeewVar = this.zzb;
        Objects.requireNonNull(zzeewVar);
        return zzg(zzbzuVar, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefi
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ As zza(zzbzu zzbzuVar2) {
                return zzeewVar.zza(zzbzuVar2);
            }
        }, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ As zza(zzbzu zzbzuVar2) {
                return this.zza.zzd(zzbzuVar2);
            }
        }, zzgywVar);
    }

    public final As zzb(zzbzu zzbzuVar) {
        return zzg(zzbzuVar, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ As zza(zzbzu zzbzuVar2) {
                return this.zza.zze(zzbzuVar2);
            }
        }, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ As zza(zzbzu zzbzuVar2) {
                return this.zza.zzf(zzbzuVar2);
            }
        }, zzefn.zza);
    }

    public final /* synthetic */ As zzc(zzefh zzefhVar, zzbzu zzbzuVar, zzgyw zzgywVar, zzeff zzeffVar) {
        return zzgzo.zzj(zzefhVar.zza(zzbzuVar), zzgywVar, this.zza);
    }

    public final /* synthetic */ As zzd(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzc(zzbzuVar, Binder.getCallingUid());
    }

    public final /* synthetic */ As zze(zzbzu zzbzuVar) {
        return this.zzb.zzd(zzbzuVar.zzh);
    }

    public final /* synthetic */ As zzf(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzd(zzbzuVar.zzh);
    }
}

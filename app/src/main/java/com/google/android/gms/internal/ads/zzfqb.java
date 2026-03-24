package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.As;
import defpackage.Vs;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfqb {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgzz zzc;
    private final zzfqc zzd;
    private final zzclx zze;

    public zzfqb(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgzz zzgzzVar, zzfqc zzfqcVar, zzclx zzclxVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgzzVar;
        this.zzd = zzfqcVar;
        this.zze = zzclxVar;
    }

    private final As zze(final String str, final long j, final int i) {
        final String strO;
        zzgzz zzgzzVar;
        As asSchedule;
        com.google.android.gms.ads.internal.util.client.zzt zztVar;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zza()) {
            zzfqc zzfqcVar = this.zzd;
            if (zzfqcVar == null || !zzxVar.zzd()) {
                zztVar = com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE;
            } else {
                zzfqcVar.zza(str, "", 2);
                zztVar = com.google.android.gms.ads.internal.util.client.zzt.BUFFERED;
            }
            return zzgzo.zza(zztVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjS)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strO = Vs.o(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strO = str;
        }
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfqa
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzb(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            zzgzzVar = this.zzc;
            asSchedule = zzgzzVar.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpz
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzd(strO);
                }
            });
        } else {
            zzgzzVar = this.zzc;
            asSchedule = zzgzzVar.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfpy
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(strO);
                }
            }, j, TimeUnit.MILLISECONDS);
        }
        return zzgzo.zzj(asSchedule, zzgywVar, zzgzzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        com.google.android.gms.ads.internal.util.client.zzu zzuVar;
        HashMap map;
        zzclx zzclxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue() && (zzclxVar = this.zze) != null && (com.google.android.gms.ads.internal.zzt.zzc().zzi(str) || com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            String strZzb = zzclxVar.zzb();
            map = new HashMap();
            if (strZzb != null) {
                map.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkl), strZzb);
            }
            zzuVar = this.zzb;
        } else {
            zzuVar = this.zzb;
            map = null;
        }
        return zzuVar.zzc(str, map);
    }

    public final As zza(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                }
            }
        }
        return zzgzo.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    public final /* synthetic */ As zzb(int i, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgzo.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long jZzb = zzxVar.zzb();
        if (i != 1) {
            jZzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, jZzb, i + 1);
    }
}

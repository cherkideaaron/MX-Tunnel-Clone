package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbyj {
    private static zzcdd zze;
    private final Context zza;
    private final AdFormat zzb;
    private final com.google.android.gms.ads.internal.client.zzek zzc;
    private final String zzd;

    public zzbyj(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzek zzekVar, String str) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzekVar;
        this.zzd = str;
    }

    public static zzcdd zza(Context context) {
        zzcdd zzcddVar;
        synchronized (zzbyj.class) {
            try {
                if (zze == null) {
                    zze = com.google.android.gms.ads.internal.client.zzbb.zzb().zzj(context, new zzbtp());
                }
                zzcddVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcddVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVarZza;
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzcdd zzcddVarZza = zza(context);
        if (zzcddVarZza == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
            com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzc;
            if (zzekVar == null) {
                com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
                zznVar.zzi(jCurrentTimeMillis);
                zzmVarZza = zznVar.zza();
            } else {
                zzekVar.zzp(jCurrentTimeMillis);
                zzmVarZza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzekVar);
            }
            try {
                zzcddVarZza.zze(iObjectWrapperWrap, new zzcdh(this.zzd, this.zzb.name(), null, zzmVarZza, 0, null), new zzbyi(this, queryInfoGenerationCallback));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        queryInfoGenerationCallback.onFailure(str);
    }
}
